package Hexel.chunk;

import Hexel.Hexel;
import Hexel.math.Vector3i;

import java.io.*;

public class ChunkFile {
	private static final File dir = new File("state/chunks/");
	private static final Object lock = new Object();
	static{
		if(!dir.exists()){
			dir.mkdirs();
		}
	}

    public static void save(Chunk chunk) {
        synchronized (lock) {
            Vector3i p = chunk.getXYZ();

            File file = new File(getPath(p));

            try {
                if (!file.exists() && !file.createNewFile()) {
                    System.out.println("Failed to create file!");
                    throw new IOException();
                }
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
                chunk.modified = false;
                out.writeObject(chunk);
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
                //System.exit(1);
            }
        }

    }

    public static Chunk load(Vector3i p) {
        synchronized (lock) {
            Chunk c = null;
            try {
                FileInputStream fileIn = new FileInputStream(getPath(p));
                ObjectInputStream in = new ObjectInputStream(fileIn);
                c = (Chunk) in.readObject();
                in.close();
                fileIn.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            } catch (ClassNotFoundException e) {
                System.out.println(("Chunk class not found"));
                e.printStackTrace();
                System.exit(1);
            }
            return c;
        }
    }

    public static boolean has(Vector3i p) {
            return new File(getPath(p)).exists();
    }

    private static String getFolder() {
        return dir.getAbsolutePath();
    }

    private static String getFilename(Vector3i p) {
        return p + ".ser";
    }

    private static String getPath(Vector3i p) {
        return getFolder() + getFilename(p);
    }
}

