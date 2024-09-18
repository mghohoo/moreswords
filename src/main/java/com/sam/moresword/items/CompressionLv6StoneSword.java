package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv6StoneSword implements ToolMaterial {

    public static final CompressionLv6StoneSword INSTANCE = new CompressionLv6StoneSword();
    @Override
    public int getDurability() {
        return 950;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 105;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 150;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
