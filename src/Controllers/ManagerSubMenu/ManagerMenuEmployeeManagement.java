package Controllers.ManagerSubMenu;

import Controllers.TableModels.EmployeeManagementTableModel;
import Model.DataBaseHelper;
import Model.FixedValues;
import Model.LegalReceipt;
import Methods.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ManagerMenuEmployeeManagement implements Initializable {
    public TableView<EmployeeManagementTableModel> table;
    public TableColumn<EmployeeManagementTableModel, String> row;
    public TableColumn<EmployeeManagementTableModel, String> username;
    public TableColumn<EmployeeManagementTableModel, String> name;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> salaryBase;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> annualIncrease;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> extraordinaryHousing;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> badWeather;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> deprivationOfServiecePlace;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> familyAllowance;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> childrenAllowance;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> seniorOrExpertAllowance;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> reward;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> importantsOfJob;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> sacrificePoints;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> insurance;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> pensionFund;
    public TableColumn<EmployeeManagementTableModel, JFXTextField> tax;
    public Button confirm;
    public Label result;
    private DataBaseHelper helper;

    void initTable() {

        row.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, String>("row"));
        username.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, String>("username"));
        name.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, String>("name"));
        salaryBase.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("salaryBase"));
        annualIncrease.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("annualIncrease"));
        extraordinaryHousing.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("extraordinaryHousing"));
        badWeather.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("badWeather"));
        deprivationOfServiecePlace.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("deprivationOfServiecePlace"));
        familyAllowance.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("familyAllowance"));
        childrenAllowance.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("childrenAllowance"));
        seniorOrExpertAllowance.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("seniorOrExpertAllowance"));
        reward.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("reward"));
        importantsOfJob.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("importantsOfJob"));
        sacrificePoints.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("sacrificePoints"));
        insurance.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("insurance"));
        pensionFund.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("pensionFund"));
        tax.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("tax"));
        salaryBase.setCellValueFactory(new PropertyValueFactory<EmployeeManagementTableModel, JFXTextField>("salaryBase"));

//        final ObservableList<EmployeeManagementTableModel> data = FXCollections.observableArrayList();
//        data.add(new
//                EmployeeManagementTableModel(1 + "", "1234", "علی", new JFXTextField("500", false), new JFXTextField("600"),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField(),
//                new JFXTextField()));
//        table.setItems(data);

    }

    void setTable(ArrayList<FixedValues> list) {
        ObservableList<EmployeeManagementTableModel> data = FXCollections.observableArrayList();
        list.forEach(hokm ->
                data.add(new EmployeeManagementTableModel(hokm.getRow() + "", hokm.getUsername(), hokm.getName(),
                        new JFXTextField(hokm.getSalaryBase(), false),
                        new JFXTextField(hokm.getAnnualIncrease() + "", false),
                        new JFXTextField(hokm.getExtraordinaryHousing()),
                        new JFXTextField(hokm.getBadWeather()),
                        new JFXTextField(hokm.getDeprivationOfServiecePlace()),
                        new JFXTextField(hokm.getFamilyAllowance()),
                        new JFXTextField(hokm.getChildrenAllowance()),
                        new JFXTextField(hokm.getSeniorOrExpertAllowance()),
                        new JFXTextField(hokm.getReward()),
                        new JFXTextField(hokm.getImportantsOfJob()),
                        new JFXTextField(hokm.getSacrificePoints()),
                        new JFXTextField(hokm.getInsurance()),
                        new JFXTextField(hokm.getPensionFund()),
                        new JFXTextField(hokm.getTax())))

        );
        table.setItems(data);

    }

    void onClickConfirm() {
        ArrayList<FixedValues> list = new ArrayList<>();
        try {
            for (EmployeeManagementTableModel item : table.getItems()) {
                list.add(new FixedValues()
                        .setRow(Integer.parseInt(item.getRow()))
                        .setUsername(item.getUsername())
                        .setName(item.getName())
                        .setSalaryBase(Double.parseDouble(item.getSalaryBase().getText()))
                        .setAnnualIncrease(Double.parseDouble(item.getAnnualIncrease().getText()))
                        .setExtraordinaryHousing(Double.parseDouble(item.getExtraordinaryHousing().getText()))
                        .setBadWeather(Double.parseDouble(item.getBadWeather().getText()))
                        .setDeprivationOfServiecePlace(Double.parseDouble(item.getDeprivationOfServiecePlace().getText()))
                        .setFamilyAllowance(Double.parseDouble(item.getFamilyAllowance().getText()))
                        .setChildrenAllowance(Double.parseDouble(item.getChildrenAllowance().getText()))
                        .setSeniorOrExpertAllowance(Double.parseDouble(item.getSeniorOrExpertAllowance().getText()))
                        .setReward(Double.parseDouble(item.getReward().getText()))
                        .setImportantsOfJob(Double.parseDouble(item.getImportantsOfJob().getText()))
                        .setSacrificePoints(Double.parseDouble(item.getSacrificePoints().getText()))
                        .setInsurance(Double.parseDouble(item.getInsurance().getText()))
                        .setPensionFund(Double.parseDouble(item.getPensionFund().getText()))
                        .setTax(Double.parseDouble(item.getTax().getText())));
            }
            helper.updateHokm(list);
            result.setText("ثبت شد!");

        } catch (Exception e) {
            result.setText("خطا در فرمت اطلاعات وارد شده!!!");
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        helper = new DataBaseHelper();
        initTable();
        setTable(helper.readAllHokms());
        confirm.setOnAction(event -> onClickConfirm());
    }
}
