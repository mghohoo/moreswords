package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv1StoneSword implements ToolMaterial {

    public static final CompressionLv1StoneSword INSTANCE = new CompressionLv1StoneSword();
    @Override
    public int getDurability() {
        return 600;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 50;}

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 60;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
