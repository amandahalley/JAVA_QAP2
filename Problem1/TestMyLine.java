package Problem1;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(6,8);

        //Using "MyPoint another" method
        double distance1 = p1.distance(p2);
        System.out.println();
        System.out.println("\nDistance between point 1 and point 2 is: " + distance1);

        //using distance (x, y)
        double distance2 = p1.distance(3, 4);
        System.out.println("\nDistance between point 1 and (3,4) is: " + distance2);

        // Testing length of line

        MyPoint begin = new MyPoint(0, 0);
        MyPoint end = new MyPoint(6, 8);

        MyLine line = new MyLine(begin, end); 

        double length = line.getLength();
        System.out.println("\nLength of line is: " + length);
    }

    
}
