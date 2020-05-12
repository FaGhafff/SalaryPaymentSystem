package SubSystems;

import Model.DBhelper;

public class PersonnelCodeGenerator {
    private final long COMPANY_CODE = 98536;
    private String personnelCode = "";

    public PersonnelCodeGenerator() {


        int numberOfWorkers = 0;
//        DBhelper dBhelper = new DBhelper();
//        call int:getNumberOfWorkers() from DBHelper
        personnelCode = String.valueOf(COMPANY_CODE * 10000 + (numberOfWorkers + 1));


    }

    public String getPersonnelCode() {
        return personnelCode;
    }
}
