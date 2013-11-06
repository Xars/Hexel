package Hexel.blocks;

import Hexel.rendering.TEX;

public class WoodBlock extends Block {

    public double getMaxHealth() {
        return 1;
    }

    public WoodBlock() {
        this.health = 1;
    }

    public int maxHeight;
    public int height;

    public int getTopTextureIndex() {
        return TEX.getTextureIndex(3, 1);
    }

    public int getBottomTextureIndex() {
        return getTopTextureIndex();
    }

    public int getSideTextureIndex() {
        return TEX.getTextureIndex(3, 0);
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
}



