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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
            ArrayList<Items> cargo,
            ArrayList<Items> storage,
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
            output.writeObject(cargo);
            output.writeObject(storage);
        }
        catch(IOException e){
            throw new GameControlException(e.getMessage());
        }
    }


    public static void loadGame(String filePathInput)
                throws GameControlException{
        
        String username = null;
        int diffMultiplier = -1;
        LocationDetails[] location = null;
        int[][] mapGrid = null;//May have an issue as it's not stored in model.
        //should fix that.
        Map mapOne = null;
        int numStorms = -1;
        Storms[] storms = null;
        String tempWarning = null;
        char difficulty = ' ';
        SelectedShip selectedShip = null;
        ArrayList<Items> cargo = null;
        ArrayList<Items> storage = null; 

        try (FileInputStream fips = new FileInputStream(filePathInput)){
            ObjectInputStream inputData = new ObjectInputStream(fips);
            
            username = (String) inputData.readObject();
            diffMultiplier = (int) inputData.readObject();
            location = (LocationDetails[]) inputData.readObject();
            mapGrid = (int[][]) inputData.readObject();
            mapOne = (Map) inputData.readObject();
            numStorms = (int) inputData.readObject();
            storms = (Storms[]) inputData.readObject();
            tempWarning = (String) inputData.readObject();
            difficulty = (char) inputData.readObject();
            selectedShip = (SelectedShip) inputData.readObject();
            cargo = (ArrayList<Items>) inputData.readObject();
            storage = (ArrayList<Items>) inputData.readObject();

        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        NewGameControl.setPlayerName(username);  
        MapControl.setDiffMultiplier(diffMultiplier);
        MapControl.setLocation(location);
        MapControl.setMapGrid(mapGrid);
        MapControl.setMapOne(mapOne);
        MapControl.setNumStorms(numStorms);
        MapControl.setStorms(storms);
        MapControl.setTempWarning(tempWarning);
        MapControl.setDifficulty(difficulty);
        ShipSelectionControl.setSelectedShip(selectedShip);
        InventoryControl.setCargo(cargo);
        InventoryControl.setStorage(storage);
                
        //byui.cit260.secretsOfTheSea.model.setMapOne(game);
    }

}
