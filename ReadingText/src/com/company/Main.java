package com.company;

import javax.naming.directory.SearchControls;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        FileReader fr = new FileReader("In.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            lines.add(line);
        }
        br.close();
        Search(lines,"the");
    }


    private static void Search(ArrayList<String> arraylist,String word) {

        for(String s: arraylist){
            if(s.contains(word)){
                System.out.println(arraylist.indexOf(s));
            }
        }
    }
}
