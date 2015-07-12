/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.GameControl;
import byui.cit260.secretsOfTheSea.control.InventoryControl;
import byui.cit260.secretsOfTheSea.control.MapControl;
import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;
import byui.cit260.secretsOfTheSea.exceptions.ExplorableAreasException;
//import byui.cit260.secretsOfTheSea.model.Player;
import byui.cit260.secretsOfTheSea.exceptions.MapControlException;
import byui.cit260.secretsOfTheSea.exceptions.ShipSelectionException;
import byui.cit260.secretsOfTheSea.model.Map;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class LoadGameView {
    
    //brandon notes
    //start here
    //initialize here and it's accessible throughout class.
   private NewGameControl newUserSettings = null; //again why are we creating the memory later in line 30 instead of here?
   private MapControl mainMap = null;
   
   private final BufferedReader keyboard = SecretsOfTheSea_RPG.getInFile();
   private final PrintWriter console = SecretsOfTheSea_RPG.getOutFile();

   
   private ShipSelectionControl assignPlayerShip = null; 
   private InventoryControl inventory = null; 
   InputView input = new InputView();
    //combined two new game functions to get this single one.
    public void newGame(){
        //Input Name
        this.console.println("Greetings Captain, welcome to the port-city of Rexburg, "
                + "how shall we address you?");
        String userName = input.stringInput();
        //Choose difficulty
        //Load the loaded map before creating new one just incase it overwrites.
        //This way the map isn't re-randomized and can be set again afterwards.
        //I'd almost be better of creating all this with default values and then loaded the file in the startProgramView.
        char difficultyLevel = MapControl.getDifficulty();
        int LoadedGrid[][] = MapControl.getMapGrid();
        Map Loadedmap = MapControl.getMapOne();
//Try - Catch test code
        try{
        mainMap = new MapControl (difficultyLevel);
        } catch (MapControlException me) {
            this.console.println(me.getMessage());
        
        
        }catch  (IndexOutOfBoundsException oub) {
                this.console.println(oub.getMessage() + "\n" + oub.getStackTrace() + "\n");
        
        }catch (ExplorableAreasException eae) {
                this.console.println(eae.getMessage());
            ErrorView.display(this.getClass().getName(),"Returning to start program view.  Press Enter to Proceed");
            String pressEnter = null;
            String value = " ";
        try {
            pressEnter = keyboard.readLine();
        } catch (IOException ioe) {
            ErrorView.display(this.getClass().getName(),"Error obtaining input\n");
        }            
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.startProgram();//Does this only work with an independent executable?
        }
        
        //Choose Ship
        int shipChoice = ShipSelectionControl.getChozenShip();
        
        try {
        assignPlayerShip = new ShipSelectionControl(0);
            } catch (ShipSelectionException sse) {
                    ErrorView.display(this.getClass().getName(),sse.getMessage());
                ErrorView.display(this.getClass().getName(),"\n You must enter a valid number or we will give you a raft."
                + " Try again, you won't survive on a raft.");
        }
                
        newUserSettings = new NewGameControl(userName);
        inventory = new InventoryControl(assignPlayerShip);
        
        try {
        this.console.println("Welcome " + newUserSettings.getPlayerName() +
                ", let's begin your " + mainMap.getUserDifficulty() + " adventures in Secrets of the Sea."
                + "\n Prepare to board your " + assignPlayerShip.getShipName() +  " and set sails on the open seas.");
        } catch (MapControlException me_difficulty) {
            ErrorView.display(this.getClass().getName(),me_difficulty.getMessage());
        }
        
        ExplorableAreasView beginExplore = new ExplorableAreasView(newUserSettings, mainMap, assignPlayerShip, inventory);
    }
    
    public void openHelp(){
        this.console.println("openHelp fucntion called");
            //load Help Menu into view
        HelpMenuView helpMenu = new HelpMenuView();
        
    }
    
    public void quitGame(){
        this.console.println("quitGame fucntion called");
    }
    
}
