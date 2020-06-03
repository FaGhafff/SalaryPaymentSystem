package SubSystems;

import Model.EmploymentOrder;

public class Register {

    static public int EMPLOYEE = 1;
    static public int MANAGER = 0;

    private EmploymentOrder order;
    private int grade;

    public Register(EmploymentOrder order, int grade) {
        this.order = order;
        this.grade = grade;
    }
    public void register(){


    }



}
