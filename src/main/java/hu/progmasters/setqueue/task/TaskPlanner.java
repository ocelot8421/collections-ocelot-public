package hu.progmasters.setqueue.task;

/**
 * A feladatunk egy tennivaló-rendszerező alkalmazás elkészítése, ahol a feladatokat a megadás sorrendjében akarjuk
 * utána megoldani.
 *
 * 1. Készíts egy Task osztályt, ami két változót tartalmaz:
 * - String description - a feladat leírása
 * - int time - a megoldáshoz szükséges órák száma
 *
 * A változók értékét a Task létrehozásakor, konstruktorban szükséges megadni, és utólag nincs lehetőség megváltoztatni
 * őket, ezért csak getter metódust írj hozzájuk.
 *
 * 2. Készíts egy Queue taskQueue változót ebbe az osztályba, és példányosítsd is az egyik implementációjával.
 * Jelen feladatra akár a LinkedList, akár az ArrayDeque megfelelő lehet implementációnak, mindkettő rendelkezik a
 * szükséges metódusokkal.
 *
 * 3. Készítsd el ebbe az osztályba az alábbi metódusokat:
 * - public void addTask(String name, int time): hozzon létre egy Task példányt a megadott paraméterekkel, és mentse
 * el a sorba
 * - public void doTask(): vegye ki a legrégebben bekerült Taskot a sorból, és írja ki a konzolra, hogy elkészült,
 * mi volt a leírása, és mennyi időbe telt megcsinálni
 * - public void previewTask(): írja ki a konzolra, hogy mi lesz a következő Task leírása és a megoldásához szükséges
 * idő, de magát a Taskot hagyja benne a sorban
 *
 * 4. Készítsd egy TaskPlannerMain osztályt, hozz létre abban egy main metódust, és onnan ellenőrizd le a TaskPlanner
 * osztályod működését.
 *
 * Opcionális:
 * Készíts egy UserInterface osztályt, ami az alábbi dolgokkal rendelkezik:
 * - TaskPlanner taskPlanner változó
 * - public void run() metódus
 *
 * A run() metódusban írd ki a konzolra az elérhető opciókat az alkalmazásban, konzolon kérd be a felhasználótól, hogy
 * melyiket akarja használni, illetve a szükséges információkat, ha vannak ilyenek.
 * Az alkalmazás egészen addig fusson, amíg a kilépésre konkrét utasítást nem ad a felhasználó, addig folyamatosan
 * lehessen megadni újabb utasításokat.
 * (Segítség: a második hét feladatai között találhattok ilyen konzolos menüre példát)
 */
public class TaskPlanner {
}
