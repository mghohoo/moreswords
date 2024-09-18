package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv1IronSword implements ToolMaterial {

    public static final  CompressionLv1IronSword INSTANCE = new  CompressionLv1IronSword();
    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 250;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 800;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
