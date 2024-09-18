package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ComprssionLv10WoodenSword implements ToolMaterial {

    public static final ComprssionLv10WoodenSword INSTANCE = new ComprssionLv10WoodenSword();
    @Override
    public int getDurability() {
        return 300;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 42;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 40;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
