/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

/**
 *
 * @author Nathan
 */
public class GameMenuControl {
        //Let's assume the view layer will check for valid input based upon the view they are in.
        //for example we can have a separate view when in the location they can board vs other explorable area
        //Each view only will allow the options that make sense in that view.
    public void boardShip(){
        //Task(s): player has selected to board ship.  This will change currentLocation to ship.
        //this may not be needed, the view would simply switch the layer to a onShipAtDock view.
    }
    
    public void dockShip(){
        //Player found or otherwise moved to location of an island.  The view layer gave a choice to
        //dock the ship or move to another spot in the grid.  Player chose to dock....I think this
        //Just swtiches view as well.
    }
    
    public void launchShip(){
        //View layer I believe.
    }
    
    public void calcShipHealth(){
        //not sure what this was for anymore
    }
    
    public void calcShipRepair(){
        //Purchase X health for X Coin or purchase Y health for Y gems
    }
    
    public void exploreLocation(){
        
    }
    
    public void moveLocation(){
        
    }
}
