package Hexel.generation.heightMap;

import Hexel.Hexel;
import Hexel.math.Vector2i;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SHMCFile {
	private static final File dir = new File("state/shmcs/");
	static{
		if(!dir.exists()){
			dir.mkdirs();
		}
	}
	
    public static void save(Vector2i p, SmoothHeightMapChunk shmc){
    	
        File file = new File(getPath(p));

        try {
            if(!file.exists() && !file.createNewFile()){
                System.out.println("Failed to create file!");
                throw new IOException();
            }
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(shmc);
            out.close();
        } catch(IOException e){
            e.printStackTrace();
            //System.exit(1);
        }

    }

    public static SmoothHeightMapChunk load(Vector2i p){

        SmoothHeightMapChunk shmc = null;
        try {
            FileInputStream fileIn = new FileInputStream(getPath(p));
            ObjectInputStream in = new ObjectInputStream(fileIn);
            shmc = (SmoothHeightMapChunk) in.readObject();
            in.close();
            fileIn.close();
        } catch(IOException e){
            e.printStackTrace();
            System.exit(1);
        } catch(ClassNotFoundException e){
            System.out.println(("SHMC class not found"));
            e.printStackTrace();
            System.exit(1);
        }
        return shmc;
    }

    public static boolean has(Vector2i p){
        return new File(getPath(p)).exists();
    }

    private static String getFolder(){
        return dir.getAbsolutePath();
    }

    private static String getFilename(Vector2i p){
        return p + ".ser";
    }

    private static String getPath(Vector2i p){
        return getFolder() + getFilename(p);
    }
}

