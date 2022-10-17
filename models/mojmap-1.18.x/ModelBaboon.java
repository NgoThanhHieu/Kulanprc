// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBaboon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "baboon"), "main");
	private final ModelPart body;

	public ModelBaboon(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frontleftleg = legs.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(44, 31)
				.addBox(4.0F, -8.0F, 4.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frontrightleg = legs.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(29, 48)
				.addBox(-7.0F, -8.0F, 4.0F, 3.0F, 8.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition backleftleg = legs.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(32, 34)
				.addBox(4.0F, -10.0F, -9.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition backrightleg = legs.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(44, 18)
				.addBox(-7.0F, -10.0F, -9.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(1.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition frontbody = body.addOrReplaceChild("frontbody", CubeListBuilder.create().texOffs(0, 0).addBox(
				-9.0F, -18.0F, 1.0F, 18.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition backbody = body.addOrReplaceChild("backbody", CubeListBuilder.create().texOffs(0, 18)
				.addBox(-6.0F, -17.0F, -9.0F, 12.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 34)
				.addBox(-5.0F, -25.0F, 10.0F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 1).mirror()
				.addBox(-7.0F, -24.0F, 13.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 1)
				.addBox(5.0F, -24.0F, 13.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition nose_r1 = head
				.addOrReplaceChild("nose_r1",
						CubeListBuilder.create().texOffs(45, 0).addBox(-2.0F, -23.0F, 12.0F, 4.0F, 5.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail = head.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(41, 42).addBox(-1.0F,
				-19.0F, -15.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}