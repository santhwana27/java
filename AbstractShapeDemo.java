abstract class Shape {

    abstract void calculateArea();

    void display() {
        System.out.println("Area calculation");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class AbstractShapeDemo {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.calculateArea();

        r.display();
        r.calculateArea();
    }
}
