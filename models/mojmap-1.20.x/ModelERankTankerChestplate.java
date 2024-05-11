// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelERankTankerChestplate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "eranktankerchestplate"), "main");
	private final ModelPart torso;
	private final ModelPart left_arm;
	private final ModelPart right_arm;

	public ModelERankTankerChestplate(ModelPart root) {
		this.torso = root.getChild("torso");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(32, 14)
						.addBox(-4.5F, -0.1F, -2.5F, 9.0F, 7.0F, 5.0F, new CubeDeformation(0.3F)).texOffs(0, 19)
						.addBox(-4.5F, 2.9F, -2.5F, 9.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(41, 26)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(36, 39)
						.addBox(-1.5F, 5.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.01F)),
				PartPose.offset(5.0F, 14.0F, 0.0F));

		PartDefinition cube_r1 = left_arm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(27, 0).addBox(-3.5F, -2.0F, -2.5F, 7.0F, 4.0F, 5.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(41, 26).mirror()
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.25F)).mirror(false)
						.texOffs(36, 39).mirror()
						.addBox(-3.5F, 5.0F, -2.5F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offset(-5.0F, 14.0F, 0.0F));

		PartDefinition cube_r2 = right_arm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(27, 0).mirror()
						.addBox(-3.5F, -2.0F, -2.5F, 7.0F, 4.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-2.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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