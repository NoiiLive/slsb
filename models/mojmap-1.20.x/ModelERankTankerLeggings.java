// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelERankTankerLeggings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "eranktankerleggings"), "main");
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public ModelERankTankerLeggings(ModelPart root) {
		this.body = root.getChild("body");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 52).addBox(
				-4.5F, 7.9F, -2.5F, 9.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(31, 50).addBox(-1.0F, -1.25F, -2.5F, 2.0F, 4.0F, 5.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(4.0F, 11.9F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(46, 4).addBox(-1.0F, -1.25F, -2.5F, 2.0F, 4.0F, 5.0F,
						new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(-4.0F, 11.9F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(20, 44)
				.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.265F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg",
				CubeListBuilder.create().texOffs(20, 44).mirror()
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.265F)).mirror(false),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}