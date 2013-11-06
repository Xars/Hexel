package Hexel.rendering;

public class TEX {
    public static final int HOR = 4*5;
    public static final int VER = 4;

    /**
     * Determines the index of a texture at the given location.  Oriented from the top-left of the texture grid.  0-indexed.
     * @param x The row of the texture.
     * @param y The column of the texture.
     * @return Return the texture index value for the given location.
     */
    public static int getTextureIndex(int x, int y){
        return x + (y * HOR);
    }
}

