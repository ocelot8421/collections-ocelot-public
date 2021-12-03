package hu.progmasters.list.basiclist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List10 {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        // Fix this code fragment! It should remove every even number from the list.
//        for (int element : al) {
//            if (element % 2 == 0) {
//                al.remove(element);
//            }
//        }
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) % 2 == 0) {
                al.remove(al.get(i));
            }
        }

        // al.removeIf(integer -> integer % 5 == 0);
        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 5 == 0) {
                iterator.remove();
            }
        }

        System.out.println(al);
    }
}

