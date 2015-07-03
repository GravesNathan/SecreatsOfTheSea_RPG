/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.exceptions.ExplorableAreasException;
import byui.cit260.secretsOfTheSea.model.ExplorableAreas;
import byui.cit260.secretsOfTheSea.model.LocationDetails;
import java.util.Random;

/**
 *
 * @author Nathan
 */
public class ExplorableAreasControl {
    
    private ExplorableAreas[][] areas = null;
    
    
    public ExplorableAreasControl(int islandNumber)
                throws ExplorableAreasException {
        this.setupAreas(islandNumber);
    }
    
    public void setupAreas(int i)
                    throws ExplorableAreasException {
        areas = new ExplorableAreas[8][4];
        Random tempRand = new Random();
        int placeStatue = tempRand.nextInt(3) + 1;
            for (int j=0; j<4; j++){
                areas[i][j] = new ExplorableAreas();
                if (j == 0){
                    areas[i][j].setDescription("dock");
                    areas[i][j].setResource1(this.randomResource());
                    areas[i][j].setResource1Quantity(10);
                    areas[i][j].setResource2(this.randomResource());
                    areas[i][j].setResource2Quantity(10);
                    areas[i][j].setTravelDistance(2);
                    areas[i][j].setHasStatue(0);
                    //used when testing System.out.println("Island " + i + " area " + j + ":  " +areas[i][j].toString());
                } else if(j==1 || j==2 || j==3){
                        areas[i][j].setDescription(this.areaNameGenerator());
                        areas[i][j].setResource1(this.randomResource());
                        areas[i][j].setResource1Quantity(3);
                        areas[i][j].setResource2(this.randomResource());
                        areas[i][j].setResource2Quantity(3);
                        areas[i][j].setTravelDistance(2);
                        if (j == placeStatue)
                            areas[i][j].setHasStatue(1);
                        else areas[i][j].setHasStatue(0);
                        //used when testing System.out.println("Island " + i + " area " + j + ":  " +areas[i][j].toString());
                    }
                else throw new ExplorableAreasException("Error Populating Areas"); //WEEK 10 IA
            }
    }
    
    public String areaNameGenerator() throws ExplorableAreasException{
        String name = null;
        Random number = new Random();
        int nameNumber = number.nextInt(5);
            switch (nameNumber){
                case 0:
                    name = "Moutain";
                    return name;
                case 1:
                    name = "Forest";
                    return name;
                case 2:
                    name = "Desert";
                    return name;
                case 3:
                    name = "Valley";
                    return name;
                case 4:
                    name = "Plains";
                    return name;
                default:
                    throw new ExplorableAreasException("Error Setting Area name");
                    //name = "error loading name"; //WEEK 10 IA
                    //return name;
            }
    }
        
    public String randomResource() throws ExplorableAreasException{
        String resource = null;
        Random number = new Random();
        int resourceNumber = number.nextInt(10);
            switch (resourceNumber){
                case 0:
                    resource = "Food";
                    return resource;
                case 1:
                    resource = "Food";
                    return resource;
                case 2:
                    resource = "Water";
                    return resource;
                case 3:
                    resource = "Water";
                    return resource;
                case 4:
                    resource = "Fuel";
                    return resource;
                case 5:
                    resource = "Munition";
                    return resource;
                case 6:
                    resource = "Coin";
                    return resource;
                case 7:
                    resource = "Artifact";
                    return resource;
                case 8:
                    resource = "Gems";
                    return resource;
                case 9:
                    resource = "none";
                    return resource;
                default:
                    throw new ExplorableAreasException("Error assigning area resources");
                    //resource = "error loading resource"; //WEEK 10 IA
                    //return resource;
            }
    }
}
