package Methods;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class JFXButton extends com.jfoenix.controls.JFXButton {

    JFXButton(){
        super();
    }
    public JFXButton(String text){
        super(text);
    }
    public JFXButton setOnClicked(EventHandler<? super MouseEvent> value){
        super.onMouseClickedProperty().set(value);
        return this;
    }



}
