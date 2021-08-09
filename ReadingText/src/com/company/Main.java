package com.company;

import javax.naming.directory.SearchControls;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        //arraylist for lines
        ArrayList<String> lines = new ArrayList<>();

        FileReader fr = new FileReader("In.txt");
        BufferedReader br = new BufferedReader(fr);

        String line;
        //gets each line and adds to an arraylist
        while((line = br.readLine()) != null){
            lines.add(line);
        }
        br.close();

        //searching for the word "the"
        Search(lines,"the");
    }


    private static void Search(ArrayList<String> arraylist,String word) {
        //searches the array list for any lines that contain the string

        for(String s: arraylist){
            if(s.contains(word)){
                //print out the index of any lines containing containing the string
                System.out.println(arraylist.indexOf(s));
            }
        }
    }
}
