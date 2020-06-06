package Controllers;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeMenuController implements Initializable {
    public ImageView e1;
    public ImageView e2;
    public ImageView e3;
    public ImageView e4;
    public ImageView exit;
    public AnchorPane menuPane;
    public Label l1;
    public Label l2;
    public Label l3;
    public Label l4;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image1 = new Image("PNG/employeeMenu1.png");
        e1.setImage(image1);
        Image image2 = new Image("PNG/employeeMenu2.png");
        e2.setImage(image2);
        Image image3 = new Image("PNG/employeeMenu3.png");
        e3.setImage(image3);
        Image image4 = new Image("PNG/employeeMenu4.png");
        e4.setImage(image4);
        Image imageExit = new Image("PNG/exit.png");
        exit.setImage(imageExit);

    }



}


