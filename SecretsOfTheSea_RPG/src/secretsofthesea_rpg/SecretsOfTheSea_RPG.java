/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea_rpg;

import byui.cit260.secretsOfTheSea.model.Cargo;
import byui.cit260.secretsOfTheSea.model.Map;
import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.ExplorableAreas;
import byui.cit260.secretsOfTheSea.model.LocationDetails;
import byui.cit260.secretsOfTheSea.model.Player;
import byui.cit260.secretsOfTheSea.model.SelectedShip;
import byui.cit260.secretsOfTheSea.model.Ships;
import byui.cit260.secretsOfTheSea.model.Societies;
import byui.cit260.secretsOfTheSea.model.SocietyNPCs;
import byui.cit260.secretsOfTheSea.model.Storage;

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
        mapOne.setXMax(5);
        mapOne.setYMax(10);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        //End Map Class Set & Print
        
        //CurrentStatus Class Set & Print
        CurrentStatus statusOne = new CurrentStatus();
        
        statusOne.setCurrentLocation("Aztec Society [Beach Front]");
        statusOne.setStatuesCount(1);
        statusOne.setLifeStatus("Alive and well");
                
        String statusInfo = statusOne.toString();
        System.out.println(statusInfo);
        //End CurrentStatus Class Set & Print
        
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
        
       //LocationDetails Class Set & Print
        LocationDetails locationOne = new LocationDetails();
        
        locationOne.setFood(4);
        locationOne.setWater(3);
        locationOne.setFuel(2);
        locationOne.setMunitions(1);
        locationOne.setCoin(1);
        locationOne.setArtifacts(2);
        locationOne.setGems(3);
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

        //Societies Class Set & Print
        Societies societyOne = new Societies();
        
        societyOne.setName("Aztecs");
        societyOne.setDescription("The Aztec Society is the oldest society found.");
        societyOne.setPositiveApproach("Bribery");
        societyOne.setNeutralApproach("Diplomacy");
        societyOne.setNegativeApproach("Intimidation");
                
        String societyInfo = societyOne.toString();
        System.out.println(societyInfo);
        //End Societies Class Set & Print

        //SocietyNPCs Class Set & Print
        SocietyNPCs societyOneNPC = new SocietyNPCs();
        
        societyOneNPC.setLeaderName("Achcauhtli");
        societyOneNPC.setLeaderDescription("Achcauhtli stands 6 feet tall but is very thin and fit.  He shows no emotion on his face.");
        societyOneNPC.setLeaderTrustLevel(0);
        societyOneNPC.setLeaderTrustLevelTarget(4);
                
        String societyNPCInfo = societyOneNPC.toString();
        System.out.println(societyNPCInfo);
        //End SocietyNPCs Class Set & Print
        
        
        //Ships Class Set & Print
        Ships ship1 = new Ships();
        
        ship1.setName("Tank");
        ship1.setDescription("Most powerful ship with high intimication stat");
        ship1.setCargoCapSize(7);
        ship1.setMorale(5);
        ship1.setSpeed(3);
        ship1.setDefense(10);
        ship1.setDeceit(2);
        ship1.setDiplomacy(3);
        ship1.setIntimidation(10);
        ship1.setBribery(4);
        
        String ship1Info = ship1.toString();
        System.out.println(ship1Info);
        
        //SelectedShip Set & Print
        SelectedShip selectedShip = new SelectedShip();
        
        selectedShip.setName("Tank!!!");
        selectedShip.setDescription("You chose a Tank!");
        selectedShip.setCargoCapSize(70);
        selectedShip.setMorale(50);
        selectedShip.setSpeed(30);
        selectedShip.setDefense(100);
        selectedShip.setDeceit(20);
        selectedShip.setDiplomacy(30);
        selectedShip.setIntimidation(100);
        selectedShip.setBribery(40);
        selectedShip.setShipHealth(200);
        
        String selectedShipInfo = selectedShip.toString();
        System.out.println(selectedShipInfo);
        
        //Storage Set & Print
        Storage storage = new Storage();
        
        storage.setFood(1);
        storage.setWater(2);
        storage.setFuel(3);
        storage.setMunitions(4);
        storage.setCoin(5);
        storage.setArtifacts(6);
        storage.setGems(7);
        
        String storageInfo = storage.toString();
        System.out.println(storageInfo);
        
        //Cargo Set & Print
        Cargo cargo = new Cargo();
        
        cargo.setFood(3);
        cargo.setWater(4);
        cargo.setFuel(7);
        cargo.setMunitions(8);
        cargo.setCoin(2);
        cargo.setArtifacts(2);
        cargo.setGems(2);
        
        String cargoInfo = cargo.toString();
        System.out.println(cargoInfo);
    }
    
}
