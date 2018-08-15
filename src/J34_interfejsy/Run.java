package J34_interfejsy;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        ArrayList<Zawodnik> listaZawodnikow = new ArrayList<>();
        Zawodnik z1 = new Zawodnik("Adam", 25, 65);
        Zawodnik z2 = new Zawodnik("Tomek", 22, 61);
        Zawodnik z3 = new Zawodnik("Roman", 35, 71);
        Zawodnik z4 = new Zawodnik("Michał", 23, 69);
        Zawodnik z5 = new Zawodnik("Darek", 29, 67);

        listaZawodnikow.add(z1);
        listaZawodnikow.add(z2);
        listaZawodnikow.add(z3);
        listaZawodnikow.add(z4);
        listaZawodnikow.add(z5);

        for (Zawodnik val : listaZawodnikow) {
            System.out.println(val);
            System.out.println(val.bieganie());
            System.out.println(val.plywanie());
            System.out.println(val.skakanie());

        }
    }
}
