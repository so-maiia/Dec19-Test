package Test;

public class Test1Part2 {
    public static boolean present9(int[] numbers) {
        int length = 0;
        boolean isPresent = false;
        if (numbers.length > 4)
            length =4;
        else length = numbers.length;

        for(int i=0; i<length; i++){
            if (numbers[i]==9)
                isPresent = true;
            }
        return isPresent;
        }

    }

