package Controllers;

import Model.DataBaseHelper;
import Model.EmploymentOrder;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EmploymentFormController implements Initializable {


    public JFXTextField namePersian;
    public JFXTextField nameEnglish;
    public JFXTextField lastNamePersian;
    public JFXTextField lastNameEnglish;
    public JFXTextField idNumber;
    public JFXTextField bcNumber;
    public JFXTextField birthPlace;
    public JFXTextField issuanceOfBCPlace;
    public JFXTextField sexuality;
    public JFXTextField mobilePhoneNumber;
    public JFXTextField telephoneNumber;
    public JFXTextField fatherName;
    public JFXTextField maritalStatus;
    public JFXTextField fatherMobileNumber;
    public JFXTextField childrenCount;
    public JFXTextField healthIssue;
    public JFXTextField emergencyContactName;
    public JFXTextField emergencyContactMobileNumber;
    public JFXTextField emergencyContactLastName;
    public JFXTextField emergencyContactRelation;
    public JFXTextField diplomaType;
    public JFXTextField diplomaScore;
    public JFXTextField associateStatus;
    public JFXTextField associatePlace;
    public JFXTextField associateScore;
    public JFXTextField bachelorStatus;
    public JFXTextField bachelorPlace;
    public JFXTextField bachelorScore;
    public JFXTextField masterStatus;
    public JFXTextField masterPlace;
    public JFXTextField masterScore;
    public JFXTextField doctorateStatus;
    public JFXTextField doctoratePlace;
    public JFXTextField doctorateScore;
    public TextArea healthStatus;
    public TextArea healthStatus1;
    public TextArea otherEducation;
    public JFXButton btnSendRequest;
    public JFXButton btnCancel;

    private EmploymentOrder order = null;

    public EmploymentFormController setOrder(EmploymentOrder order) {
        this.order = order;
        return this;
    }

    public void onClickCancel() {
        Stage stage = (Stage) btnSendRequest.getScene().getWindow();
        stage.close();
    }

    public void onClickSendRequest() {
        if (checkData()) {
            EmploymentOrder employmentOrder = new EmploymentOrder()
                    .setNamePersian(namePersian.getText())
                    .setLastNamePersian(lastNamePersian.getText())
                    .setNameEnglish(nameEnglish.getText())
                    .setLastNameEnglish(lastNameEnglish.getText())
                    .setIdNumber(Long.parseLong(idNumber.getText()))
                    .setBcNumber(Long.parseLong(bcNumber.getText()))
                    .setBirthPlace(birthPlace.getText())
                    .setIssuanceOfBCPlace(issuanceOfBCPlace.getText())
                    .setSexuality(sexuality.getText())
                    .setMobilePhoneNumber(Long.parseLong(mobilePhoneNumber.getText()))
                    .setTelephoneNumber(Long.parseLong(telephoneNumber.getText()))
                    .setFatherName(fatherName.getText())
                    .setMaritalStatus(maritalStatus.getText())
                    .setChildrenCount(Integer.parseInt(childrenCount.getText()))
                    .setHealthIssue(healthIssue.getText())
                    .setEmergencyContactName(emergencyContactName.getText())
                    .setEmergencyContactLastName(emergencyContactLastName.getText())
                    .setEmergencyContactMobileNumber(Long.parseLong(emergencyContactMobileNumber.getText()))
                    .setEmergencyContactRelation(emergencyContactRelation.getText())
                    .setDiplomaType(diplomaType.getText())
                    .setDiplomaScore(Double.parseDouble(diplomaScore.getText()))
                    .setAssociateStatus(associateStatus.getText())
                    .setAssociatePlace(associatePlace.getText())
                    .setAssociateScore(Double.parseDouble(associateScore.getText()))
                    .setBachelorStatus(bachelorStatus.getText())
                    .setBirthPlace(bachelorPlace.getText())
                    .setBachelorScore(Double.parseDouble(bachelorScore.getText()))
                    .setMasterScore(Double.parseDouble(masterScore.getText()))
                    .setMasterStatus(masterStatus.getText())
                    .setMasterPlace(masterPlace.getText())
                    .setDoctoratePlace(doctoratePlace.getText())
                    .setDoctorateScore(Double.parseDouble(doctorateScore.getText()))
                    .setDoctorateStatus(doctorateStatus.getText())
                    .setHealthStatus(healthStatus.getText())
                    .setHealthIssue(healthStatus1.getText())
                    .setOtherEducation(otherEducation.getText());

            DataBaseHelper dataBaseHelper = new DataBaseHelper();
            if (dataBaseHelper.sendRequest(employmentOrder)) {
                btnSendRequest.setText("ارسال شد !");
                btnCancel.setText("خروج");
            }
        }
    }

    private boolean checkData() {
        //todo check validation of data in here
        //set suitable color for textField if data is invalid
        return true;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (order != null) {
            System.out.println("hi");
            namePersian.setText(order.getNamePersian());
            nameEnglish.setText(order.getNameEnglish());
            lastNamePersian.setText(order.getLastNamePersian());
            lastNameEnglish.setText(order.getLastNameEnglish());
            idNumber.setText(order.getIdNumber() + "");
            bcNumber.setText(order.getBcNumber() + "");
            birthPlace.setText(order.getBirthPlace());
            issuanceOfBCPlace.setText(order.getIssuanceOfBCPlace());
            sexuality.setText(order.getSexuality());
            mobilePhoneNumber.setText(order.getMobilePhoneNumber() + "");
            telephoneNumber.setText(order.getTelephoneNumber() + "");
            fatherName.setText(order.getFatherName());
            maritalStatus.setText(order.getMaritalStatus());
            fatherMobileNumber.setText(order.getFatherMobileNumber() + "");
            childrenCount.setText(order.getChildrenCount() + "");
            healthIssue.setText(order.getHealthIssue());
            emergencyContactName.setText(order.getEmergencyContactName());
            emergencyContactMobileNumber.setText(order.getEmergencyContactMobileNumber() + "");
            emergencyContactLastName.setText(order.getEmergencyContactLastName());
            emergencyContactRelation.setText(order.getEmergencyContactRelation());
            diplomaType.setText(order.getDiplomaType());
            diplomaScore.setText(order.getDoctorateScore() + "");
            associateStatus.setText(order.getAssociateStatus());
            associatePlace.setText(order.getAssociatePlace());
            associateScore.setText(order.getAssociateScore() + "");
            bachelorStatus.setText(order.getBachelorStatus());
            bachelorPlace.setText(order.getBachelorPlace());
            bachelorScore.setText(order.getBachelorScore() + "");
            masterStatus.setText(order.getMasterStatus());
            masterPlace.setText(order.getMasterPlace());
            masterScore.setText(order.getMasterScore() + "");
            doctorateStatus.setText(order.getDoctorateStatus());
            doctoratePlace.setText(order.getDoctoratePlace());
            doctorateScore.setText(order.getDoctorateScore() + "");
            healthStatus.setText(order.getHealthStatus());
            healthStatus1.setText(order.getHealthIssue());
            otherEducation.setText(order.getOtherEducation());
            btnSendRequest.setDisable(true);
        }
    }
}
