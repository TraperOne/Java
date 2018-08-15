package kalkulator;

import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Co robimy +/-");
        String znak = input.nextLine();
        System.out.println("Ile liczb (2-3)");
        int liczba = input.nextInt();

        if (znak.equals("+")){

            if (liczba == 2) {
                System.out.println("Podaj liczby:");
                int a = input.nextInt();
                input.nextLine();
                int b = input.nextInt();
                obj.add(a,b);
            }else
            if (liczba == 3) {
                System.out.println("Podaj liczby:");
                int a = input.nextInt();
                input.nextLine();
                int b = input.nextInt();
                input.nextLine();
                int c = input.nextInt();
                obj.add(a,b,c);
            }
        }else
        if (znak.equals("-")) {

            if (liczba == 2) {
                System.out.println("Podaj liczby:");
                int a = input.nextInt();
                input.nextLine();
                int b = input.nextInt();
                obj.subtract(a,b);
            }
            if (liczba == 3) {
                System.out.println("Podaj liczby:");
                int a = input.nextInt();
                input.nextLine();
                int b = input.nextInt();
                input.nextLine();
                int c = input.nextInt();
                obj.subtract(a, b, c);
            }
        }
    }
}
