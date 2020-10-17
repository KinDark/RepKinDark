package pl.sdacademy.myproject;

import java.sql.SQLOutput;

public class MetodyMain {

    /**
     * Ttorzenie obiektów wywoływanie metod
     *
     * -statyczene( na korytarzu)
     * - na obiekcie ( na koledze)
     *
     */
    public static void main(String[] args){
        // deklaracja inicjalizacja zmiennej napis
        String napis = "Zajęcia SDA TARR";
        napis = napis.toLowerCase(); //Jeśli są tu 2 nawiasy to jest to metoda
        System.out.println(napis);

        Mlotek czerwonyMlotek; //zmienna nie jest inicjowana
        // powyżej deklaracja młotka
        System.out.println(napis);

        //Mlotek czerwonyMlotek: // zmienna nie zanicjowana

        czerwonyMlotek = new Mlotek(); // nev oznacza tworzenie za pomocą konstruktora domyślmy

        czerwonyMlotek = new Mlotek();// new oznacza tworzie

        // za pomocą konstruktora domyślny
       //zielonyMlotek.kolor = "różowy"; //bez modyfikatora dostępu
        // gdy kolor w mlotka jest privat
        // nie mamy dostępu


    }
}
