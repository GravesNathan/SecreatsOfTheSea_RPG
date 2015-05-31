/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.SelectedShip;
import byui.cit260.secretsOfTheSea.model.Ships;

/**
 *
 * @author Nathan
 */
public class ShipSelectionControl {
    
    public void assignShip( char playerChoice, Ships[] ship, SelectedShip selectedShip, CurrentStatus status){
        for (int i=0; i<4; i++){
            if ( i == Character.getNumericValue(playerChoice)){
                selectedShip.setName(ship[i].getName() );
                selectedShip.setDescription(ship[i].getDescription());
                selectedShip.setCargoCapSize(5 + ship[i].getCargoCapSize());
                selectedShip.setMorale(5 + ship[i].getMorale());
                selectedShip.setSpeed(5 + ship[i].getSpeed());
                selectedShip.setDefense(5 + ship[i].getDefense());
                selectedShip.setDeceit(5 + ship[i].getDeceit());
                selectedShip.setDiplomacy(5 + ship[i].getDiplomacy());
                selectedShip.setIntimidation(5 + ship[i].getIntimidation());
                selectedShip.setBribery(5 + ship[i].getBribery());
                selectedShip.setShipHealth(5);
                return;
            }
        }
        status.setStatusMessage("Invalid Ship choice, please select 0 through 3");
    }
}
