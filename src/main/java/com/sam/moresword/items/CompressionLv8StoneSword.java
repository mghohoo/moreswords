package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv8StoneSword implements ToolMaterial {

    public static final CompressionLv8StoneSword INSTANCE = new CompressionLv8StoneSword();
    @Override
    public int getDurability() {
        return 1200;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 150;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 400;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
