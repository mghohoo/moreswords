package com.sam.moresword.items;

import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv6WoodenSword implements ToolMaterial {

    public static final CompressionLv6WoodenSword INSTANCE = new CompressionLv6WoodenSword();
    @Override
    public int getDurability() {
        return 180;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 12;}

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
