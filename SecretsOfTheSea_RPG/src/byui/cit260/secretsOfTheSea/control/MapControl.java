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
import byui.cit260.secretsOfTheSea.model.Storms;

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
    private Storms[] storms = null;
    private int numStorms = 0;
            
    public MapControl( char tempDifficulty ){
        Boolean errorCheck = this.calcMapSize( tempDifficulty );
        if (errorCheck)
        this.populateMap();
        this.populateStorms();
    }
    
    //STEP 4 - Turn outline of solution into working code.
    
    public Boolean calcMapSize ( char difficulty){
        mapOne.setDifficulty(difficulty);
        int xMax = 4;
        int yMax = 4;
        if (difficulty == 'E' || difficulty == 'e'){
            mapOne.setxMax(xMax * 1);
            mapOne.setyMax(yMax * 1);
            numStorms = 3;
            storms = new Storms[numStorms];
            for (int i=0; i<numStorms; i++)
                storms[i] = new Storms();
            return true;
        }   
        else if (difficulty == 'N' || difficulty == 'n'){
            mapOne.setxMax(xMax * 2);
            mapOne.setyMax(yMax * 2);
            numStorms = 6;
            storms = new Storms[numStorms];
            for (int i=0; i<numStorms; i++)
                storms[i] = new Storms();
            return true;
        }
        else if (difficulty == 'H' || difficulty == 'h'){
            mapOne.setxMax(xMax * 3);
            mapOne.setyMax(yMax * 3);
            numStorms = 11;
            storms = new Storms[numStorms];
            for (int i=0; i<numStorms; i++)
                storms[i] = new Storms();
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
        //Create Locations has finished here
    }
        //This section populates Storms
      public void populateStorms(){
            int tempX = 0;
            int tempY = 0;
            int xMax = mapOne.getxMax();
            int yMax = mapOne.getyMax();
            Random xRand = new Random();
            Random yRand = new Random();
            int[][] mapGrid = new int[xMax][yMax];
            for (int i=0; i<numStorms; i++){ // fix then change to for each, indiv assign required
                tempX = xRand.nextInt(xMax);
                tempY = yRand.nextInt(yMax);
                if (mapGrid[tempX][tempY] == 0) {
                    storms[i].setXCoordinate(tempX);
                    storms[i].setYCoordinate(tempY);
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


