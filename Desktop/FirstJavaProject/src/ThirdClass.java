import java.util.Scanner;

public class ThirdClass {
    public static void main(String[] args) {
        int num = 9;
        num = num+10;
        num =num + 1;
        num++;
        num--;
        //String name = "Dhaka";
        //name = "New York";
        System.out.println(num);

        int num2 =11%3;
        System.out.println(num2);
        //remainder of what you divide

        // Use scanner to get an output that says whether it is odd or even.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");

        int num1 = scanner.nextInt();
        if (num1 % 2 ==0) {
            System.out.println(num1 + " is an Even number");
        } else {
        System.out.println(num1+ " is an Odd number");
        }

    }
}
