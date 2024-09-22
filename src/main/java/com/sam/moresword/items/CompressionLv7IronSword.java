package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv7IronSword implements ToolMaterial {

    public static final  CompressionLv7IronSword INSTANCE = new CompressionLv7IronSword();
    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 550;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 5000;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
