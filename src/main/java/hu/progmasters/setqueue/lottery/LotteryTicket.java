package hu.progmasters.setqueue.lottery;

import java.util.HashSet;
import java.util.Set;

public class LotteryTicket {
    protected Set<Integer> numbers = new HashSet<>();

    public void markNumber(int number) {
        if (number >= 1 && number <= 30){
            numbers.add(number);
        } else {
            System.out.println("1 és 30 között jelölj meg egy számot");
        }
    }

    public boolean isValid() {
        return numbers.size() == 4;
    }

    public boolean isWinner(Set<Integer> winningNumbers) {
        return numbers.containsAll(winningNumbers);
    }
}
