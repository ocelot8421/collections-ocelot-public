package hu.progmasters.list.basiclist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List10 {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        // Fix this code fragment! It should remove every even number from the list.
        for (int element : al) {
            if (element % 2 == 0) {
                al.remove(element);
            }
        }

        System.out.println(al);
    }
}

