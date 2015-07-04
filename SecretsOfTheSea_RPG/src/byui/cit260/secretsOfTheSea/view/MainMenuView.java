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
import java.util.Scanner;

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
//   private ShipSelectionControl userShip = null; 
//   MapControl createMap = null;
   private ShipSelectionControl assignPlayerShip = null; 
   private InventoryControl inventory = null; 
    //combined two new game functions to get this single one.
    public void newGame(){
        //Input Name
        String userName;
        Scanner nameReader = new Scanner(System.in);
        System.out.println("Greetings Captain, welcome to the port-city of Rexburg, how shall we address you?");
        userName = nameReader.nextLine();
        userName = userName.trim();
        
        //Choose difficulty
        char difficultyLevel;
        do{
        System.out.println("Please select your difficulty.  "
                + "\nE = Easy"
                + "\nN = Normal"
                + "\nH = Hard");
        Scanner difficultyReader = new Scanner(System.in);
        difficultyLevel = Character.toUpperCase(difficultyReader.next().charAt(0));
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
            Scanner keyboard = new Scanner(System.in);
            pressEnter = keyboard.nextLine();
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
        Scanner shipReader = new Scanner(System.in);
        charShipChoice = shipReader.nextLine();
        charShipChoice = charShipChoice.trim();
        
//Try - Catch test code
//        try {
        shipChoice = Integer.parseInt(charShipChoice);
//        } catch (NumberFormatException nf) {
//            System.out.println("\n You must enter a valid number or we will give you a raft."
//            + " Try again, you won't survive on a raft.");
//        }
        
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
