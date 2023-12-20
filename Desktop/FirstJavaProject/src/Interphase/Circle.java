package Interphase;

public class Circle implements Shape{
    private double radius;
    private final double pi = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi*radius*radius;
    }
}
