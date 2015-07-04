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

/**
 *
 * @author Nathan
 */
public class GameMenuView extends View{


        
    public GameMenuView(NewGameControl username, MapControl map, ShipSelectionControl playerShip,
            InventoryControl inventory){
                super("\n Game Menu Options"
        + "\n S - Save Game"
        + "\n H - Help"
        + "\n Q - Quit Game"
        + "\n C - Close Menu"
        + "\n I - Inventory Manager"
        + "\n M - View Map"
        + "\n V - View all Statuses\n", username, map, playerShip, inventory);
 //These aren't reachable here, but aren't assignable outside this constructor...
 //Could possibly have these setup in super constructor before the prompt message...
//        tempUsername = username;  
//        tempMap = map;
//        tempPlayerShip= playerShip;


    }
    
    public void saveGame(){
        System.out.println("saveGame method called");
    }
    
    public void quitGame(){
        System.out.println("quitGame method called");
    }
    
    public void closeMenu(){
        System.out.println("closeMenu method called");
    }
    
    @Override
    public boolean doAction(char entry){
        //return false to stay in same menu, return true to exit this view to previous view
        //also return false for invalid input to repeat the view with the display function
        char value = entry;
        switch (value) {
            case 'S':
		this.saveGame();
		return false;
            case 'H':
		HelpMenuView helpMenu = new HelpMenuView();
		return false;
            case 'Q':
		this.quitGame();
		return true;
            case 'C':
		this.closeMenu();
		return true;
            case 'I':
		InventoryManagerView inventory = new InventoryManagerView(tempUsername, tempMap, tempPlayerShip, tempInventory);
		return false;
            case 'M':
                tempMap.PrintMap();
                return false;
            case 'V':
		StatusesView status = new StatusesView(tempUsername, tempMap, tempPlayerShip, tempInventory);
		return false;
            default:
                System.out.println("\n Invalid choice.  Please try again.");
                return false;
        }
    }
}
