package net.mcreator.wip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.wip.init.WipModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TornadoInHandProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.isFallFlying() : false)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WipModItems.TORNADO.get()) {
			entity.setDeltaMovement(new Vec3((entity.getLookAngle().x), 1, (entity.getLookAngle().x)));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(WipModItems.TORNADO.get(), 75);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.isFallFlying() : false)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WipModItems.TORNADO.get()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getLookAngle().z)));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(WipModItems.TORNADO.get(), 75);
		}
	}
}
