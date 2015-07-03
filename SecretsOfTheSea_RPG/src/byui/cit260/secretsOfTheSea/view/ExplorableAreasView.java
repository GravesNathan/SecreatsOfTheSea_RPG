/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.MapControl;
import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;
import byui.cit260.secretsOfTheSea.exceptions.CharInputException;

/**
 *
 * @author Nathan
 */
public class ExplorableAreasView extends View {
    
    public ExplorableAreasView(NewGameControl username, MapControl map, ShipSelectionControl playerShip){
                super("You are on the SocientName island in the AreaName."
                + "\nPlese select what you would like to do"
                + "\nE - Explore the Area"
                + "\nM - Move to new Area"
                + "\nB - Board Ship"
                + "\nW - Work on Ship"
                + "\nX - Exchange Resources"
                + "\nI - Inventory Manager"
                + "\nV - View all Statuses"
                + "\nG - Game Menu\n", username, map, playerShip);
            }
    
    
    public void exploreAreaControl(){
        System.out.println("exploreAreaControl method called");
    }
    
    public void onShipView(){
        System.out.println("onShipView method called");
        //load OnShipView
    }
    
    public void moveAreaControl(){
        System.out.println("moveAreaControl Stub");
    }
            
    public void workOnShipControl(){
        System.out.println("workOnShipControl method called");
    }
    
    public void exchangeView(){
        System.out.println("exchangeViewStub called");
    }

    @Override
    public boolean doAction(char entry) {
        char value = entry;
        try{
        switch (value) {
            case 'E':
		this.exploreAreaControl();
		return false;
            case 'M':
		this.moveAreaControl();
		return false;
            case 'B':
                OnShipView loadShipView = new OnShipView(tempUsername, tempMap, tempPlayerShip);
		return true;
            case 'W':
		this.workOnShipControl();
		return false;
            case 'X':
                ExchangeView exchangeView = new ExchangeView(tempUsername, tempMap, tempPlayerShip);
                return false;
            case 'I':
		InventoryManagerView inventory = new InventoryManagerView(tempUsername, tempMap, tempPlayerShip);
		return false;
            case 'V':
		StatusesView statuses = new StatusesView(tempUsername, tempMap, tempPlayerShip);
		return false;
            case 'G':
		GameMenuView gameMenu = new GameMenuView(tempUsername, tempMap, tempPlayerShip);
		return false;
            default:
                throw new CharInputException("\n\n" +entry + " is an invalid input at this time \n"
                        + "Please provide acceptable input from the menu below.\n");
        }
        }catch (CharInputException cie){
                System.out.println(cie.getMessage());
                return false;
        } 
    }
}
