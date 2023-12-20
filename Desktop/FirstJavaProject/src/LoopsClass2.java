public class LoopsClass2 {

    public static void main(String[] args) {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//            if (i == 10) {
//                System.out.println("** " + i);
//                break;
//                // break means break the loop
//            }
//        }

//        for(int i=0; i<5; i++){
//            System.out.println(i);
//            break;
//            // you will see 0, because it starts at 0 and immediately break
        // after a certain position and we do not want to run it anymore
        // run a loop for 1000 times and get the sum of the even numbers stop the loop when sum==1000 and show me the last num
        int sum = 0;
//        for (int i = 0; i < 1000; i++) {
//            if (i % 2 == 0) {
//                sum = sum + i;
//            }
//            if (sum >= 1000) {
//                System.out.println(i);
//                System.out.println(sum);
//                break;
//
//            }
//
//        }
        for(int i=10;i<19;i++){
            if(i==12 || i==13)
                continue;
            // continue causes it to skip 3
            System.out.println(i);
            System.out.printf("***");
            System.out.println();
// ||-> or && -> and
        }

    }
}
