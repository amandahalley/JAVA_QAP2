package Problem2;

import Problem1.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    //Constructors for top-left and bottom-right coordinates
    public MyRectangle (MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    //Get and set top-left and bottom-right

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setbottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // calculate length of horizontal distance from top-left to bottom-right 
    public float getLength() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // calculate vertical distance from top-left to bottom-right 
    public float getWidth() {
        return Math.abs(topLeft.getY() - bottomRight.getX());
    }

    // Calculate the area of the rectangle (length x width)
    public float getArea() {
        

    }

    // Calculate the perimeter of the rectangle (2x length + width)
    public double getPerimeter() {

    }

    // Format for print statement 
    public String toString() {
        return "Top Left = " + topLeft + " Bottom Right = " + bottomRight + " Length = " + getLength() + " width = " + getWidth();
    }
}
