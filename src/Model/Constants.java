package Model;

public class Constants {

    static Employee employee = new Employee();
    static LegalReceipt legalReceipt = new LegalReceipt();

    public static boolean setFields() {

        legalReceipt.setNamePersian(employee.getNamePersian());
        legalReceipt.setLastNamePersian(employee.getLastNamePersian());
//        legalReceipt.setUserNumber(-1); // This field is empty
        legalReceipt.setIdNumber(employee.getIdNumber());
        legalReceipt.setIssuanceOfBCPlace(employee.getIssuanceOfBCPlace());
        legalReceipt.setBirthPlace(employee.getBirthPlace());
        legalReceipt.setHighestDegree(employee.getHighestDegree());
        legalReceipt.setMajorStatus(employee.getMajorStatus());
        legalReceipt.setServiceUnit(employee.getServiceUnit());
        legalReceipt.setOrganizationalPosition(employee.getOrganizationalPosition());
        legalReceipt.setServiceTimeYear(employee.getServiceTimeYear());
        legalReceipt.setServiceTimeMonth(employee.getServiceTimeMonth());
        legalReceipt.setServiceTimeDay(employee.getServiceTimeDay());
        legalReceipt.setSalaryBase(employee.getSalaryBase());



        return true;
    }



}
