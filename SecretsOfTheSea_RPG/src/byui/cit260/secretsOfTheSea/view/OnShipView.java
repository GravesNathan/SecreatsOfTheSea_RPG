/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.MapControl;
import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;

/**
 *
 * @author SDababneh
 */
public class OnShipView extends View{
 
    public OnShipView(NewGameControl username, MapControl map, ShipSelectionControl playerShip){
        super("You are now aboard your ship.  What would you like to do?"
                + "\n"
                + "\n Please choose an option below:"
                + "\n L - Launch the ship"
                + "\n D - Dock/Leave the ship"
                + "\n W - Work on(Repair) the ship"
                + "\n I - View Inventory"
                + "\n V - View all Statuses"
                + "\n M - View Map"
                + "\n G - Game Menu \n", username, map, playerShip);
            }
    
    public void launchShipControl(){
        System.out.println("launchShipControl stub");
    }
    
    public void workOnShipControl(){
        System.out.println("workOnShip stub");
    }
  
    @Override
    public boolean doAction(char entry){
        char value = entry;
        
        switch (value) {
            case 'L':
		this.launchShipControl();
		return false;
            case 'D':
                ExplorableAreasView explorableareas = new ExplorableAreasView(tempUsername, tempMap, tempPlayerShip);
		return true;
            case 'W':
		this.workOnShipControl();
		return false;
            case 'I':
		InventoryManagerView inventory = new InventoryManagerView(tempUsername, tempMap, tempPlayerShip);
		return false;
            case 'V':
		StatusesView status = new StatusesView(tempUsername, tempMap, tempPlayerShip);
		return false;
            case 'M':
                tempMap.PrintMap();
                return false;
            case 'G':
		GameMenuView gameMenu = new GameMenuView(tempUsername, tempMap, tempPlayerShip);
		return false;
            default:
                System.out.println("\n Invalid choice.  Please try again.");
                return false;
        } 
        
    }
}
