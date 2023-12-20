package StringsPractice;

public class ArrayClass4 {
    public static void main(String[] args) {
        String[] colors = {"Blue", "Orange", "White", "Black", "Red", "Yellow", "Purple"};

        for (int i = 0; i < colors.length; i++) {
//            System.out.println(colors[i].toLowerCase());
        }
        // only print the color if it contains the letter A
        boolean isPresent = false;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].contains("a")) {
//                System.out.println(colors[i]);
            }
        }
        // print only the color with the most number of letters
        int max = 0;
        String col= "";
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].length() > max) {
                max = colors[i].length();
                col = colors[i];
            }
        }
        System.out.println(col);


        // print the string reversed

        for(int i=colors.length-1; i >= 0; i--){
            System.out.println(colors[i]);
        }


        for (String color: colors) {
            System.out.println(color);

        }
        int[] nums = {2,6,9,8};
        for (int num: nums) {
            if (num%2==0)
                System.out.println(num);

        }
    }
}


