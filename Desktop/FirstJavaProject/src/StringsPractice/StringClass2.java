package StringsPractice;

public class StringClass2 {
    public static void main(String[] args) {
        String color = "yellow";

        System.out.println(color.charAt(2));

        if(color.charAt(2)== 'l')
            System.out.println("yes");
        else
            System.out.println("no");

        String color2 = "Yellow";
        System.out.println(color.equals(color2));
        System.out.println(color.equalsIgnoreCase(color2));

        String color3 = "white";
        System.out.println(color3.toLowerCase().toUpperCase());

        String color4 = "Black";
        System.out.println(color4.replace('a','e'));

        String colorString = "I love Blue";
        String[] sArray= colorString.split("l");
        System.out.println(sArray.length);
        System.out.println(sArray[2]);

    }
}
