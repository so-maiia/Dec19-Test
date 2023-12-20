package StringsPractice;

public class StringArrayClass {
    public static void main(String[] args) {
        String[] countries = new String[5];
        String[] names = {"Hossain", "Shirin","Zahia","Ait","Tipu"};
        String name = "Shirin";
        //System.out.println(names[3]);
        for(int i = 0; i<names.length;i++){
//            System.out.println(names[i]);
            if(names[i].equals(name)){
                System.out.println("yes present");
            }
        }
    }
}
