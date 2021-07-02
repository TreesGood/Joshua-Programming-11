package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //prompts the player to choose an option
        System.out.println("Choose rock paper or scissors 'r' for rock 'p' for paper and 's' for scissors");

        //gets the choice of the player
        String PlayerInput = scan.next();
        String PlayerChoice = "something";

        //tests if player choice is valid and converts input to rock, paper or scissors
        if(PlayerInput.equals("r")){
            PlayerChoice = "rock";


        }else if(PlayerInput.equals("p")){
            PlayerChoice = "paper";

        }
        else if (PlayerInput.equals("s")){
            PlayerChoice = "scissors";


        }else{
            //informs the player if their selection was invalid
            System.out.println("Invalid selection please play again.");
        }


        //generates random computer choice
        String ComputerChoice ="something";

        Double random = Math.random();

        if(random <= 1.0/3.0){
            ComputerChoice = "rock";
        }
        else if(random > 1.0/3.0 && random <= 2.0/3.0){
            ComputerChoice = "scissors";
        }
        else if (random >2.0/3.0){
            ComputerChoice = "paper";
        }


        //determines who wins and the choices that were selected

        String Choices = "\nComputer Choice: "+ ComputerChoice+ "\tPlayer Choice: "+ PlayerChoice;

        if(PlayerChoice.equals(ComputerChoice)){
            System.out.println("Draw!"+Choices);

        }else if(PlayerChoice.equals("paper")){

            if(ComputerChoice.equals("rock")){
                System.out.println("You Win!"+ Choices);

            }else if(ComputerChoice.equals("scissors")){
                System.out.println("You Lose!"+Choices);
            }
        }else if(PlayerChoice.equals("rock")){

            if(ComputerChoice.equals("scissors")){
                System.out.println("You Win!"+ Choices);

            }else if(ComputerChoice.equals("paper")){
                System.out.println("You Lose!"+Choices);

            }
        }else if(PlayerChoice.equals("scissors")){

            if(ComputerChoice.equals("paper")){
                System.out.println("You Win!"+ Choices);

            }else if(ComputerChoice.equals("rock")){
                System.out.println("You Lose!"+Choices);

            }

        }
    }
}
