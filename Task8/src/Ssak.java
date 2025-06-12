public class Ssak extends Zwierze {
    private int liczbaNog;

    public Ssak(String nazwa, int wiek, int liczbaNog) {
        super(nazwa, wiek);
        this.liczbaNog = liczbaNog;
    }

    @Override
    public String wydajDzwiek(){
        return "Ssak Ssak";
    }

    @Override
    public String poruszajSie(){
        return "Tup Tup";
    }

    public void pijMleko(){
        System.out.println("Gul gul");
    }

    @Override
    public String srodowiskoNaturalne(){
        return "Ląd";
    }

}
