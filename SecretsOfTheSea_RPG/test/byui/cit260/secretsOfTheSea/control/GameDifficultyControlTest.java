/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.LocationDetails;
import byui.cit260.secretsOfTheSea.model.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nathan
 */
public class GameDifficultyControlTest {
    
    public GameDifficultyControlTest() {
    }

    /**
     * Test of calcMapSize method, of class GameDifficultyControl.
     */
    @Test
    public void testCalcMapSize() {
        System.out.println("calcMapSize");
        /******************/
        /*****Case H******/
        /*****************/
        System.out.println("calcMapSize Case H");
        Map mapOne = new Map();   
        mapOne.setDifficulty('H');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        CurrentStatus status = new CurrentStatus();
        status.setStatusMessage("Default Message");
        
        MapControl instance = new MapControl();
        instance.calcMapSize(mapOne, status);
        
        /******************/
        /*****Case h******/
        /*****************/
        System.out.println("calcMapSize Case h"); 
        mapOne.setDifficulty('h');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        status.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, status);
        
        /******************/
        /*****Case N******/
        /*****************/
        System.out.println("calcMapSize Case N");
        mapOne.setDifficulty('N');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        status.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, status);
        
        /******************/
        /*****Case n******/
        /*****************/
        System.out.println("calcMapSize Case n");
        //Map mapOne = null;  
        mapOne.setDifficulty('n');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        status.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, status);
        
        /******************/
        /*****Case E******/
        /*****************/
        System.out.println("calcMapSize Case E");
        //Map mapOne = null;  
        mapOne.setDifficulty('E');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        status.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, status);
        
        /******************/
        /*****Case e******/
        /*****************/
        System.out.println("calcMapSize Case e");
        mapOne.setDifficulty('e');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        status.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, status);
        
        /******************/
        /**Case bad char**/
        /*****************/
        System.out.println("calcMapSize Case bad char type"); 
        mapOne.setDifficulty('a');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        status.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, status);
        
        /******************/
        /**Case bad char**/
        /*****************/
        System.out.println("calcMapSize Case bad char type"); 
        mapOne.setDifficulty('1');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        status.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, status);
    }

    /**
     * Test of populateMap method, of class GameDifficultyControl.
     */
    @Test
    public void testPopulateMap() {
        System.out.println("\npopulateMap");
        
        System.out.println("calcMapSize Case xMax=4, yMax=4");
        Map mapOne = new Map();   
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        CurrentStatus status = new CurrentStatus();
        status.setStatusMessage("Default Message");
        
        /*  Location One Setup */
        LocationDetails locationOne = new LocationDetails();
        locationOne.setXCoordinate(2);
        locationOne.setYCoordinate(2);
        /*  End of Location One ********/
        
        /*  Location Two Setup */
        LocationDetails locationTwo = new LocationDetails();
        locationTwo.setXCoordinate(2);
        locationTwo.setYCoordinate(2);
        /*  End of Location Two ********/
        
        /*  Location Three  Setup */
        LocationDetails locationThree = new LocationDetails();
        locationThree.setXCoordinate(2);
        locationThree.setYCoordinate(2);
        /*  End of Location Three ********/
        
        /*  Location Four Setup */
        LocationDetails locationFour = new LocationDetails();
        locationFour.setXCoordinate(2);
        locationFour.setYCoordinate(2);
        /*  End of LocationFour  ********/
        
        /*  Location Five Setup */
        LocationDetails locationFive = new LocationDetails();
        locationFive.setXCoordinate(2);
        locationFive.setYCoordinate(2);
        /*  End of LocationFive  ********/
        
        /*  Location Six Setup */
        LocationDetails locationSix = new LocationDetails();
        locationSix.setXCoordinate(2);
        locationSix.setYCoordinate(2);
        /*  End of LocationSix  ********/
        
        /*  Location Seven Setup */
        LocationDetails locationSeven = new LocationDetails();
        locationSeven.setXCoordinate(2);
        locationSeven.setYCoordinate(2);
        /*  End of LocationSeven  ********/
        
        /*  Location Eight Setup */
        LocationDetails locationEight = new LocationDetails();
        locationEight.setXCoordinate(2);
        locationEight.setYCoordinate(2);
        /*  End of LocationEight  ********/
        
        MapControl instance = new MapControl();
        instance.populateMap(mapOne, locationOne, locationTwo, locationThree, locationFour, locationFive, locationSix, locationSeven, locationEight, status);

        System.out.println("calcMapSize Case xMax=8, yMax=8");  
        mapOne.setxMax(8);
        mapOne.setyMax(8);
        
        status.setStatusMessage("Default Message");
        
        /*  Location One Setup */
        locationOne.setXCoordinate(2);
        locationOne.setYCoordinate(2);
        /*  End of Location One ********/
        
        /*  Location Two Setup */
        locationTwo.setXCoordinate(2);
        locationTwo.setYCoordinate(2);
        /*  End of Location Two ********/
        
        /*  Location Three  Setup */
        locationThree.setXCoordinate(2);
        locationThree.setYCoordinate(2);
        /*  End of Location Three ********/
        
        /*  Location Four Setup */
        locationFour.setXCoordinate(2);
        locationFour.setYCoordinate(2);
        /*  End of LocationFour  ********/
        
        /*  Location Five Setup */
        locationFive.setXCoordinate(2);
        locationFive.setYCoordinate(2);
        /*  End of LocationFive  ********/
        
        /*  Location Six Setup */
        locationSix.setXCoordinate(2);
        locationSix.setYCoordinate(2);
        /*  End of LocationSix  ********/
        
        /*  Location Seven Setup */
        locationSeven.setXCoordinate(2);
        locationSeven.setYCoordinate(2);
        /*  End of LocationSeven  ********/
        
        /*  Location Eight Setup */
        locationEight.setXCoordinate(2);
        locationEight.setYCoordinate(2);
        /*  End of LocationEight  ********/
        
        instance.populateMap(mapOne, locationOne, locationTwo, locationThree, locationFour, locationFive, locationSix, locationSeven, locationEight, status);

        System.out.println("calcMapSize Case xMax=12, yMax=12");  
        mapOne.setxMax(12);
        mapOne.setyMax(12);
        
        status.setStatusMessage("Default Message");
        
        /*  Location One Setup */
        locationOne.setXCoordinate(2);
        locationOne.setYCoordinate(2);
        /*  End of Location One ********/
        
        /*  Location Two Setup */
        locationTwo.setXCoordinate(2);
        locationTwo.setYCoordinate(2);
        /*  End of Location Two ********/
        
        /*  Location Three  Setup */
        locationThree.setXCoordinate(2);
        locationThree.setYCoordinate(2);
        /*  End of Location Three ********/
        
        /*  Location Four Setup */
        locationFour.setXCoordinate(2);
        locationFour.setYCoordinate(2);
        /*  End of LocationFour  ********/
        
        /*  Location Five Setup */
        locationFive.setXCoordinate(2);
        locationFive.setYCoordinate(2);
        /*  End of LocationFive  ********/
        
        /*  Location Six Setup */
        locationSix.setXCoordinate(2);
        locationSix.setYCoordinate(2);
        /*  End of LocationSix  ********/
        
        /*  Location Seven Setup */
        locationSeven.setXCoordinate(2);
        locationSeven.setYCoordinate(2);
        /*  End of LocationSeven  ********/
        
        /*  Location Eight Setup */
        locationEight.setXCoordinate(2);
        locationEight.setYCoordinate(2);
        /*  End of LocationEight  ********/
        
        instance.populateMap(mapOne, locationOne, locationTwo, locationThree, locationFour, locationFive, locationSix, locationSeven, locationEight, status);

        
        
        System.out.println("\ncalcMapSize Case xMax=5, yMax=8 (bad xMax value)");  
        mapOne.setxMax(5);
        mapOne.setyMax(8);
        status.setStatusMessage("Default Message");
        instance.populateMap(mapOne, locationOne, locationTwo, locationThree, locationFour, locationFive, locationSix, locationSeven, locationEight, status);
        System.out.println("status = " + status.getStatusMessage() + "\n");
        
        System.out.println("calcMapSize Case xMax=4, yMax=9 (bad yMax value)");  
        mapOne.setxMax(4);
        mapOne.setyMax(9);
        status.setStatusMessage("Default Message");
        instance.populateMap(mapOne, locationOne, locationTwo, locationThree, locationFour, locationFive, locationSix, locationSeven, locationEight, status);
        System.out.println("status = " + status.getStatusMessage() + "\n");
        
        System.out.println("calcMapSize Case xMax=3, yMax=9 (bad xmax and yMax value)");  
        mapOne.setxMax(3);
        mapOne.setyMax(9);
        status.setStatusMessage("Default Message");
        instance.populateMap(mapOne, locationOne, locationTwo, locationThree, locationFour, locationFive, locationSix, locationSeven, locationEight, status);
       System.out.println("status = " + status.getStatusMessage() + "\n");
    }
}