package com.mycompany.jan.ken;
import java.util.Random;

public class comPlayer extends Player {

   comPlayer(){Score = 0;}
 
   void setChoice(){
        Random comChoice = new Random();
        int choiceNum = comChoice.nextInt(1, 4);
        
        if     (choiceNum == 1){gameChoice = "Rock";}
        else if(choiceNum == 2){gameChoice = "Paper";}
        else if(choiceNum == 3){gameChoice = "Scissors";}
    }
   
   void setName(){name = "Com";}
    
}
