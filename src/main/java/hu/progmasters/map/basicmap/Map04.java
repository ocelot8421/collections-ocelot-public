package hu.progmasters.map.basicmap;

import java.util.HashMap;
import java.util.Map;

public class Map04 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        // Írd ki konzolra a map kulcs-érték párjait

        // Töröld a map-ből a ONE kulcsot

        // Töröld a map-ből a THREE kulcsot, ha jelenleg az értéke DDD

        // Töröld a map-ből a FIVE kulcsot, ha jelenleg az értéke EEE

        // Írd ki újra a map kulcs-érték párjait
    }

}
