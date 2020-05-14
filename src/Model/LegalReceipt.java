package Model;

public class LegalReceipt {

    private String namePersian = "null namePersian"; // name in persian (نام به فارسی)
    private String lastNamePersian = "null lastNamePersian"; // last name in persian (نام خانوادگی به فارسی)
    private long userNumber = -1; // user number (شماره پرسنلی)
    private long idNumber = -1; // identification card number (کد ملی)
    private String issuanceOfBCPlace = "null issuanceOfBCPlace"; // issuance of birth place (محل صدور شناسنامه)
    private String birthPlace = "null birthPlace"; // birth place (محل تولد)
    private String highestDegree = "null highestDegree"; // highest degree (بالاترین مدرک تحصیلی)
    private String majorStatus = "null majorStatus"; // major status (رشته تحصیلی)
    private String serviceUnit = "null serviceUnit"; // service unit (واحد خدمت)
    private String organizationalPosition = "null organizationalPosition"; // organizational position (پست سازمانی)
    private String serviceTimeYear = "null serviceTimeYear"; // service time year (مدت زمان خدمت به سال)
    private String serviceTimeMonth = "null serviceTimeMonth"; // service time month (مدت زمان خدمت به ماه)
    private String serviceTimeDay = "null serviceTimeDay"; // service time day (مدت زمان خدمت به روز)
    private double salaryBase = -1.0; // salary base (پایه حقوق)
    private double annualIncrease = -1.0; // annual increase (افزایش سنواتی)
    private double extraordinaryHousing = -1.0; // extraordinary housing (فوق العاده مسکن)
    private double badWeather = -1.0; // bad weather (بدی آب و هوا)
    private double deprivationOfServiecePlace = -1.0; // deprivation of serviece place (محرومیت محل خدمت)
    private double familyAllowance = -1.0; // family allowance (کمک هزینه عائله مندی)
    private double childrenAllowance = -1.0; // children's allowance (کمک هزینه فرزند)
    private double seniorOrExpertAllowance = -1.0; // senior or expert allowance (ارشد یا خبره بودن)
    private double reward = -1.0; // reward (پاداش)
    private double importantsOfJob = -1.0; // importants of job (فوق العاده شغل)
    private double sacrificePoints = -1.0; // sacrifice points (ایثارگری)
    private double insurance = -1.0; // insurance (بیمه)
    private double pensionFund = -1.0; // pension fund (صندوق بازنشستگی)
    private double tax = -1.0; // tax (مالیات)
    private String descriptionOfTheSentence = "null descriptionOfTheSentence"; // description of the sentence (شرح حکم)
    private long serialOfSentence = -1; // serial of sentence (شماره سریال حکم)
    private double finalSalary = -1; // final salary (حقوق آخر)

    public void setIssuanceOfBCPlace(String issuanceOfBCPlace) {
        this.issuanceOfBCPlace = issuanceOfBCPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public void setLastNamePersian(String lastNamePersian) {
        this.lastNamePersian = lastNamePersian;
    }

    public void setNamePersian(String namePersian) {
        this.namePersian = namePersian;
    }

    public void setAnnualIncrease(double annualIncrease) {
        this.annualIncrease = annualIncrease;
    }

    public void setBadWeather(double badWeather) {
        this.badWeather = badWeather;
    }

    public void setChildrenAllowance(double childrenAllowance) {
        this.childrenAllowance = childrenAllowance;
    }

    public void setUserNumber(long userNumber) {
        this.userNumber = userNumber;
    }

    public void setDeprivationOfServiecePlace(double deprivationOfServiecePlace) {
        this.deprivationOfServiecePlace = deprivationOfServiecePlace;
    }

    public void setExtraordinaryHousing(double extraordinaryHousing) {
        this.extraordinaryHousing = extraordinaryHousing;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public void setFamilyAllowance(double familyAllowance) {
        this.familyAllowance = familyAllowance;
    }

    public void setMajorStatus(String majorStatus) {
        this.majorStatus = majorStatus;
    }

    public void setDescriptionOfTheSentence(String descriptionOfTheSentence) {
        this.descriptionOfTheSentence = descriptionOfTheSentence;
    }

    public void setImportantsOfJob(double importantsOfJob) {
        this.importantsOfJob = importantsOfJob;
    }

    public void setOrganizationalPosition(String organizationalPosition) {
        this.organizationalPosition = organizationalPosition;
    }

    public void setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public void setPensionFund(double pensionFund) {
        this.pensionFund = pensionFund;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public void setServiceTimeDay(String serviceTimeDay) {
        this.serviceTimeDay = serviceTimeDay;
    }

    public void setServiceTimeMonth(String serviceTimeMonth) {
        this.serviceTimeMonth = serviceTimeMonth;
    }

    public void setSacrificePoints(double sacrificePoints) {
        this.sacrificePoints = sacrificePoints;
    }

    public void setSeniorOrExpertAllowance(double seniorOrExpertAllowance) {
        this.seniorOrExpertAllowance = seniorOrExpertAllowance;
    }

    public void setServiceTimeYear(String serviceTimeYear) {
        this.serviceTimeYear = serviceTimeYear;
    }

    public void setServiceUnit(String serviceUnit) {
        this.serviceUnit = serviceUnit;
    }

    public void setSerialOfSentence(long serialOfSentence) {
        this.serialOfSentence = serialOfSentence;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getIssuanceOfBCPlace() {
        return issuanceOfBCPlace;
    }

    public String getServiceTimeDay() {
        return serviceTimeDay;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public String getLastNamePersian() {
        return lastNamePersian;
    }

    public String getNamePersian() {
        return namePersian;
    }

    public double getAnnualIncrease() {
        return annualIncrease;
    }

    public long getUserNumber() {
        return userNumber;
    }

    public double getBadWeather() {
        return badWeather;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public double getChildrenAllowance() {
        return childrenAllowance;
    }

    public double getDeprivationOfServiecePlace() {
        return deprivationOfServiecePlace;
    }

    public double getExtraordinaryHousing() {
        return extraordinaryHousing;
    }

    public double getFamilyAllowance() {
        return familyAllowance;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public String getMajorStatus() {
        return majorStatus;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public String getOrganizationalPosition() {
        return organizationalPosition;
    }

    public double getImportantsOfJob() {
        return importantsOfJob;
    }

    public double getInsurance() {
        return insurance;
    }

    public double getReward() {
        return reward;
    }

    public String getServiceTimeYear() {
        return serviceTimeYear;
    }

    public double getPensionFund() {
        return pensionFund;
    }

    public double getSacrificePoints() {
        return sacrificePoints;
    }

    public double getSeniorOrExpertAllowance() {
        return seniorOrExpertAllowance;
    }

    public String getServiceTimeMonth() {
        return serviceTimeMonth;
    }

    public String getServiceUnit() {
        return serviceUnit;
    }

    public double getTax() {
        return tax;
    }

    public long getSerialOfSentence() {
        return serialOfSentence;
    }

    public String getDescriptionOfTheSentence() {
        return descriptionOfTheSentence;
    }

    public double getSalary() {

        private double holdSalary = salaryBase + annualIncrease + extraordinaryHousing + deprivationOfServiecePlace
                + badWeather + familyAllowance + childrenAllowance + seniorOrExpertAllowance + reward + importantsOfJob
                + sacrificePoints - (insurance + pensionFund);

        private double holdTax = holdSalary - ((holdSalary * tax) / 100);

        private double holdFinalSalary = holdSalary - holdTax;
        setFinalSalary(holdFinalSalary);

        return holdFinalSalary;
    }
}
