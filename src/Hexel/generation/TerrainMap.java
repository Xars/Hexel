package Hexel.generation;

import Hexel.blocks.*;
import Hexel.generation.heightMap.HexBlockHeightMaps;

import Hexel.math.Vector2i;

import java.util.Random;

import Hexel.Cleanup;

public class TerrainMap {

    private HexBlockHeightMaps hbhms;

    private static final int SCALE = 2;

    private static final EmptyBlock emptyBlock = new EmptyBlock();
    private static final GrassBlock grassBlock = new GrassBlock();
    private static final StoneBlock stoneBlock = new StoneBlock();
    private static final WoodBlock woodBlock = new WoodBlock();
    private static final GlassBlock glassBlock = new GlassBlock();

    public TerrainMap(Cleanup cleanup){
        hbhms = new HexBlockHeightMaps(cleanup);
    }

    public int getBlockHeight(int x, int y, Vector2i tmp){
        return hbhms.getBlockHeight(x, y, tmp);
    }
}

