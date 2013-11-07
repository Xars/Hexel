package Hexel.math;

public class Vector3i implements java.io.Serializable {
    public int x;
    public int y;
    public int z;

    public Vector3i(){
        this(0, 0, 0);
    }

    public Vector3i(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3i(Vector3i that){
        this.x = that.x;
        this.y = that.y;
        this.z = that.z;
    }

    @Override
    public boolean equals(Object o) {
    	if (o instanceof Vector3i){
    		if (this == o) 
                return true;
    		
            Vector3i that = (Vector3i)o;
            return this.x == that.x && this.y == that.y && this.z == that.z;
    	} else {
    		return false;
    	}
    }

    public int distance(Vector3i that){
        int diffX = this.x - that.x;
        int diffY = this.y - that.y;
        int diffZ = this.z - that.z;
        return diffX*diffX + diffY*diffY + diffZ*diffZ;
    }

    @Override
    public int hashCode() {
        int hash = 23;
        hash = hash * 31 + x;
        hash = hash * 31 + y;
        hash = hash * 31 + z;
        return hash;
    }

    @Override
    public String toString(){
        return this.x + " " + this.y + " " + this.z;
    }
}

