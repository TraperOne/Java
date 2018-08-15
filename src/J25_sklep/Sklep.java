package J25_sklep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Koszyk> zakupy = new ArrayList<>();
        HashMap<String, Double> produkty = new HashMap<>();
        produkty.put("chleb", 2.99);
        produkty.put("banan", 0.99);
        produkty.put("pomidor", 0.55);
        produkty.put("ryż", 2.49);
        produkty.put("masło", 4.99);
        produkty.put("CocaCola", 3.49);

        while (true){
            System.out.println("Czy chcesz rozpocząć zakupy jako nowy klient? [T/N]");
            String dec = input.nextLine();

            if(dec.equals("T")){
                Koszyk obj = new Koszyk();

                while(true){
                    System.out.println("Dodaj do koszyka produkt, <enter> znaczy koniec.");
                    System.out.println(produkty);
                    String produkt = input.nextLine();

                    if(produkt.equals("")) {
                        zakupy.add(obj);
                        break;
                    }
                    else{
                        System.out.println("Podaj ilość");
                        int ilosc = input.nextInt();
                        input.nextLine();
                        obj.addKoszyk(produkt, ilosc);
                    }
                }
            }
            else
                break;
        }

        for (Koszyk val : zakupy) {
            System.out.println("Podwumowanie Twoich zakupów:");
            double suma = 0.00;

            for(int i=0; i<val.produkty.size(); i++) {
                System.out.println((val.produkty.get(i)+" "+val.ilosc.get(i)));

                suma+= produkty.get(val.produkty.get(i))*val.ilosc.get(i);
            }
            System.out.println("Razem do zapłaty: "+suma);
        }

    }
}
