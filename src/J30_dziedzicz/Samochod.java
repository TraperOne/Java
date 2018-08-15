package J30_dziedzicz;

public class Samochod extends Pojazd_kolowy{
    public String typFelg;

    public Samochod(String _typFelg, int _liczbaKol, int _waga, int _mocSilnika, String _kolor, int _liczbaPasazerow, double _cena) {
        super(_liczbaKol, _waga, _mocSilnika, _kolor, _liczbaPasazerow, _cena);
        this.typFelg = _typFelg;

    }

    @Override
    public String toString() {
        return this.kolor+" "+this.liczbaKol+" "+this.typFelg+" "+mocSilnika+" "+this.waga+" "+this.cena;
    }
}
