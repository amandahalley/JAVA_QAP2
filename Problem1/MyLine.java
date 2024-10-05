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



    
}
