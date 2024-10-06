package Problem1;

public class TestMyLine {
    public static void main(String[] args) {


        //Tests for MyPoint class
        System.out.println("\nTests for MyPoint:");

        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(6,8);

        //Using "MyPoint another" method
        double distance1 = p1.distance(p2);
        System.out.println("\nDistance between point 1 and point 2 is: " + distance1);

        //using distance (x, y)
        double distance2 = p1.distance(3, 4);
        System.out.println("Distance between point 1 and (3,4) is: " + distance2);
        
        // Create MyLine from MyPoint objects
        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(3, 4);

        MyLine line1 = new MyLine(begin, end); 

        // Create MyLine with two sets of coordinates
        MyLine line2 = new MyLine(0, 0, 6, 8);



        //Display both lines
        System.out.println("\nTests for MyLine: ");

        System.out.println("\nLine 1 = " + line1);
        System.out.println("Line 2 = " + line2);

        //Test for getLength and getGradient
        double length = line1.getLength();
        System.out.println("\nThe length of line 1 is: " + length);

        double gradient = line1.getGradient();
        System.out.println("The gradient of line 1 is: " + gradient);

        //Test for setters and getters
        line1.setBeginXY(4, 4);
        line1.setBeginXY(6, 7);
        System.out.println("\nUpdated line 1: " + line1);


        //Test other setters
        line1.setBeginX(2);
        line2.setEndY(8);
        System.out.println("Updated line 2: " + line2);

        


        
    }

    
}
