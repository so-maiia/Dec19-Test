package JavaClass2;

public class JavaClass2Practice {
    public static void main(String[] args) {
        findRectangleArea(6.9,6.6);

        double cArea = 250.96;
        double cArea2= printAreaOfCircle(9.3);
        System.out.println(cArea2);

        boolean isTrue = printTrueArea(7.6,7.6);
        System.out.println(isTrue);



    }
    // declaring a method
    public static void findRectangleArea(double length, double width){
        double area= length * width;
        System.out.println("Area is "+ area);

    }
    public static double printAreaOfCircle(double radius){
        double area= radius * radius * 3.14359;
        System.out.println("Circle area is "+area);
        return area;
    }
//void means (i can do anything within this value. but nothing can be done outside it)
// write a method where if it's a square it will return true but if its a rectangle, it will return false

    public static boolean printTrueArea(double length, double width){
       if (length == width)
           return true;
       else
           return false;

    }

    public boolean cigarParty(int cigars, boolean isWeekend){
        if(!isWeekend && cigars >= 40 && cigars <60)
            return true;
        else if (isWeekend && cigars>=40) {
            return true;
        } else
            return false;
        }

    }

