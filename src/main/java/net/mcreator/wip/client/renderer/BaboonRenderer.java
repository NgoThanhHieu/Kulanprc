
package net.mcreator.wip.client.renderer;

public class BaboonRenderer extends MobRenderer<BaboonEntity, ModelBaboon<BaboonEntity>> {

	public BaboonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBaboon(context.bakeLayer(ModelBaboon.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BaboonEntity entity) {
		return new ResourceLocation("wip:textures/entities/baboon3.0.png");
	}

}
