package J34_interfejsy;

public class Zawodnik implements Zawody {

    String imie;
    int wiek;
    int waga;

    public Zawodnik(String imie, int wiek, int waga){
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
    }

    @Override
    public String bieganie() {
        return "Zawodnik "+imie+" bieganie";
    }

    @Override
    public String plywanie() {
        return "Zawodnik "+imie+" plywanie";
    }

    @Override
    public String skakanie() {
        return "Zawodnik "+imie+" skakanie";
    }

    @Override
    public String toString() {
        return "Zawodnik "+this.imie+" waży "+this.waga+", wiek zawodnika "+this.wiek+" lat";
    }
}
