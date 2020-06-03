package Controllers;

import com.jfoenix.controls.JFXTextField;
import javafx.beans.property.SimpleStringProperty;

public class ConstantsManagerTableModel {
    public String getRow() {
        return row.get();
    }

    public SimpleStringProperty rowProperty() {
        return row;
    }

    public void setRow(String row) {
        this.row.set(row);
    }

    public String getUsername() {
        return username.get();
    }

    public SimpleStringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public JFXTextField getSalaryBase() {
        return salaryBase;
    }

    public ConstantsManagerTableModel setSalaryBase(JFXTextField salaryBase) {
        this.salaryBase = salaryBase;
        return this;
    }

    public JFXTextField getAnnualIncrease() {
        return annualIncrease;
    }

    public ConstantsManagerTableModel setAnnualIncrease(JFXTextField annualIncrease) {
        this.annualIncrease = annualIncrease;
        return this;
    }

    public JFXTextField getExtraordinaryHousing() {
        return extraordinaryHousing;
    }

    public ConstantsManagerTableModel setExtraordinaryHousing(JFXTextField extraordinaryHousing) {
        this.extraordinaryHousing = extraordinaryHousing;
        return this;
    }

    public JFXTextField getBadWeather() {
        return badWeather;
    }

    public ConstantsManagerTableModel setBadWeather(JFXTextField badWeather) {
        this.badWeather = badWeather;
        return this;
    }

    public JFXTextField getDeprivationOfServiecePlace() {
        return deprivationOfServiecePlace;
    }

    public ConstantsManagerTableModel setDeprivationOfServiecePlace(JFXTextField deprivationOfServiecePlace) {
        this.deprivationOfServiecePlace = deprivationOfServiecePlace;
        return this;
    }

    public JFXTextField getFamilyAllowance() {
        return familyAllowance;
    }

    public ConstantsManagerTableModel setFamilyAllowance(JFXTextField familyAllowance) {
        this.familyAllowance = familyAllowance;
        return this;
    }

    public JFXTextField getChildrenAllowance() {
        return childrenAllowance;
    }

    public ConstantsManagerTableModel setChildrenAllowance(JFXTextField childrenAllowance) {
        this.childrenAllowance = childrenAllowance;
        return this;
    }

    public JFXTextField getSeniorOrExpertAllowance() {
        return seniorOrExpertAllowance;
    }

    public ConstantsManagerTableModel setSeniorOrExpertAllowance(JFXTextField seniorOrExpertAllowance) {
        this.seniorOrExpertAllowance = seniorOrExpertAllowance;
        return this;
    }

    public JFXTextField getReward() {
        return reward;
    }

    public ConstantsManagerTableModel setReward(JFXTextField reward) {
        this.reward = reward;
        return this;
    }

    public JFXTextField getImportantsOfJob() {
        return importantsOfJob;
    }

    public ConstantsManagerTableModel setImportantsOfJob(JFXTextField importantsOfJob) {
        this.importantsOfJob = importantsOfJob;
        return this;
    }

    public JFXTextField getSacrificePoints() {
        return sacrificePoints;
    }

    public ConstantsManagerTableModel setSacrificePoints(JFXTextField sacrificePoints) {
        this.sacrificePoints = sacrificePoints;
        return this;
    }

    public JFXTextField getInsurance() {
        return insurance;
    }

    public ConstantsManagerTableModel setInsurance(JFXTextField insurance) {
        this.insurance = insurance;
        return this;
    }

    public JFXTextField getPensionFund() {
        return pensionFund;
    }

    public ConstantsManagerTableModel setPensionFund(JFXTextField pensionFund) {
        this.pensionFund = pensionFund;
        return this;
    }

    public JFXTextField getTax() {
        return tax;
    }

    public ConstantsManagerTableModel setTax(JFXTextField tax) {
        this.tax = tax;
        return this;
    }

    private SimpleStringProperty row;
    private SimpleStringProperty username;
    private SimpleStringProperty name;
    private JFXTextField salaryBase;
    private JFXTextField annualIncrease;
    private JFXTextField extraordinaryHousing;
    private JFXTextField badWeather;
    private JFXTextField deprivationOfServiecePlace;
    private JFXTextField familyAllowance;
    private JFXTextField childrenAllowance;
    private JFXTextField seniorOrExpertAllowance;
    private JFXTextField reward;
    private JFXTextField importantsOfJob;
    private JFXTextField sacrificePoints;
    private JFXTextField insurance;
    private JFXTextField pensionFund;
    private JFXTextField tax;

    public ConstantsManagerTableModel(String row, String username,String name,
                                      JFXTextField salaryBase,
                                      JFXTextField annualIncrease,
                                      JFXTextField extraordinaryHousing,
                                      JFXTextField badWeather,
                                      JFXTextField deprivationOfServiecePlace,
                                      JFXTextField familyAllowance,
                                      JFXTextField childrenAllowance,
                                      JFXTextField seniorOrExpertAllowance,
                                      JFXTextField reward,
                                      JFXTextField importantsOfJob,
                                      JFXTextField sacrificePoints,
                                      JFXTextField insurance,
                                      JFXTextField pensionFund,
                                      JFXTextField tax) {
        this.row = new SimpleStringProperty(row);
        this.username = new SimpleStringProperty(username);
        this.name = new SimpleStringProperty(name);
        this.salaryBase = salaryBase;
        this.annualIncrease = annualIncrease;
        this.extraordinaryHousing = extraordinaryHousing;
        this.badWeather = badWeather;
        this.deprivationOfServiecePlace = deprivationOfServiecePlace;
        this.familyAllowance = familyAllowance;
        this.childrenAllowance = childrenAllowance;
        this.seniorOrExpertAllowance = seniorOrExpertAllowance;
        this.reward = reward;
        this.importantsOfJob = importantsOfJob;
        this.sacrificePoints = sacrificePoints;
        this.insurance = insurance;
        this.pensionFund = pensionFund;
        this.tax = tax;
    }
}
