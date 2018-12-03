package J30_dziedzicz;

public class Pojazd_kolowy extends Pojazd{
    public int liczbaKol;
    public Pojazd_kolowy(int _liczbaKol, int _waga, int _mocSilnika, String _kolor, int _liczbaPasazerow, double _cena){
        super(_waga,_mocSilnika,  _kolor, _liczbaPasazerow, _cena);
        this.liczbaKol = _liczbaKol;
    }
}