package Kino.model;

import Kino.controller.Controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Kino {

    public Kino() throws SQLException {

        Scanner input = new Scanner(System.in);
        Controller uc = new Controller();

        boolean program = true;
        while (program) {

            System.out.println("P - pokaż kina  | D - dodaj kino | U - usun kino | Q - Wyjscie");
            String dec = input.nextLine();
            switch (dec.toUpperCase()) {

                case "P":
                    uc.showCinemaContact();
                    break;
                case "D":
                    System.out.println("Podaj nazwę kina:");
                    String nazwa = input.nextLine();
                    uc.addCinemaContact(nazwa);
                    break;
                case "U":
                    System.out.println("Podaj ID kina do usunięcia:");
                    int ID = input.nextInt();
                    input.nextLine();
                    uc.deleteCinemaContact(ID);
                    break;
                case "Q":
                    program = false;
                    break;
            }
        }
    }
}
