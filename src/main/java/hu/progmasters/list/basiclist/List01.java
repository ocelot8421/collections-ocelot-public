package hu.progmasters.list.basiclist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class List01 {

    public static void main(String... args) {
        List<Object> arrayList = new ArrayList<>();
        // Add multiple elements to the list and print the number of the elements
        // Try multiple approach:
        // - 1 by 1
        arrayList.add(6);
        arrayList.add("alma");
        arrayList.add(" van");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        // - via the constructor of the ArrayList
        List<Object> arrayList2 = new ArrayList<>(List.of(" mindenhol", " a", " földön"));
        System.out.println(arrayList2);
        // - via addAll() method
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);

        //Lotteryhez mókolás:

        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        int randomIndex;

        for (int i = 1; i <= 30; i++) {
            allNumbers.add(i);
        }
        System.out.println("allNumbers: " + allNumbers);

        for (int i = 0; i < 30; i++) {
            randomIndex = random.nextInt(30 - i);
            int randomNumber = allNumbers.get(randomIndex);
            if (!randomList.contains(randomNumber)) {
                randomList.add(randomNumber);
            }
            allNumbers.remove(randomIndex);
            System.out.println(randomList);
            System.out.println(allNumbers);
        }

        int divRandomNumber = 0;
        for (int i = 0; i < randomList.size() - 1; i++) {
            divRandomNumber += (randomList.get(i + 1) - randomList.get(i));
        }
        divRandomNumber += (randomList.get(0) - randomList.get(randomList.size() - 1));


        System.out.println("randomList: " + randomList);
        System.out.println("divRandomNumber: " + divRandomNumber);
        System.out.println("size: " + randomList.size());
        System.out.println("allNumbers: " + allNumbers);
    }

}
