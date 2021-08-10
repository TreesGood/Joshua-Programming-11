package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Mines {
    private String name;


    //getter for the name of the mine
    public String getName() {
        return name;
    }

    //constructor for the Mine
    Mines(String name){
        this.name = name;
    }


    //writes all the required data about the mine to a file
    public void WriteToFile() throws IOException {
        FileWriter fw = new FileWriter("CookieClicker.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name+",\r");
        bw.write("Mines\r");
        bw.write("@\r");
        bw.close();

    }

    //shows the name of the mine when displayed
    public String toString(){
       return name;
    }
}
