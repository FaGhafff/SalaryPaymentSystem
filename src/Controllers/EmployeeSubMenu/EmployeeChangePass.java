package Controllers.EmployeeSubMenu;

import Model.DataBaseHelper;
import SubSystems.SMS;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.image.Image;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeChangePass implements Initializable {
    public ImageView c1;
    public ImageView c2;
    public ImageView c3;
    public Label chl1;
    public Label chl2;
    public Label chl3;
    public JFXTextField pass;
    public JFXTextField newPass;
    public JFXTextField confirmNewPass;
    public JFXButton changePass;
    public Label result;
    private String username;

    public EmployeeChangePass setUsername(String username) {
        this.username = username;
        return this;
    }

    private String phoneNumber;

    public EmployeeChangePass setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    void onClickChangePass() {
        result.setText("");
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        if (dataBaseHelper.authClient(username, pass.getText())) {
            if (newPass.getText().equals(confirmNewPass.getText())) {
                dataBaseHelper.changePassword(username, newPass.getText());
                SMS sms = new SMS(phoneNumber);
                sms.setMessage("رمز عبور جدید: "+newPass.getText());
                sms.send();
                result.setText("رمز عبور با موفقیت تغییر یافت.");
            } else {
                result.setText("رمز عبور جدید مورد تایید نمی باشد.");
            }
        } else {
            result.setText("رمز عبور صحیح نیست.");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image im1 = new Image("PNG/key_26px.png");
        c1.setImage(im1);
        Image im2 = new Image("PNG/new_64px.png");
        c2.setImage(im2);
        Image image3 = new Image("PNG/repet.png");
        c3.setImage(image3);
        changePass.setOnMouseClicked(event -> onClickChangePass());
    }
}
