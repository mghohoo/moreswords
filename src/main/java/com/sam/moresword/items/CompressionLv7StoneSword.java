package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv7StoneSword implements ToolMaterial {

    public static final CompressionLv7StoneSword INSTANCE = new CompressionLv7StoneSword();
    @Override
    public int getDurability() {
        return 1000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 120;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 200;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
