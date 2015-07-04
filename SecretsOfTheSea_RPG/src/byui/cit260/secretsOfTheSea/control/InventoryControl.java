/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.Cargo;
import byui.cit260.secretsOfTheSea.model.Storage;

/**
 *
 * @author Nathan
 */
public class InventoryControl {
    
    Cargo cargo;
    Storage storage;
    
    public InventoryControl(ShipSelectionControl playerShip){
        cargo = new Cargo();
        storage = new Storage();
        shipAdjustments(playerShip);
    }
    
    public void shipAdjustments(ShipSelectionControl playerShip){
        playerShip.getShipName();
    }
}
