package Controllers;

import SubSystems.SMS;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class ForgetPasswordController implements Initializable {


    public JFXTextField textFieldUsername;
    public Label lblResult;

    public void onClickConfirm() {
        String username = textFieldUsername.getText();
        //call method boolean:isExist(String Username) from DBHelper
        boolean isExist = true;
        if (isExist) {
            String phoneNumber = "";
            //call method String:getPhoneNumber(String username) from DBHelper

            //generate new password
            Random random = new Random();
            int newPass = random.nextInt(89999) + 10000;

            SMS sms = new SMS(phoneNumber);
            sms.setMessage("رمز عبور جدید شما: " + newPass);
            String result = sms.send();
            if (sms.getStatus()) {
                //update new password
                //call void:updatePassword(String username)
            }
            lblResult.setText(result);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
