package Problem2;
import Problem1.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(3,7);
        MyPoint bottomRight = new MyPoint (9,4);


        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        //Test basic methods of MyRectangle class

        System.out.println("\nMy Rectangle: " + rectangle);


        //Test getLength
        System.out.println("\nLength = " + rectangle.getLength());

        //Test getWidth
        System.out.println("Width = " + rectangle.getWidth());

        //Test getArea
        System.out.println("Area = " + rectangle.getArea());

        //Test getPerimeter

        System.out.println("Perimeter = " + rectangle.getPerimeter());


    }
}
