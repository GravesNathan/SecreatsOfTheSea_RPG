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
import java.io.PrintWriter;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;


/**
 *
 * @author Nathan
 */
public class StatusesView extends View{
    
                private static final PrintWriter statusReport =
            SecretsOfTheSea_RPG.getStatusReport();
    
    public StatusesView(NewGameControl username, MapControl map, ShipSelectionControl playerShip,
            InventoryControl inventory){
        super("\n Current Game Statuses"
                + "\n C - Close Inventory Manager"
                + "\n P - Print Status Report", null, null, null, null);
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
            case 'P':
                statusReport.println("Enter User Status info here or pull from code sources");
                statusReport.close();
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\n" + value + " is an invalid entry. Please select an option below:");
                return false;
        }
    }
}
