package StringsPractice;

public class ArrayClass {
    public static void main(String[] args) {
//        int num1= 8;
        // declaring an array

        int[] numbers = new int [7];
        numbers[0] = 9;
        numbers[1]= 99;
        numbers[4]= 5;
        numbers[5]= 8;
        numbers[2]= 46;
        numbers[3]= 66;
        numbers[6]= 34;
//        System.out.println(numbers[2]);
        // int default value is 0

//        for(int i=0; i<numbers.length;i++){
//            System.out.println(numbers[i]);
        int sum = 0;

        for(int i=0; i<numbers.length;i++){
            sum = sum+numbers[i];
        }
        System.out.println(sum);
        addSum(numbers);
    }

    public static void addSum(int[] nums){
        // to find the sum
//        int sum =0;
//        for(int i =0; i<nums.length; i++){
//            sum=sum+nums[i];
//        }
//        System.out.println("Sum is "+sum);
        int max = nums[0];
        for (int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
}
