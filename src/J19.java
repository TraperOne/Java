import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int[] numerki = new int[10];
        for (int i=0; i<10; i++)
        numerki[i] = rnd.nextInt( 21)-10;
            int min = 0;
            int max = 0;
            int suma = 0;
            int ileW = 0;
            int ileM = 0;
            double srednia = 0;
            for(int j=0; j<10; j++) {

                System.out.print(numerki[j]+" ");

                if(max < numerki[j])
                    max = numerki[j];
                if (min > numerki[j])
                    min = numerki[j];

            suma += numerki[j];
            srednia = (double) suma/numerki.length;

            if (numerki[j]<srednia) ileM++;
            if (numerki[j]>srednia) ileW++;
            }

            System.out.println("");
            System.out.println("Max to: "+max+" Min to: "+min);
            System.out.println("Suma to: "+suma+" Srednia to: "+srednia);
            System.out.println("Mniejszych jest: "+ileM+" Większych jest: "+ileW);

        for (int k=9; k>=0; k--)
            System.out.print(numerki[k]+" ");

            //System.out.println(Arrays.toString(numerki));
    }
}
