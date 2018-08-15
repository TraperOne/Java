import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J22_zakupy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> koszyk = new ArrayList<>();
        HashMap<String, Double> towary = new HashMap<>();
        towary.put("mleko", 1.99);
        towary.put("jajka", 4.59);
        towary.put("chleb", 2.99);
        towary.put("maka",  1.85);
        towary.put("cukier",2.50);
        towary.put("bułka", 0.55);

        for (String klucze : towary.keySet()) {
            System.out.println(klucze + " | " + towary.get(klucze));
        }

        while (true) {
            System.out.println("Co potrzeba | (ENTER) wyjście");
            String dane = sc.nextLine();

            if (dane.equals(""))
                break;
            else if (koszyk.contains(dane)) {
                System.out.println("Produkt już jest w koszyku, czy dodać jeszcze jeden?");
                String dec = sc.nextLine();

                if (dec.equals("t"))
                    koszyk.add(dane);
                else
                    continue;
            } else
                koszyk.add(dane);
        }
        double suma = 0;
        for (String dane : koszyk) {

            suma += towary.get(dane);
        }
                System.out.println(koszyk);
                System.out.println("Do zapłaty: " +suma);
    }
}
