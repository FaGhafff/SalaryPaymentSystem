package Model;

import java.util.ArrayList;

public class LegalReceipt extends Employee {

    private FixedValues fixedValues = new FixedValues();

    public LegalReceipt(Employee employee) {

        employee.setSalaryBase(fixedValues.getSalaryBase());
        employee.setAnnualIncrease(fixedValues.calculateAnnualIncrease(employee.getServiceTime()));
        employee.setExtraordinaryHousing(fixedValues.getExtraordinaryHousing());
//        employee.setBadWeather(fixedValues.calculateBadWeather(,); // ایندکس اول رده کارمند و ایندکس دوم آرای لیست ثوابت است
//        employee.setDeprivationOfServiecePlace(fixedValues.calculateDeprivationOfServiecePlace(,)); // ایندکس اول رده کارمند و ایندکس دوم آرای لیست ثوابت
//        employee.setFamilyAllowance(fixedValues.calculateFamilyAllowance()); // ترو به معنای متاهل و فالس به معنای مجرد است
//        employee.setChildrenAllowance(fixedValues.calculateChildrenAllowance()); // تعداد فرزندان را داخل پرانتز باید بنویسید
//        employee.setSeniorOrExpertAllowance(fixedValues.calculateSeniorOrExpertAllowance()); // صفر به معنای رییس و 1 به معنای کارمند ارشد است و بقیه اعداد مساوی با صفر است
        employee.setReward(fixedValues.getReward());
        employee.setImportantsOfJob(fixedValues.getImportantsOfJob());
//        employee.setSacrificePoints(fixedValues.calculateSacrificePoints(,)); // اندیس اول رده کارمند و اندیس دوم آرای لیست ثوابت است
        employee.setInsurance(fixedValues.getInsurance());
        employee.setPensionFund(fixedValues.getPensionFund());
        employee.setTax(fixedValues.getTax());


    }

    public double calculateSalary() {

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
