import java.util.Scanner;

public class jq17{
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        // Circle
        System.out.print("Enter the radius of the circle: ");
        double radius = c.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle: " + circle.calculateArea());

        // Rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = c.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = c.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());

        // Triangle
        System.out.print("Enter the base length of the triangle: ");
        double base = c.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = c.nextDouble();
        Triangle triangle = new Triangle(base, height);
        System.out.println("Area of the triangle: " + triangle.calculateArea());

        c.close();
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}
