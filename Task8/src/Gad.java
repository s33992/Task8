public class Gad extends Zwierze{
    private double dlugosc;

    public Gad(String nazwa, int wiek, double dlugosc){
        super(nazwa, wiek);
        this.dlugosc = dlugosc;
    }

    @Override
    public String wydajDzwiek(){
        return "Gad gad";
    }

    @Override
    public String poruszajSie(){
        return "Pełzu pełzu";
    }

    public void zlozJajka(){
        System.out.println("Składu składu");
    }
    @Override
    public String srodowiskoNaturalne() {
        return "Woda";
    }

}
