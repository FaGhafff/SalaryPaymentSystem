package Model;


public class FixedValues {

    private int row;
    private String username = "null";
    private String name = "null";
    private double salaryBase = -1.0; // salary base (پایه حقوق) *
    private double annualIncrease = -1.0; // annual increase (افزایش سنواتی) *
    private double extraordinaryHousing = -1.0; // extraordinary housing (فوق العاده مسکن) *
    private double badWeather = -1.0; // bad weather (بدی آب و هوا) *
    private double deprivationOfServiecePlace = -1.0; // deprivation of serviece place (محرومیت محل خدمت) *
    private double familyAllowance = -1.0; // family allowance (کمک هزینه عائله مندی) * *
    private double childrenAllowance = -1.0; // children's allowance (کمک هزینه فرزند) * *
    private double seniorOrExpertAllowance = -1.0; // senior or expert allowance (ارشد یا خبره بودن) * *
    private double reward = -1.0; // reward (پاداش) *
    private double importantsOfJob = -1.0; // importants of job (پاداش) *
    private double sacrificePoints = -1.0; // sacrifice points (ایثارگری) * *
    private double insurance = -1.0; // insurance (بیمه) *
    private double pensionFund = -1.0; // pension fund (صندوق بازنشستگی) *
    private double tax = -1.0; // tax (مالیات) *
 
    public int getChildrenCount() {
        return childrenCount;
    }

    public FixedValues setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
        return this;
    }

    public double getYear() {
        return year;
    }

    public FixedValues setYear(double year) {
        this.year = year;
        return this;
    }

    private int childrenCount;
    private double year;


    public FixedValues(){}


    public int getRow() {
        return row;
    }

    public FixedValues setRow(int row) {
        this.row = row;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public FixedValues setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public FixedValues setName(String name) {
        this.name = name;
        return this;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public FixedValues setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
        return this;
    }

    public double getAnnualIncrease() {
        return annualIncrease;
    }

    public FixedValues setAnnualIncrease(double annualIncrease) {
        this.annualIncrease = annualIncrease;
        return this;
    }

    public double getExtraordinaryHousing() {
        return extraordinaryHousing;
    }

    public FixedValues setExtraordinaryHousing(double extraordinaryHousing) {
        this.extraordinaryHousing = extraordinaryHousing;
        return this;
    }

    public double getBadWeather() {
        return badWeather;
    }

    public FixedValues setBadWeather(double badWeather) {
        this.badWeather = badWeather;
        return this;
    }

    public double getDeprivationOfServiecePlace() {
        return deprivationOfServiecePlace;
    }

    public FixedValues setDeprivationOfServiecePlace(double deprivationOfServiecePlace) {
        this.deprivationOfServiecePlace = deprivationOfServiecePlace;
        return this;
    }

    public double getFamilyAllowance() {
        return familyAllowance;
    }

    public FixedValues setFamilyAllowance(double familyAllowance) {
        this.familyAllowance = familyAllowance;
        return this;
    }

    public double getChildrenAllowance() {
        return childrenAllowance;
    }

    public FixedValues setChildrenAllowance(double childrenAllowance) {
        this.childrenAllowance = childrenAllowance;
        return this;
    }

    public double getSeniorOrExpertAllowance() {
        return seniorOrExpertAllowance;
    }

    public FixedValues setSeniorOrExpertAllowance(double seniorOrExpertAllowance) {
        this.seniorOrExpertAllowance = seniorOrExpertAllowance;
        return this;
    }

    public double getReward() {
        return reward;
    }

    public FixedValues setReward(double reward) {
        this.reward = reward;
        return this;
    }

    public double getImportantsOfJob() {
        return importantsOfJob;
    }

    public FixedValues setImportantsOfJob(double importantsOfJob) {
        this.importantsOfJob = importantsOfJob;
        return this;
    }

    public double getSacrificePoints() {
        return sacrificePoints;
    }

    public FixedValues setSacrificePoints(double sacrificePoints) {
        this.sacrificePoints = sacrificePoints;
        return this;
    }

    public double getInsurance() {
        return insurance;
    }

    public FixedValues setInsurance(double insurance) {
        this.insurance = insurance;
        return this;
    }

    public double getPensionFund() {
        return pensionFund;
    }

    public FixedValues setPensionFund(double pensionFund) {
        this.pensionFund = pensionFund;
        return this;
    }

    public double getTax() {
        return tax;
    }

    public FixedValues setTax(double tax) {
        this.tax = tax;
        return this;
    }



    public double calculateChildrenAllowance(int childrenCount) {
        double childrenAllowance = 0.0;
        for (int i = 0; i < childrenCount; i++) {
            childrenAllowance += this.childrenAllowance;
        }
        return childrenAllowance;
    }


    public double calculateAnnualIncrease(double years) {

        double increase = ((double) (years / 5) * this.annualIncrease);
        return increase;
    }

    public double getSalary() {
        double finalSalary = 0.0;
        double finalTax = 0.0;
        finalSalary = getSalaryBase() + calculateAnnualIncrease(year) + getExtraordinaryHousing() + getBadWeather() +
                getDeprivationOfServiecePlace() + getFamilyAllowance() + calculateChildrenAllowance(childrenCount) +
                getSeniorOrExpertAllowance() + getReward() + getImportantsOfJob() + getSacrificePoints() +
                getInsurance() + getPensionFund();

        finalTax = finalSalary - ((finalSalary * getTax()) / 100);
        finalSalary = finalSalary - finalTax;
        return finalSalary;
    }
}