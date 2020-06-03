package Model;

public class Hokm {

    private int row;
    private String username;
    private String name;
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

    public int getRow() {
        return row;
    }

    public Hokm setRow(int row) {
        this.row = row;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Hokm setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public Hokm setName(String name) {
        this.name = name;
        return this;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public Hokm setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
        return this;
    }

    public double getAnnualIncrease() {
        return annualIncrease;
    }

    public Hokm setAnnualIncrease(double annualIncrease) {
        this.annualIncrease = annualIncrease;
        return this;
    }

    public double getExtraordinaryHousing() {
        return extraordinaryHousing;
    }

    public Hokm setExtraordinaryHousing(double extraordinaryHousing) {
        this.extraordinaryHousing = extraordinaryHousing;
        return this;
    }

    public double getBadWeather() {
        return badWeather;
    }

    public Hokm setBadWeather(double badWeather) {
        this.badWeather = badWeather;
        return this;
    }

    public double getDeprivationOfServiecePlace() {
        return deprivationOfServiecePlace;
    }

    public Hokm setDeprivationOfServiecePlace(double deprivationOfServiecePlace) {
        this.deprivationOfServiecePlace = deprivationOfServiecePlace;
        return this;
    }

    public double getFamilyAllowance() {
        return familyAllowance;
    }

    public Hokm setFamilyAllowance(double familyAllowance) {
        this.familyAllowance = familyAllowance;
        return this;
    }

    public double getChildrenAllowance() {
        return childrenAllowance;
    }

    public Hokm setChildrenAllowance(double childrenAllowance) {
        this.childrenAllowance = childrenAllowance;
        return this;
    }

    public double getSeniorOrExpertAllowance() {
        return seniorOrExpertAllowance;
    }

    public Hokm setSeniorOrExpertAllowance(double seniorOrExpertAllowance) {
        this.seniorOrExpertAllowance = seniorOrExpertAllowance;
        return this;
    }

    public double getReward() {
        return reward;
    }

    public Hokm setReward(double reward) {
        this.reward = reward;
        return this;
    }

    public double getImportantsOfJob() {
        return importantsOfJob;
    }

    public Hokm setImportantsOfJob(double importantsOfJob) {
        this.importantsOfJob = importantsOfJob;
        return this;
    }

    public double getSacrificePoints() {
        return sacrificePoints;
    }

    public Hokm setSacrificePoints(double sacrificePoints) {
        this.sacrificePoints = sacrificePoints;
        return this;
    }

    public double getInsurance() {
        return insurance;
    }

    public Hokm setInsurance(double insurance) {
        this.insurance = insurance;
        return this;
    }

    public double getPensionFund() {
        return pensionFund;
    }

    public Hokm setPensionFund(double pensionFund) {
        this.pensionFund = pensionFund;
        return this;
    }

    public double getTax() {
        return tax;
    }

    public Hokm setTax(double tax) {
        this.tax = tax;
        return this;
    }
}
