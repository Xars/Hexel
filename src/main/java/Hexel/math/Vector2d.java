package Hexel.math;

public class Vector2d {
    public double x;
    public double y;

    public Vector2d(){
        this(0, 0);
    }

    public Vector2d(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Vector2d(Vector2d that){
        this.x = that.x;
        this.y = that.y;
    }

    public Vector2d(Vector2i that){
        this.x = that.x;
        this.y = that.y;
    }

    public double distance(Vector2d that){
        int diffX = (int)(this.x - that.x);
        int diffY = (int)(this.y - that.y);
        return Math.sqrt(diffX*diffX + diffY*diffY);
    }
    
    public static Vector2d Sub(Vector2d a, Vector2d b){
        return new Vector2d(a.x - b.x, a.y - b.y);
    }

    public void unit(){
        double m = mag();
        this.x /= m;
        this.y /= m;
    }

    public void add(Vector2d that){
        this.x += that.x;
        this.y += that.y;
    }

    public void sub(Vector2d that){
        this.x -= that.x;
        this.y -= that.y;
    }

    public void times(double n){
        this.x *= n;
        this.y *= n;
    }

    public double mag(){
        return Math.sqrt(x*x + y*y);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Vector2d){
	    	if (this == o) 
	            return true;
	        Vector2d that = (Vector2d)o;
	        return this.x == that.x && this.y == that.y;
        } else {
        	return false;
        }
     }

    @Override
    public int hashCode() {
        double hash = 23;
        hash = hash * 31 + x*100000;
        hash = hash * 31 + y*100000;
        return (int)hash;
    }

    @Override
    public String toString(){
        return this.x + " " + this.y;
    }
}


