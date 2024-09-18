package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv3IronSword implements ToolMaterial {

    public static final  CompressionLv3IronSword INSTANCE = new CompressionLv3IronSword();
    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 350;}

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
