/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.Map;
import byui.cit260.secretsOfTheSea.model.LocationDetails;
import java.util.Random;

/**
 *
 * @author Nathan
 */
public class GameDifficultyControl {
    
    public void calcMapSize ( Map mapOne, CurrentStatus statusOne ){
        char difficulty = mapOne.getDifficulty();
        int xMax = mapOne.getxMax();
        int yMax = mapOne.getyMax();
        if (difficulty == 'E' || difficulty == 'e'){
            mapOne.setxMax(xMax * 1);
            mapOne.setyMax(yMax * 1);
            return;
        }   
        else if (difficulty == 'N' || difficulty == 'n'){
            mapOne.setxMax(xMax * 2);
            mapOne.setyMax(yMax * 2);
            return;
        }
        else if (difficulty == 'H' || difficulty == 'h'){
            mapOne.setxMax(xMax * 3);
            mapOne.setyMax(yMax * 3);
            return;
        }
        else{
            statusOne.setStatusMessage("Invalid Entry. Please input an E, N, or H.");
            return;
        }
    }
  /*  
    public void populateMap( Map myMap){
        int xMax = myMap.getxMax();
        int yMax = myMap.getyMax();
        int tempX;
        int tempY;
        Random xRand = new Random();
        Random yRand = new Random();
        int[][] mapGrid = new int[xMax][yMax];
        //Creates an array of size xMax, each of which holds an array of size Ymax.  it may help to think of arrays as list
        //The main list is broken into xMax categories.  The categories have yMax items each
        for (int i=0; i<8; i++){
            tempX = nextInt(xMax);
            tempY = nextInt(yMax);
            if (mapGrid[tempX][tempY] == 0) {
                mapGrid[tempX][tempY] = 1;
		switch {
                    case (i ==0) {
                        setlocationOne.xCoordinate = tempX;
                        setlocationOne.yCoordinate = tempY
                    }
                    case (i ==1) {
                        setIsland1.xCoordinate = tempX
                        setIsland1.yCoordinate = tempY
                    }
                    case (i ==2) {
			setIsland2.xCoordinate = tempX
			setIsland2.yCoordinate = tempY
                    }
                    case (i ==3) {
			setIsland3.xCoordinate = tempX
			setIsland3.yCoordinate = tempY
                    }
                    case (i ==4) {
			setIsland4.xCoordinate = tempX
			setIsland4.yCoordinate = tempY
                    }
                    case (i ==5) {
			setIsland5.xCoordinate = tempX
			setIsland5.yCoordinate = tempY
                    }
                    case (i ==6) {
			setIsland6.xCoordinate = tempX
			setIsland6.yCoordinate = tempY
                    }
                    case (i ==7) {
			setIsland7.xCoordinate = tempX
			setIsland7.yCoordinate = tempY
                    }
                }
            }
            else i--;
        }
    Return void
    }
    */
}
