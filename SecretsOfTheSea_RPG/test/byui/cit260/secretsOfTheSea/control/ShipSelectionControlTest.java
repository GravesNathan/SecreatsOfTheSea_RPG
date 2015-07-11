/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;


import byui.cit260.secretsOfTheSea.view.ErrorView;
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
        this.console.println("assignShip");
        this.console.println("Choice 0");
        int playerChoice = 0;
        ShipSelectionControl instance = new ShipSelectionControl(playerChoice);
        //selectedShipInfo = instance.toString();
        this.console.println(instance.getUserShip());

        this.console.println("Choice 1");
        playerChoice = 1;
        instance = new ShipSelectionControl(playerChoice);
        this.console.println(instance.getUserShip());
        
        this.console.println("Choice 2");
        playerChoice = 2;
        instance = new ShipSelectionControl(playerChoice);
        this.console.println(instance.getUserShip());
        
        this.console.println("Choice 3");
        playerChoice = 3;
        instance = new ShipSelectionControl(playerChoice);
        this.console.println(instance.getUserShip());

        //instance.assignShip(playerChoice, selectedShip);
        //selectedShipInfo = instance.toString();
        //this.console.println(instance.toString());
        
        ErrorView.display(this.getClass().getName(),"Bad Choice");
        playerChoice = 4;
        instance = new ShipSelectionControl(playerChoice);
        this.console.println(instance.getUserShip());
    }
    
}
