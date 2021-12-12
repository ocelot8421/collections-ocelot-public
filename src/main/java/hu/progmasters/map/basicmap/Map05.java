package hu.progmasters.map.basicmap;

import java.util.HashMap;
import java.util.Map;

public class Map05 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        // A THREE értékét írd át 333-ra
        map.replace("THREE", "333");

        // Ha a FOUR értéke DDD, akkor írd felül 444-re
        map.replace("FOUR", "DDD", "444");

        // Írd ki konzolra a kulcs-érték párokat
        System.out.println(map);
    }

}
