package Hexel.blocks;

import Hexel.rendering.TEX;

public class GlassBlock extends Block {
    public GlassBlock(){
        super();
        this.health = .3;
    }

    @Override
    public int getTopTextureIndex() {
        return TEX.getTextureIndex(3, 2);
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
        return new GlassBlock();
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
