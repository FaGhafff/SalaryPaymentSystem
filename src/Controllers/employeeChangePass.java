package Controllers;

import javafx.scene.image.Image;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class employeeChangePass implements Initializable {
public ImageView c1 ;
public ImageView c2 ;
public ImageView c3 ;
public Label chl1 ;
public Label chl2 ;
public Label chl3 ;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image im1 = new Image("PNG/key_26px.png");
        c1.setImage(im1);
        Image im2 = new Image("PNG/new_64px.png");
        c2.setImage(im2);
        Image image3 = new Image("PNG/repet.png");
        c3.setImage(image3);


    }
}
