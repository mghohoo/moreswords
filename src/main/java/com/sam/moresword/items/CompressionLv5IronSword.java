package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv5IronSword implements ToolMaterial {

    public static final  CompressionLv5IronSword INSTANCE = new CompressionLv5IronSword();
    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 450;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 1250;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
