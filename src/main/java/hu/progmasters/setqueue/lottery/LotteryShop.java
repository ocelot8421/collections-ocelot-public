package hu.progmasters.setqueue.lottery;

import java.security.SecureRandom;
import java.util.*;

public class LotteryShop {
    protected List<LotteryTicket> tickets = new ArrayList<>();

    public void buyTicket() {

        Scanner scanner = new Scanner(System.in);
        LotteryTicket lotteryTicket = new LotteryTicket();
        int markedNumber;

        System.out.println("Mely számokat szeretnéd megjelölni? (1 - 45)");
        while (!lotteryTicket.isValid()) {
            markedNumber = scanner.nextInt();
            scanner.nextLine();
            lotteryTicket.markNumber(markedNumber);
        }

        tickets.add(lotteryTicket);


        List<Integer> numbersSorted = new ArrayList<>(lotteryTicket.numbers);

        Collections.sort(numbersSorted);
        System.out.println("Sikeresen kitöltötted a szelvényt " + numbersSorted);
    }

    public void doLottery() {
        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        int randomIndex;

        for (int i = 1; i <= 30; i++) {
            allNumbers.add(i);
        }

        for (int i = 0; i < 6; i++) {
            randomIndex = random.nextInt(30 - i);
            int randomNumber = allNumbers.get(randomIndex);
            if (!randomList.contains(randomNumber)) {
                randomList.add(randomNumber);
            }
            allNumbers.remove(randomIndex);
//            System.out.println(allNumbers);
        }
        System.out.println("Nyertes számok: " + randomList);

        boolean winOrNot;
        List<Integer> sortedMarkedNumbers = new ArrayList<>();
        int sameNumbers;
        for (LotteryTicket ticket : tickets) {
            winOrNot = ticket.isWinner(randomList);
            String result = winOrNot ? "Igen" : "Nem";
            sameNumbers = sameNumbers(ticket.numbers, randomList);
            sortedMarkedNumbers.addAll(ticket.numbers);
            Collections.sort(sortedMarkedNumbers);
            System.out.println("Nyert? " + result + " " + sortedMarkedNumbers + "\n" +
                    "   Találatok száma: " + sameNumbers);
            sortedMarkedNumbers.clear();
        }

        randomList.clear();
    }

    private int sameNumbers(Set<Integer> markedNumbers, List<Integer> winnerNumbers) {
        int counter = 0;
        for (Integer markedNumber : markedNumbers) {
            if (winnerNumbers.contains(markedNumber)) {
                counter++;
            }
        }
        return counter;
    }

}
