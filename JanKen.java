package com.mycompany.jan.ken;
import java.util.Scanner;

public class JanKen {
    public static void main(String[] args) {
        Scanner menuChoice = new Scanner(System.in);
        Scanner menuBack = new Scanner(System.in);
        
        while (true){
            displayMenu();
            int choice = menuChoice.nextInt();
            
            if(choice == 1){
                startGame();
            } else if(choice == 2){
                displayRules();
                String back = menuBack.nextLine();
                continue;
            } else if(choice == 0){
                System.out.print("\nGoodbye.");
                break;
            } else{
                System.out.print("\nInvalid input");
                continue;
            }
        }
        
        menuChoice.close();
        menuBack.close();
    }
    
    static void displayMenu(){
        System.out.print(
                "=======| Welcome to Jan-Ken! |=======\n\n"
                + "1. Play\n"
                + "2. Rules\n" 
                + "0. Exit\n"
                + "\nEnter your choice: ");
    }
    
    static void startGame(){
        Player player = new Player();
        comPlayer com = new comPlayer();
        Scanner replay = new Scanner(System.in);
        player.setName();
        com.setName();
        
        while(true){
            System.out.println("=======| Welcome to Jan-Ken! |=======\n");
            player.setChoice();
            com.setChoice();
            System.out.println("=====================================\n"
                             + "Jan-Ken-Pon!");
            System.out.println(player.name + ": " + player.gameChoice);
            System.out.println(com.name + ": " + com.gameChoice);
            System.out.println("=====================================\n");
        
            if((player.gameChoice.equalsIgnoreCase("rock") && com.gameChoice.equals("Scissors"))
                    ||(player.gameChoice.equalsIgnoreCase("scissors") && com.gameChoice.equals("Paper"))
                    ||(player.gameChoice.equalsIgnoreCase("paper") && com.gameChoice.equals("Rock"))){
            
                System.out.println(player.name + " won!");
                player.incrementScore();
            
            } else if((player.gameChoice.equalsIgnoreCase("rock") && com.gameChoice.equals("Paper"))
                    ||(player.gameChoice.equalsIgnoreCase("scissors") && com.gameChoice.equals("Rock"))
                    ||(player.gameChoice.equalsIgnoreCase("paper") && com.gameChoice.equals("Scissors"))){
            
                System.out.println(com.name + " won!");
                com.incrementScore();
            
            } else if ((player.gameChoice.equalsIgnoreCase("rock") && com.gameChoice.equals("Rock"))
                    ||(player.gameChoice.equalsIgnoreCase("scissors") && com.gameChoice.equals("Scissors"))
                    ||(player.gameChoice.equalsIgnoreCase("paper") && com.gameChoice.equals("Paper"))){
            
                System.out.println("Draw!");
                
            } else {
                System.out.println("Invalid input, try again.\n");
                continue;
            }
            
            System.out.println(player.name + "\t" + com.name);
            System.out.println(player.Score + "\t" + com.Score);
            System.out.println("\nPlay again? (y/n)");
            String playAgain = replay.nextLine();
            
            if(playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y")){
                continue;
            }
            else if(playAgain.equalsIgnoreCase("no") || playAgain.equalsIgnoreCase("n")){
                break;
            }
        }
    }
    
    static void displayRules(){
        System.out.println(
                "\n===========| Game rules |============\n"
                + "A simple game of Rock-Paper-Scissors\n"
                + "1. The game starts and the player picks one of three options: Rock, Paper or Scissors.\n"
                + "2. After you make your pick, the AI will also pick one of the three options.\n"
                + "3. The winner is determined as follows\n"
                    + "\t-Rock beats Scissors.\n"
                    + "\t-Scissors beats Paper\n"
                    + "\t-Paper beats Rock\n"
                + "4. When the player and AI make the same choice it's a draw.\n"
                + "\nEnter anything to go back to menu:");
    }
}