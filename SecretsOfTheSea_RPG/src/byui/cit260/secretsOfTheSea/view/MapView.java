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
import java.io.BufferedReader;
import java.io.PrintWriter;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class MapView{
    
    private final BufferedReader keyboard = SecretsOfTheSea_RPG.getInFile();
    private final PrintWriter console = SecretsOfTheSea_RPG.getOutFile();
    private KeyListenerView keyDetect = null;
    
    public MapView(NewGameControl username, MapControl map, ShipSelectionControl playerShip,
            InventoryControl inventory){
        console.println( map.toString() + "\n"
                + "Please enter an option below or use the arrow keys to move."
                + "\n D - Dock ship"
                + "\n W - Work on(Repair) the ship"
                + "\n I - View Inventory"
                + "\n V - View all Statuses"
                + "\n M - View Map"
                + "\n G - Game Menu");
        //keyDetect = new KeyListenerView();
    }
        

    
    //@Override
    public boolean doAction(char entry){
        return false;//get rid of error
    }

}