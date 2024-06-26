
package net.clozynoii.slsb.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.clozynoii.slsb.procedures.HunterNPCTickProcedure;
import net.clozynoii.slsb.procedures.HunterNPCOnInitialEntitySpawnProcedure;
import net.clozynoii.slsb.init.SlsbModEntities;

import javax.annotation.Nullable;

public class HunterNPCEntity extends TamableAnimal {
	public static final EntityDataAccessor<String> DATA_HunterClass = SynchedEntityData.defineId(HunterNPCEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<String> DATA_HunterRank = SynchedEntityData.defineId(HunterNPCEntity.class, EntityDataSerializers.STRING);
	public static final EntityDataAccessor<Integer> DATA_Skin = SynchedEntityData.defineId(HunterNPCEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Strength = SynchedEntityData.defineId(HunterNPCEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Vitality = SynchedEntityData.defineId(HunterNPCEntity.class, EntityDataSerializers.INT);
	public static final EntityDataAccessor<Integer> DATA_Agility = SynchedEntityData.defineId(HunterNPCEntity.class, EntityDataSerializers.INT);

	public HunterNPCEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(SlsbModEntities.HUNTER_NPC.get(), world);
	}

	public HunterNPCEntity(EntityType<HunterNPCEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 5;
		setNoAi(false);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(DATA_HunterClass, "");
		this.entityData.define(DATA_HunterRank, "");
		this.entityData.define(DATA_Skin, 0);
		this.entityData.define(DATA_Strength, 0);
		this.entityData.define(DATA_Vitality, 0);
		this.entityData.define(DATA_Agility, 0);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new OwnerHurtTargetGoal(this));
		this.goalSelector.addGoal(2, new OwnerHurtByTargetGoal(this));
		this.goalSelector.addGoal(3, new FollowOwnerGoal(this, 1, (float) 10, (float) 2, false));
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.4, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(8, new FloatGoal(this));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, GiantRatEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, UndeadSoldierEntity.class, false, false));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		HunterNPCOnInitialEntitySpawnProcedure.execute(this);
		return retval;
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compound) {
		super.addAdditionalSaveData(compound);
		compound.putString("DataHunterClass", this.entityData.get(DATA_HunterClass));
		compound.putString("DataHunterRank", this.entityData.get(DATA_HunterRank));
		compound.putInt("DataSkin", this.entityData.get(DATA_Skin));
		compound.putInt("DataStrength", this.entityData.get(DATA_Strength));
		compound.putInt("DataVitality", this.entityData.get(DATA_Vitality));
		compound.putInt("DataAgility", this.entityData.get(DATA_Agility));
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("DataHunterClass"))
			this.entityData.set(DATA_HunterClass, compound.getString("DataHunterClass"));
		if (compound.contains("DataHunterRank"))
			this.entityData.set(DATA_HunterRank, compound.getString("DataHunterRank"));
		if (compound.contains("DataSkin"))
			this.entityData.set(DATA_Skin, compound.getInt("DataSkin"));
		if (compound.contains("DataStrength"))
			this.entityData.set(DATA_Strength, compound.getInt("DataStrength"));
		if (compound.contains("DataVitality"))
			this.entityData.set(DATA_Vitality, compound.getInt("DataVitality"));
		if (compound.contains("DataAgility"))
			this.entityData.set(DATA_Agility, compound.getInt("DataAgility"));
	}

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level().isClientSide());
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level().isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level().isClientSide()) : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (item.isEdible() && this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal((float) item.getFoodProperties().getNutrition());
						retval = InteractionResult.sidedSuccess(this.level().isClientSide());
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.sidedSuccess(this.level().isClientSide());
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level().broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level().broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.sidedSuccess(this.level().isClientSide());
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		HunterNPCTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		HunterNPCEntity retval = SlsbModEntities.HUNTER_NPC.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return Ingredient.of().test(stack);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		return builder;
	}
}
