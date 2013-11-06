package Hexel.blocks;
import Hexel.rendering.TEX;

public class BlockDirt extends Block {
    public double getMaxHealth(){ return .5; };
    public BlockDirt(){
        this.health = .5;
    }

    public int getTopTextureIndex(){
        return TEX.getTextureIndex(2, 1);
    }
    public int getBottomTextureIndex(){
        return TEX.getTextureIndex(2, 1);
    }
    public int getSideTextureIndex(){
        return TEX.getTextureIndex(2, 1);
    }
    public double getFracBottom(){ return 0; }
    public double getFracTop(){ return 1; }
    public Block clone(){ return this; }


    public String getName() { return "dirt"; }

    public boolean isTransparent(){ return false; }

}

