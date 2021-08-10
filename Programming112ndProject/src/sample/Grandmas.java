package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Grandmas {


    private String name;


    //getter for name of the farm
    public String getName() {
        return name;
    }

    //constructor for Grandmas
    Grandmas(String name){
        this.name = name;

    }

    //saves all the necessary data to a file
    public void WriteToFile() throws IOException {
        FileWriter fw = new FileWriter("CookieClicker.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name+",\r");
        bw.write("Grandmas\r");
        bw.write("@\r");
        bw.close();

    }

    //shows the name of the grandma when displayed
    public String toString(){
        return name;
    }
}
