package pl.sdacademy.myproject.interfejsy;

public class InterfejsyMain {
    private static Object PozaMcDonaldimpl;

    public static void main(String[] args) {
        // camelCase- metoda wielbłądzia
        // Kolejny wyraz z wielkiej litery
        // bez spracji!!!
        McDonald mcDonaldNaRynku;
        McDonald pozaDonaldNaRynku;


        //Inicjalizacjia
        mcDonaldNaRynku = new RynekMcDonaldimpl();
        pozaDonaldNaRynku = new PozaMacDonaldimpl();
//        pozaMcDonald = new pozaMcDonaldimpl();
        //Zadanie 1
        // Poproś o frytki i mcflury w mcdponald na rynku
        mcDonaldNaRynku.poproszeFrytki( 30);
        mcDonaldNaRynku.poproszeMcFlury( 30);

        pozaDonaldNaRynku.poproszeMcFlury(50);
//        PozaMcDonald.poproszeFrynki ( 50);
        pozaDonaldNaRynku.poproszeMcFlury(50);
//        PozaMcDonald.poproszeMcflury( 50 );
        // Zadanie 2
        // Stwórz implementację PazaMcDonaldimpl
        // podobnie jak w przypadku na rynku
        // wykonaj polecenia na plazie tak jak na rynku

    }
}
