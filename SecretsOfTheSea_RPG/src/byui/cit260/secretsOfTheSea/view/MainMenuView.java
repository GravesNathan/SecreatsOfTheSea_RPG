/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class MainMenuView {
    
    //brandon notes
    //start here
    //initialize here and it's accessible throughout class.
   NewGameControl recordName = null; //again why are we creating the memory later in line 30 instead of here?
    
    //combined two new game functions to get this single one.
    public void newGame(){
        String userName;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Greetings Captain, welcome to the port-city of Rexburg, how shall we address you?");
        userName = keyboard.nextLine();
        userName = userName.trim();
        recordName = new NewGameControl();//...construcotr...?
        recordName.setPlayerName(userName); //passing input from view to control layer
        System.out.println("Welcome " + recordName.getPlayer1Name() +
                ", let's begin your adventures in Secrets of the Sea.");

        //this.chooseDifficulty();
        //this.selectShip();
    }
    
    public void chooseDifficulty(){
        char difficultyLevel;
        Scanner reader = new Scanner(System.in);
        difficultyLevel = Character.toUpperCase(reader.next().charAt(0));
    }
    
    public void selectShip(){
        char shipChoice;
        Scanner reader = new Scanner(System.in);
        shipChoice = Character.toUpperCase(reader.next().charAt(0));
    }
    
    public void openHelp(){
        System.out.println("openHelp fucntion called");
    }
    
    public void loadGame(){
        System.out.println("loadGame fucntion called");
    }
    
    public void quitGame(){
        System.out.println("quitGame fucntion called");
    }

    private void setPlayerName(String userName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
