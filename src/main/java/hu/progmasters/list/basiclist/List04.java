package hu.progmasters.list.basiclist;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.List;

public class List04 {

    public static void main(String... args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(4);
        // Accidentally we added number 3 twice. Your task is to remove it from the list
        // Do it via code! Don't change the previous lines!
        // Note this two available approaches
        // - remove(int index)
        // - remove(Object o)
        arrayList.remove((Object)2);
        System.out.println(arrayList);
        arrayList.remove(Integer.valueOf(4));
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);
    }

}
