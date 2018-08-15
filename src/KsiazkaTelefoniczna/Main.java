package KsiazkaTelefoniczna;

import KsiazkaTelefoniczna.controller.Controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);
        Controller uc = new Controller();

        boolean program = true;
        while (program) {

            System.out.println("P - Pokaz | D - Dodaj | U - Usun | M - Modyfikuj | S - Szukaj | Q - Wyjscie");
            String dec = input.nextLine();

            switch (dec.toUpperCase()) {

                case  "D":
                    System.out.println("Podaj imie:");
                    String imie = input.nextLine();
                    System.out.println("Podaj nazwisko:");
                    String nazwisko = input.nextLine();
                    System.out.println("Podaj nr telefonu:");
                    String telefon = input.nextLine();

                    uc.addKontakt(imie, nazwisko, telefon);
                break;

                case "P":
                    System.out.println("Lista kontaktów:");
                    uc.showContact();
                break;

                case "U":
                    uc.showContact();
                    System.out.println("Podaj ID do usunięcia:");
                    int ID = input.nextInt();
                    input.nextLine();
                    uc.deleteContact(ID);
                break;

                case "S":
                    System.out.println("Kogo szukasz?");
                    String szukaj = input.nextLine();
                    uc.searchContact(szukaj);
                break;

                case "M":
                    System.out.println("Podaj ID do zmiany:");
                    int IDs = input.nextInt();
                    input.nextLine();
                    System.out.println("Podajk nazwę kolumny w której zmienimy wartość ?");
                    String kolumna = input.nextLine();
                    System.out.println("Podaj nową wartość?");
                    String nowe = input.nextLine();
                    uc.modifiContact(IDs, kolumna, nowe);
                    break;

                case "Q":
                    program = false;
                break;
            }
        }

    }
}
