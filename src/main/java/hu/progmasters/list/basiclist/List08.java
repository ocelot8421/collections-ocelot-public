package hu.progmasters.list.basiclist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List08 {
    public static void main(String... args) {
        List<String> list = new ArrayList<>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list using a for loop and an Iterator as well
        System.out.println("-- Using a for loop:");
        for (String h : list) {
            System.out.print(h + " ");
        }
        System.out.println();

        System.out.println("-- Using Iterator:");
        Iterator<String> needForPrinting = list.iterator();
        while (needForPrinting.hasNext()) {
            System.out.print(needForPrinting.next() + " ");
        }
    }
}
