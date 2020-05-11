package Controllers;

import Model.Employee;
import SubSystems.Employment;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable {
    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
