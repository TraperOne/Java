package Kino;

import Kino.controller.Controller;
import Kino.model.Bilety;
import Kino.model.Filmy;
import Kino.model.Kino;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        Scanner input = new Scanner(System.in);
        Controller uc = new Controller();

        boolean program = true;
        while (program){
        System.out.println("K - zarzadzaj kinami | F - zarzadzaj filmami | B - kup bileft | Q - Wyjscie");
        String dec = input.nextLine();

            switch (dec.toUpperCase()) {

                case "K":
                    Kino kino = new Kino();
                    break;
                case "F":
                    Filmy filmy = new Filmy();
                    break;
                case "B":
                    Bilety bilety = new Bilety();
                    break;
                case "Q":
                    program = false;
                    break;
            }
        }
    }
}