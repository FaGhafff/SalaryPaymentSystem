package SubSystems;

import Model.DataBaseHelper;

public class PersonnelCodeGenerator {
    private String personnelCode = "";

    public PersonnelCodeGenerator() {
        int numberOfWorkers = 0;
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        numberOfWorkers = dataBaseHelper.getNumberOfEmployees();
        long COMPANY_CODE = 98536;
        personnelCode = String.valueOf(COMPANY_CODE * 10000 + (numberOfWorkers + 1));
    }

    public String getPersonnelCode() {
        return personnelCode;
    }
}
