package hu.progmasters.list.blockbuster;


/**
 * Az alkalmazásunkban egy videotékát szeretnénk menedzselni.
 *
 * 1. Készítsünk egy VideoTape osztályt, ami az alábbi változókat tartalmazza:
 * - String title
 * - int length
 * - List<String> mainActors
 *
 * A változókat konstruktor paraméterben kötelező megadni, és tartozik hozzájuk getter és setter metódus
 *
 * 2. Készítsünk egy BlockBuster osztályt, ami az egyes videótékákat fogja jelképezni. Az osztály az alábbi dolgokat
 * tartalmazza:
 * - List<VideoTape> videoTapes
 * - void addTape(String title, int length, List<String> mainActors): hozzáadja a listához a videókazettát
 * - boolean findTape(String title): visszaadja, hogy bent megvan-e a kazetta
 * - VideoTape rentTape(String title): megkeresi a legelső adott című kazettát a listában, majd ha létezik ilyen, akkor
 * kiveszi a listából és visszatér vele, ha nem létezik, akkor null-t ad vissza
 * - List<String> findByActor(String name): visszaadja listában az összes olyan film címét, amiben szerepel a
 * paraméterként kapott színész
 *
 * A findByActor() metódusnál ellenőrizzük le azt is, hogy egy cím csak egyszer szerepeljen a visszaadott listában.
 */
public class BlockBusterMain {
}
