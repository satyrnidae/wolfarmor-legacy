package com.attributestudios.wolfarmor.mixin.entity;

import net.minecraft.entity.passive.EntityAnimal;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntityAnimal.class)
public abstract class MixinEntityAnimal extends MixinEntityAgeable {
}
