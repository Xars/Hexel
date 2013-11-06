package Hexel;

import java.util.ArrayList;

public class Cleanup extends Thread {

    public Cleanup() {

    }

    ArrayList<Runnable> runnables = new ArrayList<Runnable>();

    public void add(Runnable runnable) {
        runnables.add(runnable);
    }

    public void run() {
        for (Runnable runnable : runnables) {
            runnable.run();
        }
    }
}

