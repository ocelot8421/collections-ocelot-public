package hu.progmasters.comparator.book;

import java.util.Arrays;
import java.util.List;

/**
 * A Book osztályban implementáld a Comparable interface-t!
 * Implementáld a compareTo metódust úgy, hogy az alábbi lista sorba rendezése a következő módon történjen:
 * - író neve szerint ábécé sorrendben,
 * - ha ugyanaz az író, akkor a megjelenés éve szerint rendezve,
 * - ha ugyanazon írónak egy évben több könyve is megjelent, akkor azok a cím szerint ábécé sorrendben rendeződnek.
 * Írd felül az equals metódust, hogy összhangban legyen a compareTo-val
 * (ez könnyíti is a dolgod, mivel a compareTo metódus a dokumentáció szerint
 * egyenlőség esetén 0-t kell, hogy visszaadjon), valamint a hashcode metódust.
 * Ehhez használd ki az IDEA nyújtotta lehetőséget:
 * ALT-INSERT -> generate -> equals() and hashCode(). Amit alapértelmezésben generál, az jó is lesz ide.
 */
public class BookMain {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("P. Howard", 1941, "Piszkos Fred közbelép... Fülig Jimmy őszinte sajnálatára"),
                new Book("Dan Brown", 2009, "The Lost Symbol"),
                new Book("P. Howard", 1940, "Vesztegzár a Grand Hotelben"),
                new Book("Douglas Adams", 1980, "The Restaurant at the End of the Universe"),
                new Book("P. Howard", 1940, "Piszkos Fred, a kapitány"),
                new Book("Émile Zola", 1890, "La Bête humaine"),
                new Book("P. Howard", 1941, "Csontbrigád"),
                new Book("Douglas Adams", 1979, "The Hitchhiker's Guide to the Galaxy"),
                new Book("Dan Brown", 2003, "The Da Vinci Code"),
                new Book("Émile Zola", 1880, "Nana"),
                new Book("Dan Brown", 2000, "Angels & Demons")
        );
        // rendezetlenül
        for (Book book : bookList) {
            System.out.println(book);
        }
        System.out.println();

        // ha kész a Comparable implementálása
//        Collections.sort(bookList);
//        for (Book book : bookList) {
//            System.out.println(book);
//        }
//        System.out.println();

        // ha kész a külön Comparator implementálás
//        Collections.sort(bookList, new BookComparatorByYear());
//        for (Book book : bookList) {
//            System.out.println(book);
//        }
    }
}
