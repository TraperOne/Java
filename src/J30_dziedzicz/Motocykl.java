package J30_dziedzicz;

public class Motocykl extends Pojazd_kolowy{
    public String bagaznikNaKask;

    public Motocykl(String _bagaznikNaKask, int _liczbaKol, int _waga, int _mocSilnika, String _kolor, int _liczbaPasazerow, double _cena) {
        super(_liczbaKol, _waga, _mocSilnika, _kolor, _liczbaPasazerow, _cena);
        this.bagaznikNaKask = _bagaznikNaKask;
    }
}