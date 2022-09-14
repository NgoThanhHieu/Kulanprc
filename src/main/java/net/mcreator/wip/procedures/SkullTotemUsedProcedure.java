package net.mcreator.wip.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.client.Minecraft;

import net.mcreator.wip.init.WipModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SkullTotemUsedProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WipModItems.SKULL_TOTEM.get()) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(20);
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(WipModItems.SKULL_TOTEM.get()));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(WipModItems.SKULL_TOTEM.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("U ded but now no"), (false));
			entity.setDeltaMovement(new Vec3(0, 200, 0));
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("5 seconds left"), (true));
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(new TextComponent("4 seconds left"), (true));
							new Object() {
								private int ticks = 0;
								private float waitTicks;
								private LevelAccessor world;

								public void start(LevelAccessor world, int waitTicks) {
									this.waitTicks = waitTicks;
									MinecraftForge.EVENT_BUS.register(this);
									this.world = world;
								}

								@SubscribeEvent
								public void tick(TickEvent.ServerTickEvent event) {
									if (event.phase == TickEvent.Phase.END) {
										this.ticks += 1;
										if (this.ticks >= this.waitTicks)
											run();
									}
								}

								private void run() {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(new TextComponent("3 seconds left"), (true));
									new Object() {
										private int ticks = 0;
										private float waitTicks;
										private LevelAccessor world;

										public void start(LevelAccessor world, int waitTicks) {
											this.waitTicks = waitTicks;
											MinecraftForge.EVENT_BUS.register(this);
											this.world = world;
										}

										@SubscribeEvent
										public void tick(TickEvent.ServerTickEvent event) {
											if (event.phase == TickEvent.Phase.END) {
												this.ticks += 1;
												if (this.ticks >= this.waitTicks)
													run();
											}
										}

										private void run() {
											if (entity instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(new TextComponent("2 seconds left"), (true));
											new Object() {
												private int ticks = 0;
												private float waitTicks;
												private LevelAccessor world;

												public void start(LevelAccessor world, int waitTicks) {
													this.waitTicks = waitTicks;
													MinecraftForge.EVENT_BUS.register(this);
													this.world = world;
												}

												@SubscribeEvent
												public void tick(TickEvent.ServerTickEvent event) {
													if (event.phase == TickEvent.Phase.END) {
														this.ticks += 1;
														if (this.ticks >= this.waitTicks)
															run();
													}
												}

												private void run() {
													if (entity instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(new TextComponent("1 sexeond"), (true));
													new Object() {
														private int ticks = 0;
														private float waitTicks;
														private LevelAccessor world;

														public void start(LevelAccessor world, int waitTicks) {
															this.waitTicks = waitTicks;
															MinecraftForge.EVENT_BUS.register(this);
															this.world = world;
														}

														@SubscribeEvent
														public void tick(TickEvent.ServerTickEvent event) {
															if (event.phase == TickEvent.Phase.END) {
																this.ticks += 1;
																if (this.ticks >= this.waitTicks)
																	run();
															}
														}

														private void run() {
															if (entity instanceof LivingEntity _entity)
																_entity.hurt(new DamageSource("Your time run out").bypassArmor(), 50);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, 20);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, 20);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, 20);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, 20);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 20);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WipModItems.SKULL_TOTEM
				.get()) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(WipModItems.SKULL_TOTEM.get()));
		}
	}
}
