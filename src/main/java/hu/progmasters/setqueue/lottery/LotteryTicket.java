package hu.progmasters.setqueue.lottery;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LotteryTicket implements Comparable<LotteryTicket> {
    protected Set<Integer> numbers = new HashSet<>();

    public void markNumber(int number) {
        if (number >= 1 && number <= 45 && !numbers.contains(number)){
            numbers.add(number);
        } else {
            System.out.println("1 és 45 között jelölj meg egy számot, amit még nem jelöltél meg");
        }
    }

    public boolean isValid() {
        return numbers.size() == 6;
    }

    public boolean isWinner(List<Integer> winningNumbers) {
        return numbers.containsAll(winningNumbers);
    }

    @Override
    public int compareTo(LotteryTicket o) {
        return 0;
    }
}
