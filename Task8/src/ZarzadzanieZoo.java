public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Ssak("Lew", 2, 4);
        Zwierze orzeł = new Ptak("Orzeł", 5, true);
        Zwierze wąż = new Gad("Wąż", 3, 3.4);


        System.out.println(lew.wydajDzwiek());
        System.out.println(lew.poruszajSie());
        ((Ssak) lew).pijMleko();
        lew.wyswietlInformacje();
        System.out.println(lew.srodowiskoNaturalne());

        System.out.println(orzeł.wydajDzwiek());
        System.out.println(orzeł.poruszajSie());
        ((Ptak) orzeł).Leć();
        orzeł.wyswietlInformacje();
        System.out.println(orzeł.srodowiskoNaturalne());

        System.out.println(wąż.wydajDzwiek());
        System.out.println(wąż.poruszajSie());
        ((Gad) wąż).zlozJajka();
        wąż.wyswietlInformacje();
        System.out.println(wąż.srodowiskoNaturalne());



    }
}
