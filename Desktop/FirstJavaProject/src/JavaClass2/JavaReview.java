package JavaClass2;

public class JavaReview {
    int num=10;
// num is never used
    public static void main(String[] args) {
//        int num1=90;
//        int num2=num1+10;
//        int num3= num1+num2;
//        System.out.println(num3);
//
//        num3= num3+10;
//        System.out.println(num3);

        double dNum1= 23.6;
        double dNum2= 63.7;
        double dNum3= 630.85;

        char ahr= '$';
        String name ="ABCD";

        //IF ELSE-CONDITIONS (Flow charts)
        // I want to see the summation of the first two numbers if it's greater than the third num.
        // print 'yes it is greater' or 'no it is not greater'

//        if ((dNum1+dNum2)> dNum3){
//            System.out.println(" it's not the greatest value");
//        }
//        else if ((dNum1+dNum2)<dNum3){
//            System.out.println(" it's the greatest value");
//        }

        int month=5;

        switch (month){
            case 1:{
                System.out.println("Month is January");
                break;
            }
            case 2: {
                System.out.println("Month is February");
                break;
            }
            case 12: {
                System.out.println("Month is December");
                break;
            }
            default: {
                System.out.println("No Idea");
            }
        }



    }

}
//method is a block of code that, when called, performs specific actions mentioned in it
//we can declare two things in the class body -variable and method
// int, double, char, string, boolean