package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv3StoneSword implements ToolMaterial {

    public static final CompressionLv3StoneSword INSTANCE = new CompressionLv3StoneSword();
    @Override
    public int getDurability() {
        return 800;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 70;}

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
