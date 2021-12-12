package hu.progmasters.comparator.reversenumbers;

import java.util.Comparator;

public class ReverseIntComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer firstNumber, Integer secondNumber) {
        return secondNumber.compareTo(firstNumber);
    }
}
