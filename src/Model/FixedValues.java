package Model;

import java.util.ArrayList;

public class FixedValues {

    private int row;
    private String username;
    private String name;
    private double salaryBase = -1.0; // salary base (پایه حقوق) *
    private double annualIncrease = -1.0; // annual increase (افزایش سنواتی) *
    private double extraordinaryHousing = -1.0; // extraordinary housing (فوق العاده مسکن) *
    private double badWeather = -1.0; // bad weather (بدی آب و هوا) *
    private double deprivationOfServiecePlace = -1.0; // deprivation of serviece place (محرومیت محل خدمت) *
    private double familyAllowance = -1.0; // family allowance (کمک هزینه عائله مندی) * *
    private double childrenAllowance = -1.0; // children's allowance (کمک هزینه فرزند) * *
    private double seniorOrExpertAllowance = -1.0; // senior or expert allowance (ارشد یا خبره بودن) * *
    private double reward = -1.0; // reward (پاداش) *
    private double importantsOfJob = -1.0; // importants of job (فوق العاده شغل) *
    private double sacrificePoints = -1.0; // sacrifice points (ایثارگری) * *
    private double insurance = -1.0; // insurance (بیمه) *
    private double pensionFund = -1.0; // pension fund (صندوق بازنشستگی) *
    private double tax = -1.0; // tax (مالیات) *

    public FixedValues() {

        this.salaryBase = 980.0;
        this.extraordinaryHousing = 300.0;
        this.insurance = -200.0;
        this.pensionFund = -400.0;
        this.reward = 250.0;
        this.importantsOfJob = 150.0;
        this.tax = 9.0;

    }


    public void setBadWeather(double badWeather) {
        this.badWeather = badWeather;
    }

    public double getBadWeather() {
        return badWeather;
    }

    public void calculateBadWeather(int status, ArrayList<Double> fixed) {

        switch (status) {

            case 0:
                setBadWeather(fixed.get(0));
                break;

            case 1:
                setBadWeather(fixed.get(1));
                break;
            case 2:
                setBadWeather(fixed.get(2));
                break;
            case 3:
                setBadWeather(fixed.get(3));
                break;

        }

    }

    public void setDeprivationOfServiecePlace(double deprivationOfServiecePlace) {
        this.deprivationOfServiecePlace = deprivationOfServiecePlace;
    }

    public double getDeprivationOfServiecePlace() {
        return deprivationOfServiecePlace;
    }

    public void calculateDeprivationOfServiecePlace(int status, ArrayList<Double> fixed) {

        switch (status) {

            case 0:
                setBadWeather(fixed.get(0));
                break;

            case 1:
                setBadWeather(fixed.get(1));
                break;

            case 2:
                setBadWeather(fixed.get(2));
                break;

            case 3:
                setBadWeather(fixed.get(3));
                break;

        }
    }

    public void setFamilyAllowance(double familyAllowance) {
        this.familyAllowance = familyAllowance;
    }

    public double getFamilyAllowance() {
        return familyAllowance;
    }

    public double calculateFamilyAllowance(boolean status) {

        if (status) {
            setFamilyAllowance(320.0);
            return getFamilyAllowance();
        } else
            setFamilyAllowance(0.0);
        return getFamilyAllowance();

    }

    public void setChildrenAllowance(double childrenAllowance) {
        this.childrenAllowance = childrenAllowance;
    }

    public double getChildrenAllowance() {
        return childrenAllowance;
    }

    public double calculateChildrenAllowance(int childrenCount) {

        double childrenAllowance = 0.0;

        for (int i = 0; i < childrenCount; i++) {


        }

        return childrenAllowance;

    }

    public void setSeniorOrExpertAllowance(double seniorOrExpertAllowance) {
        this.seniorOrExpertAllowance = seniorOrExpertAllowance;
    }

    public double getSeniorOrExpertAllowance() {
        return seniorOrExpertAllowance;
    }

    public double calculateSeniorOrExpertAllowance(boolean entry) {

        if (entry) {
            return 400.0;
        } else {
            return 300.0;
        }

    }

    public void setSacrificePoints(double sacrificePoints) {
        this.sacrificePoints = sacrificePoints;
    }

    public double getSacrificePoints() {
        return sacrificePoints;
    }

    public double calculateSacrificePoints(boolean status) {

        if (status) {
            return 500.0;
        } else {
            return 0.0;
        }
    }

    public void setAnnualIncrease(double annualIncrease) {
        this.annualIncrease = annualIncrease;
    }

    public double getAnnualIncrease() {
        return annualIncrease;
    }

    public double calculateAnnualIncrease(double years) {

        setAnnualIncrease((double) (years / 5) * 120);
        return getAnnualIncrease();
    }

    public void setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public void setPensionFund(double pensionFund) {
        this.pensionFund = pensionFund;
    }

    public void setImportantsOfJob(double importantsOfJob) {
        this.importantsOfJob = importantsOfJob;
    }

    public void setExtraordinaryHousing(double extraordinaryHousing) {
        this.extraordinaryHousing = extraordinaryHousing;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public double getExtraordinaryHousing() {
        return extraordinaryHousing;
    }

    public double getPensionFund() {
        return pensionFund;
    }

    public double getReward() {
        return reward;
    }

    public double getImportantsOfJob() {
        return importantsOfJob;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

    public String getUsername() {
        return username;
    }
}
