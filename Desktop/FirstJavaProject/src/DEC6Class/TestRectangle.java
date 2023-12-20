package DEC6Class;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(9.0);
        rectangle.setWidth(4.3);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
    }
    }

