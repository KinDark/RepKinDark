package pl.sdacademy.myproject.interfejsy;

public class PozaMacDonaldimpl implements McDonald
{
    @Override
    public void poproszeFrytki(double kwota) {
        System.out.println("witamy w MacDonald na Poza rynkiem");
        System.out.println(" Oto Twoje frytki");
    }

    @Override
    public void poproszeMcFlury(double kwota) {
        System.out.println("witamy w MacDonald na Poza rynkiem");
        System.out.println(" Oto Twoje McFlury");
    }

  }
