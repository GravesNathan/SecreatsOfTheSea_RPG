/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
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
        /******************/
        /*****Case H******/
        /*****************/
        System.out.println("calcMapSize Case H");
        //Map mapOne = null;
        Map mapOne = new Map();   
        mapOne.setDifficulty('H');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        //CurrentStatus statusOne = null;
        CurrentStatus statusOne = new CurrentStatus();
        statusOne.setStatusMessage("Default Message");
        
        GameDifficultyControl instance = new GameDifficultyControl();
        instance.calcMapSize(mapOne, statusOne);
        
        /******************/
        /*****Case h******/
        /*****************/
        System.out.println("calcMapSize Case h");
        //Map mapOne = null;   
        mapOne.setDifficulty('h');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        //CurrentStatus statusOne = null;
        statusOne.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, statusOne);
        
        /******************/
        /*****Case N******/
        /*****************/
        System.out.println("calcMapSize Case N");
        //Map mapOne = null;   
        mapOne.setDifficulty('N');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        //CurrentStatus statusOne = null;
        statusOne.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, statusOne);
        
        /******************/
        /*****Case n******/
        /*****************/
        System.out.println("calcMapSize Case n");
        //Map mapOne = null;  
        mapOne.setDifficulty('n');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        //CurrentStatus statusOne = null;
        statusOne.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, statusOne);
        
        /******************/
        /*****Case E******/
        /*****************/
        System.out.println("calcMapSize Case E");
        //Map mapOne = null;  
        mapOne.setDifficulty('E');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        //CurrentStatus statusOne = null;
        statusOne.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, statusOne);
        
        /******************/
        /*****Case e******/
        /*****************/
        System.out.println("calcMapSize Case e");
        //Map mapOne = null;  
        mapOne.setDifficulty('e');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        //CurrentStatus statusOne = null;
        statusOne.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, statusOne);
        
        /******************/
        /**Case bad char**/
        /*****************/
        System.out.println("calcMapSize Case bad char type");
        //Map mapOne = null;  
        mapOne.setDifficulty('a');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        //CurrentStatus statusOne = null;
        statusOne.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, statusOne);
        
        /******************/
        /**Case bad char**/
        /*****************/
        System.out.println("calcMapSize Case bad char type");
        //Map mapOne = null;  
        mapOne.setDifficulty('1');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        //CurrentStatus statusOne = null;
        statusOne.setStatusMessage("Default Message");
        
        instance.calcMapSize(mapOne, statusOne);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
