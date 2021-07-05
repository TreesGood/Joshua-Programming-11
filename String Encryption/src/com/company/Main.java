package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("What would you like to encode. 'x' to exit");

            String Input = scan.nextLine();

            int length = Input.length();

            String Output = "";

            if(Input.equals("x")){

                System.out.println("Thank you for using this encoder");

                break;
            }

            for(int i = Input.length(); i>0; i--){

                Output += Input.substring(length-1,length);

                length--;
            }
            System.out.println(Output);

        }
    }
}
