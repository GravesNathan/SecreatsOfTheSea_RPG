/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.Map;

/**
 *
 * @author Nathan
 */
public class GameDifficultyControl {
    
    public void calcMapSize ( Map mapOne, CurrentStatus statusOne ){
        char difficulty = mapOne.getDifficulty();
        int XMax = mapOne.getXMax();
        int YMax = mapOne.getYMax();
        if (difficulty == 'E' || difficulty == 'e'){
            mapOne.setXMax(XMax * 1);
            mapOne.setYMax(YMax * 1);
            return;
        }   
        else if (difficulty == 'N' || difficulty == 'n'){
            mapOne.setXMax(XMax * 2);
            mapOne.setYMax(YMax * 2);
            return;
        }
        else if (difficulty == 'H' || difficulty == 'h'){
            mapOne.setXMax(XMax * 3);
            mapOne.setYMax(YMax * 3);
            return;
        }
        else{
            statusOne.setStatusMessage("Invalid Entry. Please input an E, N, or H.");
            return;
        }
    }
    
}
