/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.MapControl;
import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;
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
   NewGameControl newUserSettings = null; //again why are we creating the memory later in line 30 instead of here?
   MapControl mainMap = null; 
   ShipSelectionControl userShip = null; 
//   MapControl createMap = null;
   ShipSelectionControl assignPlayerShip = null; 
    
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
         }while(!((difficultyLevel == 'E') || (difficultyLevel == 'N') || (difficultyLevel == 'H')));
        mainMap = new MapControl (difficultyLevel);
        
        
        //Choose Ship
        char charShipChoice = '8';
        int shipChoice = -1;
        ShipSelectionControl tempShips = new ShipSelectionControl(8);
        
        do{
        System.out.println("\n Please select your ship with with options 0 through 3"
                + tempShips.toString());
        Scanner shipReader = new Scanner(System.in);
        charShipChoice = shipReader.next().charAt(0);
        shipChoice = Character.getNumericValue(charShipChoice);
        if (!((shipChoice == 0) || ( shipChoice == 1) || ( shipChoice == 2) || ( shipChoice ==3)))
            System.out.println("Invalid Input.");
        }while(!( (shipChoice == 0) || ( shipChoice == 1) || ( shipChoice == 2) || ( shipChoice ==3) ));
        assignPlayerShip = new ShipSelectionControl(shipChoice);
        
        newUserSettings = new NewGameControl(userName); //...construcotr...?
        System.out.println("Welcome " + newUserSettings.getPlayerName() +
                ", let's begin your " + mainMap.getUserDifficulty() + " adventures in Secrets of the Sea."
                + "\n Prepare to board your " + assignPlayerShip.getUserShip() +  " and set sails on the open seas.");
        
        ExplorableAreasView beginExplore = new ExplorableAreasView();
    }
    
    //public void chooseDifficulty(){
    //    char difficultyLevel;
        
    //}
    
    /*public void selectShip(){
        char shipChoice;
        Scanner reader = new Scanner(System.in);
        shipChoice = Character.toUpperCase(reader.next().charAt(0));
    }*/
    
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

    private void setPlayerName(String userName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
