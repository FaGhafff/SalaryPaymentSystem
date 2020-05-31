package Model;

public class Employee extends Person {

    private long fatherMobileNumber = -1; //father's mobile number (شماره تلفن پدر)
    private String maritalStatus = "null maritalStatus"; // marital status (وضعیت تاهل)
    private int childrenCount = -1; // children Count (تعداد فرزندان)
    private String healthIssue = "null healthIssue"; // health issue (مشکل سلامتی)
    private String healthStatus = "null healthStatus"; // health status (شرح وضعیت سلامتی)
    private String emergencyContactName = "null emergencyContacName"; // emergency contact (نام یک آشنا برای مواقع ضروری)
    private String emergencyContactLastName = "null emergencyContacLastName"; // emergency contact (نام خانوادگی یک آشنا برای مواقع ضروری)
    private String emergencyContactRelation = "null emergencyContacRelation"; // emergency contact (نسبت یک آشنا برای مواقع ضروری)
    private long emergencyContactMobileNumber = -1; // emergency contact (شماره موبایل یک آشنا برای مواقع ضروری) the method of introduction
    private String methodOfIntroduction = "null methodOfIntroduction"; // method of introduction (نحوه آشنایی با شرکت)
    private String diplomaType = "null diplomaType"; // diploma type (نوع دیپلم)
    private double diplomaScore = -1.0; // diploma score (معدل دیپلم)
    private String associateStatus = "null associateStatus"; // associate status (وضعیت مدرک کاردانی)
    private String associatePlace = "null associatePlace"; // associate place (محل اخد مدرک کاردانی)
    private double associateScore = -1.0; // associate score (معدل مدرک کاردانی)
    private String bachelorStatus = "null bachelorStatus"; // bachelor status (وضعیت مدرک کارشناسی)
    private String bachelorPlace = "null bachelorPlace"; // bachelor place (محل اخد مدرک کارشناسی)
    private double bachelorScore = -1.0; // bachelor score (معدل مدرک کارشناسی)
    private String masterStatus = "null masterStatus"; // master status (وضعیت مدرک کارشناسی ارشد)
    private String masterPlace = "null masterPlace"; // master place (محل اخذ مدرک کارشناسی ارشد)
    private double masterScore = -1.0; // master score (معدل مدرک کارشناسی ارشد)
    private String doctorateStatus = "null doctorateStatus"; // doctorate status (وضعیت مدرک دکتری)
    private String doctoratePlace = "null doctoratePlace";// doctorate place (محل اخذ مدرک دکتری)
    private double doctorateScore = -1.0; // doctorate score (معدل مدرک دکتری)
    private String otherEducation = "null otherEducation"; // other education (توضیحات مدارج علمی دیگر)
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
    private String companyName = "null companyName"; // company name (نام شرکت)
    private long companyCode = -1; // company code (کد شرکت)
    private double serviceTime = -1.0; // مدت زمان خدمت

    public void setAssociateScore(double associateScore) {
        this.associateScore = associateScore;
    }

    public void setBachelorPlace(String bachelorPlace) {
        this.bachelorPlace = bachelorPlace;
    }

    public void setDiplomaType(String diplomaType) {
        this.diplomaType = diplomaType;
    }

    public void setMasterStatus(String masterStatus) {
        this.masterStatus = masterStatus;
    }

    public void setBachelorStatus(String bachelorStatus) {
        this.bachelorStatus = bachelorStatus;
    }

    public void setMasterPlace(String masterPlace) {
        this.masterPlace = masterPlace;
    }

    public void setAssociatePlace(String associatePlace) {
        this.associatePlace = associatePlace;
    }

    public void setAssociateStatus(String associateStatus) {
        this.associateStatus = associateStatus;
    }

    public void setDiplomaScore(double diplomaScore) {
        this.diplomaScore = diplomaScore;
    }

    public void setMethodOfIntroduction(String methodOfIntroduction) {
        this.methodOfIntroduction = methodOfIntroduction;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void setHealthIssue(String healthIssue) {
        this.healthIssue = healthIssue;
    }

    public void setMasterScore(double masterScore) {
        this.masterScore = masterScore;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    public void setDoctorateScore(double doctorateScore) {
        this.doctorateScore = doctorateScore;
    }

    public void setDoctoratePlace(String doctoratePlace) {
        this.doctoratePlace = doctoratePlace;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setFatherMobileNumber(long fatherMobileNumber) {
        this.fatherMobileNumber = fatherMobileNumber;
    }

    public void setEmergencyContactLastName(String emergencyContactLastName) {
        this.emergencyContactLastName = emergencyContactLastName;
    }

    public void setDoctorateStatus(String doctorateStatus) {
        this.doctorateStatus = doctorateStatus;
    }

    public void setBachelorScore(double bachelorScore) {
        this.bachelorScore = bachelorScore;
    }

    public void setEmergencyContactMobileNumber(long emergencyContactMobileNumber) {
        this.emergencyContactMobileNumber = emergencyContactMobileNumber;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public void setOtherEducation(String otherEducation) {
        this.otherEducation = otherEducation;
    }

    public void setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setSerialOfSentence(long serialOfSentence) {
        this.serialOfSentence = serialOfSentence;
    }

    public void setServiceUnit(String serviceUnit) {
        this.serviceUnit = serviceUnit;
    }

    public void setServiceTimeYear(String serviceTimeYear) {
        this.serviceTimeYear = serviceTimeYear;
    }

    public void setSeniorOrExpertAllowance(double seniorOrExpertAllowance) {
        this.seniorOrExpertAllowance = seniorOrExpertAllowance;
    }

    public void setSacrificePoints(double sacrificePoints) {
        this.sacrificePoints = sacrificePoints;
    }

    public void setServiceTimeMonth(String serviceTimeMonth) {
        this.serviceTimeMonth = serviceTimeMonth;
    }

    public void setServiceTimeDay(String serviceTimeDay) {
        this.serviceTimeDay = serviceTimeDay;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public void setFinalSalary(double finalSalary) {
        this.finalSalary = finalSalary;
    }

    public void setPensionFund(double pensionFund) {
        this.pensionFund = pensionFund;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public void setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
    }

    public void setOrganizationalPosition(String organizationalPosition) {
        this.organizationalPosition = organizationalPosition;
    }

    public void setImportantsOfJob(double importantsOfJob) {
        this.importantsOfJob = importantsOfJob;
    }

    public void setDescriptionOfTheSentence(String descriptionOfTheSentence) {
        this.descriptionOfTheSentence = descriptionOfTheSentence;
    }

    public void setMajorStatus(String majorStatus) {
        this.majorStatus = majorStatus;
    }

    public void setFamilyAllowance(double familyAllowance) {
        this.familyAllowance = familyAllowance;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public void setExtraordinaryHousing(double extraordinaryHousing) {
        this.extraordinaryHousing = extraordinaryHousing;
    }

    public void setDeprivationOfServiecePlace(double deprivationOfServiecePlace) {
        this.deprivationOfServiecePlace = deprivationOfServiecePlace;
    }

    public void setChildrenAllowance(double childrenAllowance) {
        this.childrenAllowance = childrenAllowance;
    }

    public void setBadWeather(double badWeather) {
        this.badWeather = badWeather;
    }

    public void setAnnualIncrease(double annualIncrease) {
        this.annualIncrease = annualIncrease;
    }

    public void setCompanyCode(long companyCode) {
        this.companyCode = companyCode;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescriptionOfTheSentence() {
        return descriptionOfTheSentence;
    }

    public long getSerialOfSentence() {
        return serialOfSentence;
    }

    public double getAssociateScore() {
        return associateScore;
    }

    public String getDoctoratePlace() {
        return doctoratePlace;
    }

    public String getDiplomaType() {
        return diplomaType;
    }

    public double getMasterScore() {
        return masterScore;
    }

    public String getMethodOfIntroduction() {
        return methodOfIntroduction;
    }

    public String getAssociatePlace() {
        return associatePlace;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public String getAssociateStatus() {
        return associateStatus;
    }

    public String getMasterPlace() {
        return masterPlace;
    }

    public String getDoctorateStatus() {
        return doctorateStatus;
    }

    public double getDiplomaScore() {
        return diplomaScore;
    }

    public String getHealthIssue() {
        return healthIssue;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public long getFatherMobileNumber() {
        return fatherMobileNumber;
    }

    public long getEmergencyContactMobileNumber() {
        return emergencyContactMobileNumber;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getMasterStatus() {
        return masterStatus;
    }

    public String getEmergencyContactLastName() {
        return emergencyContactLastName;
    }

    public double getBachelorScore() {
        return bachelorScore;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public String getServiceUnit() {
        return serviceUnit;
    }

    public String getBachelorPlace() {
        return bachelorPlace;
    }

    public String getBachelorStatus() {
        return bachelorStatus;
    }

    public double getTax() {
        return tax;
    }

    public String getServiceTimeMonth() {
        return serviceTimeMonth;
    }

    public double getSeniorOrExpertAllowance() {
        return seniorOrExpertAllowance;
    }

    public double getSacrificePoints() {
        return sacrificePoints;
    }

    public double getPensionFund() {
        return pensionFund;
    }

    public String getServiceTimeYear() {
        return serviceTimeYear;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public double getReward() {
        return reward;
    }

    public double getInsurance() {
        return insurance;
    }

    public double getImportantsOfJob() {
        return importantsOfJob;
    }

    public double getDoctorateScore() {
        return doctorateScore;
    }

    public String getOrganizationalPosition() {
        return organizationalPosition;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public String getMajorStatus() {
        return majorStatus;
    }

    public double getFinalSalary() {
        return finalSalary;
    }

    public String getOtherEducation() {
        return otherEducation;
    }

    public double getFamilyAllowance() {
        return familyAllowance;
    }

    public double getExtraordinaryHousing() {
        return extraordinaryHousing;
    }

    public double getDeprivationOfServiecePlace() {
        return deprivationOfServiecePlace;
    }

    public double getChildrenAllowance() {
        return childrenAllowance;
    }

    public double getBadWeather() {
        return badWeather;
    }

    public double getAnnualIncrease() {
        return annualIncrease;
    }

    public String getServiceTimeDay() {
        return serviceTimeDay;
    }

    public long getCompanyCode() {
        return companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setServiceTime(double serviceTime) {
        this.serviceTime = serviceTime;
    }

    public double getServiceTime() {
        return serviceTime;
    }
}
