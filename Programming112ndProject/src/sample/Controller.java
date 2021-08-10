package sample;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Controller {
    public Button CookieButton;
    public Label CookiesLabel;


    public Button ExitButton;


    public Label GrandmasLabel;
    public Button GetGrandmaButton;

    public Label FarmLabel;
    public Button GetFarmButton;

    public Label MinesLabel;
    public Button GetMineButton;

    public static int Cookies;


    public Label SelecteGrandmaName;
    public ListView<Grandmas> ListOfGrandmas = new ListView<>();
    public Label SelectFarmName;
    public ListView<Farms> ListOfFarms = new ListView<>();
    public Label SelectedMineName;
    public ListView<Mines> ListOfMines = new ListView<>();

//random names and adjectives for grandmas,farms and mines
    String[] GrandmaAdjectives = {"Grumpy","Young","Tired","Angry","Happy","Relaxed","Sleeping","'Energetic'","Boring","Bored","Barely awake","Small","Scary","Battle ready","Unicorn?","THE","Male","Gaming","Black Belt","Knife wielding"};
    String[] GrandmaNames = {"Barbra","Emma","Jean","Elizabeth","Anita","Bell","Rose","John","Sharon","Kate","Katerina","Mary","Constance 'Connie' Tucker",""};

    String[] FarmAdjectives = {"Shiny","'ol","Red","Golden","Farmer's","really big farm, yeah you know the one. Its by the river and near a forest, I think. It's called something dumb like Bob's","Morning","Windy"};
    String[] FarmNames = {"orchard","rake","shoe","cow","electric fan","potato","scythe","scarecrow","horse","straw hat","lab coat","oak tree","ridge"};

    String[] MinePreposition = {"under","above","near","beside","no where near","North of","South of","West of","East of","over a rainbow and beside"};
    String[] MineAdjectives = {"big","small","cavernous","unnecessary","collapsing","flying","waking","swimming","floating","spinning"};
    String[] MineLocations = {"Washington","Washington D.C.","Japan","Vancouver","Greenland","the middle of the Pacific Ocean","the Top of mount Everest","my bedroom","Korea"};

    //loads saved grandmas, farms, mines and cookies
    public void initialize() throws IOException {

        ArrayList<Grandmas> GrandmasArrayList= LoadSave.AddGrandmas("CookieClicker.txt");
        for(Grandmas g:GrandmasArrayList){
            ListOfGrandmas.getItems().add(g);
        }
        ArrayList<Farms> FarmsArrayList = LoadSave.AddFarms("CookieClicker.txt");
        for(Farms f: FarmsArrayList){
            ListOfFarms.getItems().add(f);
        }
        ArrayList<Mines> MinesArrayList = LoadSave.AddMines("CookieClicker.txt");
        for(Mines m: MinesArrayList){
            ListOfMines.getItems().add(m);
        }
        Cookies = LoadSave.AddCookies("CookieClicker.txt");
        CookiesLabel.setText(String.valueOf(Cookies));

    }
    //saves grandmas, farms, mines, and cookies the closes the window
    public void ExitGame(ActionEvent actionEvent) throws IOException {
        FileWriter fw = new FileWriter("CookieClicker.txt", false);
        BufferedWriter bw = new BufferedWriter(fw);
        ObservableList<Grandmas> GrandmasList = ListOfGrandmas.getItems();
        ObservableList<Farms> FarmsList = ListOfFarms.getItems();
        ObservableList<Mines> MinesList = ListOfMines.getItems();
        bw.write(String.valueOf(Cookies)+",\r");
        bw.write("Cookies\r");
        bw.write("@\r");

        bw.close();
        for(Grandmas g :GrandmasList){
            g.WriteToFile();
        }
        for(Farms f: FarmsList){
            f.WriteToFile();
        }
        for (Mines m: MinesList){
            m.WriteToFile();
        }

        Platform.exit();
    }


    //buys a grandma,with a random name, adds it to the list and subtracts cost from total cookies
    public void BuyGrandma(ActionEvent actionEvent) {
        if(Cookies >= 100){
            Cookies -= 100;
            CookiesLabel.setText(String.valueOf(Cookies));
            int RandomGrandmaName = (int) Math.floor(Math.random() * GrandmaNames.length);
            int RandomGrandmaAdjective = (int) Math.floor(Math.random() * GrandmaAdjectives.length);
            Grandmas NewGrandma = new Grandmas(GrandmaAdjectives[RandomGrandmaAdjective]+" "+GrandmaNames[RandomGrandmaName]);
            ListOfGrandmas.getItems().add(NewGrandma);
            GrandmasLabel.setText(String.valueOf(ListOfGrandmas.getItems().size()));
        }
    }

    //buys a farm, with a random name, adds it to the list and subtracts cost from total cookies
    public void BuyFarm(ActionEvent actionEvent) throws IOException {
        if(Cookies >= 1100){
            Cookies -= 1100;
            CookiesLabel.setText(String.valueOf(Cookies));
            int RandomFarmName = (int) Math.floor(Math.random() * FarmNames.length);
            int RandomFarmAdjectives = (int) Math.floor(Math.random() * FarmAdjectives.length);
            Farms newFarm = new Farms("The "+FarmAdjectives[RandomFarmAdjectives]+FarmNames[RandomFarmName]+"farm");
            ListOfFarms.getItems().add(newFarm);
            FarmLabel.setText(String.valueOf(ListOfFarms.getItems().size()));

        }
    }

    //buys a mine,with a random name, adds it to the list and subtracts cost from total cookies
    public void BuyMine(ActionEvent actionEvent) {
            if(Cookies >= 12000){
                Cookies -= 12000;
                CookiesLabel.setText(String.valueOf(Cookies));
                int RandomMineLocation = (int) Math.floor(Math.random() * MineLocations.length);
                int RandomMineAdjectives = (int) Math.floor(Math.random() * MineLocations.length);
                int RandomMinePreposition = (int) Math.floor(Math.random() * MineLocations.length);
                Mines newMine = new Mines("The "+MineAdjectives[RandomMineAdjectives]+" mine "+ MinePreposition[RandomMinePreposition]+" "+MineLocations[RandomMineLocation]);
                ListOfMines.getItems().add(newMine);
                MinesLabel.setText(String.valueOf(ListOfMines.getItems().size()));

            }

    }
    //takes the number of grandmas, farms and mines then adds with some math to get the total amount of cookies earned for that click
    public void ClickCookieButton(ActionEvent actionEvent) {
        Cookies += (ListOfGrandmas.getItems().size()+(ListOfFarms.getItems().size()*5)+(ListOfMines.getItems().size()*15)+1);
        CookiesLabel.setText(String.valueOf(Cookies));
    }
    //displays the grandmas name when selected

    public void DisplayGrandmaName(MouseEvent mouseEvent) {
        if(ListOfGrandmas.getItems().size()>=1 && ListOfGrandmas.getSelectionModel().getSelectedItem() != null) {
            Grandmas g;
            g = ListOfGrandmas.getSelectionModel().getSelectedItem();
            SelecteGrandmaName.setText(g.getName());
        }

    }
    //displays the farms name when selected
    public void DisplayFarmName(MouseEvent mouseEvent) {
        if(ListOfFarms.getItems().size()>=1) {
            Farms f;
            f = ListOfFarms.getSelectionModel().getSelectedItem();
            SelectFarmName.setText(f.getName());
        }
    }
    //displays the mines name when selected
    public void DisplayMineName(MouseEvent mouseEvent) {
        if(ListOfFarms.getItems().size()>=1) {
            Mines m;
            m = ListOfMines.getSelectionModel().getSelectedItem();
            SelectedMineName.setText(m.getName());
        }
    }
}
