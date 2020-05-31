package Controllers;

import Controllers.EmployeeController;
import Controllers.ManagerController;
import Model.DataBaseHelper;
import Model.Employee;
import Model.Manager;
import Model.Person;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginPageController implements Initializable {
    public ImageView imageViewBack;
    public JFXTextField textFieldUser;
    public JFXTextField textFieldPass;
    public Pane forgetPassPane;
    public Label lblResultForgetPass;
    public JFXTextField textFieldForgetPass;

    private Parent root;
    private FXMLLoader loader;


    public void onClickLogin() {
        if (textFieldValidation(textFieldUser)) {
            DataBaseHelper dataBaseHelper = new DataBaseHelper();
            if (dataBaseHelper.authClient(textFieldUser.getText(), textFieldPass.getText())) {
                //if we have a client with this user pass
                //call getPerson(String username)
                Stage stage = (Stage) imageViewBack.getScene().getWindow();
                Person person = dataBaseHelper.getPerson(textFieldUser.getText());
                try {
                    if (person instanceof Manager) {
                        loginAsManager((Manager) person, stage);
                    } else if (person instanceof Employee) {
                        loginAsEmployee((Employee) person, stage);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage() + " in class: " + this.getClass().getName());
                }
            }
        }
    }

    public void onClickFillForm() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXMLs/employmentForm.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage() + " in class" + this.getClass().getName().toString());
        }
    }

    public void onClickForgetPass() {
        if (textFieldValidation(textFieldForgetPass)) {


        } else {
            lblResultForgetPass.setText("نام کاربری موجود نمی باشد.");
        }
        //todo open new stage and get username and send new pass with SMS
    }

    private void loginAsEmployee(Employee employee, Stage stage) throws IOException {
        loader = new FXMLLoader();
        EmployeeController employeeController = new EmployeeController();
        employeeController.setEmployee(employee);
        loader.setController(employeeController);
        loader.setRoot(getClass().getResource("FXMLs/employee.fxml"));
        root = loader.load();
        stage.close();
        stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void loginAsManager(Manager manager, Stage stage) throws IOException {
        loader = new FXMLLoader();
        ManagerController managerController = new ManagerController();
        managerController.setManager(manager);
        loader.setController(manager);
        loader.setRoot(getClass().getResource("FXMLs/manager.fxml"));
        root = loader.load();
        stage.close();
        stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }


    private boolean textFieldValidation(JFXTextField textField) {
        String str = textField.getText();
        for (char c : str.toCharArray()
        ) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    public void onClickHyperBack() {
        forgetPassPane.setVisible(false);
        forgetPassPane.setDisable(true);
    }

    public void showForgetPane() {
        forgetPassPane.setDisable(false);
        forgetPassPane.setVisible(true);
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image = new Image("PNG/PP.jpg");
        imageViewBack.setImage(image);
        forgetPassPane.setVisible(false);
        forgetPassPane.setDisable(false);


    }
}
