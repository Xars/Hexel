package Hexel.math;

import Hexel.math.Vector3i;

public class Vector3d {
    public double x;
    public double y;
    public double z;

    public Vector3d(){
        this(0, 0, 0);
    }

    public Vector3d(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d(Vector3d that){
        this.x = that.x;
        this.y = that.y;
        this.z = that.z;
    }

    public Vector3d(Vector3i that){
        this.x = that.x;
        this.y = that.y;
        this.z = that.z;
    }

    public double distance(Vector3d that){
        double diffX = this.x - that.x;
        double diffY = this.y - that.y;
        double diffZ = this.z - that.z;
        return Math.sqrt(diffX*diffX + diffY*diffY + diffZ*diffZ);
    }
    
    public static Vector3d Sub(Vector3d a, Vector3d b){
    	return new Vector3d(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public void unit(){
        double m = mag();
        this.x /= m;
        this.y /= m;
        this.z /= m;
    }

    public void add(Vector3d that){
        this.x += that.x;
        this.y += that.y;
        this.z += that.z;
    }

    public void cross(Vector3d that){
        this.x = this.y * that.z - this.z * that.y;
        this.y = this.z * that.x - this.x * that.z;
        this.z = this.x * that.y - this.y * that.x;
    }

    public void sub(Vector3d that){
        this.x -= that.x;
        this.y -= that.y;
        this.z -= that.z;
    }

    public double dot(double x, double y, double z){
        return this.x * x + this.y * y + this.z * z;
    }

    public void times(double n){
        this.x *= n;
        this.y *= n;
        this.z *= n;
    }

    public double mag(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Vector3d){
	    	if (this == o) 
	            return true;
	        Vector3d that = (Vector3d)o;
	       return this.x == that.x && this.y == that.y && this.z == that.z;
        } else {
        	return false;
        }
     }

    @Override
    public int hashCode() {
    	double hash = 23;
        hash = hash * 31 + x * 100000;
        hash = hash * 31 + y * 100000;
        hash = hash * 31 + z * 100000;
        return (int)hash;
    }

    @Override
    public String toString(){
        return this.x + " " + this.y + " " + this.z;
    }
}

