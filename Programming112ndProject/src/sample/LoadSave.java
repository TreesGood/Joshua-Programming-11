package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class LoadSave {
    private static FileReader fr;
    private static BufferedReader br;
    private static ArrayList<Grandmas> GrandmasList = new ArrayList<>();
    private static ArrayList<Farms> FarmsList = new ArrayList<>();
    private static ArrayList<Mines> MinesList = new ArrayList<>();
    private static int cookies;

    //converts sections of the file into strings and gives them to the "get cookies" method to parse
    public static int AddCookies(String filename)throws IOException{
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
        String line;
        String LoadString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals("@")) {
                LoadString += line;
            } else{
                GetCookies(LoadString);
                LoadString = "";
            }
        }

        return cookies;

    }
    //parses the strings and changes the number of cookies accordingly
    private static void GetCookies(String string){
        int position  = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                position=i;
                if(string.substring(i+1,string.length()).equals("Cookies")) {

                    cookies = Integer.parseInt(string.substring(0, position));
                    System.out.println(String.valueOf(cookies));

                }
            }

        }

    }
    //converts sections of the file into strings and gives them to the "get grandmas" method to parse
    public static ArrayList AddGrandmas(String filename)throws IOException{
        GrandmasList.clear();
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
        String line;
        String LoadString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals("@")) {
                LoadString += line;
            } else{
                GetGrandmas(LoadString);
                LoadString = "";
            }
        }

        return GrandmasList;

    }
    //Parses the strings and adds grandmas to a list using the data from the strings
    private static void GetGrandmas(String string){
        int position  = 0;
        String name ="";
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                position=i;
                if(string.substring(i+1,string.length()).equals("Grandmas")) {

                    name = string.substring(0, position);
                    Grandmas newGrandmas = new Grandmas(name);
                    GrandmasList.add(newGrandmas);
                }
            }

        }

    }


    //converts sections of the file into strings and gives them to the "get Farms" method to parse
    public static ArrayList AddFarms(String filename)throws IOException{
        FarmsList.clear();
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
        String line;
        String LoadString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals("@")) {
                LoadString += line;
            } else{
                GetFarms(LoadString);
                LoadString = "";
            }
        }

        return FarmsList;

    }
    //Parses the strings and adds farms to a list using the data from the strings
    private static void GetFarms(String string){
        int position  = 0;
        String name ="";
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                position=i;
                if(string.substring(i+1,string.length()).equals("Farms")) {

                    name = string.substring(0, position);
                    Farms newFarm = new Farms(name);
                    FarmsList.add(newFarm);
                }
            }

        }

    }
    //converts sections of the file into strings and gives them to the "get Mines" method to parse
    public static ArrayList AddMines(String filename)throws IOException{
        MinesList.clear();
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
        String line;
        String LoadString = "";
        while ((line = br.readLine()) != null) {
            if (!line.equals("@")) {
                LoadString += line;
            } else{
                GetMines(LoadString);
                LoadString = "";
            }
        }

        return MinesList;

    }

    //Parses the strings and adds mines to a list using the data from the strings
    private static void GetMines(String string){
        int position  = 0;
        String name ="";
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals(",")) {
                position=i;
                if(string.substring(i+1,string.length()).equals("Mines")) {

                    name = string.substring(0, position);
                    Mines newMines = new Mines(name);
                    MinesList.add(newMines);
                }
            }

        }

    }
}

