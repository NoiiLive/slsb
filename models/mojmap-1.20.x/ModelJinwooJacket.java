// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelJinwooJacket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jinwoojacket"), "main");
	private final ModelPart torso;
	private final ModelPart left_arm;
	private final ModelPart right_arm;

	public ModelJinwooJacket(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(56, 54)
						.addBox(3.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 16)
						.addBox(-4.25F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 8)
						.addBox(-4.0F, 1.0F, -2.25F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 68)
						.addBox(-4.0F, 0.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 38)
						.addBox(2.0F, 0.0F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 29)
						.addBox(2.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 29)
						.addBox(-2.0F, -0.25F, 0.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 34)
						.addBox(-4.0F, -0.25F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 44)
						.addBox(-4.0F, 0.0F, 1.25F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition torso_r1 = torso.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(60, 16).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.4056F, 1.8292F, 0.1745F, 0.0F, 0.0F));

		PartDefinition torso_r2 = torso.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(16, 58).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.2167F, 1.8292F, -0.1745F, 0.0F, 0.0F));

		PartDefinition torso_r3 = torso.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(60, 18).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.4056F, -1.8292F, -0.1745F, 0.0F, 0.0F));

		PartDefinition torso_r4 = torso.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(58, 44).addBox(-4.0F, -0.5F, -0.5F, 8.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.2167F, -1.8292F, 0.1745F, 0.0F, 0.0F));

		PartDefinition torso_r5 = torso.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(76, 35).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8292F, 8.4056F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition torso_r6 = torso.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(68, 67).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.8292F, 9.2167F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition torso_r7 = torso.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(76, 40).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8292F, 8.4056F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition torso_r8 = torso.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(46, 71).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.8292F, 9.2167F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition jacket = torso.addOrReplaceChild("jacket", CubeListBuilder.create().texOffs(48, 0)
				.addBox(-4.9962F, -24.5871F, -2.449F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)).texOffs(16, 53)
				.addBox(-2.9962F, -24.5871F, 0.551F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(47, 46)
				.addBox(3.0038F, -24.5871F, -2.449F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.001F)).texOffs(46, 54)
				.addBox(3.75F, -24.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.015F)).texOffs(36, 16)
				.addBox(-4.0F, -24.0F, 1.5F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.015F)).texOffs(36, 53)
				.addBox(-4.75F, -24.0F, -2.0F, 1.0F, 11.0F, 4.0F, new CubeDeformation(0.015F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition torso_r9 = jacket.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(24, 0).addBox(-2.5F, -1.65F, 1.5F, 5.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0038F, -23.8371F, 1.801F, -0.829F, 0.0F, 0.0F));

		PartDefinition torso_r10 = jacket.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(42, 40).addBox(-4.483F, -0.8476F, -0.6765F, 3.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2048F, -15.9515F, -2.0211F, 0.1923F, -0.1011F, -1.1452F));

		PartDefinition torso_r11 = jacket.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(56, 66).addBox(-1.9548F, -8.0485F, -0.7289F, 2.0F, 11.0F, 1.0F,
						new CubeDeformation(0.015F)),
				PartPose.offsetAndRotation(4.2048F, -15.9515F, -2.0211F, 0.0F, -0.1745F, 0.0F));

		PartDefinition torso_r12 = jacket.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(32, 33).addBox(-1.0F, -2.0F, -4.0F, 1.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.9697F, -23.3282F, 0.551F, 0.0F, 0.0F, 0.2618F));

		PartDefinition torso_r13 = jacket.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(0, 52).addBox(-4.0F, -1.5F, -1.1F, 8.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0038F, -23.0998F, 2.4766F, -1.0472F, 0.0F, 0.0F));

		PartDefinition head_r1 = jacket.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(50, 40).addBox(-4.5F, -2.0F, -1.0F, 9.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0038F, -23.3282F, 4.9169F, -0.2618F, 0.0F, 0.0F));

		PartDefinition torso_r14 = jacket.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(0, 41).addBox(0.0F, -2.0F, -4.0F, 1.0F, 3.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9697F, -23.3282F, 0.551F, 0.0F, 0.0F, -0.2618F));

		PartDefinition torso_r15 = jacket.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(0, 68).addBox(-0.0919F, -7.6994F, -0.7263F, 2.0F, 11.0F, 1.0F,
						new CubeDeformation(0.015F)),
				PartPose.offsetAndRotation(-4.1581F, -16.3006F, -2.0237F, 0.0F, 0.1745F, 0.0F));

		PartDefinition torso_r16 = jacket.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(53, 44).addBox(1.009F, 0.6006F, -0.681F, 3.0F, 1.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1581F, -16.3006F, -2.0237F, 0.0999F, 0.1929F, 0.5343F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(62, 62)
						.addBox(2.3377F, 3.2153F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 61)
						.addBox(-1.3377F, 3.2153F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 70)
						.addBox(-1.0F, 3.2153F, -2.3377F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 69)
						.addBox(-1.0F, 3.2153F, 1.3377F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1",
				CubeListBuilder.create().texOffs(22, 78).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.3187F, 1.9786F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_arm_r2 = left_arm
				.addOrReplaceChild("left_arm_r2",
						CubeListBuilder.create().texOffs(74, 24).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 0.0F, 1.75F, 0.0436F, 0.0F, 0.0F));

		PartDefinition left_arm_r3 = left_arm.addOrReplaceChild("left_arm_r3",
				CubeListBuilder.create().texOffs(72, 9).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.9164F, 1.9786F, -0.3491F, 0.0F, 0.0F));

		PartDefinition left_arm_r4 = left_arm.addOrReplaceChild("left_arm_r4",
				CubeListBuilder.create().texOffs(6, 76).addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, -1.75F, -0.0436F, 0.0F, 0.0F));

		PartDefinition left_arm_r5 = left_arm.addOrReplaceChild("left_arm_r5",
				CubeListBuilder.create().texOffs(73, 79).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.3187F, -1.9786F, -0.3491F, 0.0F, 0.0F));

		PartDefinition left_arm_r6 = left_arm.addOrReplaceChild("left_arm_r6",
				CubeListBuilder.create().texOffs(79, 0).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 2.9164F, -1.9786F, 0.3491F, 0.0F, 0.0F));

		PartDefinition right_arm_r1 = left_arm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(72, 11).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9786F, 2.9164F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_arm_r2 = left_arm.addOrReplaceChild("right_arm_r2",
				CubeListBuilder.create().texOffs(70, 39).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9786F, 2.3187F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition right_arm_r3 = left_arm.addOrReplaceChild("right_arm_r3",
				CubeListBuilder.create().texOffs(24, 16).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition left_arm_r7 = left_arm.addOrReplaceChild("left_arm_r7",
				CubeListBuilder.create().texOffs(6, 1).addBox(-0.05F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4377F, 8.2153F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition left_arm_r8 = left_arm.addOrReplaceChild("left_arm_r8",
				CubeListBuilder.create().texOffs(16, 76).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9786F, 2.9164F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition left_arm_r9 = left_arm.addOrReplaceChild("left_arm_r9",
				CubeListBuilder.create().texOffs(76, 30).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9786F, 2.3187F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition left_arm_r10 = left_arm.addOrReplaceChild("left_arm_r10",
				CubeListBuilder.create().texOffs(66, 7).addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition left_arm_r11 = left_arm.addOrReplaceChild("left_arm_r11",
				CubeListBuilder.create().texOffs(56, 33).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.75F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(62, 62).mirror().addBox(-3.3377F, 3.2153F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(20, 61).mirror()
				.addBox(0.3377F, 3.2153F, -2.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(16, 70).mirror().addBox(-3.0F, 3.2153F, -2.3377F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(40, 69).mirror()
				.addBox(-3.0F, 3.2153F, 1.3377F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		PartDefinition right_arm_r4 = right_arm.addOrReplaceChild("right_arm_r4",
				CubeListBuilder.create().texOffs(22, 78).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.3187F, 1.9786F, 0.3491F, 0.0F, 0.0F));

		PartDefinition right_arm_r5 = right_arm.addOrReplaceChild("right_arm_r5",
				CubeListBuilder.create().texOffs(74, 24).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 1.75F, 0.0436F, 0.0F, 0.0F));

		PartDefinition right_arm_r6 = right_arm.addOrReplaceChild("right_arm_r6",
				CubeListBuilder.create().texOffs(72, 9).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.9164F, 1.9786F, -0.3491F, 0.0F, 0.0F));

		PartDefinition right_arm_r7 = right_arm.addOrReplaceChild("right_arm_r7",
				CubeListBuilder.create().texOffs(6, 76).mirror()
						.addBox(-2.0F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -1.75F, -0.0436F, 0.0F, 0.0F));

		PartDefinition right_arm_r8 = right_arm.addOrReplaceChild("right_arm_r8",
				CubeListBuilder.create().texOffs(73, 79).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.3187F, -1.9786F, -0.3491F, 0.0F, 0.0F));

		PartDefinition right_arm_r9 = right_arm.addOrReplaceChild("right_arm_r9",
				CubeListBuilder.create().texOffs(79, 0).mirror()
						.addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, 2.9164F, -1.9786F, 0.3491F, 0.0F, 0.0F));

		PartDefinition left_arm_r12 = right_arm.addOrReplaceChild("left_arm_r12",
				CubeListBuilder.create().texOffs(72, 11).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9786F, 2.9164F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition left_arm_r13 = right_arm.addOrReplaceChild("left_arm_r13",
				CubeListBuilder.create().texOffs(70, 39).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9786F, 2.3187F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition left_arm_r14 = right_arm.addOrReplaceChild("left_arm_r14",
				CubeListBuilder.create().texOffs(24, 16).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.75F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition right_arm_r10 = right_arm.addOrReplaceChild("right_arm_r10",
				CubeListBuilder.create().texOffs(6, 1).mirror()
						.addBox(0.05F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.4377F, 8.2153F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition right_arm_r11 = right_arm.addOrReplaceChild("right_arm_r11",
				CubeListBuilder.create().texOffs(16, 76).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.9786F, 2.9164F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition right_arm_r12 = right_arm.addOrReplaceChild("right_arm_r12",
				CubeListBuilder.create().texOffs(76, 30).mirror()
						.addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.9786F, 2.3187F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition right_arm_r13 = right_arm.addOrReplaceChild("right_arm_r13",
				CubeListBuilder.create().texOffs(66, 7).mirror()
						.addBox(-0.5F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition right_arm_r14 = right_arm.addOrReplaceChild("right_arm_r14",
				CubeListBuilder.create().texOffs(56, 33).mirror()
						.addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.75F, 0.0F, 0.0F, 0.0F, -0.0873F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}