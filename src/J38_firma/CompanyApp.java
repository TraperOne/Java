package J38_firma;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) throws IOException {

        String sciezka = "D:\\kurs\\Java\\src\\J38_firma\\firma.txt";
        File plik = new File(sciezka);
        CompanyController companyController = new CompanyController();
        FileWriter zapis = new FileWriter(sciezka, true);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("d - dodaj | o - odczytaj | u - usuń | z - zmień | s- szukaj | <enter> wyjście");
            String dec = input.nextLine();
            String imie="";
            String nazwisko="";
            int wyplata=0;

            if (dec.equals("d")) {

                while (true){
                    System.out.println("Podaj imię:");
                    imie = input.nextLine();

                    if (imie.equals("")){
                        System.out.println("Podałeś puste imię, jeszcze raz...");
                    }
                    else
                        break;
                }
                while (true){
                    System.out.println("Podaj nazwisko:");
                    nazwisko = input.nextLine();

                    if (nazwisko.equals("")){
                        System.out.println("Podałeś puste nazwisko, jeszcze raz...");
                    }
                    else
                        break;
                }
                while (true){
                    System.out.println("Podaj wyplate:");
                    wyplata = input.nextInt();

                    if (nazwisko.equals("")){
                        System.out.println("Podałeś puste nazwisko, jeszcze raz...");
                    }
                    else
                        break;
                }
                companyController.dodaj(zapis, imie, nazwisko, wyplata);

            } else if (dec.equals("o")) {
                companyController.odczyt(plik);

            } else if (dec.equals("u")) {
                System.out.println("Podaj nazwisko do usunięcia:");
                nazwisko = input.nextLine();
                companyController.usuwanie(nazwisko, plik, sciezka);

            } else if (dec.equals("z")) {
                System.out.println("Podaj nazwisko osoby do zmiany:");
                String nazwiskoMod = input.nextLine();

                System.out.println("Podaj imie:");
                imie = input.nextLine();

                System.out.println("Podaj nazwisko:");
                nazwisko = input.nextLine();

                System.out.println("Podaj wyplate:");
                wyplata = input.nextInt();

                companyController.zmiana(nazwiskoMod, imie, nazwisko, wyplata, plik, sciezka);

            } else if (dec.equals("s")) {
                    System.out.println("Podaj imię szukanego pracownika:");
                    String imieSz = input.nextLine();

                companyController.szukaj(imieSz, plik);

                System.out.println();

            } else if (dec.equals("")) {
                    break;
                }
            }
        }

    }

