package hu.progmasters.map.basicmap;

import java.util.HashMap;
import java.util.Map;

public class Map01 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THREE", 3);
        map.put("FOUR", 4);

        // Add hozzá a map-hez a 'ONE-111' kulcs-érték párt, de csak akkor, ha a ONE nincs jelen a map-ben.

        // Add hozzá a map-hez a 'FIVE-5' kulcs-érték párt, de csak akkor, ha a FIVE nincs jelen a map-ben.

        // Írasd ki a konzolra a map kulcs-érték párjait

    }

}
