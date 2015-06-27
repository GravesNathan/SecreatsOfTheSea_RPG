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
public class ExchangeView extends View {
    
    public ExchangeView(NewGameControl username, MapControl map, ShipSelectionControl playerShip){
                super("Exchanging / Trading Resouces can be tricky.  Make sure you know that those you trade with may not offer fair trades."
                + "\n"
                + "\n Please choose a trade option below:"
                + "\n O - Offer Trade"
                + "\n A - Accept Trade Terms"
                + "\n C - Close Exchange Menu"
                + "\n I - Inventory Menu"
                + "\n V - View Status"
                + "\n G - Game Menu \n", username, map, playerShip);
    }

    
    public void offerTradeControl(){
        System.out.println("offerTradeControl stub");
    }
    
    public void acceptTradeControl(){
        System.out.println("acceptTradeControl stub");
    }
    
    public void closeTradeControl(){
        System.out.println("closeTradeControl stub");
    }
      
    @Override
    public boolean doAction(char entry){
        char value = entry;
        
        switch (value) {
            case 'O':
		this.offerTradeControl();
		return false;
            case 'X':
		return false;
            case 'A':
		this.acceptTradeControl();
		return false;
            case 'C':
		this.closeTradeControl();
		return true;
            case 'I':
		InventoryManagerView inventory = new InventoryManagerView(tempUsername, tempMap, tempPlayerShip);
		return false;
            case 'V':
		StatusesView status = new StatusesView(tempUsername, tempMap, tempPlayerShip);
		return false;
            case 'G':
		GameMenuView gameMenu = new GameMenuView(tempUsername, tempMap, tempPlayerShip);
		return false;
            default:
                System.out.println("\n Invalid choice. Please try again.");
                return false;
        }
    }
}
