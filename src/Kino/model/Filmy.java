package Kino.model;

import Kino.controller.Controller;

import javax.print.DocFlavor;
import java.sql.SQLException;
import java.util.Scanner;

public class Filmy {

    public Filmy() throws SQLException {

        Scanner input = new Scanner(System.in);
        Controller uc = new Controller();

        boolean program = true;
        while (program) {

            System.out.println("P - pokaż filmy  | D - dodaj film | U - usun film | Q - Wyjscie");
            String dec = input.nextLine();

            switch (dec.toUpperCase()) {

                case "P":
                    uc.showMovieContact();
                    break;
                case "D":
                    uc.showCinemaContact();
                    System.out.println("Podaj ID kina:");
                    int IDk = input.nextInt();
                    input.nextLine();
                    System.out.println("Podaj tytuł filmu:");
                    String tytul = input.nextLine();
                    uc.addMovieContact(tytul, IDk);
                    break;
                case "U":
                    System.out.println("Podaj ID filmu do usunięcia:");
                    int ID = input.nextInt();
                    input.nextLine();
                    uc.deleteMovieContact(ID);
                    break;
                case "Q":
                    program = false;
                    break;
            }
        }

    }
}
