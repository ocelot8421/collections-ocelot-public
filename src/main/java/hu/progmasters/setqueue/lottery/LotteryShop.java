package hu.progmasters.setqueue.lottery;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LotteryShop {
    protected List<LotteryTicket> tickets = new ArrayList<>();

    public void buyTicket() {

        Scanner scanner = new Scanner(System.in);
        LotteryTicket lotteryTicket = new LotteryTicket();
        int markedNumber;

        while (!lotteryTicket.isValid()) {
            System.out.println("Melyik számot szeretnéd megjelölni? (1 - 30)");
            markedNumber = scanner.nextInt();
            scanner.nextLine();
            lotteryTicket.markNumber(markedNumber);
        }

        tickets.add(lotteryTicket);
        System.out.println("Sikeresen kitöltötted a szelvényt " + lotteryTicket.numbers);
    }

    public boolean doLottery() {
        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        int randomIndex;

        for (int i = 1; i <= 30; i++) {
            allNumbers.add(i);
        }
//        System.out.println("allNumbers: " + allNumbers);

        for (int i = 0; i < 4; i++) {
            randomIndex = random.nextInt(30 - i);
            int randomNumber = allNumbers.get(randomIndex);
            if (!randomList.contains(randomNumber)) {
                randomList.add(randomNumber);
            }
            allNumbers.remove(randomIndex);
//            System.out.println(allNumbers);
        }
        System.out.println("Nyertes számok: " + randomList);

        boolean winOrNot = false;
        for (LotteryTicket ticket : tickets) {
            winOrNot = randomList.containsAll(ticket.numbers);
            System.out.println("Nyert? " + winOrNot + " " + ticket.numbers);
        }

        randomList.clear();
        return winOrNot;
    }
}
