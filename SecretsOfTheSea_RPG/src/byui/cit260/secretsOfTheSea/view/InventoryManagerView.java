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
public class InventoryManagerView extends View{
    
    public InventoryManagerView(NewGameControl username, MapControl map, ShipSelectionControl playerShip, InventoryControl inventory){
        super("\n Inventory Manager"
                + "\nD - Drop Resource"
                + "\nT - Take Resource"
                + "\nV - View Resource"
                + "\nU - Use Resource"
                //+ "\nG - Game Menu View" Took off so we don't have an endless loop of inventory, game menu
                + "\nC - Close Inventory Manager", username, map, playerShip, inventory);
    }
    
    public void dropItem(){
        System.out.println("dropItem function stub");
    }
    
    public void takeItem(){
        System.out.println("takeItem function stub");
    }

    public void viewResource(){
        System.out.println("viewResourceView called (maybe in same view, separte output and prompt)");
    }
    
    public void useResource(){
        System.out.println("useResource function called.");
    }
    
        
    @Override
    public boolean doAction(char entry){
        char value = entry;
        
        switch (value) {
            case 'D':
                this.dropItem();
                return false;
            case 'T':
                this.takeItem();
                return false;
            case 'V':
                this.viewResource();//unsure if needed or purpose.  perhaps to describe what the items are used for.
                return false;
            case 'U':
                this.useResource();
                return false;
//            case 'G':  Took off so we don't have an endless loop of inventory, game menu
//                GameMenuView gamemenu = new GameMenuView();
//                return false; 
            case 'C'://closes inventory manager view
                return true;                
            default:
                System.out.println("\n" + value + " is an invalid entry. Please select an option below:");
                return false;
        }
    }
}
