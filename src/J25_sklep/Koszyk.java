package J25_sklep;

import java.util.ArrayList;

public class Koszyk {

    ArrayList<String> produkty = new ArrayList<>();
    ArrayList<Integer> ilosc = new ArrayList<>();



    public void addKoszyk(String produkty, int ilosc) {
        this.produkty.add(produkty);
        this.ilosc.add(ilosc);

    }

    public String toString(){
        return this.produkty+" "+ this.ilosc;
    }
}
