package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

public class Controller {
    public ListView ViewFriends;
    public TextField FirstNameInput;
    public TextField LastNameInput;
    public TextField AgeInput;
    public TextField UsernameInput;
    public TextField GenderInput;

    public Button AddFriendButton;
    public Button SaveButton;
    public Button LoadButton;
//takes all friends in the list and saves to a file
    public void Save(ActionEvent actionEvent) throws IOException {
        ObservableList<Friend> List = ViewFriends.getItems();
        for(Friend f :List){
            f.WriteToFile();
        }
        ViewFriends.getItems().clear();

    }
//gets list of friends/friends info from a file
    public void Load(ActionEvent actionEvent) throws IOException {
        ViewFriends.getItems().clear();
        ArrayList<Friend> Friends = AddFriend.AddAllFriends("Friends.txt");
        for(Friend p: Friends){
            ViewFriends.getItems().add(p);
        }
    }
//adds friend and makes sure all fields are filled in
    public void AddFriend(ActionEvent actionEvent) {
        if(!UsernameInput.getText().equals("")&& !FirstNameInput.getText().equals("")&&!LastNameInput.getText().equals("")&&!AgeInput.getText().equals("")&&!GenderInput.getText().equals("")) {
            Friend NewFriend = new Friend(UsernameInput.getText(), FirstNameInput.getText(), LastNameInput.getText(), GenderInput.getText(), Integer.parseInt(AgeInput.getText()));
            ViewFriends.getItems().add(NewFriend);

            UsernameInput.clear();
            FirstNameInput.clear();
            LastNameInput.clear();
            AgeInput.clear();
            GenderInput.clear();
        }

    }
}
