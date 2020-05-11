package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBhelper {
    Connection cnct;
    Statement st;

    public DBhelper() {
        connect();
        createTable();

//        ArrayList<DBPerson> persons = getAllPerson();
//        for (DBPerson p : persons) {
//            System.out.println(p);
//        }
        close();
    }

    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            cnct = DriverManager.getConnection("jdbc:sqlite:faat.db");

            System.out.println("Connection Created!");

            st = cnct.createStatement();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void createTable() {
        String tableSQL = "CREATE TABLE IF NOT EXISTS loginInfo (Username TEXT , Password TEXT)";
        try {
            st.executeUpdate(tableSQL);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertPerson(String username, String password) {
        String insertSQL = "INSERT INTO loginInfo (username,password) VALUES ('" + username + "','" + password + "')";
        try {
            st.executeUpdate(insertSQL);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void close() {

        try {
            st.close();
            cnct.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        new DBhelper();
    }

    class DBPerson {
        String username;
        String password;

        public String toString() {
            return  ( username + " " + password);
        }
    }

    public ArrayList<DBPerson> getAllPerson() {
        String getSQL = "SELECT username,password FROM loginInfo";
        ArrayList<DBPerson> list = new ArrayList<DBhelper.DBPerson>();

        try {
            ResultSet rs = st.executeQuery(getSQL);
            while (rs.next()) {
                DBPerson dbp = new DBPerson();
                dbp.username = rs.getString(1);
                dbp.password = rs.getString(2);

                list.add(dbp);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return list;
    }
}