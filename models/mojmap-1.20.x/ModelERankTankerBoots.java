// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelERankTankerBoots<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "eranktankerboots"), "main");
	private final ModelPart left_boot;
	private final ModelPart right_boot;

	public ModelERankTankerBoots(ModelPart root) {
		this.left_boot = root.getChild("left_boot");
		this.right_boot = root.getChild("right_boot");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition left_boot = partdefinition.addOrReplaceChild("left_boot",
				CubeListBuilder.create().texOffs(0, 39)
						.addBox(-2.5F, 4.1F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-2.5F, 10.1F, -4.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition right_boot = partdefinition.addOrReplaceChild("right_boot",
				CubeListBuilder.create().texOffs(0, 39).mirror()
						.addBox(-2.5F, 4.1F, -2.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 34).mirror()
						.addBox(-2.5F, 10.1F, -4.5F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		left_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_boot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}