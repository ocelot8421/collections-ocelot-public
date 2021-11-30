package hu.progmasters.comparator.reversenumbers;

import java.util.Arrays;
import java.util.List;

/**
 * Írd meg a ReverseIntComparatort úgy, hogy fordítva (nagyobbtól a kisebb felé)
 * rendezze el a listát a meglévő kód!
 */
public class ReverseNumbersMain {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 7, 4, 9, 1, 4, 6, 7, 2);
        System.out.println(integers);
        integers.sort(new ReverseIntComparator());
        System.out.println(integers);
    }

}
