/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.MapControl;
import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;

/**
 *
 * @author SDababneh
 */
public class TrustTrialView extends View{
    
    public TrustTrialView(NewGameControl username, MapControl map, ShipSelectionControl playerShip){
        super("\n Trust Trial"
                + "\n D - Diplomatic Approach"
                + "\n S - Scare Tactics/Intimidation Approach"
                + "\n B - Bribery Approach"
                + "\n T - Treachery/Deceit Approach"
                + "\n F - Flee the Island"
                + "\n I - Inventory Manager"
                + "\n V - View All Statuses"
                + "\n G - Game Menu View", username, map, playerShip);
    }
    
    public void diplomaticApproach(){
        System.out.println("Diplomatic Approach function stub");
    }

    public void intimidationApproach(){
        System.out.println("Intimidation Approach function stub");
    }
        
    public void briberyApproach(){
        System.out.println("Bribery Approach function stub");
    }
    
    public void deceitApproach(){
        System.out.println("Deceit Approach function stub");
    }
    
    public void fleeApproach(){
        System.out.println("Flee Approach function stub");
    }
    
    @Override
    public boolean doAction(char entry){
        char value = entry;
        
        switch (value) {
            case 'D':
                this.diplomaticApproach();
                return false;
            case 'S':
                this.intimidationApproach();
                return false;
            case 'B':
                this.briberyApproach();
                return false;
            case 'T':
                this.deceitApproach();
                return false;
            case 'F':
                this.fleeApproach();
                return false;
            case 'I':
		InventoryManagerView inventory = new InventoryManagerView(tempUsername, tempMap, tempPlayerShip);
		return false;
            case 'V':
		StatusesView status = new StatusesView(tempUsername, tempMap, tempPlayerShip);
		return false;
            case 'G':
                GameMenuView gamemenu = new GameMenuView(tempUsername, tempMap, tempPlayerShip);
                return false; 
            default:
                System.out.println("\n Invalid choice. Please try again.");
                return false;
        }
    }
    
}
