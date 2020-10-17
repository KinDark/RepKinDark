package Zadania;

public class User {
    String imie;
    String nazwisko;
    int wiek;
    public String toString() {
        return imie + nazwisko + wiek;
    }
    public User (String wprowadzoneImie, String wprowadzoneNazwisko, Integer wprowadzonyWiek) {
        imie = wprowadzoneImie;
        nazwisko = wprowadzoneNazwisko;
        wiek = wprowadzonyWiek;

        }
}