package Controllers;

import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ManagerMenuController implements Initializable {
    public ImageView i0;
    public ImageView i1;
    public ImageView i2;
    public ImageView i3;
    public ImageView i4;
    public ImageView i5;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image1 = new Image("PNG/managerMenu1.png");
        i0.setImage(image1);
        Image image2 = new Image("PNG/managerMenu2.png");
        i1.setImage(image2);
        Image image3 = new Image("PNG/managerMenu3.png");
        i2.setImage(image3);
        Image image4 = new Image("PNG/employeeMenu1.png");
        i3.setImage(image4);
        Image image5 = new Image("PNG/managerMenu4.png");
        i4.setImage(image5);
        Image imageExit = new Image("PNG/exit.png");
        i5.setImage(imageExit);
    }
}
