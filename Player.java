
package com.mycompany.jan.ken;
import java.util.Scanner;

public class Player {
    String name;
    String gameChoice;
    int Score;
    
    Player(){Score = 0;}
    
    void setName(){
        Scanner nameSetter = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = nameSetter.nextLine();
    }
    
    
    void setChoice(){
        Scanner choiceSetter = new Scanner(System.in);
        System.out.print("Choose your pick (Rock, Paper, Scissors): ");
        gameChoice = choiceSetter.nextLine();
    }
    
    
    void incrementScore(){Score++;}
}
