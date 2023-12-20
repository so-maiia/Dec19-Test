package Interphase;

public class TestShapeClass {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.printmessage("World");
        classA.eatFood("Piaju");

        Circle circle = new Circle(34.5);
        System.out.println(circle.getArea());

        Rectangle rectangle = new Rectangle(23.4,34.4);
        System.out.println(rectangle.getArea());

        Triangle triangle = new Triangle(33.2,44.9);
        System.out.println(triangle.getArea());
    }

    public void printShapeArea(Shape shape){
        System.out.println(shape.getArea());
    }

}
