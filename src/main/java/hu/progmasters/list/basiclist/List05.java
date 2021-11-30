package hu.progmasters.list.basiclist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List05 {

    public static void main(String... args) {
        List<String> arrayList = new ArrayList<>();
        int random = new Random().nextInt(20);
        for (int i = 0; i < 20; i++) {
            if (i == random) {
                arrayList.add("removable");
            }
            arrayList.add("" + i);
        }
        // Remove "removable" from the list, but without using the index of the element.

        System.out.println(arrayList);
    }
}
