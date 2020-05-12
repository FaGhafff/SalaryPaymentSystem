package Model;

public class EmploymentOrder {

    private String namePersian = "null namePersian"; // name in persian (نام به فارسی)
    private String lastNamePersian = "null lastNamePersian"; // last name in persian (نام خانوادگی به فارسی)
    private String nameEnglish = "null nameEnglish"; // name in english (نام به انگلیسی)
    private String lastNameEnglish = "null lastNameEnglish"; // last name in english (نام خانوادگی به انگلیسی)
    private long idNumber = -1; // identification card number (کد ملی)
    private long bcNumber = -1; // birth certification number (شماره شناسنامه)
    private String birthPlace = "null birthPlace"; // birth place (محل تولد)
    private String issuanceOfBCPlace = "null issuanceOfBCPlace"; // issuance of birth place (محل صدور شناسنامه)
    private String sexuality = "null sexuality"; // sexuality (جنسیت)
    private String fatherName = "null fatherName"; // father's name in persian (نام پدر به فارسی)
    private long fatherMobileNumber = -1; //father's mobile number (شماره تلفن پدر)
    private long mobilePhoneNumber = -1; // mobile number (شماره موبایل)
    private long telephoneNumber = -1; // telephone number (شماره تلفن ثابت)
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

    public void setNamePersian(String namePersian) {
        this.namePersian = namePersian;
    }

    public void setLastNamePersian(String lastNamePersian) {
        this.lastNamePersian = lastNamePersian;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    public void setLastNameEnglish(String lastNameEnglish) {
        this.lastNameEnglish = lastNameEnglish;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public void setBcNumber(long bcNumber) {
        this.bcNumber = bcNumber;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public void setIssuanceOfBCPlace(String issuanceOfBCPlace) {
        this.issuanceOfBCPlace = issuanceOfBCPlace;
    }

    public void setSexuality(String sexuality) {
        this.sexuality = sexuality;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setFatherMobileNumber(long fatherMobileNumber) {
        this.fatherMobileNumber = fatherMobileNumber;
    }

    public void setMobilePhoneNumber(long mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    public void setHealthIssue(String healthIssue) {
        this.healthIssue = healthIssue;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void setEmergencyContactName(String emergencyContacName) {
        this.emergencyContactName = emergencyContacName;
    }

    public void setEmergencyContactLastName(String emergencyContacLastName) {
        this.emergencyContactLastName = emergencyContacLastName;
    }

    public void setEmergencyContactRelation(String emergencyContacRelation) {
        this.emergencyContactRelation = emergencyContacRelation;
    }

    public void setEmergencyContactMobileNumber(long emergencyContacMobileNumber) {
        this.emergencyContactMobileNumber = emergencyContacMobileNumber;
    }

    public void setMethodOfIntroduction(String methodOfIntroduction) {
        this.methodOfIntroduction = methodOfIntroduction;
    }

    public void setDiplomaType(String diplomaType) {
        this.diplomaType = diplomaType;
    }

    public void setDiplomaScore(double diplomaScore) {
        this.diplomaScore = diplomaScore;
    }

    public void setAssociateStatus(String associateStatus) {
        this.associateStatus = associateStatus;
    }

    public void setAssociatePlace(String associatePlace) {
        this.associatePlace = associatePlace;
    }

    public void setAssociateScore(double associateScore) {
        this.associateScore = associateScore;
    }

    public void setBachelorStatus(String bachelorStatus) {
        this.bachelorStatus = bachelorStatus;
    }

    public void setBachelorPlace(String bachelorPlace) {
        this.bachelorPlace = bachelorPlace;
    }

    public void setBachelorScore(double bachelorScore) {
        this.bachelorScore = bachelorScore;
    }

    public void setMasterStatus(String masterStatus) {
        this.masterStatus = masterStatus;
    }

    public void setMasterPlace(String masterPlace) {
        this.masterPlace = masterPlace;
    }

    public void setMasterScore(double masterScore) {
        this.masterScore = masterScore;
    }

    public void setDoctorateStatus(String doctorateStatus) {
        this.doctorateStatus = doctorateStatus;
    }

    public void setDoctoratePlace(String doctoratePlace) {
        this.doctoratePlace = doctoratePlace;
    }

    public void setDoctorateScore(double doctorateScore) {
        this.doctorateScore = doctorateScore;
    }

    public void setOtherEducation(String otherEducation) {
        this.otherEducation = otherEducation;
    }

    public String getNamePersian() {
        return namePersian;
    }

    public String getLastNamePersian() {
        return lastNamePersian;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public String getLastNameEnglish() {
        return lastNameEnglish;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public long getBcNumber() {
        return bcNumber;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getIssuanceOfBCPlace() {
        return issuanceOfBCPlace;
    }

    public String getSexuality() {
        return sexuality;
    }

    public String getFatherName() {
        return fatherName;
    }

    public long getFatherMobileNumber() {
        return fatherMobileNumber;
    }

    public long getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public String getHealthIssue() {
        return healthIssue;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getEmergencyContactLastName() {
        return emergencyContactLastName;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public long getEmergencyContactMobileNumber() {
        return emergencyContactMobileNumber;
    }

    public String getMethodOfIntroduction() {
        return methodOfIntroduction;
    }

    public String getDiplomaType() {
        return diplomaType;
    }

    public double getDiplomaScore() {
        return diplomaScore;
    }

    public String getAssociateStatus() {
        return associateStatus;
    }

    public String getAssociatePlace() {
        return associatePlace;
    }

    public double getAssociateScore() {
        return associateScore;
    }

    public String getBachelorStatus() {
        return bachelorStatus;
    }

    public String getBachelorPlace() {
        return bachelorPlace;
    }

    public double getBachelorScore() {
        return bachelorScore;
    }

    public String getMasterStatus() {
        return masterStatus;
    }

    public String getMasterPlace() {
        return masterPlace;
    }

    public double getMasterScore() {
        return masterScore;
    }

    public String getDoctorateStatus() {
        return doctorateStatus;
    }

    public String getDoctoratePlace() {
        return doctoratePlace;
    }

    public double getDoctorateScore() {
        return doctorateScore;
    }

    public String getOtherEducation() {
        return otherEducation;
    }

    public String idNumberString() {
        return String.valueOf(idNumber);
    }

    public String bcNumberString() {
        return String.valueOf(bcNumber);
    }

    public String fatherMobileNumber() {
        return String.valueOf(fatherMobileNumber);
    }

    public String mobilePhoneNumberString() {
        return String.valueOf(mobilePhoneNumber);
    }

    public String telephoneNumberString() {
        return String.valueOf(telephoneNumber);
    }

    public String childrenCountString() {
        return String.valueOf(childrenCount);
    }

    public String emergencyContactMobileNumberString() {
        return String.valueOf(emergencyContactMobileNumber);
    }

    public String diplomaScoreString() {
        return String.valueOf(diplomaScore);
    }

    public String associateScoreString() {
        return String.valueOf(associateScore);
    }

    public String bachelorScoreString() {
        return String.valueOf(bachelorScore);
    }

    public String masterScoreString() {
        return String.valueOf(masterScore);
    }

    public String doctorateScoreString() {
        return String.valueOf(doctorateScore);
    }

    @Override
    public String toString() {
        return "EmploymentOrder{" +
                "namePersian='" + namePersian + '\'' +
                ", lastNamePersian='" + lastNamePersian + '\'' +
                ", nameEnglish='" + nameEnglish + '\'' +
                ", lastNameEnglish='" + lastNameEnglish + '\'' +
                ", idNumber=" + idNumber +
                ", bcNumber=" + bcNumber +
                ", birthPlace=" + birthPlace +
                ", issuanceOfBCPlace=" + issuanceOfBCPlace +
                ", sexuality='" + sexuality + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", fatherMobileNumber=" + fatherMobileNumber +
                ", mobilePhoneNumber=" + mobilePhoneNumber +
                ", telephoneNumber=" + telephoneNumber +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", childrenCount=" + childrenCount +
                ", healthIssue='" + healthIssue + '\'' +
                ", healthStatus='" + healthStatus + '\'' +
                ", emergencyContactName='" + emergencyContactName + '\'' +
                ", emergencyContactLastName='" + emergencyContactLastName + '\'' +
                ", emergencyContactRelation='" + emergencyContactRelation + '\'' +
                ", emergencyContactMobileNumber=" + emergencyContactMobileNumber +
                ", methodOfIntroduction='" + methodOfIntroduction + '\'' +
                ", diplomaType='" + diplomaType + '\'' +
                ", diplomaScore=" + diplomaScore +
                ", associateStatus='" + associateStatus + '\'' +
                ", associatePlace='" + associatePlace + '\'' +
                ", associateScore=" + associateScore +
                ", bachelorStatus='" + bachelorStatus + '\'' +
                ", bachelorPlace='" + bachelorPlace + '\'' +
                ", bachelorScore=" + bachelorScore +
                ", masterStatus='" + masterStatus + '\'' +
                ", masterPlace='" + masterPlace + '\'' +
                ", masterScore=" + masterScore +
                ", doctorateStatus='" + doctorateStatus + '\'' +
                ", doctoratePlace='" + doctoratePlace + '\'' +
                ", doctorateScore=" + doctorateScore +
                ", otherEducation='" + otherEducation + '\'' +
                '}';
    }
}