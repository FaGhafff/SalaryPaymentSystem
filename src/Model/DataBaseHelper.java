package Model;

import SubSystems.Employment;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;

public class DataBaseHelper {
    private Connection connection;
    private Statement statement;

    public DataBaseHelper() {
        connect();
//        createTables();
    }

    private void connect() {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/salerypaymentsystem", "root", "");
            statement = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " from connect -> DataBaseHelper");
            e.printStackTrace();
            close();
        }
    }

    //Reviewed
    public void close() {
        try {
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage() + " from close -> DataBaseHelper");
            throwables.printStackTrace();
        }
    }

    private void createTables() {
        createTableUserPass();
        createTable("CREATE TABLE IF NOT EXIST `salerypaymentsystem`.`legalreceipt` ( `userName` VARCHAR(9) NOT NULL , `namePersian` VARCHAR(50) NOT NULL , `lastNamePersian` VARCHAR(50) NOT NULL , `idNumber` VARCHAR(10) NOT NULL , `issuanceOfBCPlace` VARCHAR(10) NOT NULL , `birthPlace` VARCHAR(10) NOT NULL , `highestDegree` VARCHAR(10) NOT NULL , `majorStatus` VARCHAR(10) NOT NULL , `serviceUnit` VARCHAR(10) NOT NULL , `organizationalPosition` VARCHAR(10) NOT NULL , `serviceTimeYear` VARCHAR(10) NOT NULL , `serviceTimeMonth` VARCHAR(10) NOT NULL , `serviceTimeDay` VARCHAR(10) NOT NULL , `salaryBase` DOUBLE(6,2) NOT NULL , `annualIncrease` DOUBLE(6,2) NOT NULL , `extraordinaryHousing` DOUBLE(6,2) NOT NULL , `badWeather` DOUBLE(6,2) NOT NULL , `deprivationOfServiecePlace` DOUBLE(6,2) NOT NULL , `familyAllowance` DOUBLE(6,2) NOT NULL , `childrenAllowance` DOUBLE(6,2) NOT NULL , `seniorOrExpertAllowance` DOUBLE(6,2) NOT NULL , `reward` DOUBLE(6,2) NOT NULL , `importantsOfJob` DOUBLE(6,2) NOT NULL , `sacrificePoints` DOUBLE(6,2) NOT NULL , `insurance` DOUBLE(6,2) NOT NULL , `pensionFund` DOUBLE(6,2) NOT NULL , `tax` DOUBLE(6,2) NOT NULL , `descriptionOfTheSentence` VARCHAR(60) NOT NULL , `serialOfSentence` VARCHAR(50) NOT NULL , `finalSalary` DOUBLE(8,2) NOT NULL , PRIMARY KEY (`userName`(9))) ENGINE = InnoDB; ");
    }

    private void createTableUserPass() {
        String query = "CREATE TABLE IF NOT EXISTS `salerypaymentsystem`.`userpass` ( `row` INT NULL AUTO_INCREMENT ,  `user` VARCHAR(9) CHARACTER SET utf8 COLLATE utf8_persian_ci NULL ,  `pass` VARCHAR(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL , PRIMARY KEY(`user`(9)), INDEX`index` (`row`)) ENGINE = InnoDB";
        try {
            statement.execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " from createTableUserPass -> DataBase ");
            e.printStackTrace();
        }
    }

    public String getHash(String input) {
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

    public boolean authClient(String username, String password) {
        try {
            String query = "SELECT * FROM userpass WHERE user='" + username + "' AND pass= '" + getHash(password) + "'";
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            resultSet.getString(1);
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public boolean changePassword(String username, String newPassword) {
        String sql = "UPDATE userpass SET pass = '" + getHash(newPassword) + "' WHERE user ='" + username + "'";
        try {
            statement.execute(sql);
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    public void setConstants(FixedValues constants) {
        try {
            statement.execute("DELETE FROM cons");
            String sql = "INSERT INTO `cons`(`salaryBase`, `annualIncrease`, `extraordinaryHousing`, `badWeather`, `deprivationOfServiecePlace`," +
                    " `familyAllowance`, `childrenAllowance`, `seniorOrExpertAllowance`, `reward`," +
                    " `importantsOfJob`, `sacrificePoints`, `insurance`, `pensionFund`, `tax`) " +
                    "VALUES ('" + constants.getSalaryBase() + "','" + constants.getAnnualIncrease() + "','" + constants.getExtraordinaryHousing() + "','" + constants.getBadWeather() + "','" + constants.getDeprivationOfServiecePlace()
                    + "','" + constants.getFamilyAllowance() + "','" + constants.getChildrenAllowance() + "','" + constants.getSeniorOrExpertAllowance() + "','" + constants.getReward() +
                    "','" + constants.getImportantsOfJob() + "','" + constants.getSacrificePoints() + "','" + constants.getInsurance() + "','" + constants.getPensionFund() + "','" + constants.getTax() + "')";
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " setConstants " + this.getClass().getName());
        }
    }

    public FixedValues getConstants() {
        try {
            String sql = "SELECT * FROM cons";
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            return new FixedValues().setSalaryBase(resultSet.getDouble(1))
                    .setAnnualIncrease(resultSet.getDouble(2))
                    .setExtraordinaryHousing(resultSet.getDouble(3))
                    .setBadWeather(resultSet.getDouble(4))
                    .setDeprivationOfServiecePlace(resultSet.getDouble(5))
                    .setFamilyAllowance(resultSet.getDouble(6))
                    .setChildrenAllowance(resultSet.getDouble(7))
                    .setSeniorOrExpertAllowance(resultSet.getDouble(8))
                    .setReward(resultSet.getDouble(9))
                    .setImportantsOfJob(resultSet.getDouble(10))
                    .setSacrificePoints(resultSet.getDouble(11))
                    .setInsurance(resultSet.getDouble(12))
                    .setPensionFund(resultSet.getDouble(13))
                    .setTax(resultSet.getDouble(14));
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " getDefaultHokm");
            return null;
        }

    }

    public ArrayList<FixedValues> readAllHokms() {
        ArrayList<FixedValues> list = new ArrayList<>();
        String sql = "SELECT * FROM `legalreceipt` ";
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            int i =1;
            while (resultSet.next()){
                list.add(new FixedValues().setRow(i)
                        .setUsername(resultSet.getString(1))
                        .setName(resultSet.getString(2))
                        .setSalaryBase(resultSet.getDouble(3))
                        .setAnnualIncrease(resultSet.getDouble(4))
                        .setExtraordinaryHousing(resultSet.getDouble(5))
                        .setBadWeather(resultSet.getDouble(6))
                        .setDeprivationOfServiecePlace(resultSet.getDouble(7))
                        .setFamilyAllowance(resultSet.getDouble(8))
                        .setChildrenAllowance(resultSet.getDouble(9))
                        .setSeniorOrExpertAllowance(resultSet.getDouble(10))
                        .setReward(resultSet.getDouble(11))
                        .setImportantsOfJob(resultSet.getDouble(12))
                        .setSacrificePoints(resultSet.getDouble(13))
                        .setInsurance(resultSet.getDouble(14))
                        .setPensionFund(resultSet.getDouble(15))
                        .setTax(resultSet.getDouble(16)));
                i++;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage() + " readAllHokms");
        }
        return list;

    }

    public FixedValues getHokm(String username){
        try {
            String sql = "SELECT * FROM `legalreceipt` WHERE `username`='"+username+"'";
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            return new FixedValues().setUsername(resultSet.getString(1))
                    .setName(resultSet.getString(2))
                    .setSalaryBase(resultSet.getDouble(3))
                    .setAnnualIncrease(resultSet.getDouble(4))
                    .setExtraordinaryHousing(resultSet.getDouble(5))
                    .setBadWeather(resultSet.getDouble(6))
                    .setDeprivationOfServiecePlace(resultSet.getDouble(7))
                    .setFamilyAllowance(resultSet.getDouble(8))
                    .setChildrenAllowance(resultSet.getDouble(9))
                    .setSeniorOrExpertAllowance(resultSet.getDouble(10))
                    .setReward(resultSet.getDouble(11))
                    .setImportantsOfJob(resultSet.getDouble(12))
                    .setSacrificePoints(resultSet.getDouble(13))
                    .setInsurance(resultSet.getDouble(14))
                    .setPensionFund(resultSet.getDouble(15))
                    .setTax(resultSet.getDouble(16));
        }catch (SQLException e){
            System.out.println(e.getMessage()+" getHokm");
            return null;
        }
    }

    public void writeHokme(FixedValues fixedValues) {

        String sql = "INSERT INTO `legalreceipt`(`username`, `name`,`salaryBase`, `annualIncrease`, `extraordinaryHousing`, `badWeather`, `deprivationOfServiecePlace`," +
                " `familyAllowance`, `childrenAllowance`, `seniorOrExpertAllowance`, `reward`," +
                " `importantsOfJob`, `sacrificePoints`, `insurance`, `pensionFund`, `tax`) " +
                "VALUES ('"+fixedValues.getUsername()+"','"+fixedValues.getName()+"','" + fixedValues.getSalaryBase() + "','" + fixedValues.getAnnualIncrease() + "','" + fixedValues.getExtraordinaryHousing() + "','" + fixedValues.getBadWeather() + "','" + fixedValues.getDeprivationOfServiecePlace()
                + "','" + fixedValues.getFamilyAllowance() + "','" + fixedValues.getChildrenAllowance() + "','" + fixedValues.getSeniorOrExpertAllowance() + "','" + fixedValues.getReward() +
                "','" + fixedValues.getImportantsOfJob() + "','" + fixedValues.getSacrificePoints() + "','" + fixedValues.getInsurance() + "','" + fixedValues.getPensionFund() + "','" + fixedValues.getTax() +"')";
        try {
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void updateHokm(ArrayList<FixedValues> list) {
        for (FixedValues fixedValues : list) {

            String query = "DELETE FROM `legalreceipt` WHERE `username`="+fixedValues.getUsername();
            try {
                statement.execute(query);
                writeHokme(fixedValues);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void remove(EmploymentOrder order) {
        try {
            String sql ="DELETE FROM `employment` WHERE `idNumber`="+order.getIdNumber();
            statement.execute(sql);
        }catch (SQLException e){
            System.out.println(e.getMessage()+" remove");
        }
    }

    //

    //Need to check

    public boolean sendRequest(EmploymentOrder employmentOrder) {
        try {
            String query = "INSERT INTO employment VALUES (NULL,'"
                    + employmentOrder.getNamePersian() + "','"
                    + employmentOrder.getLastNamePersian() + "','"
                    + employmentOrder.getNameEnglish() + "','"
                    + employmentOrder.getLastNameEnglish() + "','"
                    + employmentOrder.getIdNumber() + "','"
                    + employmentOrder.getBcNumber() + "','"
                    + employmentOrder.getBirthPlace() + "','"
                    + employmentOrder.getIssuanceOfBCPlace() + "','"
                    + employmentOrder.getSexuality() + "','"
                    + employmentOrder.getFatherName() + "','"
                    + employmentOrder.getFatherMobileNumber() + "','"
                    + employmentOrder.getTelephoneNumber() + "','"
                    + employmentOrder.getMaritalStatus()
                    + employmentOrder.getChildrenCount() + "','"
                    + employmentOrder.getHealthIssue() + "','"
                    + employmentOrder.getHealthStatus() + "','"
                    + employmentOrder.getEmergencyContactName()
                    + employmentOrder.getEmergencyContactLastName() + "','"
                    + employmentOrder.getEmergencyContactRelation() + "','"
                    + employmentOrder.getEmergencyContactMobileNumber() + "','"
                    + employmentOrder.getMethodOfIntroduction() + "','"
                    + employmentOrder.getDiplomaType() + "','"
                    + employmentOrder.getDiplomaType() + "','"
                    + employmentOrder.getDiplomaScore() + "','"
                    + employmentOrder.getAssociateStatus() + "','"
                    + employmentOrder.getAssociatePlace() + "','"
                    + employmentOrder.getAssociateScore() + "','"
                    + employmentOrder.getBachelorStatus() + "','"
                    + employmentOrder.getBachelorScore() + "','"
                    + employmentOrder.getMaritalStatus() + "','"
                    + employmentOrder.getMasterPlace() + "','"
                    + employmentOrder.getMasterScore() + "','"
                    + employmentOrder.getDoctorateStatus() + "','"
                    + employmentOrder.getDoctoratePlace() + "','"
                    + employmentOrder.getDoctorateScore() + "'";
            return statement.execute(query);
        } catch (SQLException e) {
            return false;
        }

//        return true;
    }

    public ArrayList<EmploymentOrder> getRequests() {
        String query = "SELECT * FROM employment";
        ArrayList<EmploymentOrder> list = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                list.add(new EmploymentOrder()
                        .setNamePersian(resultSet.getString(2))
                        .setLastNamePersian(resultSet.getString(3))
                        .setNameEnglish(resultSet.getString(4))
                        .setLastNameEnglish(resultSet.getString(5))
                        .setIdNumber(resultSet.getLong(6))
                        .setBcNumber(resultSet.getLong(7))
                        .setBirthPlace(resultSet.getString(8))
                        .setIssuanceOfBCPlace(resultSet.getString(9))
                        .setSexuality(resultSet.getString(10))
                        .setFatherName(resultSet.getString(11))
                        .setFatherMobileNumber(Long.parseLong(resultSet.getString(12)))
                        .setMobilePhoneNumber(Long.parseLong(resultSet.getString(13)))
                        .setTelephoneNumber(Long.parseLong(resultSet.getString(14)))
                        .setMaritalStatus(resultSet.getString(15))
                        .setChildrenCount(Integer.parseInt(resultSet.getString(16)))
                        .setHealthIssue(resultSet.getString(17))
                        .setHealthStatus(resultSet.getString(18))
                        .setEmergencyContactName(resultSet.getString(19))
                        .setEmergencyContactLastName(resultSet.getString(20))
                        .setEmergencyContactRelation(resultSet.getString(21))
                        .setEmergencyContactMobileNumber(Long.parseLong(resultSet.getString(22)))
                        .setMethodOfIntroduction(resultSet.getString(23))
                        .setDiplomaType(resultSet.getString(24))
                        .setDiplomaScore(Double.parseDouble(resultSet.getString(25)))
                        .setAssociateStatus(resultSet.getString(26))
                        .setAssociatePlace(resultSet.getString(27))
                        .setAssociateScore(Double.parseDouble(resultSet.getString(28)))
                        .setBachelorStatus(resultSet.getString(29))
                        .setBachelorPlace(resultSet.getString(30))
                        .setBachelorScore(Double.parseDouble(resultSet.getString(31)))
                        .setMasterStatus(resultSet.getString(32))
                        .setMasterPlace(resultSet.getString(33))
                        .setMasterScore(Double.parseDouble(resultSet.getString(35)))
                        .setDoctoratePlace(resultSet.getString(36))
                        .setDoctorateScore(resultSet.getDouble(37))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    private void createTable(String query) {
        try {
            statement.execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage() + " from createTableUserPass -> DataBase ");
            e.printStackTrace();
        }
    }




    //Empty
    public Person getPerson(String username) {
        return new Employee();
    }

    public void signUp(EmploymentOrder order) {
    }


    //

    //todo eslah shavad ehraz dar login baraye textFields

    public static void main(String[] args) {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
//        dataBaseHelper.createTables();




    }
}




//    public void updateHokm(ArrayList<FixedValues> list) {
//        for (FixedValues fixedValues : list) {
//
//            String query = "UPDATE `legalreceipt`"
//                    +" SET `salaryBase`= "+fixedValues.getSalaryBase()+" ," +
//                    "`annualIncrease`= "+fixedValues.getAnnualIncrease()+"," +
//                    "`extraordinaryHousing`="+fixedValues.getExtraordinaryHousing()+"," +
//                    "`badWeather`="+fixedValues.getBadWeather()+"," +
//                    "`deprivationOfServiecePlace`="+fixedValues.getDeprivationOfServiecePlace()+"," +
//                    "`familyAllowance`="+fixedValues.getFamilyAllowance()+"," +
//                    "`childrenAllowance`="+fixedValues.getChildrenAllowance()+"," +
//                    "`seniorOrExpertAllowance`="+fixedValues.getSeniorOrExpertAllowance()+"," +
//                    "`reward`="+fixedValues.getReward()+"," +
//                    "`importantsOfJob`="+fixedValues.getImportantsOfJob()+"," +
//                    "`sacrificePoints`="+fixedValues.getSacrificePoints()+"," +
//                    "`insurance`="+fixedValues.getInsurance()+"," +
//                    "`pensionFund`="+fixedValues.getPensionFund()+"," +
//                    "`tax`="+fixedValues.getTax()+""+" WHERE 'username'= "+fixedValues.getUsername()+"";
//            try {
//                statement.execute(query);
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//    }
