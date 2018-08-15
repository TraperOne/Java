import java.util.Random;
import java.util.Scanner;

public class J14_gra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int liczbaU, liczbaL;

        liczbaL = rnd.nextInt( 100)+1;

        System.out.println("Gra Za dużo, za mało");
        System.out.println("Zgadnij liczbę od 1 do 100:");
        liczbaU = sc.nextInt();
        while (true){

            if (liczbaL > liczbaU){
                System.out.println("Za mało, zgaduj dalej...");
                liczbaU = sc.nextInt();}
            if (liczbaL < liczbaU){
                System.out.println("Za dużo, zgaduj dalej...");
                liczbaU = sc.nextInt();}
            if (liczbaL == liczbaU) {
                System.out.println("Trafiłeś GRATULACJE!!!");
                break;
            }

        }
    }
}
