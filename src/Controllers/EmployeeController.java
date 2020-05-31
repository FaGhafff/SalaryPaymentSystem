package Controllers;

import Model.Employee;
import SubSystems.Employment;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeController implements Initializable {
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

            Pane pa = FXMLLoader.load(getClass().getResource("../FXMLs/employeeMenu.fxml"));
            drawer.setSidePane(pa);
            for (Node node : pa.getChildren()) {
                node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
                    switch (node.getAccessibleText()) {
                        case "fish hogogi":
                            break;
                        case "change pass":
                            break;
                        case "send massage":
                            break;
                        case "exit":
                            break;
                    }
                });
            }
            HamburgerBackArrowBasicTransition back = new HamburgerBackArrowBasicTransition(hamburger);
            back.setRate(-1);
            hamburger.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    back.setRate(back.getRate() * -1);
                    back.play();
                    if (drawer.isOpened())
                        drawer.close();
                    else
                        drawer.open();
                }
            });
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }

    }
}
