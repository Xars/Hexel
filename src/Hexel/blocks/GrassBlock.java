package Hexel.blocks;
import Hexel.rendering.TEX;

public class GrassBlock extends Block {
  public double getMaxHealth(){ return .5; };
  public GrassBlock(){
    this.health = .5;
  }

    public int getTopTextureIndex(){
        return TEX.getTextureIndex(1, 0);
    }
    public int getBottomTextureIndex(){
        return TEX.getTextureIndex(2, 1);
    }
    public int getSideTextureIndex(){
        return TEX.getTextureIndex(1, 1);
    }
    public double getFracBottom(){ return 0; }
    public double getFracTop(){ return 1; }
    public Block clone(){ return this; }

    public boolean isTransparent(){ return false; }

}

