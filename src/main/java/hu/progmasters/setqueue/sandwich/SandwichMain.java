package hu.progmasters.setqueue.sandwich;

/**
 * Az iskolai menzán szeretnénk megkönnyíteni a reggeli elkészítését, ezért a szendvicsek elkészítéséhez konyhai
 * robotokat állítunk szolgálatba.
 * A robotok egyetlen alapanyag hozzáadására programozhatóak csak be, és egyszerre csak egy szendviccsel tudnak
 * foglalkozni.
 *
 * 1. Készíts egy Sandwich osztályt, ami tartalmazzon egy String listát a már a szendvicsre került hozzávalókról, egy
 * addIngredient(String ingredient) metódust, illetve egy gettert a listához.
 *
 * 2. Készíts egy KitchenRobot osztályt, ami konstruktorban kapjon 3 paramétert:
 * - egy hozzávaló nevét (ez legyen String)
 * - egy tőle balra levő tálcát (Queue)
 * - egy tőle jobbra levő tálcát (Queue)
 *
 * Hozz létre egy public void prepareSandwich() metódust, amiben a robot vegye el a balra levő tálcáról a legrégebben
 * rákerült szendvicset, adja hozzá a hozzávalót, majd tegye rá a jobboldali tálcára.
 * Hogy a feladat ellenőrizhető legyen, ezért a robot írja is ki a konzolra, hogy melyik robot ő, és hogy megcsinált egy
 * szendvicset.
 *
 * 3. Készíts egy Kitchen osztályt, ami a munkafolyamatot fogja koordinálni. Hozz létre benne három robotot, sorban
 * az alábbi hozzávalókhoz:
 * - mogyoróvaj
 * - lekvár
 * - banánszeletek
 *
 * A három robot létrehozásakor ügyelj rá, hogy megfelelően össze kell kötni őket, azaz a mogyoróvajas robot jobb oldali
 * tálcája megegyezik a lekváros robot bal oldali tálcájával, ahogy a lekváros robot jobb oldali tálcája pedig a banános
 * robot bal oldali tálcájával.
 *
 * A Kitchen osztályban változóként csak az első és az utolsó tálcát tárold el külön.
 *
 * Hozz létre egy public List<Sandwich> prepareSandwiches(int quantity) metódust, ami az alábbi dolgokat csinálja:
 * - feltölti a kezdőtálcát a megadott mennyiségű üres szendviccsel
 * - egy ciklusban legyártatja a szendvicseket a robotokkal, minden lépésben minden robot egy szendviccsel dolgozik csak
 * - a legvégén készíts az utolsó tálcában egy Listet, amit adjon vissza a metódus (ha LinkedListet használtál Queue
 * implementációnak, akkor is készíts másolatot belőle)
 *
 * Ha a prepareSandwiches() metódusod hosszú lenne, akkor emeld ki az egyes lépéseket belőle külön metódusokba!
 *
 * A main metódusban próbáld ki az alkalmazásod működését.
 *
 * Opcionális 1:
 * Írj teszteket a Sandwich, a KitchenRobot és a Kitchen osztályokhoz is.
 *
 * Opcionális 2:
 * A költségvetésbe csak olcsó robotok fértek bele, amik viszonylag gyakran hibáznak. Minden robot 10% eséllyel úgy adja
 * tovább a szendvicset, hogy nem teszi rá a hozzávalót, 10% eséllyel elejti a szendvicset, 10% eséllyel pedig nem
 * csinál semmit. Ehhez akár a Random osztályt, akár a Math.random() metódust használhatod.
 *
 * Kezeld azt az esetet, ha egy robot nem tudja végrehajtani a feladatát, mert üres a balra levő tálca, ellenőrizd, hogy
 * ilyenkor nem áll le hibával az alkalmazás, illetve írja is ki a robot konzolra, hogy nincs mit csinálnia.
 *
 * Hogy az alkalmazás továbbra is tesztelhető maradjon, ezért a KitchenRobot osztályba vegyél fel egy boolean buggy
 * változót, amivel ki-be tudod kapcsolni a hibás működést, a változó értékét pedig a konstruktorban kérd be, gettert és
 * settert nem kell írni hozzá.
 * Emellett a Kitchen osztály konstruktorában kérd be paraméterként, hogy bugos robotokat hozz-e létre.
 *
 * A teszteket elegendő a jól működő robotokra, illetve az azokat tartalmazó konyhára megírni.
 *
 */
public class SandwichMain {

    public static void main(String[] args) {

    }
}
