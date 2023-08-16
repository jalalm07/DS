package alltest.ClassImpl;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateDiameter() {
        return 2 * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0;
        Circle circle = new Circle(radius);

        double area = circle.calculateArea();
        double diameter = circle.calculateDiameter();

        System.out.println("Circle with radius " + radius);
        System.out.println("Area: " + area);
        System.out.println("Diameter: " + diameter);
    }
}
