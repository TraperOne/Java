package Kino.model;

import Kino.controller.Controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Bilety {
    Scanner input = new Scanner(System.in);
    Controller uc = new Controller();


    public Bilety() throws SQLException {

        boolean program = true;
        while (program) {
            System.out.println("K - kup bilet  | P - pokaż bilet | U - usun bilet | Q - Wyjscie");
            String dec = input.nextLine();

            switch (dec.toUpperCase()) {
                case "K":
                    uc.showCinemaContact();
                    System.out.println("Podaj ID kina:");
                    int IDk = input.nextInt();
                    uc.showMovieContact(IDk);
                    input.nextLine();
                    System.out.println("Podaj ID filmu:");
                    int IDf = input.nextInt();
                    input.nextLine();
                    System.out.println("Podaj ilość biletów:");
                    String ilosc = input.nextLine();

                    uc.shopTicketContact(IDk, IDf, ilosc);
                    break;
                case "P":
                    uc.showTicketContact();
                    break;
                case "U":
                    System.out.println("Podaj ID biletu do usunięcia:");
                    int IDb = input.nextInt();
                    input.nextLine();
                    uc.deleteTicketContact(IDb);
                    break;
                case "Q":System.out.println("vcxvcxvcxvcx");
                    program = false;
                    break;
            }
       }
    }
}
