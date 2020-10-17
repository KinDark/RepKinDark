package pl.sdacademy.myproject;
//generate test
//alt + enter

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

import static java.lang.Math.PI;

/**
 * App
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 **/
public class App {
    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Hello World!");

        //dodanie zmiennej. Pi
        //typ nazwa = wartosc;
        double liczba = 3.0; //zmienna ma wartość 3.0
        liczba = PI; // zmienna ma wartość 3.14159....
        liczba = PI;

        //doble liczba = 3.6;
        int number;// deklaracja
        number = 2020;// inicjalizacja

        int number2 = 6;// deklaracja i inicjalizacja w jednej lini

        System.out.println(number);

        wypiszLiczbe(number2);

        // String - napis;ciąg znaków
        String odpowiedz = coNaObiad();// odpowiedź metody
        // jest przypisana do zmiennej odpowiedź

        System.out.println(odpowiedz);
        System.out.println(coNaObiad());// tutaj nie tworzymy zmiennej
        System.out.println(coNaObiad("jutro"));// tutaj nie tworzymy zmiennej
        System.out.println(coNaObiad("pojutrze"));// tutaj nie tworzymy zmiennej


       // int wynik; // deklaracja
        //int wynik = sumaliczb(int 1, int 2, int 3) {
            
            
       //     return a+b+c;
                    }
        //System.out.println(wynik);


        // Zadanie: Stwórz metodę liczącą sume 3 liczb całkowitych (int)
        // deklarujemy i inicjalizujemy 3 zmienne a,b,c
        // wynik metody zapisujemy do zmiennej wynik
        // wypisujemy wynik na konsoli


    // metoda zwraca odpowiedz co na obiad
    private static String coNaObiad(String kiedy) {
        return kiedy+" będzie "+"gulasz";
    }

    // metoda zwraca odpowiedz co na obiad
    private static String coNaObiad() {
        return "Pomidorowa z rosołu ze wczoraj";
    }

    // metoda void nic nie zwraca
    private static void wypiszLiczbe(int liczba) {
        System.out.println("Twoja liczba to :"+liczba);
    }


    //Zadanie: Stwórz metodę liczącą sume 3 liczb całkowitych (int)
    // deklarujemy i inicjalizujemy 3 zmienne a,b,c
    // wynik metody zapisujemy do zmiennej wynik
    // wypisujemy wynik na konsoli





}
