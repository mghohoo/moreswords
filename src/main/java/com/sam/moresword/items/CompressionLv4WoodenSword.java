package com.sam.moresword.items;

import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv4WoodenSword implements ToolMaterial {

    public static final CompressionLv4WoodenSword INSTANCE = new CompressionLv4WoodenSword();
    @Override
    public int getDurability() {
        return 140;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 8;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
