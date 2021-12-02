package hu.progmasters.list.basiclist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class List01 {

    public static void main(String... args) {
        List<Object> arrayList = new ArrayList<>();
        // Add multiple elements to the list and print the number of the elements
        // Try multiple approach:
        // - 1 by 1
        arrayList.add(6);
        arrayList.add("alma");
        arrayList.add(" van");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        // - via the constructor of the ArrayList
        List<Object> arrayList2 = new ArrayList<>(List.of(" mindenhol", " a", " földön"));
        System.out.println(arrayList2);
        // - via addAll() method
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
    }

}
