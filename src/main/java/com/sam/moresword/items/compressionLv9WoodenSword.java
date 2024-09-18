package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class compressionLv9WoodenSword implements ToolMaterial {

    public static final compressionLv9WoodenSword INSTANCE = new compressionLv9WoodenSword();
    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 32;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 24;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
