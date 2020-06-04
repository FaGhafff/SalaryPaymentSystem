package Controllers.ManagerSubMenu;

import Controllers.EmploymentFormController;
import Controllers.TableModels.RequestTableModel;
import Methods.JFXButton;
import Model.DataBaseHelper;
import Model.EmploymentOrder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ManagerMenuRequestManagement implements Initializable {
    public TableView<RequestTableModel> table;
    public TableColumn<RequestTableModel, String> row;
    public TableColumn<RequestTableModel, String> name;
    public TableColumn<RequestTableModel, JFXButton> show;
    public TableColumn<RequestTableModel, JFXButton> accept;
    public TableColumn<RequestTableModel, JFXButton> reject;

    private ArrayList<EmploymentOrder> tableList = new ArrayList<>();

    private void initTable() {
        row.setCellValueFactory(new PropertyValueFactory<RequestTableModel, String>("row"));
        name.setCellValueFactory(new PropertyValueFactory<RequestTableModel, String>("name"));
        show.setCellValueFactory(new PropertyValueFactory<RequestTableModel, JFXButton>("show"));
        accept.setCellValueFactory(new PropertyValueFactory<RequestTableModel, JFXButton>("accept"));
        reject.setCellValueFactory(new PropertyValueFactory<RequestTableModel, JFXButton>("reject"));
    }

    private void fillTable() {
        ObservableList<RequestTableModel> data = FXCollections.observableArrayList();
        tableList.forEach(employmentOrder -> {
            data.add(new RequestTableModel((tableList.indexOf(employmentOrder) + 1) + ""
                            , employmentOrder.getNamePersian() + " " + employmentOrder.getLastNamePersian()
                            , new JFXButton("نمایش").setOnClicked(event -> onClickShow(employmentOrder))
                            , new JFXButton("تایید").setOnClicked(event -> onClickAccept(employmentOrder))
                            , new JFXButton("رد کردن").setOnClicked(event -> onClickReject(employmentOrder))
                    )
            );
        });
        table.setItems(data);

    }



    void onClickShow(EmploymentOrder order) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../../FXMLs/employmentForm.fxml"));
            loader.setController(new EmploymentFormController().setOrder(order));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    DataBaseHelper dataBaseHelper;
    void onClickAccept(EmploymentOrder order) {
        dataBaseHelper = new DataBaseHelper();
        dataBaseHelper.signUp(order);
        onClickReject(order);
    }

    void onClickReject(EmploymentOrder order) {
        dataBaseHelper = new DataBaseHelper();
        dataBaseHelper.remove(order);
        tableList.remove(order);
        fillTable();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initTable();
        ArrayList<EmploymentOrder> list = new ArrayList<>();
        list.add(new EmploymentOrder().setNamePersian("ali").setMobilePhoneNumber(914).setSexuality("mard").setDoctorateStatus("hi"));
        list.add(new EmploymentOrder().setNamePersian("علی").setMobilePhoneNumber(5030).setSexuality("mard").setDoctorateStatus("ho"));
        tableList.addAll(list);
        fillTable();


    }
}
