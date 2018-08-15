package Kino.controller;

import Kino.database.DBConnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {

    DBConnect dao = new DBConnect();

    public void shopTicketContact(int IDk, int IDf, String ilosc) throws SQLException {
        String insertSQL = "INSERT INTO bilety (ilosc, filmy_ID) values (?, ?)";
        PreparedStatement st = dao.getCon().prepareStatement(insertSQL);
        st.setString(1, ilosc);
        st.setInt(2, IDf);
        st.execute();
        st.close();

        System.out.println("Chcesz zatwierdzic wprowadzone zmiany? T/N");
        Scanner input = new Scanner(System.in);
        String dec = input.nextLine();
        if (dec.toLowerCase().equals("t")) {
            dao.getCon().commit();
        } else {
            dao.getCon().rollback();
        }

    }

    public void showTicketContact() throws SQLException {
        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery("SELECT b.ID, b.ilosc, f.nazwa as 'f_nazwa', k.nazwa as 'k_nazwa' from bilety b INNER JOIN filmy f ON f.ID=b.filmy_ID  INNER JOIN kino k ON k.ID=f.kino_ID");
        while (rs.next()){
            System.out.printf("%3s %20s %20s %20s \n", rs.getString("ID"), rs.getString("ilosc"), rs.getString("f_nazwa"), rs.getString("k_nazwa"));
        }
        st.close();

    }
    public void deleteTicketContact(int IDb) throws SQLException {
        String deleteSQL = "DELETE FROM bilety WHERE ID=" + IDb + "";
        PreparedStatement st = dao.getCon().prepareStatement(deleteSQL);
        st.execute();
        st.close();

        System.out.println("Chcesz zatwierdzic wprowadzone zmiany? T/N");
        Scanner input = new Scanner(System.in);
        String dec = input.nextLine();
        if (dec.toLowerCase().equals("t")) {
            dao.getCon().commit();
        } else {
            dao.getCon().rollback();
        }

    }


    public void showMovieContact() throws SQLException {
        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery("SELECT f.*, k.nazwa as 'k_nazwa' from filmy f INNER JOIN kino k ON k.ID=f.kino_ID");
        while (rs.next()){
            System.out.printf("%3s %20s %20s \n", rs.getString("ID"), rs.getString("nazwa"), rs.getString("k_nazwa"));
        }
        st.close();
    }

    public void showMovieContact(int ID) throws SQLException {
        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery("SELECT f.* from filmy f WHERE kino_ID = "+ID+"");
        while (rs.next()){
            System.out.printf("%3s %20s \n", rs.getString("ID"), rs.getString("nazwa"));
        }
        st.close();
    }

    public void addMovieContact(String tytul, int IDk) throws SQLException {
        String insertSQL = "INSERT INTO filmy(nazwa, kino_ID) values (?, ?)";
        PreparedStatement st = dao.getCon().prepareStatement(insertSQL);
        st.setString(1, tytul);
        st.setInt(2, IDk);
        st.execute();
        st.close();

        System.out.println("Chcesz zatwierdzic wprowadzone zmiany? T/N");
        Scanner input = new Scanner(System.in);
        String dec = input.nextLine();
        if (dec.toLowerCase().equals("t")) {
            dao.getCon().commit();
        } else {
            dao.getCon().rollback();
        }
    }

    public void deleteMovieContact(int ID) throws SQLException {
        String deleteSQL = "DELETE FROM filmy WHERE ID=" + ID + "";
        PreparedStatement st = dao.getCon().prepareStatement(deleteSQL);
        st.execute();
        st.close();

        System.out.println("Chcesz zatwierdzic wprowadzone zmiany? T/N");
        Scanner input = new Scanner(System.in);
        String dec = input.nextLine();
        if (dec.toLowerCase().equals("t")) {
            dao.getCon().commit();
        } else {
            dao.getCon().rollback();
        }
    }


    public void showCinemaContact() throws SQLException {
        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM kino");
        while (rs.next()){
            System.out.printf("%3s %20s \n", rs.getString("ID"), rs.getString("nazwa"));
        }
        st.close();
    }

    public void addCinemaContact(String nazwa) throws SQLException {
        String insertSQL = "INSERT INTO kino(nazwa) values (?)";
        PreparedStatement st = dao.getCon().prepareStatement(insertSQL);
        st.setString(1, nazwa);
        st.execute();
        st.close();

        System.out.println("Chcesz zatwierdzic wprowadzone zmiany? T/N");
        Scanner input = new Scanner(System.in);
        String dec = input.nextLine();
        if (dec.toLowerCase().equals("t")) {
            dao.getCon().commit();
        } else {
            dao.getCon().rollback();
        }
    }

    public void deleteCinemaContact(int ID) throws SQLException {
        String deleteSQL = "DELETE FROM kino WHERE ID=" + ID + "";
        PreparedStatement st = dao.getCon().prepareStatement(deleteSQL);
        st.execute();
        st.close();

        System.out.println("Chcesz zatwierdzic wprowadzone zmiany? T/N");
        Scanner input = new Scanner(System.in);
        String dec = input.nextLine();
        if (dec.toLowerCase().equals("t")) {
            dao.getCon().commit();
        } else {
            dao.getCon().rollback();
        }

    }

}
