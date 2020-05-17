package Model;

public class Person {

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
    private long mobilePhoneNumber = -1; // mobile number (شماره موبایل)
    private long telephoneNumber = -1; // telephone number (شماره تلفن ثابت)

    public void setNamePersian(String namePersian) {
        this.namePersian = namePersian;
    }

    public void setLastNamePersian(String lastNamePersian) {
        this.lastNamePersian = lastNamePersian;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }

    public void setIssuanceOfBCPlace(String issuanceOfBCPlace) {
        this.issuanceOfBCPlace = issuanceOfBCPlace;
    }

    public void setSexuality(String sexuality) {
        this.sexuality = sexuality;
    }

    public void setBcNumber(long bcNumber) {
        this.bcNumber = bcNumber;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setLastNameEnglish(String lastNameEnglish) {
        this.lastNameEnglish = lastNameEnglish;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setMobilePhoneNumber(long mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getNamePersian() {
        return namePersian;
    }

    public String getLastNamePersian() {
        return lastNamePersian;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public long getBcNumber() {
        return bcNumber;
    }

    public String getIssuanceOfBCPlace() {
        return issuanceOfBCPlace;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public long getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getSexuality() {
        return sexuality;
    }

    public String getLastNameEnglish() {
        return lastNameEnglish;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }
}
