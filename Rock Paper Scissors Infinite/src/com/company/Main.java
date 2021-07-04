package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continueplaying = true;

        System.out.println("Choose rock paper or scissors 'r' for rock 'p' for paper and 's' for scissors. To exit choose 'x'");

        int loses = 0;

        int wins = 0;

        String seperate = "*************************************************************";

        int timesplayed = 0;

        while (true) {

            System.out.println(seperate + "\nWins: " + wins + "\tLoses: " + loses);

            System.out.println("Players Choice:");

            //gets the choice of the player
            String PlayerInput = scan.next();

            String PlayerChoice = null;

            //tests if player choice is valid and converts input to rock, paper or scissors
            if ((!PlayerInput.equals("r")) && (!PlayerInput.equals("p")) && (!PlayerInput.equals("s"))&&(!PlayerInput.equals("x"))) {

                System.out.println("Invalid selection please play again.");

            } else {
                if (PlayerInput.equals("r")) {
                    PlayerChoice = "rock";


                } else if (PlayerInput.equals("p")) {

                    PlayerChoice = "paper";

                } else if (PlayerInput.equals("s")) {

                    PlayerChoice = "scissors";


                } else if (PlayerInput.equals("x")) {

                    System.out.println("Thank You For Playing!");

                    break;
                }


                //generates random computer choice
                String ComputerChoice = null;

                Double random = Math.random();

                if (random <= 1.0 / 3.0) {
                    ComputerChoice = "rock";

                } else if (random > 1.0 / 3.0 && random <= 2.0 / 3.0) {

                    ComputerChoice = "scissors";

                } else if (random > 2.0 / 3.0) {

                    ComputerChoice = "paper";
                }


                //determines who wins and the choices that were selected

                String Choices = "\nComputer Choice: " + ComputerChoice + "\tPlayer Choice: " + PlayerChoice;

                String L = "You Lose!";

                String W = "You Win!";

                if (PlayerChoice.equals(ComputerChoice)) {

                    System.out.println("Draw!" + Choices);

                } else if (PlayerChoice.equals("paper")) {

                    if (ComputerChoice.equals("rock")) {

                        System.out.println(W + Choices);

                        wins++;

                    } else if (ComputerChoice.equals("scissors")) {

                        System.out.println(L + Choices);

                        loses++;

                    }
                } else if (PlayerChoice.equals("rock")) {

                    if (ComputerChoice.equals("scissors")) {

                        System.out.println(W + Choices);

                        wins++;

                    } else if (ComputerChoice.equals("paper")) {

                        System.out.println(L + Choices);

                        loses++;

                    }
                } else if (PlayerChoice.equals("scissors")) {

                    if (ComputerChoice.equals("paper")) {

                        System.out.println(W + Choices);

                        wins++;

                    } else if (ComputerChoice.equals("rock")) {

                        System.out.println(L + Choices);

                        loses++;

                    }
                }

            }
            }
        }
    }
