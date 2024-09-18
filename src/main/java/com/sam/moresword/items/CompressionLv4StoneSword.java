package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv4StoneSword implements ToolMaterial {

    public static final CompressionLv4StoneSword INSTANCE = new CompressionLv4StoneSword();
    @Override
    public int getDurability() {
        return 850;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 87;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 80;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
