package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField UsernameInput;
    public TextField FirstnameInput;
    public TextField LastnameInput;
    public TextField AgeInput;
    public TextField GenderInput;
    public Label DisplayUsername;
    public Label DisplayFirstName;
    public Label DisplayLastName;
    public Label DisplayAge;
    public Label DisplayGender;
    public ListView<Friend> FriendsList = new ListView<>()  ;
    public Button AddFriendButton;

    public void AddFriend(ActionEvent actionEvent) {
        if(!UsernameInput.getText().equals("")&& !FirstnameInput.getText().equals("")&&!LastnameInput.getText().equals("")&&!AgeInput.getText().equals("")&&!GenderInput.getText().equals("")) {
            Friend NewFriend = new Friend(UsernameInput.getText(), FirstnameInput.getText(), LastnameInput.getText(), GenderInput.getText(), Integer.parseInt(AgeInput.getText()));
            FriendsList.getItems().add(NewFriend);

            UsernameInput.clear();
            FirstnameInput.clear();
            LastnameInput.clear();
            AgeInput.clear();
            GenderInput.clear();
        }



    }

    public void DisplayFriend(MouseEvent mouseEvent) {
        Friend friend;
        friend = FriendsList.getSelectionModel().getSelectedItem();
        DisplayUsername.setText(friend.getUsername());
        DisplayFirstName.setText(friend.getFirstname());
        DisplayLastName.setText(friend.getLastname());
        DisplayAge.setText(String.valueOf(friend.getAge()));
        DisplayGender.setText(friend.getGender());

    }
}
