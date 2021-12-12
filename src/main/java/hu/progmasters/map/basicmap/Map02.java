package hu.progmasters.map.basicmap;

import java.util.HashMap;
import java.util.Map;

public class Map02 {

    public static void main(String[] args) {
        Map<Integer, Double> map = new HashMap<>();

        map.put(111, 111.111);
        map.put(222, 222.222);
        map.put(333, 333.333);
        map.put(444, 444.444);
        map.put(555, 555.555);

        // Írd ki konzolra a kulcs-érték párokat
        System.out.println(map);

        // Ürítsd ki a map-et
        map.clear();

        // Vizsgáld meg, hogy hány eleme van a map-nek a törlés után
        System.out.println(map.size());
    }

}
