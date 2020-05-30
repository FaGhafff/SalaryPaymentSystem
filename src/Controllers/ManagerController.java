package Controllers;

import Model.Manager;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagerController implements Initializable {
    private Manager manager;

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @FXML
    private JFXHamburger hamburgerM;

    @FXML
    private JFXDrawer drawerM;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {

            AnchorPane pa = FXMLLoader.load(getClass().getResource("../FXMLs/employeeMenu.fxml"));
            drawerM.setSidePane(pa);
            HamburgerBackArrowBasicTransition back = new HamburgerBackArrowBasicTransition(hamburgerM);
            back.setRate(-1);
            hamburgerM.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    back.setRate(back.getRate() * -1);
                    back.play();
                    if (drawerM.isOpened())
                        drawerM.close();
                    else
                        drawerM.open();
                }
            });
        }
        catch(Exception e){

        }

    }
    }

