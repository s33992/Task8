public class Ptak extends Zwierze{
    private boolean czyLata;

    public Ptak(String nazwa, int wiek, boolean czyLata){
        super(nazwa, wiek);
        this.czyLata = czyLata;
    }

    @Override
    public String wydajDzwiek(){
        return "Ptak Ptak";
    }

    @Override
    public String poruszajSie(){
        return "Fru fru";
    }

    public void Leć(){
        if (czyLata == true){
            System.out.println("*Dzwiek latania*");
        }
        else{
            System.out.println("*Dzwiek stania*");
        }
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Niebo";
    }

}
