package Controllers;

import Controllers.EmployeeSubMenu.EmployeeChangePass;
import Controllers.EmployeeSubMenu.EmployeeLegalReceipt;
import Controllers.EmployeeSubMenu.EmployeeSendRequests;
import Model.Employee;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable {
    public AnchorPane mainPane;
    private Employee employee;

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private JFXDrawer drawer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Pane pa = FXMLLoader.load(getClass().getResource("../FXMLs/EmployeeMenu/employeeMenu.fxml"));
            drawer.setSidePane(pa);
            loadPane("FXMLs/EmployeeMenu/employeeFish.fxml", new EmployeeLegalReceipt().setUsername(employee.getUsername()));
            for (Node node : pa.getChildren()) {
                node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                    switch (node.getAccessibleText()) {
                        case "fish hogogi":
                            loadPane("FXMLs/EmployeeMenu/employeeFish.fxml", new EmployeeLegalReceipt().setUsername(employee.getUsername()));
                            break;
                        case "change pass":
                            loadPane("FXMLs/EmployeeMenu/employeeChangePass.fxml",new EmployeeChangePass().setUsername(employee.getUsername()).setPhoneNumber(employee.getMobilePhoneNumber()+""));
                            break;
                        case "send massage":
                            loadPane("FXMLs/EmployeeMenu/employeeSend.fxml",new EmployeeSendRequests());
                            break;
                        case "exit":
                            System.exit(0);
                            break;
                    }
                });
            }
            HamburgerBackArrowBasicTransition back = new HamburgerBackArrowBasicTransition(hamburger);
            back.setRate(-1);
            hamburger.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
                back.setRate(back.getRate() * -1);
                back.play();
                if (drawer.isOpened())
                    drawer.close();
                else
                    drawer.open();
            });
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void loadPane(String path, Object controller) {
        if (mainPane.getChildren().size() > 0)
            mainPane.getChildren().remove(0);
        try {
            FXMLLoader fXMLLoader = new FXMLLoader(getClass().getClassLoader().getResource(path));
            fXMLLoader.setController(controller);
            Parent root = fXMLLoader.load();
            FadeTransition fadeTransition = new FadeTransition(Duration.millis(500), root);
            fadeTransition.play();
            mainPane.getChildren().add(root);
        } catch (IOException e) {
            System.out.println(e.getMessage() + " " + this.getClass().getName());
        }
    }


}
