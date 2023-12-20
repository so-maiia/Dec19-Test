package StringsPractice;

public class StringClass {
    public static void main(String[] args) {
//        String city= "New York";
//        // spaces are considered a character
//        System.out.println(city.length());
//
//        String anything = "dhaka";
//
//        System.out.println(city.contains("York"));
//        String city2 = "New York";
//
//        System.out.println(city.equals(city2));
//
//        System.out.println(city == city2);
//
//        System.out.println(city.charAt(2));
//
//        String name = "Somaia";
//        String name2 = name.replace('a','b');
//        System.out.println(name2);
//
//        if(city.length()>anything.length()) {
//            System.out.println(city +" is longer");
//        } else {
//            System.out.println(city + " is not longer");
//            }
        String country = "bangladeshlaa";

//        for(int i=0;i<country.length(); i++){
//            System.out.println(country.charAt(i));
//        }
// find the L present in the variable bangladesh
        boolean isPresent = false;
        for (int i = 0; i < country.length(); i++) {
            if (country.charAt(i) == 'l') {
                System.out.println("L is present");
//                isPresent = true;
            }
        }
//        System.out.println("L is present");
        System.out.println(country.indexOf('a'));
        // find all the 'a' in the word (loop) + counter
        int count = 0;
        for (int i = 0; i < country.length(); i++) {
            if (country.charAt(i) == 'a') {
                    count++;
            }
        }
        System.out.println(count);

    }
}