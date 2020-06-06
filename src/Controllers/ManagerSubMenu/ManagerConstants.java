package Controllers.ManagerSubMenu;

import Model.DataBaseHelper;
import Model.FixedValues;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagerConstants implements Initializable {
    public JFXButton confirm;
    public Label result;
    public TextField txtSalaryBase;
    public TextField txtReward;
    public TextField txtBadWeather;
    public TextField txtExtraordinaryHousing;
    public TextField txtChildrenAllowance;
    public TextField txtFamilyAllowance;
    public TextField txtSeniorOrExpertAllowance;
    public TextField txtImportantsOfJob;
    public TextField txtDeprivationOfServiecePlace;
    public TextField txtInsurance;
    public TextField txtSacrificePoints;
    public TextField txtPensionFund;
    public TextField txtAnnualIncrease;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        FixedValues fixedValues = dataBaseHelper.getConstants();
        if (fixedValues != null){




        }
    }
}
