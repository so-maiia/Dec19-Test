public class DoWhileLoop {
    public static void main(String[] args) {
//        int i=5;
//        do{
//
//            System.out.println("do "+i);
//            i++;
//
//        }while (i<5);
//        // do loop will run one loop because it checks the conditions after running
//        //****
//        i=5;
//        while(i<5){
//            System.out.println("while "+i);
//            i++;
//            // i++ means that it will increase up to 5

        // run a loop from 1990 to 2023 and find out how many leap years we have

        int year=1990;
        int i=0;
        while (year<2023){

            if (year%4==0){
                i= i+1;
            }
            year++;
        }
        System.out.println(i);

//        year= 2015;
//        i=1;
//        while(i<=4){
//            if ((year%4)==0){
//                System.out.println(year);
//                break;
//            }
//            year =year+i;
//            i++;
//
//        }
    }
}

