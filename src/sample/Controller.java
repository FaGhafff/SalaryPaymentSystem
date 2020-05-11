package sample;

import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public ImageView imageViewBack;





    public void onClickLogin(){}
    public void onClickFillForm(){}
    public void onClickForgetPass(){}


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image = new Image("PNG/PP.jpg");
        imageViewBack.setImage(image);

    }
}
