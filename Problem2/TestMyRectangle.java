package Problem2;
import Problem1.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(3,7);
        MyPoint bottomRight = new MyPoint (9,4);


        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        //Test basic methods of MyRectangle class

        System.out.println("My Rectangle: " + rectangle);

    }
}
