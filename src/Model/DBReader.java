package Model;

import java.sql.*;
import java.util.ArrayList;


public class DBReader {
    private Connection cnct;
    private Statement st;



    public DBReader() {
        connect();
        reading();
        ArrayList<DBPerson> list = getAllPerson();
//        System.out.println(getPhoneNumber("1362960276" , list , phoneNumber));
        System.out.println(getCount(list));
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

    private void reading() {

    }


    public int getCount(ArrayList<DBPerson> list) {

        int count = list.size();

        return count;
    }

//    public String getPhoneNumber(String username , ArrayList<DBPerson> list , ArrayList<Long> pn) {
//
//        int i = list.indexOf(username);
//        pn.add((long) 25);
//        System.out.println(i);
//        System.out.println(pn.get(0));
//        System.out.println(pn.get(1));
//        String phoneNumber = pn.get(0).toString();
//        return phoneNumber;
//    }

    public static void updatePassword(String username) {
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
                    "#" + fatherName + "#" + fatherMobileNumber + "#" + telephoneNumber + "#" + maritalStatus + "#" +
                    childrenCount + "#" + healthIssue + "#" + healthStatus + "#" + emergencyContactName + "#" +
                    emergencyContactLastName + "#" + emergencyContactRelation + "#" + emergencyContactMobileNumber +
                    "#" + methodOfIntroduction + "#" + diplomaType + "#" + diplomaScore + "#" + associateStatus + "#"
                    + associatePlace + "#" + associateScore + "#" + bachelorStatus + "#" + bachelorPlace + "#" + bachelorScore
                    + "#" + masterStatus + "#" + masterPlace + "#" + masterScore + "#" + doctorateStatus + "#" + doctoratePlace
                    + "#" + doctorateScore + "#" + otherEducation);
        }

        public long getMobilePhoneNumber() {
            return mobilePhoneNumber;
        }

        public void setMobilePhoneNumber(long mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
        }
    }

    private ArrayList<DBPerson> getAllPerson() {
        String getSQL = "SELECT namePersian , lastNamePersian , nameEnglish,lastNameEnglish,idNumber,bcNumber,birthPlace,issuanceOfBirth,sexuality,fatherName,fatherMobileNumber,telephoneNumber ,  maritalStatus ,childrenCount , healthIssue, healthStatus ,emergencyContactName,emergencyContactLastName,emergencyContactRelation,emergencyContactPhoneNumber, methodOfIntroducing,diplomaType , diplomaScore ,associateStatus,associatePlace ,associateScore,bachelorStatus ,bachelorPlace,bachelorScore,masterStatus,masterPlace , masterScore ,doctorateStatus,doctoratePlace,doctorateScore ,otherEducation FROM personalInfo";
        ArrayList<DBPerson> list = new ArrayList<DBPerson>();

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
                dbp.emergencyContactMobileNumber = rs.getInt(21);
                dbp.methodOfIntroduction = rs.getString(22);
                dbp.diplomaType = rs.getString(22);
                dbp.diplomaScore = rs.getDouble(23);
                dbp.associateStatus = rs.getString(24);
                dbp.associatePlace = rs.getString(25);
                dbp.associateScore = rs.getDouble(26);
                dbp.bachelorStatus = rs.getString(27);
                dbp.bachelorPlace = rs.getString(28);
                dbp.bachelorScore = rs.getDouble(29);
                dbp.masterStatus = rs.getString(30);
                dbp.masterPlace = rs.getString(31);
                dbp.masterScore = rs.getDouble(32);
                dbp.doctorateStatus = rs.getString(33);
                dbp.doctoratePlace = rs.getString(34);
                dbp.doctorateScore = rs.getDouble(35);
                dbp.otherEducation = rs.getString(36);
                list.add(dbp);
               for (int i=1;i<37;i++){
                   System.out.println(rs.getString(i));
               }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage() + "  anjam nashod 1");
        }
        return list;
    }
}
