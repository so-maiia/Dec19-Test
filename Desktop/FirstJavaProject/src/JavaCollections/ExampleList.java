package JavaCollections;

import java.util.ArrayList;

public class ExampleList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(63);
        arrayList.add(34);
        arrayList.add(60);
        arrayList.add(77);
        arrayList.add(68);
        arrayList.add(23);

        int i = 0;
        int max = arrayList.get(0);
        for(int num:arrayList){
            if(num>max){
                max=num;
            }
            System.out.println(max);
        }

    }
}
