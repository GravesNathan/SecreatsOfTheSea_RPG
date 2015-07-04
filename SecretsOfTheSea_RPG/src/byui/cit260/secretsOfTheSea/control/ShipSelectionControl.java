/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.SelectedShip;
import byui.cit260.secretsOfTheSea.model.Ships;
import byui.cit260.secretsOfTheSea.exceptions.ShipSelectionException;

/**
 *
 * @author Nathan
 */
public class ShipSelectionControl {
    
    private SelectedShip selectedShip = new SelectedShip();;
    private Ships[] ship = null;
    int baseStats = 5;
            
    public ShipSelectionControl(int tempShipChoice)
            throws ShipSelectionException{
    
        this.createShips();
        this.assignShip(tempShipChoice);
        selectedShip.setShipChoice(tempShipChoice);
    }
    
    public void createShips(){
        ship = new Ships[4];//Initialize an array of 4 ship objects
        for (int i=0; i<4; i++)
            ship[i] = new Ships();
        //End of creating the object.
        //Begin setting ship stats
        //ship0
        ship[0].setName("Submersible");
        ship[0].setDescription("Sneak in, deceive leaders, slide away");
        ship[0].setCargoCapSize(20);
        ship[0].setMorale(0);
        ship[0].setSpeed(0);
        ship[0].setDefense(1);
        ship[0].setDeceit(1);
        ship[0].setDiplomacy(1);
        ship[0].setIntimidation(0);
        ship[0].setBribery(0);
        ship[0].setHealth(0);
        
        String ship0Info = ship[0].toString();
        //System.out.println(ship0Info);
        
        //ship1
        ship[1].setName("Ironclad");
        ship[1].setDescription("Highest Intimidation and defense of the game");
        ship[1].setCargoCapSize(60);
        ship[1].setMorale(0);
        ship[1].setSpeed(-1);
        ship[1].setDefense(1);
        ship[1].setDeceit(-1);
        ship[1].setDiplomacy(0);
        ship[1].setIntimidation(1);
        ship[1].setBribery(0);
        ship[1].setHealth(0);
        
        String ship1Info = ship[1].toString();
        //System.out.println(ship1Info);
        
        //ship2
        ship[2].setName("Galley");
        ship[2].setDescription("Higher Supplies, better trade opportunities");
        ship[2].setCargoCapSize(100);
        ship[2].setMorale(-1);
        ship[2].setSpeed(0);
        ship[2].setDefense(-1);
        ship[2].setDeceit(0);
        ship[2].setDiplomacy(0);
        ship[2].setIntimidation(-1);
        ship[2].setBribery(1);
        ship[2].setHealth(0);
        
        String ship2Info = ship[2].toString();
        //System.out.println(ship2Info);
        
        //ship3
        
        ship[3].setName("Clipper");
        ship[3].setDescription("Speed across the open sea, you'll with any race with this ship.");
        ship[3].setCargoCapSize(40);
        ship[3].setMorale(1);
        ship[3].setSpeed(1);
        ship[3].setDefense(-1);
        ship[3].setDeceit(0);
        ship[3].setDiplomacy(1);
        ship[3].setIntimidation(0);
        ship[3].setBribery(-1);
        ship[3].setHealth(0);
        String ship3Info = ship[3].toString();
        //System.out.println(ship3Info);
        
    /*    
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
            */
    }
    
    public void assignShip(int tempShipChoice1)
            throws ShipSelectionException{
        
        for (int i=0; i<4; i++){
            if ( i == tempShipChoice1){
                selectedShip.setName(ship[i].getName() );
                selectedShip.setDescription(ship[i].getDescription());
                selectedShip.setCargoCapSize(baseStats *10 + ship[i].getCargoCapSize());
                selectedShip.setMorale(baseStats + ship[i].getMorale());
                selectedShip.setSpeed(baseStats + ship[i].getSpeed());
                selectedShip.setDefense(baseStats + ship[i].getDefense());
                selectedShip.setDeceit(baseStats + ship[i].getDeceit());
                selectedShip.setDiplomacy(baseStats + ship[i].getDiplomacy());
                selectedShip.setIntimidation(baseStats + ship[i].getIntimidation());
                selectedShip.setBribery(baseStats + ship[i].getBribery());
                selectedShip.setShipHealth(baseStats + ship[i].getHealth());
                return;  
            }
            else throw new ShipSelectionException("Error Populating Ship Details");//WEEK 10 IA
        }
    }
    
    @Override //Used to show the potential selected ships stats.  This is
    //printed to the user before choosing the ship.
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
    
    public int getShipChoice(){
        return selectedShip.getShipChoice();
    }
    
    public String getShipName(){
        return selectedShip.getName();
    }
    
    public String getDescription(){
        return selectedShip.getDescription();
    }
    
    public int getCargoCapSize(){
        return selectedShip.getCargoCapSize();
    }
    
    //These we plan to get and set as the game goes on.
    public int getMorale(){
        return selectedShip.getMorale();
    }
    
    public void setMorale(int change){
        selectedShip.setMorale(selectedShip.getMorale() + change);
    }
    
    public int getSpeed(){
        return selectedShip.getSpeed();
    }
    
    public void setSpeed(int change){
        selectedShip.setSpeed(selectedShip.getSpeed() + change);
    }
        
    public int getHealth(){
        return selectedShip.getHealth();
    }
    
    public void setHealth(int change){
        selectedShip.setHealth(selectedShip.getHealth() + change);
    }
    
    //*****************************************
    //These stats are retreivable, but not changable during game play, at least not yet.
    public int getDefense(){
       return selectedShip.getDefense();
    }
    
    public int getDeceit(){
        return selectedShip.getDeceit();
    }
    
    public int getDiplomacy(){
        return selectedShip.getDiplomacy();
    }
    
    public int getIntimidation(){
        return selectedShip.getIntimidation();
    }
    
    public int getBribery(){
        return selectedShip.getBribery();
    }
}
