/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.ExplorableAreas;
import byui.cit260.secretsOfTheSea.model.Map;
import byui.cit260.secretsOfTheSea.model.LocationDetails;
import byui.cit260.secretsOfTheSea.model.Ships;

import java.util.Random;

/**
 *
 * @author Nathan
 */
public class MapControl {
    //MapControl will create the map, place islands and storms, all based on difficulty
    private char difficulty;
    private Map mapOne = new Map();
    private LocationDetails[] location = null;

            
    public MapControl( char tempDifficulty ){
        Boolean errorCheck = this.calcMapSize( tempDifficulty );
        if (errorCheck)
        this.populateMap();
    }
    
    public Boolean calcMapSize ( char difficulty){
        mapOne.setDifficulty(difficulty);
        int xMax = 4;
        int yMax = 4;
        if (difficulty == 'E' || difficulty == 'e'){
            mapOne.setxMax(xMax * 1);
            mapOne.setyMax(yMax * 1);
            return true;
        }   
        else if (difficulty == 'N' || difficulty == 'n'){
            mapOne.setxMax(xMax * 2);
            mapOne.setyMax(yMax * 2);
            return true;
        }
        else if (difficulty == 'H' || difficulty == 'h'){
            mapOne.setxMax(xMax * 3);
            mapOne.setyMax(yMax * 3);
            return true;
        }
        else return false;
    }
  
    public void populateMap(){
        int xMax = mapOne.getxMax();
        int yMax = mapOne.getyMax();
        location = new LocationDetails[8];
            for (int i=0; i<8; i++)
            location[i] = new LocationDetails();
        //if ( (xMax != 4 && xMax != 8 && xMax != 12) || (yMax != 4 && yMax != 8 && yMax != 12) )
        //    status.setStatusMessage("Error Populating Map. Contact programmers");
        //else {
        int tempX;
        int tempY;
        Random xRand = new Random();
        Random yRand = new Random();
        int[][] mapGrid = new int[xMax][yMax];
        //Creates an array of size xMax, each of which holds an array of size Ymax.  it may help to think of arrays as list
        //The main list is broken into xMax categories.  The categories have yMax items each
        for (int i=0; i<8; i++){
            tempX = xRand.nextInt(xMax);
            tempY = yRand.nextInt(yMax);
            if (mapGrid[tempX][tempY] == 0) {
                location[i].setXCoordinate(tempX);
                location[i].setYCoordinate(tempY);
                ExplorableAreasControl setupAreas = new ExplorableAreasControl(i);
            }
            else i--; //offset increment when the island ends up stacked on another island.
        }
    }
    
    public String getUserDifficulty(){
        char nameDifficulty = mapOne.getDifficulty();
        switch (nameDifficulty) {
            case 'E':
                return "Easy";
            case 'N': 
                return "Normal";
            case 'H':
                return "Hard";
            default: 
                return "Invalid Input";
        }
}
    
}


