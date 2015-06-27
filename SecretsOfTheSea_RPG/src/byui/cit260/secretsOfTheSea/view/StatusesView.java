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
 * @author Nathan
 */
public class StatusesView extends View{
    
    public StatusesView(NewGameControl username, MapControl map, ShipSelectionControl playerShip){
        super("\n Current Game Statuses"
                + "\nC - Close Inventory Manager", null, null, null);
               // + "\nG - Game Menu View", username, map, playerShip);
        //Took out so we don't have a loop of game menu and statuses view
    }
    
        
    @Override
    public boolean doAction(char entry){
        char value = entry;
        
        switch (value) {
//            case 'G':  Took out so we don't have a loop of game menu and statuses view
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
