package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv2IronSword implements ToolMaterial {

    public static final  CompressionLv2IronSword INSTANCE = new CompressionLv2IronSword();
    @Override
    public int getDurability() {
        return 2000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 300;}

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
