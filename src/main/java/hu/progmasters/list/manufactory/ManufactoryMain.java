package hu.progmasters.list.manufactory;

/**
 * Egy kézműves ajándéktárgyakat forgalmazó nagykereskedést fogunk szimulálni az alkalmazásban, ami különböző fajta
 * kézművesektől gyűjti be az általuk legyártott termékeket, majd ezeket egyben értékesíti a piacon.
 *
 * Az összetartozó osztályokat rendezd külön package-be!
 *
 * 1. Készíts egy Product absztrakt osztályt, ami az alábbi dolgokat tartalmazza:
 * - String type
 * - int price
 *
 * 2. Készítsd el az alábbi osztályokat, amik a Productból származnak:
 * - Jewelry
 * - Painting
 * - Pottery
 *
 * A közös tulajdonságokon felül a Jewelry osztály rendelkezzen egy int weight változóval (a súlya grammban megadva),
 * míg a Painting és a Pottery osztályoknak legyen egy List<String> colors változója.
 * Ezeket a konstruktorban kérd be paraméterként, és tartozzon hozzájuk getter metódus is.
 *
 * Mindegyik osztály kérje be a description és a price változók értékét konstruktorparaméterben, type-nak pedig állítsa
 * be a saját nevét.
 *
 * 3. Hozz létre egy Manufacturer interface-t, aminek egy metódusa van:
 * - List<Product> createProducts
 *
 * 4. Hozd létre az alábbi osztályokat, amik mind implementálják a Manufacturert:
 * - Jeweler
 * - Painter
 * - Potter
 *
 * A Jeweler az ékszer súlyát határozza meg véletlenszerűen 2 és 30 gramm között.
 * A Potter az alábbi színekből válasszon minden termékhez egyet véletlenszerűen: red, black, brown, green, blue, white
 * A Painter konstruktorparaméterben kapjon egy listát a kedvenc színeivel, és abból válasszon maximum 5-öt
 * véletlenszerűen. Egy szín csak egyszer szerepeljen a listában, és ha már benne lenne, akkor nem kell választani újat
 * helyette.
 *
 *
 * Mindegyik osztálynak készítsd el a toString() metódusát, ami kiírja a termék összes adatát szépen megformázva.
 *
 * 5. Készíts egy Manufactory osztályt, ami az alábbi dolgokat tartalmazza:
 * - List<Manufacturer> manufacturers
 * - List<Product> storage
 * - void makeThemWork(): minden kézművessel legyártat egy terméket, és beteszi a raktárba
 * - void printStorageStatus(): kiírja az összes a storage-ben levő terméket a konzolra
 * - void sellProducts(): összegyűjti, hogy hány termék van a raktárban és mi azoknak az összértéke típusokra bontva,
 * illetve a végösszeget is, ezeket az adatokat kiírja a konzolra, majd kiüríti a storage listát
 * - addJeweler(), addPainter() és addPotter() metódusok, amik paraméterben kérjék be az adott kézműveshez szükséges
 * összes adatot, hozzák létre a példányt, majd mentsék el azt a manufacturers listában
 *
 * Opcionális:
 * Hozz létre egy Colorful interface-t, ami az alábbi metódusokat tartalmazza:
 * - boolean hasColor(String color)
 * - List<String> getColors()
 *
 * A Painting és a Potter osztályod implementálja a Colorful interface-t.
 *
 * Hozz létre két új metódust a Manufactory osztályodban:
 * - Colorful findWithColor(String color)
 * - List<Colorful> findAllWithColor(String color)
 *
 * Az első metódus adjon vissza egy tetszőleges terméket, amin szerepel az adott szín (ékszereknek úgy vesszük, hogy
 * nincs színe), a második pedig az összes ilyet.
 *
 */
public class ManufactoryMain {
}
