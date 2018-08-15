package J30_dziedzicz;

public class Lodz extends Pojazd{
    public int zanurzenie;

    public Lodz(int _zanurzenie, int _waga, int _mocSilnika, String _kolor, int _liczbaPasazerow, double _cena) {
        super(_waga, _mocSilnika, _kolor, _liczbaPasazerow, _cena);
        this.zanurzenie = _zanurzenie;
    }
}
