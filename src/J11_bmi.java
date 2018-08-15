import java.util.Locale;
import java.util.Scanner;

public class J11_bmi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);


        System.out.println("Podaj swoją wagę: ");
        int wa = input.nextInt();
        System.out.println("Podaj swój wzrost (w metrach): ");
        double wz = input.nextDouble();
        double bmi = wa/(wz*wz);
        System.out.println( bmi >= 18.5 && bmi <=24.9 ? "waga prawidłowa" : (bmi < 18.5) ? "niedowaga" : "nadwaga");

    }
}