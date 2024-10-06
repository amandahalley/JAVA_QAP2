package Problem1;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;


    //constructor including givin coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }


    //constructor including two MyPoint objects (begin & end)
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }


    //Getters and Setters

    //Begin point
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin (MyPoint begin) {
        this.begin = begin;
    }

    //End point
    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // X - coordinate begin point
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    // Y - coordinate begin point
    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    //X - coordinate end point
    public int getEndX() {
        return end.getX();
    }

    public void getEndX(int x) {
        end.setX(x);
    }

    // Y - coordinate end point
    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    // Get both begin coordinates as an array and set both
    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Get both end coordinates as an array and set both
    public int[] getEndXY() {
        return end.getXY();
    }

    public void getEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Calculateing length of line using distance method from MyPoint class
    public double getLength() {
        return begin.distance(end);
    }


    // Calculating gradient of line (slope)
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(xDiff, yDiff);
    }

    // Print line in format given
    public String toString() {
        return "MyLine[begin = " + begin + ", end = " + end + "]";
    }
    
}
