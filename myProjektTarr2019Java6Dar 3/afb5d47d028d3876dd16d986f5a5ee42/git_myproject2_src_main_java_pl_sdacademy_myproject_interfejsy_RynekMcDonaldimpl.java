package pl.sdacademy.myproject.interfejsy;

public class RynekMcDonaldimpl implements McDonald {

    @Override
    public void poproszeFrytki(double kwota) {
        System.out.println("witamy w MacDonald na rynku");
        System.out.println(" Oto Twoje frytki");
    }

    @Override
    public void poproszeMcFlury(double kwota) {
        System.out.println("Witamy w MacDonald na rynku");
        System.out.println(" Oto Twój McFlury");
    }
}
