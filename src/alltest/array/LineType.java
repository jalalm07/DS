package alltest.array;

public class LineType {

    public class Point {
        public double x;
        public double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point point1;
    private Point point2;

    public LineType(double x1, double y1, double x2, double y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    public boolean isHorizontal() {
        return point1.y == point2.y;
    }

    public boolean isVertical() {
        return point1.x == point2.x;
    }

    public double slope() {
        if (isVertical()) {
            throw new RuntimeException("Slope is undefined for a vertical line.");
        }
        return (point2.y - point1.y) / (point2.x - point1.x);
    }

    public boolean parallel(LineType otherLine) {
        if (isVertical() && otherLine.isVertical()) {
            return true;
        }
        if (isVertical() || otherLine.isVertical()) {
            return false;
        }
        return slope() == otherLine.slope();
    }

    public static void main(String[] args) {
        LineType line1 = new LineType(1, 2, 3, 2);
        LineType line2 = new LineType(4, 5, 4, 7);
        LineType line3 = new LineType(1, 2, 3, 4);

        System.out.println("Line 1 is horizontal: " + line1.isHorizontal());
        System.out.println("Line 2 is vertical: " + line2.isVertical());
        System.out.println("Line 3 slope: " + line3.slope());

        System.out.println("Line 1 parallel to Line 2: " + line1.parallel(line2));
        System.out.println("Line 1 parallel to Line 3: " + line1.parallel(line3));
    }
}
