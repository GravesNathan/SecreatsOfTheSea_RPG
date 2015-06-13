/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;


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
    public void testShipSelectionControl() {
        
 
        
        /******** Start Testing ******/
        System.out.println("assignShip");
        System.out.println("Choice 0");
        int playerChoice = 0;
        ShipSelectionControl instance = new ShipSelectionControl(playerChoice);
        //selectedShipInfo = instance.toString();
        System.out.println(instance.getUserShip());

        System.out.println("Choice 1");
        playerChoice = 1;
        instance = new ShipSelectionControl(playerChoice);
        System.out.println(instance.getUserShip());
        
        System.out.println("Choice 2");
        playerChoice = 2;
        instance = new ShipSelectionControl(playerChoice);
        System.out.println(instance.getUserShip());
        
        System.out.println("Choice 3");
        playerChoice = 3;
        instance = new ShipSelectionControl(playerChoice);
        System.out.println(instance.getUserShip());

        //instance.assignShip(playerChoice, selectedShip);
        //selectedShipInfo = instance.toString();
        //System.out.println(instance.toString());
        
        System.out.println("Bad Choicem");
        playerChoice = 4;
        instance = new ShipSelectionControl(playerChoice);
        System.out.println(instance.getUserShip());
    }
    
}
