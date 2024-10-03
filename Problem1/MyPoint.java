package Problem1;

public class MyPoint {
    private int x;
    private int y;

    //Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //Get & set X value
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //Get & set Y value
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Return coordinates of the line as an array [x, y]
    public int[] getXY() {
        return new int[]{x, y};
    }

    //Set X & Y
    public void setXY(int x, int y) {
        this.x =x;
        this.y = y;
    }

    //Method to caluclate the distance another point object
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    //Calculate distance to a point with (x, y)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

     //print point X and Y int this format - (x, y)
     public String toString() {
        return "(" + x + "," + y + ")";
    }
}



