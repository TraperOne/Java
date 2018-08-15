import java.util.Locale;
import java.util.Scanner;

public class J11_switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj pierwszą liczbę: ");
        double liczba1 = input.nextDouble();
        input.nextLine();
        System.out.println("Podaj znak matematyczny: ");
        String z = input.nextLine();
        System.out.println("Podaj drugąą liczbę: ");
        double liczba2 = input.nextDouble();

        switch (z) {
            case "*":
                    System.out.println(liczba1 * liczba2);
                break;
            case "/":
                if (liczba2 ==0) {
                    System.out.println("Nie można dzielić przez zero");
                }
                else {
                    System.out.println(liczba1 / liczba2);
                }
                break;
            case "+":
                    System.out.println(liczba1 + liczba2);
                break;
            case "-":
                    System.out.println(liczba1 - liczba2);
                break;
        }
    }
}