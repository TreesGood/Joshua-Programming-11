package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Farms {


    private String name;

    //getter for name of the farm
    public String getName() {
        return name;
    }

    //constructor for Farms
    Farms(String name){
        this.name = name;

    }
    //writes all the necesarry data about the farm to a file
    public void WriteToFile() throws IOException {
        FileWriter fw = new FileWriter("CookieClicker.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(name+",\r");
        bw.write("Farms\r");
        bw.write("@\r");
        bw.close();

    }

    //shows the farms name when displayed
    public String toString(){
       return name;
    }
}
