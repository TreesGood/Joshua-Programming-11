package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favourite pokemon?");
        String pokemon = scan.next();

        System.out.println("" +
                "\t★\t\t★\t\t ★ \t\t★\t★\n"+
                "\t★\t\t\t\t★\n"+
                "\t\t   ★\t▄▄▄▄▄▄▄▄▄▄\t\t   ★\n" +
                "\t   ★\t▄██▀\t\t  ▀██▄\t★\n" +
                "\t\t★ ██\t\t\t\t  ██\n" +
                "\t\t██\t\t\t\t\t\t██\t★\n" +
                "\t★  ██\t\t   ▄▄▄▄\t\t\t ██ \t ★\n" +
                "\t   ██---------██████---------██\n" +
                "\t ★ ██\t\t   ▀▀▀▀\t\t\t ██ \n" +
                "\t\t██\t\t\t\t\t\t██\n" +
                "\t\t  ██\t\t\t\t  ██\n" +
                "\t\t\t▀██▄\t\t  ▄██▀\n" +
                "\t\t\t\t▀▀▀▀▀▀▀▀▀▀");
        System.out.println("\t\t  You caught a "+pokemon+"!");
    }
}
