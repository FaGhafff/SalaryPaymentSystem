package Controllers.EmployeeSubMenu;

import Model.DataBaseHelper;
import Model.FixedValues;
import Model.LegalReceipt;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeLegalReceipt implements Initializable {

    private String username = null;
    DataBaseHelper dataBaseHelper;
    FixedValues legalReceipt;

    public EmployeeLegalReceipt setUsername(String username) {
        this.username = username;
        return this;
    }

    void init(FixedValues legalReceipt) {
        //TODO init here

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dataBaseHelper = new DataBaseHelper();
        if (username != null)
            legalReceipt = dataBaseHelper.getHokm(username);
        init(legalReceipt);
    }
}
