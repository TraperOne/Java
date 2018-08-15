package J29_studenci;

public class Student {
    private String imie;
    private String nazwisko;
    private int index;
    public static int cout=0;

    public Student(String _imie, String _nazwisko, int _index) {
        this.imie = _imie;
        this.nazwisko = _nazwisko;
        this.index = _index;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String toString() {
        return this.index+ " | " + this.imie + " " + this.nazwisko;
    }
}
