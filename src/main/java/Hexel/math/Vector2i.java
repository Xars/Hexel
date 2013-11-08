package Hexel.math;

public class Vector2i {
    public int x;
    public int y;

    public Vector2i() {
        this(0, 0);
    }

    public Vector2i(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector2i(Vector2i that) {
        this.x = that.x;
        this.y = that.y;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Vector2i){
	    	if (this == o)
	            return true;
	        Vector2i that = (Vector2i) o;
	        return this.x == that.x && this.y == that.y;
        } else {
        	return false;
        }
    }

    public double distance(Vector2i that) {
        double diffX = this.x - that.x;
        double diffY = this.y - that.y;
        return diffX * diffX + diffY * diffY;
    }

    @Override
    public int hashCode() {
        int hash = 23;
        hash = hash * 31 + x;
        hash = hash * 31 + y;
        return hash;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}

