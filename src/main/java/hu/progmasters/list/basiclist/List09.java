package hu.progmasters.list.basiclist;

import java.util.*;

public class List09 {

    public static void main(String... args) {
        List<String> al = new ArrayList<>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in 'al'. Use an Iterator!
        ListIterator<String> allIterator = al.listIterator();
        while (allIterator.hasNext()) {
           allIterator.set(allIterator.next() + "a");
        }
        // Hint: the Iterator interface doesn't have the capability to achieve this,
        // so you can use the ListIterator's 'set' method.

        System.out.println(al);
    }

}
