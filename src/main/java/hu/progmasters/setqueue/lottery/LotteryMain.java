package hu.progmasters.setqueue.lottery;

/**
 * 1. Készíts el LotteryTicket osztályt, ami tartalmazza az alábbi dolgokat:
 * - Set<Integer> numbers
 * - void markNumber(int number) metódus
 * - boolean isValid() metódus
 * - boolean isWinner(Set<Integer> winningNumbers) metódus
 * <p>
 * A lottószelvényen 1 és 30 között szerepelhetnek megjelölve számok, és akkor számít érvényesnek egy szelvény, ha
 * pontosan 4 szám van megjelölve rajta.
 * Nyertesnek csak akkor számít a szelvény, ha a paraméterben kapott összes számot tartalmazza megjelölve.
 * <p>
 * 2. Készíts egy LotteryShop osztályt, ami az alábbi dolgokat tartalmazza:
 * - List<LotteryTicket> tickets
 * - public void buyTicket() metódus, ami hozzon létre egy új LotteryTicket példányt, és jelöljön meg rajta számokat
 * egészen addig, amíg nem számít érvényesnek a szelvény, majd adja azt hozzá a tickets listához
 * - public boolean doLottery() metódus, ami válasszon ki véletlenszerűen 4 számot 1 és 30 között (a nyertes számokat),
 * majd adja vissza, hogy ezen a héten volt-e nyertes szelvény, és a végén törölje a lista tartalmát
 * <p>
 * A szelvények kitöltésénél és a sorsolásnál is a véletlen számok generálására használhatod az alábbi megoldást:
 * Random random = new Random();
 * int nextNumber = random.nextInt(100) + 1;
 *
 * A main metódusból próbáld ki különböző mennyiség szelvények vásárlásával, hogy nyertél-e.
 * Hány szelvénynél lett szerencséd? :)
 */
public class LotteryMain {

    public static void main(String[] args) {
        LotteryShop lotteryShop = new LotteryShop();
        lotteryShop.buyTicket();
        lotteryShop.buyTicket();
        lotteryShop.buyTicket();

        lotteryShop.doLottery();
    }
}
