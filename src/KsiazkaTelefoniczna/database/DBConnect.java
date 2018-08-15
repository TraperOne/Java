package KsiazkaTelefoniczna.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    final static String draiverMySQl = "com.mysql.jdbc.Driver";
    final static String url = "jdbc:mysql://localhost/ksiazkatelefoniczna";
    final static String uid = "root";
    final static String pwd = "alfa147";
    private Connection con = null;

    public DBConnect() {
        try {
            Class.forName(draiverMySQl).newInstance();
            con = DriverManager.getConnection(url,uid,pwd);
            con.setAutoCommit(false); //false - dopiero po zapytaniu i zatwierdzeniu ładuje do bazy; true automatycznie laduje do bazy
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Nie znaleziono sterownika bazy danych");
            System.out.println(e);
            System.exit(1);
        } catch (SQLException e) {
            System.out.println("Nie połaczyłem się z bazą " + url);
            System.out.println(e);
            System.exit(1);
        }
    }

    public Connection getCon() {
        return con;
    }
}
