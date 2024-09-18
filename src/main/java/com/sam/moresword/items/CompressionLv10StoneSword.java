package com.sam.moresword.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CompressionLv10StoneSword implements ToolMaterial {

    public static final CompressionLv10StoneSword INSTANCE = new CompressionLv10StoneSword();
    @Override
    public int getDurability() {
        return 1600;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {return 190;}

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
