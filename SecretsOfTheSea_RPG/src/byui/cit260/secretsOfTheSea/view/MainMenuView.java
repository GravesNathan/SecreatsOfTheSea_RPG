/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.InventoryControl;
import byui.cit260.secretsOfTheSea.control.MapControl;
import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;
import byui.cit260.secretsOfTheSea.exceptions.ExplorableAreasException;
//import byui.cit260.secretsOfTheSea.model.Player;
import byui.cit260.secretsOfTheSea.exceptions.MapControlException;
import byui.cit260.secretsOfTheSea.exceptions.ShipSelectionException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class MainMenuView {
    
    //brandon notes
    //start here
    //initialize here and it's accessible throughout class.
   private NewGameControl newUserSettings = null; //again why are we creating the memory later in line 30 instead of here?
   private MapControl mainMap = null;
   protected final BufferedReader keyboard = SecretsOfTheSea_RPG.getInFile();

//   private ShipSelectionControl userShip = null; 
//   MapControl createMap = null;
   private ShipSelectionControl assignPlayerShip = null; 
   private InventoryControl inventory = null; 
   InputView input = new InputView();
    //combined two new game functions to get this single one.
    public void newGame(){
        //Input Name
        System.out.println("Greetings Captain, welcome to the port-city of Rexburg, "
                + "how shall we address you?");
        String userName = input.stringInput();
        //Choose difficulty
        char difficultyLevel;
        do{
        System.out.println("Please select your difficulty.  "
                + "\nE = Easy"
                + "\nN = Normal"
                + "\nH = Hard");
        //difficultyLevel = Character.toUpperCase(difficultyReader.next().charAt(0));
        difficultyLevel = input.charInput();
        if (!((difficultyLevel == 'E') || (difficultyLevel == 'N') || (difficultyLevel == 'H')))
            System.out.println("\n Invalid Input.  Please try again.");
         }while(!((difficultyLevel == 'E') || (difficultyLevel == 'N') || (difficultyLevel == 'H') || (difficultyLevel == 'S')));

//Try - Catch test code
        try{
        mainMap = new MapControl (difficultyLevel);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        
        
        }catch  (IndexOutOfBoundsException oub) {
                System.out.println(oub.getMessage() + "\n" + oub.getStackTrace() + "\n");
        
        }catch (ExplorableAreasException eae) {
                System.out.println(eae.getMessage());
            System.out.println("\nReturning to start program view.  Press Enter to Proceed");
            String pressEnter = null;
            String value = " ";
        try {
            pressEnter = keyboard.readLine();
        } catch (IOException ioe) {
            System.out.println("\nError obtaining input\n");
        }            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();//Does this only work with an independent executable?
        }
        
        //Choose Ship
        String charShipChoice = "Raft";
        int shipChoice = -1;
        
        ShipSelectionControl tempShips = null;
        try {
        tempShips = new ShipSelectionControl(0);
                } catch (ShipSelectionException sse) {
                    System.out.println(sse.getMessage());
                System.out.println("\n You must enter a valid number or we will give you a raft."
                + " Try again, you won't survive on a raft.");
        }
        do{
        System.out.println("\n Please select your ship with with options 0 through 3"
                + tempShips.toString());
        shipChoice = input.intInput();

        //if (!((shipChoice == 0) || ( shipChoice == 1) || ( shipChoice == 2) || ( shipChoice ==3)))
        //    System.out.println("Invalid Input.");
        }while(!( (shipChoice == 0) || ( shipChoice == 1) || ( shipChoice == 2) || ( shipChoice ==3) ));
        
        try {
        assignPlayerShip = new ShipSelectionControl(shipChoice);
            } catch (ShipSelectionException sse) {
                    System.out.println(sse.getMessage());
                System.out.println("\n You must enter a valid number or we will give you a raft."
                + " Try again, you won't survive on a raft.");
        }
                
        newUserSettings = new NewGameControl(userName);
        inventory = new InventoryControl(assignPlayerShip);
        
        try {
        System.out.println("Welcome " + newUserSettings.getPlayerName() +
                ", let's begin your " + mainMap.getUserDifficulty() + " adventures in Secrets of the Sea."
                + "\n Prepare to board your " + assignPlayerShip.getShipName() +  " and set sails on the open seas.");
        } catch (MapControlException me_difficulty) {
            System.out.println(me_difficulty.getMessage());
        }
        
        ExplorableAreasView beginExplore = new ExplorableAreasView(newUserSettings, mainMap, assignPlayerShip, inventory);
    }
    
    public void openHelp(){
        System.out.println("openHelp fucntion called");
            //load Help Menu into view
        HelpMenuView helpMenu = new HelpMenuView();
//        helpMenu.displayMenu();
        
    }
    
    public void loadGame(){
        System.out.println("loadGame fucntion called");
    }
    
    public void quitGame(){
        System.out.println("quitGame fucntion called");
    }
    
}
