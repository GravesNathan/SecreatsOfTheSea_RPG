/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.StartGameControl;
import byui.cit260.secretsOfTheSea.model.Player;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class MainMenuView {
    
    public void startNewGame(){
        //Player playerName = new Player();
        this.nameInput();
        //this.chooseDifficulty();
        //this.selectShip();
        System.out.println("Welcome " + Player.getName() + ", let's begin your adventures in Secrets of the Sea.");
    }
    
    public void nameInput(){
        String userName;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Greetings, Captain to the port-city of Rexburg, how shall we address you?");
        userName = keyboard.nextLine();
        userName = userName.trim();
        StartGameControl recordName = new StartGameControl();
        recordName.setPlayerName(userName); //passing input from view to control layer
        
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
