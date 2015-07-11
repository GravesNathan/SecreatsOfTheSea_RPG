/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;


//import byui.cit260.secretsOfTheSea.model.LocationDetails;
//import byui.cit260.secretsOfTheSea.model.Map;
//import byui.cit260.secretsOfTheSea.control.MapControl;
import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author Nathan
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of calcMapSize method, of class GameDifficultyControl.
     */
    @Test
    public void TestMapControl() {
        /******************/
        /*****Case H******/
        /*****************/
        char difficultyChoice = 'H';
        MapControl instance = new MapControl(difficultyChoice);
        this.console.println("chosen difficulty is " + instance.getUserDifficulty());
        
        /******************/
        /*****Case N******/
        /*****************/
        difficultyChoice = 'N';
        instance =  new MapControl(difficultyChoice);
        this.console.println("chosen difficulty is " + instance.getUserDifficulty());
        
        /******************/
        /*****Case E******/
        /*****************/
        difficultyChoice = 'E';
        instance =  new MapControl(difficultyChoice);
        this.console.println("chosen difficulty is " + instance.getUserDifficulty());

        
        /******************/
        /*****Case Invalid******/
        /*****************/
        difficultyChoice = 'W';  
        instance =  new MapControl(difficultyChoice);
        this.console.println("chosen difficulty is " + instance.getUserDifficulty());
    }
    
}