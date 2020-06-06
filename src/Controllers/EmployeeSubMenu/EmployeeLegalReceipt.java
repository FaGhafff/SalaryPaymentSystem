package Controllers.EmployeeSubMenu;

import Model.DataBaseHelper;
import Model.FixedValues;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeLegalReceipt implements Initializable {

    public TextField username;
    public TextField annualIncrease;
    public TextField badWeather;
    public TextField familyAllowance;
    public TextField seniorOrExpertAllowance;
    public TextField sacrificePoints;
    public TextField pensionFund;
    public TextField importantsOfJob;
    public TextField name;
    public TextField salaryBase;
    public TextField extraordinaryHousing;
    public TextField deprivationOfServiecePlace;
    public TextField childrenAllowance;
    public TextField reward;
    public TextField insurance;
    public TextField tax;
    public TextField total;

    private String user = null;
    DataBaseHelper dataBaseHelper;
    FixedValues legalReceipt;
    private int childrenCount;
    private int year;

    public EmployeeLegalReceipt setUsername(String username,int childrenCount , int year) {
        this.user = username;
        this.childrenCount = childrenCount;
        this.year = year;
        return this;
    }

    void init(FixedValues legalReceipt) {
        username.setText(legalReceipt.getUsername());
        name.setText(legalReceipt.getName());
        username.setText(legalReceipt.getUsername());
        annualIncrease.setText(String.valueOf(legalReceipt.getAnnualIncrease()));
        badWeather.setText(String.valueOf(legalReceipt.getBadWeather()));
        familyAllowance.setText(String.valueOf(legalReceipt.getFamilyAllowance()));
        seniorOrExpertAllowance.setText(String.valueOf(legalReceipt.getSeniorOrExpertAllowance()));
        sacrificePoints.setText(String.valueOf(legalReceipt.getSacrificePoints()));
        pensionFund.setText(String.valueOf(legalReceipt.getPensionFund()));
        importantsOfJob.setText(String.valueOf(legalReceipt.getImportantsOfJob()));
        salaryBase.setText(String.valueOf(legalReceipt.getSalaryBase()));
        extraordinaryHousing.setText(String.valueOf(legalReceipt.getExtraordinaryHousing()));
        deprivationOfServiecePlace.setText(String.valueOf(legalReceipt.getDeprivationOfServiecePlace()));
        childrenAllowance.setText(String.valueOf(legalReceipt.getChildrenAllowance()));
        reward.setText(String.valueOf(legalReceipt.getReward()));
        insurance.setText(String.valueOf(legalReceipt.getInsurance()));
        tax.setText(String.valueOf(legalReceipt.getTax()));
        total.setText(String.valueOf(legalReceipt.getSalary()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dataBaseHelper = new DataBaseHelper();
        if (user != null)
            legalReceipt = dataBaseHelper.getHokm(user);
        init(legalReceipt.setChildrenCount(childrenCount).setYear(year));
    }
}
