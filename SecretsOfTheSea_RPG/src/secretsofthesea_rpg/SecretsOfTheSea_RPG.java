/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea_rpg;

import byui.cit260.secretsOfTheSea.model.Map;
import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.ExplorableAreas;
import byui.cit260.secretsOfTheSea.model.LocationDetails;
import byui.cit260.secretsOfTheSea.model.Player;

/**
 *
 * @author SDababneh
 */
public class SecretsOfTheSea_RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Sample Class Set & Print
        /*Sample samepleOne = new Sample();
        *
        *sampleOne.setAttribute("Value");
        *sampleOne.setIntAttribute(1);
        *
        *String sampleInfo = sampleOne.toString();
        *System.out.println(sampleInfo);
        */
        //End sample Class Set & Print
        
        //Map Class Set & Print
        Map mapOne = new Map();
   
        mapOne.setDifficulty("Easy Challenge");
        mapOne.setXMax("5");
        mapOne.setYMax("10");
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        //End Map Class Set & Print
        
        //LocationDetails Class Set & Print
        LocationDetails locationOne = new LocationDetails();
        
        locationOne.setFoodLevel(4);
        locationOne.setWaterLevel(3);
        locationOne.setFuelLevel(2);
        locationOne.setMunitionsLevel(1);
        locationOne.setCoinLevel(1);
        locationOne.setArtifactsLevel(2);
        locationOne.setGemsLevel(3);
        locationOne.setStatue(1);
        locationOne.setXCoordinate(2);
        locationOne.setYCoordinate(7);
        
        String locationAztec = locationOne.toString();
        System.out.println(locationAztec);
        //End LocationDetails Class Set & Print
        
        //Player Class Set & Print
        Player playerOne = new Player();
        
        playerOne.setName("Nathan the Amazing");
        playerOne.setApproachChoice(1);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        //End Player Class Set & Print
        
        //ExplorableAreas Class Set & Print
        ExplorableAreas areaOne = new ExplorableAreas();
        
        areaOne.setDescription("Beach Front");
        areaOne.setHasStatue(1);
        areaOne.setResource1("Food");
        areaOne.setResource2("Water");
        areaOne.setResource1Quantity(3);
        areaOne.setResource2Quantity(5);
        areaOne.setTravelDistance(14);
        
        String areaInfo = areaOne.toString();
        System.out.println(areaInfo);
        //End ExplorableAreas Class Set & Print
        
        //CurrentStatus Class Set & Print
        CurrentStatus statusOne = new CurrentStatus();
        
        statusOne.setCurrentLocation("Aztec Society");
        statusOne.setStatuesCount("Zero");
        statusOne.setLifeStatus("Alive and well");
                
        String statusInfo = statusOne.toString();
        System.out.println(statusInfo);
        //End sample Class Set & Print
    }
    
}
