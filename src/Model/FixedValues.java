package Model;

import java.util.ArrayList;

public class FixedValues {

    private double salaryBase = -1.0; // salary base (پایه حقوق) *
    private double annualIncrease = -1.0; // annual increase (افزایش سنواتی) *
    private double extraordinaryHousing = -1.0; // extraordinary housing (فوق العاده مسکن) *
    private double badWeather = -1.0; // bad weather (بدی آب و هوا) *
    private double deprivationOfServiecePlace = -1.0; // deprivation of serviece place (محرومیت محل خدمت) *
    private double familyAllowance = -1.0; // family allowance (کمک هزینه عائله مندی) *
    private double childrenAllowance = -1.0; // children's allowance (کمک هزینه فرزند) *
    private double seniorOrExpertAllowance = -1.0; // senior or expert allowance (ارشد یا خبره بودن) *
    private double reward = -1.0; // reward (پاداش) *
    private double importantsOfJob = -1.0; // importants of job (فوق العاده شغل) *
    private double sacrificePoints = -1.0; // sacrifice points (ایثارگری) *
    private double insurance = -1.0; // insurance (بیمه) *
    private double pensionFund = -1.0; // pension fund (صندوق بازنشستگی) *
    private double tax = -1.0; // tax (مالیات) *
    private ArrayList<Double> fixedBadWeather = new ArrayList();
    private ArrayList<Double> fixedChildrenAllowance = new ArrayList();
    private ArrayList<Integer> fixedOrganizationalPosition = new ArrayList();
    private ArrayList<Double> fixSeniorOrExpertAllowance = new ArrayList();
    private ArrayList<Double> fixsacrificePoints = new ArrayList();

    public FixedValues() {

        this.salaryBase = 980.0;
        this.extraordinaryHousing = 300.0;
        this.insurance = -200.0;
        this.pensionFund = -400.0;
        this.reward = 250.0;
        this.importantsOfJob = 150.0;
        this.tax = 9.0;

        fixedBadWeather.add(35.0);
        fixedBadWeather.add(60.0);
        fixedBadWeather.add(120.0);
        fixedBadWeather.add(170.0);

        fixedOrganizationalPosition.add(0); // رییس
        fixedOrganizationalPosition.add(1); // کارمند و کارشناس
        fixedOrganizationalPosition.add(2); // خدمات و حراست
        fixedOrganizationalPosition.add(3); // قراردادی

        fixedChildrenAllowance.add(250.0);
        fixedChildrenAllowance.add(200.0);
        fixedChildrenAllowance.add(180.0);
        fixedChildrenAllowance.add(150.0);

        fixSeniorOrExpertAllowance.add(500.0);
        fixSeniorOrExpertAllowance.add(300.0);
        fixSeniorOrExpertAllowance.add(0.0);
        fixSeniorOrExpertAllowance.add(0.0);

        fixsacrificePoints.add(400.0);
        fixsacrificePoints.add(350.0);
        fixsacrificePoints.add(300.0);
        fixsacrificePoints.add(250.0);

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

    public void calculateFamilyAllowance(boolean status) {

        if (status)
            setFamilyAllowance(320.0);

        else
            setFamilyAllowance(0.0);

    }

    public void setChildrenAllowance(double childrenAllowance) {
        this.childrenAllowance = childrenAllowance;
    }

    public double getChildrenAllowance() {
        return childrenAllowance;
    }

    public void calculateChildrenAllowance(int childrenCount, int status, ArrayList<Double> fixed) {

        double hold = 0.0;

        switch (status) {

            case 0:
                for (int i = 0; i < childrenCount; i++) {
                    hold += 250.0;
                }

            case 1:
                hold = 0.0;
                for (int i = 0; i < childrenCount; i++) {
                    hold += 200.0;
                }

            case 2:
                hold = 0.0;
                for (int i = 0; i < childrenCount; i++) {
                    hold += 180.0;
                }

            case 3:
                hold = 0.0;
                for (int i = 0; i < childrenCount; i++) {
                    hold += 150.0;
                }

        }

    }

    public void setSeniorOrExpertAllowance(double seniorOrExpertAllowance) {
        this.seniorOrExpertAllowance = seniorOrExpertAllowance;
    }

    public double getSeniorOrExpertAllowance() {
        return seniorOrExpertAllowance;
    }

    public void calculateSeniorOrExpertAllowance(int status, ArrayList<Double> fixed) {

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

    public void setSacrificePoints(double sacrificePoints) {
        this.sacrificePoints = sacrificePoints;
    }

    public double getSacrificePoints() {
        return sacrificePoints;
    }

    public void calculateSacrificePoints(int status, ArrayList<Double> fixed) {

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

    public void setAnnualIncrease(double annualIncrease) {
        this.annualIncrease = annualIncrease;
    }

    public double getAnnualIncrease() {
        return annualIncrease;
    }

    public void calculateAnnualIncrease(int years) {

        setAnnualIncrease((double) (years / 5) * 120);
    }
}
