package Controllers;

import Model.Manager;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagerController implements Initializable {
    private Manager manager;

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
