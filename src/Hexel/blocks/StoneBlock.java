package Hexel.blocks;

import Hexel.rendering.TEX;

public class StoneBlock extends Block {

    public double getMaxHealth() {
        return 2;
    }

    public StoneBlock() {
        this.health = 2;
    }

    public int getTopTextureIndex() {
        return TEX.getTextureIndex(2, 0);
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
}


