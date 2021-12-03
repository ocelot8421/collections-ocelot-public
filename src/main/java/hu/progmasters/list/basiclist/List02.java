package hu.progmasters.list.basiclist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List02 {
    public static void main(String... args) {
        String[] numbers = new String[]{"one", "two", "three", "four", "five"};
        // Initialize the arrayList using the numbers array
        List<String> arrayList = new ArrayList<>(); // ??
        arrayList.addAll(Arrays.asList(numbers));
        System.out.println(arrayList);
    }
}
