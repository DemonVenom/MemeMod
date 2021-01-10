package com.demonvenom.mememod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MemeToolMaterial implements ToolMaterial {

    public static final MemeToolMaterial SHAGGY = new MemeToolMaterial();

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public float getAttackDamage() {
        return 3.0F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}