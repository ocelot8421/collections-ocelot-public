package hu.progmasters.list.basiclist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List06 {
    public static void main(String... args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // Check if the arrayList contains "7". If it does, print "Hoorray". Otherwise print "Noooooo".
        if (arrayList.contains(7)){
            System.out.println("Hoorray");
        } else {
            System.out.println("Noooooo");
        }
    }
}
