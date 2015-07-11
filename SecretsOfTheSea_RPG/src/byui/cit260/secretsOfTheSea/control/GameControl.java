/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.exceptions.GameControlException;
import byui.cit260.secretsOfTheSea.model.Items;
import byui.cit260.secretsOfTheSea.model.LocationDetails;
import byui.cit260.secretsOfTheSea.model.Map;
import byui.cit260.secretsOfTheSea.model.SelectedShip;
import byui.cit260.secretsOfTheSea.model.Storms;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Nathan
 */
public class GameControl {
    
    public static void saveGame(
            String username,
            int diffMultiplier,
            LocationDetails[] location,
            int[][] mapGrid,//May have an issue as it's not stored in model.
            //should fix that.
            Map mapOne,
            int numStorms,
            Storms[] storms,
            String tempWarning,
            char difficulty,
            SelectedShip selectedShip,
            ArrayList<Items> Cargo,
            ArrayList<Items> Storage,
            String filepath)
            throws GameControlException, IOException {
        
        try (FileOutputStream fops = new FileOutputStream(filepath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(username);
            output.writeObject(diffMultiplier);
            output.writeObject(location);
            output.writeObject(mapGrid);
            output.writeObject(mapOne);
            output.writeObject(numStorms);
            output.writeObject(storms);
            output.writeObject(tempWarning);
            output.writeObject(difficulty);
            output.writeObject(selectedShip);
            output.writeObject(Cargo);
            output.writeObject(Storage);
        }
        catch(IOException e){
            throw new GameControlException(e.getMessage());
        }
    }
}
