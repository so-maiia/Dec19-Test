public class SecondClass {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 199;
        int num4 = num3+num1+2;

        int grade = 89;

        if (num1>num2){
            System.out.println(num1+" is larger");
        }
        else {
            System.out.println(num2+" is larger");
        }

        if(num1>num2 && num1>num3){
            System.out.println(num1+" is the largest");
        }
        else if (num2>num1 && num2>num3){
            System.out.println(num2+" is the largest");
        } else {
            System.out.println(num3+" is the largest");
        }
    }
}
