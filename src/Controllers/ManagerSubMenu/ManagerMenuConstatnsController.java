package Controllers.ManagerSubMenu;

import Controllers.ConstantsManagerTableModel;
import Model.DataBaseHelper;
import Model.Hokm;
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

public class ManagerMenuConstatnsController implements Initializable {
    public TableView<ConstantsManagerTableModel> table;
    public TableColumn<ConstantsManagerTableModel,String> row;
    public TableColumn<ConstantsManagerTableModel,String> username;
    public TableColumn<ConstantsManagerTableModel,String> name;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> salaryBase;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> annualIncrease;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> extraordinaryHousing;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> badWeather;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> deprivationOfServiecePlace;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> familyAllowance;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> childrenAllowance;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> seniorOrExpertAllowance;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> reward;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> importantsOfJob;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> sacrificePoints;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> insurance;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> pensionFund;
    public TableColumn<ConstantsManagerTableModel,JFXTextField> tax;
    public Button confirm;
    public Label result;
    private DataBaseHelper helper;

    void initTable() {

        row.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel,String>("row"));
        username.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, String>("username"));
        name.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, String>("name"));
        salaryBase.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("salaryBase"));
        annualIncrease.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("annualIncrease"));
        extraordinaryHousing.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("extraordinaryHousing"));
        badWeather.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("badWeather"));
        deprivationOfServiecePlace.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("deprivationOfServiecePlace"));
        familyAllowance.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("familyAllowance"));
        childrenAllowance.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("childrenAllowance"));
        seniorOrExpertAllowance.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("seniorOrExpertAllowance"));
        reward.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("reward"));
        importantsOfJob.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("importantsOfJob"));
        sacrificePoints.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("sacrificePoints"));
        insurance.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("insurance"));
        pensionFund.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("pensionFund"));
        tax.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("tax"));
        salaryBase.setCellValueFactory(new PropertyValueFactory<ConstantsManagerTableModel, JFXTextField>("salaryBase"));

        final ObservableList<ConstantsManagerTableModel> data = FXCollections.observableArrayList();
        data.add(new
                ConstantsManagerTableModel(1 + "", "1234", "علی", new JFXTextField("500",false), new JFXTextField("600"),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField(),
                new JFXTextField()));
        table.setItems(data);

    }

    void setTable(ArrayList<Hokm> list) {
        ObservableList<ConstantsManagerTableModel> data = FXCollections.observableArrayList();
        list.forEach(hokm ->
                data.add(new ConstantsManagerTableModel(hokm.getRow() + "", hokm.getUsername(), hokm.getName(),
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

    void onClickConfirm(){
        ArrayList<Hokm> list = new ArrayList<>();
        try {
            for (ConstantsManagerTableModel item : table.getItems()) {
                list.add(new Hokm()
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
            helper.writeHokmes(list);
            result.setText("ثبت شد!");

        }catch (Exception e){
            result.setText("خطا در فرمت اطلاعات وارد شده!!!");
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        helper = new DataBaseHelper();
        initTable();
        setTable(helper.readAllHokms());
        confirm.setOnAction( event -> onClickConfirm());
    }
}
