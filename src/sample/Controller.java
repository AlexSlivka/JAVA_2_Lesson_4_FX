package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;

public class Controller {
    @FXML
    public TextArea textAreaCorrespondence;
    @FXML
    public TextField textFieldEnterMessage;

    public void sendMessage(ActionEvent actionEvent) {
        send();
    }


    public void enterMessage(ActionEvent actionEvent) {
        send();
    }

    public void send(){
        System.out.println("Сообщение отослано");
        textAreaCorrespondence.appendText(textFieldEnterMessage.getText() + "\n");
        textAreaCorrespondence.requestFocus();
        textFieldEnterMessage.setText(" ");
    }
}
