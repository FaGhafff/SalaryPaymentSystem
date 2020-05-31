package Controllers;

import Model.Employee;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

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
            loadPane("FXMLs/EmployeeMenu/employeeFish.fxml");
            for (Node node : pa.getChildren()) {
                node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                    switch (node.getAccessibleText()) {
                        case "fish hogogi":
                            loadPane("FXMLs/EmployeeMenu/employeeFish.fxml");
                            break;
                        case "change pass":
                            loadPane("FXMLs/EmployeeMenu/employeeChangePass.fxml");
                            break;
                        case "send massage":
                            loadPane("FXMLs/EmployeeMenu/employeeSend.fxml");
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

    private void loadPane(String path) {
        try {
            FXMLLoader fXMLLoader = new FXMLLoader(getClass().getClassLoader().getResource(path));
            Parent root = fXMLLoader.load();
            mainPane.getChildren().add(root);
            System.out.println("hi");
        } catch (IOException e) {
            System.out.println(e.getMessage() + " " + this.getClass().getName());
        }
    }



}
