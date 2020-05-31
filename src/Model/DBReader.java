package Model;

//import java.security.acl.LastOwnerException;
import java.sql.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class DBReader {
    private static Connection cnct;
    private Statement st;
    static ArrayList<DBPerson> list;
    static ArrayList<Long> phoneNumber;
    static DBPerson person;

    public DBReader() {
        connect();
        list = getAllPerson();
        ArrayList<String> login = getAllPersonLogin();
        System.out.println(getPhoneNumber("1362960276", login, phoneNumber));
        System.out.println("count is : " + getCount(list));
        updatePassword(login, "1362960276", "ali123456789", "ali123456");
        getPerson("1362960276", login);
        System.out.println(authClient("1362960276", "ali123456", login));
        System.out.println(person);
    }

    private void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            cnct = DriverManager.getConnection("jdbc:sqlite:faat.db");

            st = cnct.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "    anjam nashod");
        }
    }


    public int getCount(ArrayList<DBPerson> list) {

        int count = list.size();

        return count;
    }

    public String getPhoneNumber(String username, ArrayList<String> login, ArrayList<Long> pn) {
        int j = -1;
        for (int i = 0; i < login.size(); i++) {
            ArrayList<String> temp = new ArrayList<String>();
            StringTokenizer tkn = new StringTokenizer(login.get(i), "#");
            while (tkn.hasMoreTokens()) {
                temp.add(tkn.nextToken());
            }
            if (temp.get(0).equals(username)) {
                j = i;
                break;
            }
        }
        System.out.println(j);
        System.out.println(pn.get(0));
        String phoneNumber = pn.get(j).toString();
        return phoneNumber;
    }

    public static void updatePassword(ArrayList<String> login, String username, String lastPassword, String newPassword) {
        int j = -1;
        for (int i = 0; i < login.size(); i++) {
            ArrayList<String> temp = new ArrayList<String>();
            StringTokenizer tkn = new StringTokenizer(login.get(i), "#");
            while (tkn.hasMoreTokens()) {
                temp.add(tkn.nextToken());
            }
            System.out.println(temp.get(0) + "   " + temp.get(1));

            if (temp.get(0).equals(username)) {
                j = i;
            }
            if (temp.get(1).equals(lastPassword)) {
                try {
                    String updateSQl = "update loginInfo set id = '" + 1 + "' , userName='" + username + "' , password = '" + newPassword + "' where id = '" + 1 + "' ";
                    PreparedStatement pstmt = cnct.prepareStatement(updateSQl);
                    pstmt.executeUpdate();
                    System.out.println("ok");
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage() + " ramz avaz nashod");
                }
            }
        }
    }

    public static boolean authClient(String username, String password, ArrayList<String> login) {

        for (int i = 0; i < login.size(); i++) {
            ArrayList<String> temp = new ArrayList<String>();
            StringTokenizer tkn = new StringTokenizer(login.get(i), "#");
            while (tkn.hasMoreTokens()) {
                temp.add(tkn.nextToken());
            }
            if (temp.get(0).equals(username) && temp.get(1).equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void getPerson(String username, ArrayList<String> login) {
        for (int i = 0; i < login.size(); i++) {
            ArrayList<String> temp = new ArrayList<String>();
            StringTokenizer tkn = new StringTokenizer(login.get(i), "#");
            while (tkn.hasMoreTokens()) {
                temp.add(tkn.nextToken());
            }
            if (username.equals(temp.get(0))) {
                person = list.get(i);
                break;
            }
        }
    }



    public static void main(String[] args) {
        new DBReader();
    }

    class DBPerson {
        private String namePersian;
        private String lastNamePersian;
        private String nameEnglish;
        private String lastNameEnglish;
        private long idNumber;
        private long bcNumber;
        private String birthPlace;
        private String issuanceOfBCPlace;
        private String sexuality;
        private String fatherName;
        private long fatherMobileNumber;
        private long mobilePhoneNumber;
        private long telephoneNumber;
        private String maritalStatus;
        private int childrenCount;
        private String healthIssue;
        private String healthStatus;
        private String emergencyContactName;
        private String emergencyContactLastName;
        private String emergencyContactRelation;
        private long emergencyContactMobileNumber;
        private String methodOfIntroduction;
        private String diplomaType;
        private double diplomaScore;
        private String associateStatus;
        private String associatePlace;
        private double associateScore;
        private String bachelorStatus;
        private String bachelorPlace;
        private double bachelorScore;
        private String masterStatus;
        private String masterPlace;
        private double masterScore;
        private String doctorateStatus;
        private String doctoratePlace;
        private double doctorateScore;
        private String otherEducation;

        public String toString() {

            return (namePersian + "#" + lastNamePersian + "#" + nameEnglish + "#" + lastNameEnglish + "#"
                    + idNumber + "#" + bcNumber + "#" + birthPlace + "#" + issuanceOfBCPlace + "#" + sexuality +
                    "#" + fatherName + "#" + fatherMobileNumber + "#" + "#" + mobilePhoneNumber + "#" + telephoneNumber + "#" + maritalStatus + "#" +
                    childrenCount + "#" + healthIssue + "#" + healthStatus + "#" + emergencyContactName + "#" +
                    emergencyContactLastName + "#" + emergencyContactRelation + "#" + emergencyContactMobileNumber +
                    "#" + methodOfIntroduction + "#" + diplomaType + "#" + diplomaScore + "#" + associateStatus + "#"
                    + associatePlace + "#" + associateScore + "#" + bachelorStatus + "#" + bachelorPlace + "#" + bachelorScore
                    + "#" + masterStatus + "#" + masterPlace + "#" + masterScore + "#" + doctorateStatus + "#" + doctoratePlace
                    + "#" + doctorateScore + "#" + otherEducation);
        }
    }

    private ArrayList<String> getAllPersonLogin() {
        String getSQL = "SELECT userName , password FROM loginInfo";
        ArrayList<String> list = new ArrayList<String>();
        try {
            ResultSet rs = st.executeQuery(getSQL);
            while (rs.next()) {
                String temp = (rs.getString(1) + "#" + rs.getString(2));
                list.add(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "  khandane user pass na movafag");
        }
        return list;
    }


    private ArrayList<DBPerson> getAllPerson() {
        String getSQL = "SELECT namePersian , lastNamePersian , nameEnglish,lastNameEnglish,idNumber,bcNumber,birthPlace,issuanceOfBirth,sexuality,fatherName,fatherMobileNumber,mobilePhoneNumber,telephoneNumber ,  maritalStatus ,childrenCount , healthIssue, healthStatus ,emergencyContactName,emergencyContactLastName,emergencyContactRelation,emergencyContactPhoneNumber, methodOfIntroducing,diplomaType , diplomaScore ,associateStatus,associatePlace ,associateScore,bachelorStatus ,bachelorPlace,bachelorScore,masterStatus,masterPlace , masterScore ,doctorateStatus,doctoratePlace,doctorateScore ,otherEducation FROM personalInfo";
        ArrayList<DBPerson> list = new ArrayList<DBPerson>();
        phoneNumber = new ArrayList<Long>();
        try {

            ResultSet rs = st.executeQuery(getSQL);

            while (rs.next()) {
                DBPerson dbp = new DBPerson();
                dbp.namePersian = rs.getString(1);
                dbp.lastNamePersian = rs.getString(2);
                dbp.nameEnglish = rs.getString(3);
                dbp.lastNameEnglish = rs.getString(4);
                dbp.idNumber = rs.getLong(5);
                dbp.bcNumber = rs.getLong(6);
                dbp.birthPlace = rs.getString(7);
                dbp.issuanceOfBCPlace = rs.getString(8);
                dbp.sexuality = rs.getString(9);
                dbp.fatherName = rs.getString(10);
                dbp.fatherMobileNumber = rs.getLong(11);
                dbp.mobilePhoneNumber = rs.getLong(12);
                dbp.telephoneNumber = rs.getLong(13);
                dbp.maritalStatus = rs.getString(14);
                dbp.childrenCount = rs.getInt(15);
                dbp.healthIssue = rs.getString(16);
                dbp.healthStatus = rs.getString(17);
                dbp.emergencyContactName = rs.getString(18);
                dbp.emergencyContactLastName = rs.getString(19);
                dbp.emergencyContactRelation = rs.getString(20);
                dbp.emergencyContactMobileNumber = rs.getLong(21);
                dbp.methodOfIntroduction = rs.getString(22);
                dbp.diplomaType = rs.getString(23);
                dbp.diplomaScore = rs.getDouble(24);
                dbp.associateStatus = rs.getString(25);
                dbp.associatePlace = rs.getString(26);
                dbp.associateScore = rs.getDouble(27);
                dbp.bachelorStatus = rs.getString(28);
                dbp.bachelorPlace = rs.getString(29);
                dbp.bachelorScore = rs.getDouble(30);
                dbp.masterStatus = rs.getString(31);
                dbp.masterPlace = rs.getString(32);
                dbp.masterScore = rs.getDouble(33);
                dbp.doctorateStatus = rs.getString(34);
                dbp.doctoratePlace = rs.getString(35);
                dbp.doctorateScore = rs.getDouble(36);
                dbp.otherEducation = rs.getString(37);
                list.add(dbp);

                phoneNumber.add(rs.getLong(12));
            }


        } catch (Exception e) {
            System.out.println(e.getMessage() + "  anjam nashod 1");
        }
        return list;
    }
}