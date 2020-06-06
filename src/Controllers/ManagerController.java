package Controllers;

import Model.Manager;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ManagerController implements Initializable {
    public AnchorPane mainPane;
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

            Pane pI = FXMLLoader.load(getClass().getResource("../FXMLs/managerMenu.fxml"));
            drawerM.setSidePane(pI);
            pI.getChildren().forEach(node -> {
                node.setOnMouseClicked(event -> {
                    switch (node.getAccessibleText()) {
                        case "modirKar":
                            loadPane("FXMLs/ManagerMenu/managerMenuEmployeeManagement.fxml");
                            break;
                        case "mian":
                            loadPane("FXMLs/ManagerMenu/managerAvreg.fxml");
                            break;
                        case "modirDar":
                            loadPane("FXMLs/ManagerMenu/managerRequsetManagment.fxml");
                            break;
                        case "taghiSav":
                            loadPane("FXMLs/ManagerMenu/managerConstantes.fxml");
                            break;
                        case "exit":
                            System.exit(0);
                            break;
                    }
                });
            });
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    void loadPane(String path) {
        try {
            if (mainPane.getChildren().size()>0)
                mainPane.getChildren().remove(0);
            FXMLLoader fXMLLoader = new FXMLLoader(getClass().getClassLoader().getResource(path));
            Parent root = fXMLLoader.load();
            mainPane.getChildren().add(root);
            System.out.println("hi");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage() + " " + this.getClass().getName());
        }
    }
}

