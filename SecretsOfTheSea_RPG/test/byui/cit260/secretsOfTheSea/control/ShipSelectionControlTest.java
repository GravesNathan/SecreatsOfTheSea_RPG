/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.SelectedShip;
import byui.cit260.secretsOfTheSea.model.Ships;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nathan
 */
public class ShipSelectionControlTest {
    
    public ShipSelectionControlTest() {
    }

    /**
     * Test of assignShip method, of class ShipSelectionControl.
     */
    @Test
    public void testAssignShip() {
        //Inialize for testing
        Ships[] ship = new Ships[4];//Initialize an array of 4 ship objects
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

        
        
        //SelectedShip Set & Print
        SelectedShip selectedShip = new SelectedShip();
        //Set the Default stats here, selected ship stats are adjusted + and - based
        //on the player's choice.  This is the base for all ships.
        selectedShip.setName("baseStats");
        selectedShip.setDescription("Ship not Chosen yet");
        selectedShip.setCargoCapSize(5);
        selectedShip.setMorale(5);
        selectedShip.setSpeed(5);
        selectedShip.setDefense(5);
        selectedShip.setDeceit(5);
        selectedShip.setDiplomacy(5);
        selectedShip.setIntimidation(5);
        selectedShip.setBribery(5);
        selectedShip.setShipHealth(5);
        
        String selectedShipInfo = selectedShip.toString();
        
        //CurrentStatus Class Set & Print
        CurrentStatus status = new CurrentStatus();
        
        status.setCurrentLocation("Aztec Society [Beach Front]");
        status.setStatuesCount(1);
        status.setLifeStatus("Alive and well");
        status.setGameDifficulty("Normal");
        status.setStatusMessage("Default Message");
                
        String statusInfo = status.toString();
        
        
        /******** Start Testing ******/
        System.out.println("assignShip");
        System.out.println("Choice 0");
        char playerChoice = '0';
        ShipSelectionControl instance = new ShipSelectionControl();
        instance.assignShip(playerChoice, ship, selectedShip, status);
        System.out.println(selectedShip);

        System.out.println("Choice 1");
        playerChoice = '1';
        instance.assignShip(playerChoice, ship, selectedShip, status);
        System.out.println(selectedShip);
        
        System.out.println("Choice 2");
        playerChoice = '2';
        instance.assignShip(playerChoice, ship, selectedShip, status);
        System.out.println(selectedShip);
        
        System.out.println("Choice 3");
        playerChoice = '3';
        instance.assignShip(playerChoice, ship, selectedShip, status);
        System.out.println(selectedShip);
        
        System.out.println("Bad Choice");
        playerChoice = '4';
        instance.assignShip(playerChoice, ship, selectedShip, status);
        System.out.println(selectedShip);
    }
    
}
