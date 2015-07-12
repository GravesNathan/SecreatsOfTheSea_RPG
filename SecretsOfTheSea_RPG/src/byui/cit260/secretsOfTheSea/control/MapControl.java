/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

//import byui.cit260.secretsOfTheSea.model.CurrentStatus;
//import byui.cit260.secretsOfTheSea.model.ExplorableAreas;
import byui.cit260.secretsOfTheSea.exceptions.ExplorableAreasException;
import byui.cit260.secretsOfTheSea.model.Map;
import byui.cit260.secretsOfTheSea.model.LocationDetails;
//import byui.cit260.secretsOfTheSea.model.Ships;
import byui.cit260.secretsOfTheSea.model.Storms;
import byui.cit260.secretsOfTheSea.exceptions.MapControlException;
import java.io.PrintWriter;

import java.util.Random;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class MapControl {
    
    protected final PrintWriter console = SecretsOfTheSea_RPG.getOutFile();
    //MapControl will create the map, place islands and storms, all based on difficulty
    private static char difficulty;
    private static Map mapOne = new Map();
    private static LocationDetails[] location = null;
    private static Storms[] storms = null;
    private static int numStorms = 0;
    private static int[][] mapGrid = null;
    private static int diffMultiplier = 0;
    private static String tempWarning = null;
    
    public MapControl( char tempDifficulty )
            throws MapControlException, ArrayIndexOutOfBoundsException, 
            ExplorableAreasException  {
        
        this.calcMapSize( tempDifficulty );
        this.populateMap();
        this.populateStorms();
        this.PrintMap();
//        this.tempPrintMap2();
//        this.verifyMap();
//        this.tempPrintMap3();
    }
    
    //STEP 4 - Turn outline of solution into working code.
    
    public void calcMapSize ( char difficulty) 
            throws MapControlException {
        
        mapOne.setDifficulty(difficulty);
        int xMax = 4;
        int yMax = 4;
        if (difficulty == 'E' || difficulty == 'e'){
            diffMultiplier = 1;
            tempWarning = "Mild storm ahead.  What would you like to do?";
        }   
        else if (difficulty == 'N' || difficulty == 'n'){
            diffMultiplier = 2;
            tempWarning = "Moderate storm ahead.  What would you like to do?";
        }
        else if (difficulty == 'H' || difficulty == 'h'){
            diffMultiplier = 3;
            tempWarning = "Severe storm ahead.  What would you like to do?";
        }
        else throw new MapControlException("Failed to create map size based on difficulty selection");
        mapOne.setxMax(xMax * diffMultiplier);
        mapOne.setyMax(yMax * diffMultiplier);
        numStorms = 4 * diffMultiplier;
        storms = new Storms[numStorms];
        for (int i=0; i<numStorms; i++)
            storms[i] = new Storms(); 
    }
  
    public void populateMap() 
            throws ArrayIndexOutOfBoundsException, ExplorableAreasException{
        int xMax = mapOne.getxMax();
        int yMax = mapOne.getyMax();
        location = new LocationDetails[8];
            for (int i=0; i<8; i++){
                if (i>=8)
                    throw new ArrayIndexOutOfBoundsException ("Error, program trying to "
                            + "create too many islands");
                        //ArrayIndexOutOfBoundsException("Error creating islands.  Program attempting"
                        // + "to create more islands than allowed.");
                location[i] = new LocationDetails();
            }
            int tempX;
            int tempY;
            Random xRand = new Random();
            Random yRand = new Random();
            mapGrid = new int[xMax][yMax];
        //Creates an array of size xMax, each of which holds an array of size Ymax.  it may help to think of arrays as list
        //The main list is broken into xMax categories.  The categories have yMax items each
            for (int i=0; i<8; i++){
                tempX = xRand.nextInt(xMax);
                tempY = yRand.nextInt(yMax);
                if (mapGrid[tempX][tempY] == 0) {
                    location[i].setXCoordinate(tempX);
                    location[i].setYCoordinate(tempY);
                    mapGrid[tempX][tempY] = 1;
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
            for (int i=0; i<numStorms; i++){ // fix then change to for each, indiv assign required
                tempX = xRand.nextInt(xMax);
                tempY = yRand.nextInt(yMax);
                if (mapGrid[tempX][tempY] == 0) {
                    storms[i].setXCoordinate(tempX);
                    storms[i].setYCoordinate(tempY);
                    storms[i].setPowerLevel(3 * diffMultiplier);
                    storms[i].setWarning(tempWarning);
                    mapGrid[tempX][tempY] = 2;
                }
                else i--; //offset increment when the island ends up stacked on another island.
            }
      }
      
      
    
    public String getUserDifficulty()
            throws MapControlException {
        char nameDifficulty = mapOne.getDifficulty();
        switch (nameDifficulty) {
            case 'E':
                return "Easy";
            case 'N': 
                return "Normal";
            case 'H':
                return "Hard";
            default: 
                throw new MapControlException ("Failed to read from set Difficulty"); 
        }
    }
    
    
    public void PrintMap(){
        //this.console.println("\nfor-each bad Print, 0 = empty, 1 = island, 2 = storm");
        this.console.println("\n");
        int emptySpaces = 0;
        int islands = 0;
        int storms = 0;
        

        this.console.println("\nTemporary Map Print, 0 = empty, 1 = island, 2 = storm");
        for(int[] row : mapGrid){
            this.console.println();
            for(int column : row)
                System.out.print("  " + column + "  ");
        }    

//        for(int[] row : mapGrid){//for-each statement, mapGrid is double array
//            
//            for(int i = 0; i < row.length ; i++){//coulnd't use second for-each...?
//                System.out.print(row[i] + "  ");//This is my "Sum" function for the week's assignment
//                switch (row[i]) {
//                    case 0:
//                        emptySpaces += 1;
//                    case 1:
//                        islands += row[i];
//                    case 2:
//                        storms += (row[i]/2);
//                }
//            }
//            this.console.println();
//        } 
        this.console.println("Total empty coordinates = " + emptySpaces
        + "\nTotal island coordinates = " + islands
        + "\nTotal storm coordinates = " + storms);
    }

    public char getDifficulty() {
        return difficulty;
    }

    public static void setDifficulty(char storedifficulty) {
        difficulty = storedifficulty;
    }

    public Map getMapOne() {
        return mapOne;
    }

    public static void setMapOne(Map storeMapOne) {
        mapOne = storeMapOne;
    }

    public LocationDetails[] getLocation() {
        return location;
    }

    public static void setLocation(LocationDetails[] storeLocation) {
        location = storeLocation;
    }

    public Storms[] getStorms() {
        return storms;
    }

    public static void setStorms(Storms[] storeStorms) {
        storms = storeStorms;
    }

    public int getNumStorms() {
        return numStorms;
    }

    public static void setNumStorms(int storeNumStorms) {
        numStorms = storeNumStorms;
    }

    public int[][] getMapGrid() {
        return mapGrid;
    }

    public static void setMapGrid(int[][] storeMapGrid) {
        mapGrid = storeMapGrid;
    }

    public int getDiffMultiplier() {
        return diffMultiplier;
    }

    public static void setDiffMultiplier(int storeDiffMultiplier) {
        diffMultiplier = storeDiffMultiplier;
    }

    public String getTempWarning() {
        return tempWarning;
    }

    public static void setTempWarning(String storeTempWarning) {
        tempWarning = storeTempWarning;
    }
    
    
}


