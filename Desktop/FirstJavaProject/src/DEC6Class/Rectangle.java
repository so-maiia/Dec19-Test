package DEC6Class;

public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea(){
        return length * width;
    }
    public double calculatePerimeter(){
        return(2*length + 2*width);
    }
}
//3. Write a Java program to create a class
// called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.