package Hexel.blocks;

import Hexel.rendering.TEX;

public class DebugBlock extends Block {

    public double getMaxHealth() {
        return .1;
    }

    public DebugBlock() {
        this.health = .1;
    }


    public int getTopTextureIndex() {
        return TEX.getTextureIndex(0, 1);
    }

    public int getBottomTextureIndex() {
        return TEX.getTextureIndex(0, 0);
    }

    public int getSideTextureIndex() {
        return getBottomTextureIndex();
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

