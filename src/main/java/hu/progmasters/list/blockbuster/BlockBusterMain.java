package hu.progmasters.list.blockbuster;


import java.util.ArrayList;
import java.util.List;

/**
 * Az alkalmazásunkban egy videotékát szeretnénk menedzselni.
 * <p>
 * 1. Készítsünk egy VideoTape osztályt, ami az alábbi változókat tartalmazza:
 * - String title
 * - int length
 * - List<String> mainActors
 * <p>
 * A változókat konstruktor paraméterben kötelező megadni, és tartozik hozzájuk getter és setter metódus
 * <p>
 * 2. Készítsünk egy BlockBuster osztályt, ami az egyes videótékákat fogja jelképezni. Az osztály az alábbi dolgokat
 * tartalmazza:
 * - List<VideoTape> videoTapes
 * - void addTape(String title, int length, List<String> mainActors): hozzáadja a listához a videókazettát
 * - boolean findTape(String title): visszaadja, hogy bent megvan-e a kazetta
 * - VideoTape rentTape(String title): megkeresi a legelső adott című kazettát a listában, majd ha létezik ilyen, akkor
 * kiveszi a listából és visszatér vele, ha nem létezik, akkor null-t ad vissza
 * - List<String> findByActor(String name): visszaadja listában az összes olyan film címét, amiben szerepel a
 * paraméterként kapott színész
 * <p>
 * A findByActor() metódusnál ellenőrizzük le azt is, hogy egy cím csak egyszer szerepeljen a visszaadott listában.
 */
public class BlockBusterMain {

    public static void main(String[] args) {

        List<String> actors = new ArrayList<>();

        actors.add("Próba Puding");
        actors.add("Bio Díszlet");
        actors.add("Keljfel Jancsi");
        BlockBuster blockBuster = new BlockBuster();
        blockBuster.addTape("A bevetés", 120, actors);

        blockBuster.addTape("A beesés", 130, List.of("Bukta Béla", "Káposztás Gábor"));

        blockBuster.addTape("Csillagok Háborúja - Egy új remény", 121, List.of("Mark Hemill", "Harrison Ford", "Carrie Fisher"));
        blockBuster.addTape("A vasember", 126, List.of("Robert Downey Jr", "Gwyneth Paltrow", "Terrence Howard"));
        blockBuster.addTape("A Gyűrűk Ura: A Gyűrű Szövetsége", 178, List.of("Elijah Wood", "Ian McKellen", "Sean Astin"));
        blockBuster.addTape("Sherlock Holmes", 128, List.of("Robert Downey Jr", "Jude Law"));

        System.out.println(blockBuster);
        System.out.println(blockBuster.findTape("A bevetés"));
        System.out.println(blockBuster.findTape("A bepréselés"));

        blockBuster.rentTape("A beesés");
        System.out.println(blockBuster);

        System.out.println(blockBuster.findByActor("Robert Downey Jr"));

    }
}
