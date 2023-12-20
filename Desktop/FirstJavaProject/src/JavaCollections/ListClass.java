package JavaCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClass {
    public static void main(String[] args) {
//        int[] nums= new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(20);
        arrayList.add(9);

        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        //^ for the size of the array

        for(int i = 0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

//        for (int i = 0; i < ; i++) {
//
//        }

        // for each loop
        for (Integer num:arrayList) {
          //  System.out.println(num);
        }
//        arrayList.clear();
//        System.out.println(arrayList.size());
        arrayList.remove(3);
        System.out.println(arrayList.get(3));

        List<String> names = new LinkedList<>();
        names.add("ABC");
        names.add("DEF");
        names.add("XYZ");

        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("China");


    }
}
