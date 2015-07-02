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
    
    private SelectedShip selectedShip = null;
    private Ships[] ship = null;
    int baseStats = 5;
            
    public ShipSelectionControl(int tempShipChoice){
    
        this.createShips();
        this.assignShip(tempShipChoice, selectedShip);
        selectedShip.setShipChoice(tempShipChoice);
    }
    
    public void createShips(){
        ship = new Ships[4];//Initialize an array of 4 ship objects
        for (int i=0; i<4; i++)
            ship[i] = new Ships();
        
        //ship0
        ship[0].setName("Submersible");
        ship[0].setDescription("Sneak in, deceive leaders, slide away");
        ship[0].setCargoCapSize(-1);
        ship[0].setMorale(0);
        ship[0].setSpeed(0);
        ship[0].setDefense(1);
        ship[0].setDeceit(1);
        ship[0].setDiplomacy(1);
        ship[0].setIntimidation(0);
        ship[0].setBribery(0);
        
        String ship0Info = ship[0].toString();
        //System.out.println(ship0Info);
        
        //ship1
        ship[1].setName("Ironclad");
        ship[1].setDescription("Highest Intimidation and defense of the game");
        ship[1].setCargoCapSize(0);
        ship[1].setMorale(0);
        ship[1].setSpeed(-1);
        ship[1].setDefense(1);
        ship[1].setDeceit(-1);
        ship[1].setDiplomacy(0);
        ship[1].setIntimidation(1);
        ship[1].setBribery(0);
        
        String ship1Info = ship[1].toString();
        //System.out.println(ship1Info);
        
        //ship2
        ship[2].setName("Galley");
        ship[2].setDescription("Higher Supplies, better trade opportunities");
        ship[2].setCargoCapSize(1);
        ship[2].setMorale(-1);
        ship[2].setSpeed(0);
        ship[2].setDefense(-1);
        ship[2].setDeceit(0);
        ship[2].setDiplomacy(0);
        ship[2].setIntimidation(-1);
        ship[2].setBribery(1);
        
        String ship2Info = ship[2].toString();
        //System.out.println(ship2Info);
        
        //ship3
        
        ship[3].setName("Clipper");
        ship[3].setDescription("Speed across the open sea, you'll with any race with this ship.");
        ship[3].setCargoCapSize(0);
        ship[3].setMorale(1);
        ship[3].setSpeed(1);
        ship[3].setDefense(-1);
        ship[3].setDeceit(0);
        ship[3].setDiplomacy(1);
        ship[3].setIntimidation(0);
        ship[3].setBribery(-1);
        
        String ship3Info = ship[3].toString();
        //System.out.println(ship3Info);
        
        
        //SelectedShip Set & Print
        selectedShip = new SelectedShip();
        //Set the Default stats here, selected ship stats are adjusted + and - based
        //on the player's choice.  This is the base for all ships.
        selectedShip.setName("baseStats");
        selectedShip.setDescription("Ship not Chosen yet");
        selectedShip.setCargoCapSize(baseStats);
        selectedShip.setMorale(baseStats);
        selectedShip.setSpeed(baseStats);
        selectedShip.setDefense(baseStats);
        selectedShip.setDeceit(baseStats);
        selectedShip.setDiplomacy(baseStats);
        selectedShip.setIntimidation(baseStats);
        selectedShip.setBribery(baseStats);
        selectedShip.setShipHealth(baseStats);
    }
    
    public void assignShip(int tempShipChoice1, SelectedShip selectedShip){
        for (int i=0; i<4; i++){
            if ( i == tempShipChoice1){
                selectedShip.setName(ship[i].getName() );
                selectedShip.setDescription(ship[i].getDescription());
                selectedShip.setCargoCapSize(ship[i].getCargoCapSize());
                selectedShip.setMorale(ship[i].getMorale());
                selectedShip.setSpeed(ship[i].getSpeed());
                selectedShip.setDefense(ship[i].getDefense());
                selectedShip.setDeceit(ship[i].getDeceit());
                selectedShip.setDiplomacy( ship[i].getDiplomacy());
                selectedShip.setIntimidation(ship[i].getIntimidation());
                selectedShip.setBribery(ship[i].getBribery());
                selectedShip.setShipHealth(ship[i].getHealth());
                return;  
                //WEEK 10 IA
            }
        }
    }
    
    @Override
    public String toString() {
        String shipsPrint = "\n";
        for (int i=0; i<4; i++){
                ship[i].setCargoCapSize(baseStats + ship[i].getCargoCapSize());
                ship[i].setMorale(baseStats + ship[i].getMorale());
                ship[i].setSpeed(baseStats + ship[i].getSpeed());
                ship[i].setDefense(baseStats + ship[i].getDefense());
                ship[i].setDeceit(baseStats + ship[i].getDeceit());
                ship[i].setDiplomacy(baseStats + ship[i].getDiplomacy());
                ship[i].setIntimidation(baseStats + ship[i].getIntimidation());
                ship[i].setBribery(baseStats + ship[i].getBribery());
                ship[i].setHealth(baseStats + ship[i].getHealth());
                
            shipsPrint += ("\n\nPress " + i + " to select this ship:"
                    + "\nname= " + ship[i].getName()
                    + "\ndescription= " + ship[i].getDescription() 
                    + "\nMax Cargo= " + ship[i].getCargoCapSize() 
                    + ", morale= " + ship[i].getMorale()
                    + ", speed= " + ship[i].getSpeed()
                    + ", defense " + ship[i].getDefense()
                    + "\ndeceit= " + ship[i].getDeceit()
                    + ", Diplomacy= " + ship[i].getDiplomacy()
                    + ", intimidation= " + ship[i].getIntimidation()
                    + ", bribery " + ship[i].getBribery());
        }
        return shipsPrint;
    }
    
    public String getUserShip(){
        return selectedShip.getName();
    }
}
