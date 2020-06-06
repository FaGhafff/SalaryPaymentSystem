package Controllers;

import Model.DataBaseHelper;
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
        DataBaseHelper dataBaseHelper = new DataBaseHelper();
        if (dataBaseHelper.isExist(username)) {
            String phoneNumber = "";
            phoneNumber = String.valueOf(dataBaseHelper.getPerson(username).getMobilePhoneNumber());
            //generate new password
            Random random = new Random();
            int newPass = random.nextInt(89999) + 10000;

            SMS sms = new SMS(phoneNumber);
            sms.setMessage("رمز عبور جدید شما: " + newPass);
            String result = sms.send();
            if (sms.getStatus()) {
                dataBaseHelper.changePassword(username, newPass + "");
            }
            lblResult.setText(result);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
