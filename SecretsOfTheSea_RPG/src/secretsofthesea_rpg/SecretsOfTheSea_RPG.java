/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea_rpg;

import byui.cit260.secretsOfTheSea.control.GameDifficultyControl;
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
   
        mapOne.setDifficulty('h');
        mapOne.setxMax(4);
        mapOne.setyMax(4);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        //End Map Class Set & Print
        
        //CurrentStatus Class Set & Print
        CurrentStatus status = new CurrentStatus();
        
        status.setCurrentLocation("Aztec Society [Beach Front]");
        status.setStatuesCount(1);
        status.setLifeStatus("Alive and well");
        status.setGameDifficulty("Normal");
        status.setStatusMessage("Default Message");
                
        String statusInfo = status.toString();
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
       
        /**************************************/ 
        //LocationDetails Class Set & Print
        /*************************************/
        /*  Location One Setup */
        LocationDetails locationOne = new LocationDetails();
        
        locationOne.setFood(2);
        locationOne.setWater(2);
        locationOne.setFuel(2);
        locationOne.setMunitions(2);
        locationOne.setCoin(2);
        locationOne.setArtifacts(3);
        locationOne.setGems(2);
        locationOne.setStatue(2);
        locationOne.setXCoordinate(2);
        locationOne.setYCoordinate(2);
        
        String locationOneInfo = locationOne.toString();
        System.out.println(locationOneInfo);
        /*  End of Location One ********/
        /*  Location Two Setup */
        LocationDetails locationTwo = new LocationDetails();
        
        locationTwo.setFood(2);
        locationTwo.setWater(2);
        locationTwo.setFuel(2);
        locationTwo.setMunitions(2);
        locationTwo.setCoin(2);
        locationTwo.setArtifacts(3);
        locationTwo.setGems(2);
        locationTwo.setStatue(2);
        locationTwo.setXCoordinate(2);
        locationTwo.setYCoordinate(2);
        
        String locationTwoInfo = locationTwo.toString();
        System.out.println(locationTwoInfo);
        /*  End of Location Two ********/
        /*  Location Three  Setup */
        LocationDetails locationThree = new LocationDetails();
        
        locationThree.setFood(2);
        locationThree.setWater(2);
        locationThree.setFuel(2);
        locationThree.setMunitions(2);
        locationThree.setCoin(2);
        locationThree.setArtifacts(3);
        locationThree.setGems(2);
        locationThree.setStatue(2);
        locationThree.setXCoordinate(2);
        locationThree.setYCoordinate(2);
        
        String locationThreeInfo = locationThree.toString();
        System.out.println(locationThreeInfo);
        /*  End of Location Three ********/
        /*  Location Four Setup */
        LocationDetails locationFour = new LocationDetails();
        
        locationFour.setFood(2);
        locationFour.setWater(2);
        locationFour.setFuel(2);
        locationFour.setMunitions(2);
        locationFour.setCoin(2);
        locationFour.setArtifacts(3);
        locationFour.setGems(2);
        locationFour.setStatue(2);
        locationFour.setXCoordinate(2);
        locationFour.setYCoordinate(2);
        
        String locationFourInfo = locationFour.toString();
        System.out.println(locationFourInfo);
        /*  End of LocationFour  ********/
        /*  Location Five Setup */
        LocationDetails locationFive = new LocationDetails();
        
        locationFive.setFood(2);
        locationFive.setWater(2);
        locationFive.setFuel(2);
        locationFive.setMunitions(2);
        locationFive.setCoin(2);
        locationFive.setArtifacts(3);
        locationFive.setGems(2);
        locationFive.setStatue(2);
        locationFive.setXCoordinate(2);
        locationFive.setYCoordinate(2);
        
        String locationFiveInfo = locationFive.toString();
        System.out.println(locationFiveInfo);
        /*  End of LocationFive  ********/
        /*  Location Six Setup */
        LocationDetails locationSix = new LocationDetails();
        
        locationSix.setFood(2);
        locationSix.setWater(2);
        locationSix.setFuel(2);
        locationSix.setMunitions(2);
        locationSix.setCoin(2);
        locationSix.setArtifacts(3);
        locationSix.setGems(2);
        locationSix.setStatue(2);
        locationSix.setXCoordinate(2);
        locationSix.setYCoordinate(2);
        
        String locationSixInfo = locationSix.toString();
        System.out.println(locationSixInfo);
        /*  End of LocationSix  ********/
        /*  Location Seven Setup */
        LocationDetails locationSeven = new LocationDetails();
        
        locationSeven.setFood(2);
        locationSeven.setWater(2);
        locationSeven.setFuel(2);
        locationSeven.setMunitions(2);
        locationSeven.setCoin(2);
        locationSeven.setArtifacts(3);
        locationSeven.setGems(2);
        locationSeven.setStatue(2);
        locationSeven.setXCoordinate(2);
        locationSeven.setYCoordinate(2);
        
        String locationSevenInfo = locationSeven.toString();
        System.out.println(locationSevenInfo);
        /*  End of LocationSeven  ********/
        /*  Location Eight Setup */
        LocationDetails locationEight = new LocationDetails();
        
        locationEight.setFood(2);
        locationEight.setWater(2);
        locationEight.setFuel(2);
        locationEight.setMunitions(2);
        locationEight.setCoin(2);
        locationEight.setArtifacts(3);
        locationEight.setGems(2);
        locationEight.setStatue(2);
        locationEight.setXCoordinate(2);
        locationEight.setYCoordinate(2);
        
        String locationEightInfo = locationEight.toString();
        System.out.println(locationEightInfo);
        /*  End of LocationEight  ********/
        
        
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
        
        //calcMapSize check
        GameDifficultyControl difficultyCon1 = new GameDifficultyControl();
        difficultyCon1.calcMapSize( mapOne, status );
        mapInfo = mapOne.toString();
        System.out.println(mapInfo + " " + status.getStatusMessage());
        
        
        //populateMap check
        difficultyCon1.populateMap( mapOne, locationOne, locationTwo, locationThree, locationFour,
                locationFive, locationSix, locationSeven, locationEight, status);
        String allLocationInfo = locationOne.toString() + "\n" + locationTwo.toString() + "\n" 
                + locationThree.toString() + "\n" + locationFour.toString() + "\n" + locationFive.toString()
                + "\n" + locationSix.toString() + "\n" + locationSeven.toString() + "\n" + locationEight.toString();
        System.out.println(allLocationInfo);
    }
    
}
