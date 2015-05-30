/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea_rpg;

import byui.cit260.secretsOfTheSea.control.GameDifficultyControl;
import byui.cit260.secretsOfTheSea.control.StartControl;
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
        
        StartControl startup = new StartControl();
        startup.initializeGame();
    }
    
}
