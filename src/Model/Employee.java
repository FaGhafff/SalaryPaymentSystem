package Model;

public class Employee extends Person {

    private String username;
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
    private String startServiceYear = "null startServiceYear";//تاریخ شروع خدمت به سال
    private String startServiceMonth = "null startServiceMonth";//الریخ شروع خدمت به ماه
    private String startServiceDay = "null startServiceDay";//تاریخ شروع خدمت به روز

    public String getUsername() {
        return username;
    }

    public Employee setUsername(String username) {
        this.username = username;
        return this;
    }

    public long getFatherMobileNumber() {
        return fatherMobileNumber;
    }

    public Employee setFatherMobileNumber(long fatherMobileNumber) {
        this.fatherMobileNumber = fatherMobileNumber;
        return this;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public Employee setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public Employee setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
        return this;
    }

    public String getHealthIssue() {
        return healthIssue;
    }

    public Employee setHealthIssue(String healthIssue) {
        this.healthIssue = healthIssue;
        return this;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public Employee setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public Employee setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
        return this;
    }

    public String getEmergencyContactLastName() {
        return emergencyContactLastName;
    }

    public Employee setEmergencyContactLastName(String emergencyContactLastName) {
        this.emergencyContactLastName = emergencyContactLastName;
        return this;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public Employee setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
        return this;
    }

    public long getEmergencyContactMobileNumber() {
        return emergencyContactMobileNumber;
    }

    public Employee setEmergencyContactMobileNumber(long emergencyContactMobileNumber) {
        this.emergencyContactMobileNumber = emergencyContactMobileNumber;
        return this;
    }

    public String getMethodOfIntroduction() {
        return methodOfIntroduction;
    }

    public Employee setMethodOfIntroduction(String methodOfIntroduction) {
        this.methodOfIntroduction = methodOfIntroduction;
        return this;
    }

    public String getDiplomaType() {
        return diplomaType;
    }

    public Employee setDiplomaType(String diplomaType) {
        this.diplomaType = diplomaType;
        return this;
    }

    public double getDiplomaScore() {
        return diplomaScore;
    }

    public Employee setDiplomaScore(double diplomaScore) {
        this.diplomaScore = diplomaScore;
        return this;
    }

    public String getAssociateStatus() {
        return associateStatus;
    }

    public Employee setAssociateStatus(String associateStatus) {
        this.associateStatus = associateStatus;
        return this;
    }

    public String getAssociatePlace() {
        return associatePlace;
    }

    public Employee setAssociatePlace(String associatePlace) {
        this.associatePlace = associatePlace;
        return this;
    }

    public double getAssociateScore() {
        return associateScore;
    }

    public Employee setAssociateScore(double associateScore) {
        this.associateScore = associateScore;
        return this;
    }

    public String getBachelorStatus() {
        return bachelorStatus;
    }

    public Employee setBachelorStatus(String bachelorStatus) {
        this.bachelorStatus = bachelorStatus;
        return this;
    }

    public String getBachelorPlace() {
        return bachelorPlace;
    }

    public Employee setBachelorPlace(String bachelorPlace) {
        this.bachelorPlace = bachelorPlace;
        return this;
    }

    public double getBachelorScore() {
        return bachelorScore;
    }

    public Employee setBachelorScore(double bachelorScore) {
        this.bachelorScore = bachelorScore;
        return this;
    }

    public String getMasterStatus() {
        return masterStatus;
    }

    public Employee setMasterStatus(String masterStatus) {
        this.masterStatus = masterStatus;
        return this;
    }

    public String getMasterPlace() {
        return masterPlace;
    }

    public Employee setMasterPlace(String masterPlace) {
        this.masterPlace = masterPlace;
        return this;
    }

    public double getMasterScore() {
        return masterScore;
    }

    public Employee setMasterScore(double masterScore) {
        this.masterScore = masterScore;
        return this;
    }

    public String getDoctorateStatus() {
        return doctorateStatus;
    }

    public Employee setDoctorateStatus(String doctorateStatus) {
        this.doctorateStatus = doctorateStatus;
        return this;
    }

    public String getDoctoratePlace() {
        return doctoratePlace;
    }

    public Employee setDoctoratePlace(String doctoratePlace) {
        this.doctoratePlace = doctoratePlace;
        return this;
    }

    public double getDoctorateScore() {
        return doctorateScore;
    }

    public Employee setDoctorateScore(double doctorateScore) {
        this.doctorateScore = doctorateScore;
        return this;
    }

    public String getOtherEducation() {
        return otherEducation;
    }

    public Employee setOtherEducation(String otherEducation) {
        this.otherEducation = otherEducation;
        return this;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public Employee setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
        return this;
    }

    public String getMajorStatus() {
        return majorStatus;
    }

    public Employee setMajorStatus(String majorStatus) {
        this.majorStatus = majorStatus;
        return this;
    }

    public String getStartServiceYear() {
        return startServiceYear;
    }

    public Employee setStartServiceYear(String startServiceYear) {
        this.startServiceYear = startServiceYear;
        return this;
    }

    public String getStartServiceMonth() {
        return startServiceMonth;
    }

    public Employee setStartServiceMonth(String startServiceMonth) {
        this.startServiceMonth = startServiceMonth;
        return this;
    }

    public String getStartServiceDay() {
        return startServiceDay;
    }

    public Employee setStartServiceDay(String startServiceDay) {
        this.startServiceDay = startServiceDay;
        return this;
    }
}