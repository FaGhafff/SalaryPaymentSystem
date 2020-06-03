package Model;


public class LegalReceipt {

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


    public LegalReceipt(Employee employee, FixedValues fixedValues, int childrenCount, boolean familyAllowance,
                        boolean seniorOrExpertAllowance, boolean sacrificePoints) {

        this.salaryBase = fixedValues.getSalaryBase();
        this.annualIncrease = fixedValues.getAnnualIncrease();
        this.extraordinaryHousing = fixedValues.getExtraordinaryHousing();
        this.badWeather = fixedValues.getBadWeather();
        this.deprivationOfServiecePlace = fixedValues.getDeprivationOfServiecePlace();
        this.familyAllowance = fixedValues.calculateFamilyAllowance(familyAllowance);
        this.childrenAllowance = fixedValues.calculateChildrenAllowance(childrenCount);
        this.seniorOrExpertAllowance = fixedValues.calculateSeniorOrExpertAllowance(seniorOrExpertAllowance);
        this.reward = fixedValues.getReward();
        this.importantsOfJob = fixedValues.getImportantsOfJob();
        this.sacrificePoints = fixedValues.calculateSacrificePoints(sacrificePoints);
        this.insurance = fixedValues.getInsurance();
        this.pensionFund = fixedValues.getPensionFund();
        this.tax = fixedValues.getTax();

    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setExtraordinaryHousing(double extraordinaryHousing) {
        this.extraordinaryHousing = extraordinaryHousing;
    }

    public void setImportantsOfJob(double importantsOfJob) {
        this.importantsOfJob = importantsOfJob;
    }

    public void setPensionFund(double pensionFund) {
        this.pensionFund = pensionFund;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public void setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
    }

    public void setAnnualIncrease(double annualIncrease) {
        this.annualIncrease = annualIncrease;
    }

    public void setSacrificePoints(double sacrificePoints) {
        this.sacrificePoints = sacrificePoints;
    }

    public void setSeniorOrExpertAllowance(double seniorOrExpertAllowance) {
        this.seniorOrExpertAllowance = seniorOrExpertAllowance;
    }

    public void setChildrenAllowance(double childrenAllowance) {
        this.childrenAllowance = childrenAllowance;
    }

    public void setFamilyAllowance(double familyAllowance) {
        this.familyAllowance = familyAllowance;
    }

    public void setDeprivationOfServiecePlace(double deprivationOfServiecePlace) {
        this.deprivationOfServiecePlace = deprivationOfServiecePlace;
    }

    public void setBadWeather(double badWeather) {
        this.badWeather = badWeather;
    }

    public double getInsurance() {
        return insurance;
    }

    public double getImportantsOfJob() {
        return importantsOfJob;
    }

    public double getReward() {
        return reward;
    }

    public double getPensionFund() {
        return pensionFund;
    }

    public double getExtraordinaryHousing() {
        return extraordinaryHousing;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public double getTax() {
        return tax;
    }

    public double getAnnualIncrease() {
        return annualIncrease;
    }

    public double getSacrificePoints() {
        return sacrificePoints;
    }

    public double getSeniorOrExpertAllowance() {
        return seniorOrExpertAllowance;
    }

    public double getChildrenAllowance() {
        return childrenAllowance;
    }

    public double getFamilyAllowance() {
        return familyAllowance;
    }

    public double getDeprivationOfServiecePlace() {
        return deprivationOfServiecePlace;
    }

    public double getBadWeather() {
        return badWeather;
    }

    public double getSalary() {

        double finalSalary = 0.0;
        double finalTax = 0.0;

        finalSalary = getSalaryBase() + getAnnualIncrease() + getExtraordinaryHousing() + getBadWeather() +
                getDeprivationOfServiecePlace() + getFamilyAllowance() + getChildrenAllowance() +
                getSeniorOrExpertAllowance() + getReward() + getImportantsOfJob() + getSacrificePoints() +
                getInsurance() + getPensionFund();

        finalTax = finalSalary - ((finalSalary * getTax()) / 100);

        finalSalary = finalSalary - finalTax;

        return finalSalary;
    }
}
