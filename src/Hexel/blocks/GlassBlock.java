package Hexel.blocks;

import Hexel.rendering.TEX;

public class GlassBlock extends Block {
    public GlassBlock(){
        super();
        this.health = .3;
    }

    @Override
    public int getTopTextureIndex() {
        return 3 + TEX.HOR*2;
    }

    @Override
    public int getBottomTextureIndex() {
        return getTopTextureIndex();
    }

    @Override
    public int getSideTextureIndex() {
        return getTopTextureIndex();
    }

    @Override
    public double getFracBottom() {
        return 0;
    }

    @Override
    public double getFracTop() {
        return 1;
    }

    @Override
    public Block clone() {
        return this;
    }

    @Override
    public boolean isTransparent() {
        return true;
    }

    @Override
    public double getMaxHealth() {
        return .3;
    }
}
