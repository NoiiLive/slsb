package net.clozynoii.slsb.procedures;

import net.minecraftforge.eventbus.api.Event;

@Mod.EventBusSubscriber
public class ShadowSummonProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer().level(), event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		execute(null, world, x, y, z, entity, text);
	}

private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
String text
) {
if(
entity == null ||
text == null
) return ;
String convert = "";String entitytype = "";String entityname = "";String textconvert = "";
if ((text).toLowerCase().startsWith(().toLowerCase())) {textconvert = (text).toLowerCase().replace(().toLowerCase(),"");textconvert = (textconvert).strip();if(event != null && event.isCancelable()) {
event.setCanceled(true);
}if (new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert(textconvert)!=0&&new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert(textconvert)<=) {if (!().isEmpty()) {convert = new Object(){
private String split(String text, String space, int index){
String s = text.split(space)[index];
return s;
}
}.split(, "\u00B6", (int) (Mth.nextInt(RandomSource.create(), (int)(new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert(textconvert)-1), (int)(new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert(textconvert)-1))))
;SlsbMod.LOGGER.info(convert);entitytype = new Object(){
private String split(String text, String space, int index){
String s = text.split(space)[index];
return s;
}
}.split(convert, "\u00A4", (int) 0)
;entityname = new Object(){
private String split(String text, String space, int index){
String s = text.split(space)[index];
return s;
}
}.split(convert, "\u00A4", (int) 1)
;SlsbMod.LOGGER.info(entitytype);SlsbMod.LOGGER.info(entityname);if (world instanceof ServerLevel _level)
_level.getServer().getCommands().performPrefixedCommand(
new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO,
_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), ("summon "+entitytype+" ~ ~ ~ {CustomName:'[{\"text\":\""+entityname+"\"}]'}"));SlsbMod.LOGGER.info();if (!world.isClientSide() && world.getServer() != null)
world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("<"+entity.getDisplayName().getString()+"> "++", "+entityname)), false);{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
for (Entity entityiterator : _entfound) {
if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("slsb:shadow_mob")))&&!(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame():false)) {if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner) _toTame.tame(_owner);}
}
}}else{if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("No More Shadows"), true);}}else{if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("Invalid Shadow Position"), false);if (entity instanceof Player _player && !_player.level().isClientSide())
_player.displayClientMessage(Component.literal("Use /slsb shadow list"), false);}}
}
}
