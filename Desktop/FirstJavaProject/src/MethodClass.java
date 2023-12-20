public class MethodClass {
    public static void main(String[] args) {

        int num1=8;
        int num2=8;
        int sum= num1+num2;

        System.out.println(sum);
        System.out.println("****");
        // dry> do not repeat yourself
        num1=50;
        num2=20;
        sum= num1+num2;
        System.out.println(sum);
        addTwoNumbers();
        addTwoNumbersWithPara(9,8);
        addTwoNumbersWithPara(56,54);
        multiplyThreePara(7,8,9);
        largestPara(8,9,3);

        int result= multiplyThreeParam(5,6,8);
        System.out.println(result);

        isFirstOneLarger(8,3);

    }
    public static void addTwoNumbers(){
        int num1=63;
        int num2=11;
        int sum= num1+num2;

    }
    public static void addTwoNumbersWithPara(int num1, int num2){
        int sum= num1+num2;
        System.out.println(sum);

    }
    public static void multiplyThreePara(int num1, int num2, int num3){
        int sum= num1*num2*num3;
        System.out.println(sum);
    }
    //write a method which will take 3 integers and print the largest out of the three parameters
    public static void largestPara(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println(num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
    public static int multiplyThreeParam(int num1, int num2, int num3){
        int sum= num1*num2*num3;
//        System.out.println(sum);
        return sum;
// we use return when we don't use VOID
    }
    //create a method that will take two parameters, it will return true if first param is larger than second

    public static boolean isFirstOneLarger(int num1, int num2){
        if (num1 > num2)
            return true;
        else
            return false;
//        return num1>num2;

    }
}
