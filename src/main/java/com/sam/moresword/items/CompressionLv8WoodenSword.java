package com.sam.moresword.items;

import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv8WoodenSword implements ToolMaterial {

    public static final CompressionLv8WoodenSword INSTANCE = new CompressionLv8WoodenSword();
    @Override
    public int getDurability() {
        return 220;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 24;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
