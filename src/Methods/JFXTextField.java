package Methods;

public class JFXTextField extends com.jfoenix.controls.JFXTextField {
    public JFXTextField(String text, boolean isEditable) {
        super(text);
        super.setEditable(isEditable);
    }

    public JFXTextField(int text, boolean isEditable) {
        super(text + "");
        super.setEditable(isEditable);
    }

    public JFXTextField(double text, boolean isEditable) {
        super(text + "");
        super.setEditable(isEditable);
    }

    public JFXTextField() {
        super();
    }

    public JFXTextField(String text) {
        super(text);
    }

    public JFXTextField(double text) {
        super(text + "");
    }

    public JFXTextField(int text) {
        super(text + "");
    }

}
