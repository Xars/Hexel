package Hexel.blocks;

import Hexel.rendering.TEX;

public class SeedBlock extends Block {

    public double getMaxHealth() {
        return .1;
    }

    public SeedBlock() {
        this.health = .1;
    }

    public int getTopTextureIndex() {
        return TEX.getTextureIndex(0, 2);
    }

    public int getBottomTextureIndex() {
        return getTopTextureIndex();
    }

    public int getSideTextureIndex() {
        return getTopTextureIndex();
    }

    public double getFracBottom() {
        return 0;
    }

    public double getFracTop() {
        return 1;
    }

    public Block clone() {
        return this;
    }

    public boolean isTransparent() {
        return false;
    }

    public String getName() {
        return "seed";
    }
}




