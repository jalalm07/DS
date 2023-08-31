package ds.ClassImpl;

public class LineType {
    Point point1;
    Point point2;

    public void LineType(int x1, int y1, int x2, int y2){
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    public boolean isHorizontal(){
        return point1.y == point2.y;
    }

    public boolean isVertical(){
        return point1.x == point2.x;
    }

    public int slope(){
        if(isHorizontal())
            return (point2.y - point1.y) / (point2.x - point1.x);
        else throw new RuntimeException("Slope is undefined for a vertical line.");
    }

    public boolean isParallel(LineType otherLine){
        if (isVertical() && otherLine.isVertical()) {
            return true;
        }
        if (isVertical() || otherLine.isVertical()) {
            return false;
        }
        return slope() == otherLine.slope();
    }
}
