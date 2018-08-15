package J30_dziedzicz;

public class Samolot extends Pojazd{
    public int pulap;

    public Samolot(int _pulap, int _waga, int _mocSilnika, String _kolor, int _liczbaPasazerow, double _cena) {
        super(_waga, _mocSilnika, _kolor, _liczbaPasazerow, _cena);
        this.pulap = _pulap;
    }
}
