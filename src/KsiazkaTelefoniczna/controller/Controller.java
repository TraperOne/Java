package KsiazkaTelefoniczna.controller;

import KsiazkaTelefoniczna.database.DBConnect;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Controller {

    DBConnect dao = new DBConnect();

    public void addKontakt(String imie, String nazwisko, String telefon) throws SQLException {

        String insertSQL = "insert into kontakty(imie, nazwisko, telefon) values (?,?,?)";
        PreparedStatement st = dao.getCon().prepareStatement(insertSQL);
        st.setString(1, imie);
        st.setString(2, nazwisko);
        st.setString(3, telefon);
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

    public void showContact() throws SQLException {

        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery("select * from kontakty");
        while (rs.next()){
            System.out.printf("%3s %10s %10s %10s \n", rs.getString("ID"), rs.getString("imie"), rs.getString("nazwisko"), rs.getString("telefon"));
        }
        st.close();
    }

    public void deleteContact(int ID) throws SQLException {

        String deleteSQL = "DELETE FROM kontakty WHERE ID=" + ID + "";
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

    public void searchContact(String szukaj) throws SQLException {

        Statement st = dao.getCon().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM kontakty WHERE imie LIKE '%"+szukaj+"%' OR nazwisko LIKE '%"+szukaj+"%' OR telefon LIKE '%"+szukaj+"%'");
        while (rs.next()) {
            System.out.printf("%3s %10s %10s %10s\n", rs.getString("ID"), rs.getString("imie"), rs.getString("nazwisko"), rs.getString("telefon"));
        }
        st.close();
    }

    public  void modifiContact(int IDs, String kolumna, String nowe) throws SQLException {
        String updateSQL = "UPDATE kontakty SET "+kolumna+"=? WHERE ID=?";
        PreparedStatement st = dao.getCon().prepareStatement(updateSQL);
        st.setString(1, nowe);
        st.setInt(2, IDs);
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
