package JavaClass2;

public class LoopPractice {
    public static void main(String[] args) {
        // we use a loop when we want to repeat a sequence
        // i want the summation of 1 to 100
//        int sum=0;
//        //we declare int sum=0
//        for (int i=1; i<=100; i++){
//            sum = sum+i;
//        }
//        System.out.println(sum);
//        // runs the loop until it (i<=5) is false
//        for(int i=1; i<=5; i++){
//            System.out.println("******");
//            System.out.println("Value of i is "+(i+1));
//            System.out.println("####");
        int sum=0;
        int i=1;
        for (i=1; i<=100; i++){
            sum= sum+i;
            if (sum > 2000) {
                break;
            }

        }
        System.out.println(i);
        System.out.println(sum);

        }
}
