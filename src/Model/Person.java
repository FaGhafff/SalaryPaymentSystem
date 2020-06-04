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

    public String getNamePersian() {
        return namePersian;
    }

    public Person setNamePersian(String namePersian) {
        this.namePersian = namePersian;
        return this;
    }

    public String getLastNamePersian() {
        return lastNamePersian;
    }

    public Person setLastNamePersian(String lastNamePersian) {
        this.lastNamePersian = lastNamePersian;
        return this;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public Person setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
        return this;
    }

    public String getLastNameEnglish() {
        return lastNameEnglish;
    }

    public Person setLastNameEnglish(String lastNameEnglish) {
        this.lastNameEnglish = lastNameEnglish;
        return this;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public Person setIdNumber(long idNumber) {
        this.idNumber = idNumber;
        return this;
    }

    public long getBcNumber() {
        return bcNumber;
    }

    public Person setBcNumber(long bcNumber) {
        this.bcNumber = bcNumber;
        return this;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public Person setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    public String getIssuanceOfBCPlace() {
        return issuanceOfBCPlace;
    }

    public Person setIssuanceOfBCPlace(String issuanceOfBCPlace) {
        this.issuanceOfBCPlace = issuanceOfBCPlace;
        return this;
    }

    public String getSexuality() {
        return sexuality;
    }

    public Person setSexuality(String sexuality) {
        this.sexuality = sexuality;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Person setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public long getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public Person setMobilePhoneNumber(long mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
        return this;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public Person setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return this;
    }
}
