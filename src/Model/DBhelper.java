package Model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBhelper {
    public Connection cnct;
    Statement st;

    public DBhelper() {
        connect();
        createTable();

        // ArrayList<DBPerson> persons = getAllPerson();
        // for (DBPerson p : persons) {
        // System.out.println(p);
        // }
        close();
    }

    private void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            cnct = DriverManager.getConnection("jdbc:sqlite:faat.db");

            System.out.println("Connection Created!");

            st = cnct.createStatement();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // {
    // String tablSQL="CREATE TABLE IF NOT EXISTS person (id INTEGER PRIMARY KEY
    // AUTOINCREMENT NOT NULL ,name TEXT , lastname TEXT);";
    // try {

    private void createTable() {

        String tableSQL = "CREATE TABLE IF NOT EXISTS personalInfo (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, namePersian TEXT,  lastNamePersian TEXT, nameEnglish TEXT, lastNameEnglish TEXT, idNumber INTEGER, bcNumber INTEGER, birthPlace TEXT, issuanceOfBirth TEXT,sexuality TEXT, fatherName TEXT, fatherMobileNumber INTEGER, mobilePhoneNumber INTEGER, telephoneNumber INTEGER, maritalStatus TEXT, childrenCount INTEGER, healthIssue TEXT, healthStatus TEXT, emergencyContactName TEXT, emergencyContactLastName TEXT, emergencyContactRelation TEXT, emergencyContactPhoneNumber INTEGER, methodOfIntroducing TEXT, diplomaType TEXT, diplomaScore DOUBLE, associateStatus TEXT, associatePlace TEXT,associateScore DOUBLE, bachelorStatus TEXT, bachelorPlace TEXT, bachelorScore DOUBLE, masterStatus TEXT, masterPlace TEXT, masterScore DOUBLE, doctorateStatus TEXT, doctoratePlace TEXT, doctorateScore DOUBLE, otherEducation TEXT);";
        try {
            st.executeUpdate(tableSQL);
            System.out.println("TABLE CREATE");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void insertPerson(String username, String password) {
        String insertSQL = "INSERT INTO loginInfo (username,password) VALUES ('" + username + "','" + password + "')";
        try {
            st.executeUpdate(insertSQL);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private void close() {

        try {
            st.close();
            cnct.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    private String getHash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new DBhelper();
    }

    // class DBPerson {
    // String username;
    // String password;
    //
    // public String toString() {
    // return ( username + " " + password);
    // }
    // }
    //
    // private ArrayList<DBPerson> getAllPerson() {
    // String getSQL = "SELECT username,password FROM loginInfo";
    // ArrayList<DBPerson> list = new ArrayList<DBhelper.DBPerson>();
    //
    // try {
    // ResultSet rs = st.executeQuery(getSQL);
    // while (rs.next()) {
    // DBPerson dbp = new DBPerson();
    // dbp.username = rs.getString(1);
    // dbp.password = rs.getString(2);
    //
    // list.add(dbp);
    // }
    // } catch (SQLException e) {
    // System.out.println(e.getMessage());
    // }

    // return list;
    // }
}
