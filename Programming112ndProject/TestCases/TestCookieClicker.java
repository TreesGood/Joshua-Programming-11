import javafx.event.ActionEvent;
import org.junit.Before;
import org.junit.Test;
import sample.*;

import java.io.*;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TestCookieClicker {
    private ArrayList TestArrayList;

    @Before
    public void setup() throws IOException {
        //start with file filled
        FileWriter fw = new FileWriter("CookieClicker.txt", false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Test1,\r");
        bw.write("Grandmas\r");
        bw.write("@\r");
        bw.write("Test2,\r");
        bw.write("Farms\r");
        bw.write("@\r");
        bw.write("Test3,\r");
        bw.write("Mines\r");
        bw.write("@\r");
        bw.write("Test4,\r");
        bw.write("Grandmas\r");
        bw.write("@\r");
        bw.write("Test5,\r");
        bw.write("Farms\r");
        bw.write("@\r");
        bw.write("Test6,\r");
        bw.write("Mines\r");
        bw.write("@\r");
        bw.write("something,\r");
        bw.write("somethingelse");
        bw.write("@\r");
        bw.close();
    }


    @Test
    public void TestAddGrandmas() throws IOException {
        //make arraylist with data from the file
        ArrayList<Grandmas> GrandmasArrayList = new ArrayList<>();
        GrandmasArrayList = LoadSave.AddGrandmas("CookieClicker.txt");
        //test to see if the arraylist is th correct size and has the correct objects
        assertEquals(GrandmasArrayList.size(),2);
        assertEquals(GrandmasArrayList.get(1).getName(),"Test4");
        //clear the arraylist and file
        GrandmasArrayList.clear();
        FileWriter fw = new FileWriter("CookieClicker.txt", false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("");
        bw.close();
        //try to add to the arraylist with the empty file
        GrandmasArrayList = LoadSave.AddGrandmas("CookieClicker.txt");
        assertEquals(GrandmasArrayList.size(),0);
    }

    @Test
    public void TestAddFarms() throws IOException {
        //same as previous
        ArrayList<Farms> FarmsArrayList = new ArrayList<>();
        FarmsArrayList = LoadSave.AddFarms("CookieClicker.txt");
        assertEquals(FarmsArrayList.size(),2);
        assertEquals(FarmsArrayList.get(1).getName(),"Test5");
        FarmsArrayList.clear();
        FileWriter fw = new FileWriter("CookieClicker.txt", false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("");
        bw.close();
        FarmsArrayList = LoadSave.AddFarms("CookieClicker.txt");
        assertEquals(FarmsArrayList.size(),0);
    }
    @Test
    public void TestAddMines() throws IOException {
        //same as previous
        ArrayList<Mines> MinesArrayList = new ArrayList<>();
        MinesArrayList = LoadSave.AddMines("CookieClicker.txt");
        assertEquals(MinesArrayList.size(),2);
        assertEquals(MinesArrayList.get(1).getName(),"Test6");
        MinesArrayList.clear();
        FileWriter fw = new FileWriter("CookieClicker.txt", false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("");
        bw.close();
        MinesArrayList = LoadSave.AddMines("CookieClicker.txt");
        assertEquals(MinesArrayList.size(),0);



    }

}
