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
            txtSalaryBase.setText(fixedValues.getSalaryBase()+"");
            txtReward.setText(fixedValues.getReward()+"");
            txtBadWeather.setText(fixedValues.getBadWeather()+"");
            txtExtraordinaryHousing.setText(fixedValues.getExtraordinaryHousing()+"");
            txtChildrenAllowance.setText(fixedValues.getChildrenAllowance()+"");
            txtFamilyAllowance.setText(fixedValues.getFamilyAllowance()+"");
            txtSeniorOrExpertAllowance.setText(fixedValues.getSeniorOrExpertAllowance()+"");
            txtImportantsOfJob.setText(fixedValues.getSeniorOrExpertAllowance()+"");
            txtDeprivationOfServiecePlace.setText(fixedValues.getDeprivationOfServiecePlace()+"");
            txtInsurance.setText(fixedValues.getInsurance()+"");
            txtSacrificePoints.setText(fixedValues.getSacrificePoints()+"");
            txtPensionFund.setText(fixedValues.getPensionFund()+"");
            txtAnnualIncrease.setText(fixedValues.getAnnualIncrease()+"");
        }

    }
    public void fati() {
        FixedValues da =new FixedValues();
        da.setSalaryBase(Double.parseDouble(txtSalaryBase.getText()));
        da.setReward(Double.parseDouble(txtReward.getText()));
        da.setBadWeather(Double.parseDouble(txtBadWeather.getText()));
        da.setExtraordinaryHousing(Double.parseDouble(txtSeniorOrExpertAllowance.getText()));
        da.setChildrenAllowance(Double.parseDouble(txtChildrenAllowance.getText()));
        da.setFamilyAllowance(Double.parseDouble(txtFamilyAllowance.getText()));
        da.setSeniorOrExpertAllowance(Double.parseDouble(txtSeniorOrExpertAllowance.getText()));
        da.setImportantsOfJob(Double.parseDouble(txtImportantsOfJob.getText()));
        da.setDeprivationOfServiecePlace(Double.parseDouble(txtDeprivationOfServiecePlace.getText()));
        da.setInsurance(Double.parseDouble(txtInsurance.getText()));
        da.setSacrificePoints(Double.parseDouble(txtSacrificePoints.getText()));
        da.setPensionFund(Double.parseDouble(txtPensionFund.getText()));
        da.setAnnualIncrease(Double.parseDouble(txtAnnualIncrease.getText()));



    }
}
