package Problem1;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;


    //constructor including givin coordinates
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y2);
        this.end = new MyPoint(x2, y2);
    }


    //constructor including two MyPoint objects (begin & end)
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
}
