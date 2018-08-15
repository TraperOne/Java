import java.util.Random;
import java.util.Scanner;

public class J13_pentle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int liczbaU, liczbaL;
        System.out.println("Podaj liczbę z zakrest 1-5:");
        liczbaU = sc.nextInt();

        for (int i=0; i<5; i++) {

            liczbaL = rnd.nextInt( 5) + 1;  //zakres <1, 5>)

            if (liczbaL == liczbaU) {
                System.out.println("Liczba "+liczbaL+" jest równa");
            } else if (liczbaL > liczbaU) {
                System.out.println("Liczba "+liczbaL+" jest większa");
            } else if (liczbaL < liczbaU) {
                System.out.println("Liczba "+liczbaL+" jest miniejsza");
            }
        }

    }
}
