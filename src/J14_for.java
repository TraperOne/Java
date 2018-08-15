import java.util.Scanner;

public class J14_for {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wysokość drzewka");
        int w = sc.nextInt();

        for (int i=1; i<=w; i++) {

            for (int j = 1; j<=(w - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=(i*2)-1 ; k++) {
                    System.out.print("*");
            }
            System.out.println("");
        }
    }

}