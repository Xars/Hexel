package Hexel.rendering;

import Hexel.things.Thing;

import javax.media.opengl.GL2;
import java.util.HashSet;

public class ThingRenderer {

    private HashSet<Thing> things = new HashSet<Thing>();

    public void addThing(Thing thing) {
        this.things.add(thing);
    }

    public void render(GL2 gl) {
        for (Thing thing : things) {
            if (thing instanceof Renderable) {
                Renderable r = (Renderable) thing;
                r.render(gl);
            }
        }
    }
}

