package Controllers;

import Controllers.EmployeeController;
import Controllers.ManagerController;
import Model.Employee;
import Model.Manager;
import Model.Person;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class LoginPageController implements Initializable {
    public ImageView imageViewBack;
    public JFXTextField textFieldUser;
    public JFXTextField textFieldPass;

    private Parent root;
    private FXMLLoader loader;


    public void onClickLogin() {
        if (textFieldValidation(textFieldUser)) {
            //call authClient(String username,String password) from DBHelper
            //if we have a client with this user pass
            //call getPerson(String username)
            Stage stage = (Stage) imageViewBack.getScene().getWindow();
            Person person= null;
            try {
                if (person instanceof Manager) {
                    loginAsManager((Manager) person, stage);
                } else if (person instanceof Employee) {
                    loginAsEmployee((Employee) person, stage);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage()+" in class: "+this.getClass().getName());
            }
        }
    }

    public void onClickFillForm() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXMLs/employmentForm.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println(e.getMessage() + " in class" + this.getClass().getName().toString());
        }
    }

    public void onClickForgetPass() {
        Stage stage = new Stage();
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


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image = new Image("PNG/PP.jpg");
        imageViewBack.setImage(image);

    }
}
