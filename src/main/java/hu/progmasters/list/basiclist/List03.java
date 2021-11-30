package hu.progmasters.list.basiclist;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String... args) {
        List<Object> arrayList = new ArrayList<>();
        arrayList.add("first");
        arrayList.add(2);
        arrayList.add("third");
        arrayList.add(false);
        // Accidentally we added "2" and "false" to the list. Your task is to change from "2" to "second" and change from "false" to "fourth"
        // Do it via code! Don't change the previous lines!

        System.out.println(arrayList);
    }
}
