package J38_firma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompanyController {

    public void odczyt(File plik) throws FileNotFoundException {
        Scanner odczyt = new Scanner(plik);
        System.out.println("Lista pracowników:");

        while (odczyt.hasNextLine()) {
            System.out.println(odczyt.nextLine());
        }
        odczyt.close();
    }

    public void dodaj(FileWriter zapis, String imie, String nazwisko, int wyplata) throws IOException {
        zapis.append(imie+";"+nazwisko+";"+wyplata+"\n");
        zapis.close();
    }

    public void usuwanie(String nazwisko, File plik, String sciezka) throws IOException {
        Scanner odczyt = new Scanner(plik);
        ArrayList<String> pracownicy = new ArrayList<>();

        while (odczyt.hasNextLine()) {
            String[] parts = odczyt.nextLine().split(";");

            if(!parts[1].equals(nazwisko))
                pracownicy.add(parts[0]+";"+parts[1]+";"+parts[2]+"\n");
        }
        odczyt.close();

        FileWriter zapis = new FileWriter(sciezka, false);

        for (String val : pracownicy) {
            zapis.append(val);
        }
        zapis.close();
    }

    public void zmiana(String nazwiskoMod, String imie, String nazwisko, int wyplata, File plik, String sciezka) throws IOException {
        Scanner odczyt = new Scanner(plik);
        ArrayList<String> pracownicy = new ArrayList<>();

        while (odczyt.hasNextLine()) {
            String[] parts = odczyt.nextLine().split(";");

            if (parts[1].equals(nazwiskoMod)) {

                if(imie.equals(""))
                    imie = parts[0];

                if(nazwisko.equals(""))
                    nazwisko = parts[1];


                    //wyplata = parts[2];

                pracownicy.add(imie + ";" + nazwisko + ";" + wyplata + "\n");
            }
            else
                pracownicy.add(parts[0]+";"+parts[1]+";"+parts[2]+"\n");

        }

        FileWriter zapis = new FileWriter(sciezka, false);

        for (String val : pracownicy) {
            zapis.append(val);
        }
        zapis.close();
    }

    public void szukaj(String imieSz, File plik) throws FileNotFoundException {
        Scanner odczyt = new Scanner(plik);
        ArrayList<String> pracownicy = new ArrayList<>();

        while (odczyt.hasNextLine()) {
            String[] parts = odczyt.nextLine().split(";");

            if (parts[0].indexOf(imieSz) > -1) {

            }





            System.out.println("Nie znaleziono pracownika:");
        }
    }
}
