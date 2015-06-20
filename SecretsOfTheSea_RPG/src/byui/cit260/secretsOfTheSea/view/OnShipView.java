/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

/**
 *
 * @author SDababneh
 */
public class OnShipView extends View{
 
    public OnShipView(){
        super("You are now aboard your ship.  What would you like to do?"
                + "\n"
                + "\n Please choose an option below:"
                + "\n L - Launch the ship"
                + "\n D - Dock/Leave the ship"
                + "\n W - Work on(Repair) the ship"
                + "\n I - View Inventory"
                + "\n V - View all Statuses"
                + "\n G - Game Menu \n");
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
                ExplorableAreasView explorableareas = new ExplorableAreasView();
		return true;
            case 'W':
		this.workOnShipControl();
		return false;
            case 'I':
		InventoryManagerView inventory = new InventoryManagerView();
		return false;
            case 'V':
		StatusesView status = new StatusesView();
		return false;
            case 'G':
		GameMenuView gameMenu = new GameMenuView();
		return false;
            default:
                System.out.println("\n Invalid choice.  Please try again.");
                return false;
        } 
        
    }
}
