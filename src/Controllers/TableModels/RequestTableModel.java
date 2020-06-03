package Controllers.TableModels;

import com.jfoenix.controls.JFXButton;
import javafx.beans.property.SimpleStringProperty;

public class RequestTableModel {

    private SimpleStringProperty row;
    private SimpleStringProperty name;
    private JFXButton show;
    private JFXButton accept;
    private JFXButton reject;


    public RequestTableModel(String row, String name, JFXButton show, JFXButton accept, JFXButton reject) {
        this.row = new SimpleStringProperty(row);
        this.name = new SimpleStringProperty(name);
        this.show = show;
        this.accept = accept;
        this.reject = reject;
    }

    public JFXButton getShow() {
        return show;
    }

    public RequestTableModel setShow(JFXButton show) {
        this.show = show;
        return this;
    }

    public String getRow() {
        return row.get();
    }

    public SimpleStringProperty rowProperty() {
        return row;
    }

    public void setRow(String row) {
        this.row.set(row);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public JFXButton getAccept() {
        return accept;
    }

    public RequestTableModel setAccept(JFXButton accept) {
        this.accept = accept;
        return this;
    }

    public JFXButton getReject() {
        return reject;
    }

    public RequestTableModel setReject(JFXButton reject) {
        this.reject = reject;
        return this;
    }
}
