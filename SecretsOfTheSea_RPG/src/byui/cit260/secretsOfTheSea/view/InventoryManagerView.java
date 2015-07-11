/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.InventoryControl;
import byui.cit260.secretsOfTheSea.control.MapControl;
import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;
import byui.cit260.secretsOfTheSea.model.Items;
import java.io.PrintWriter;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class InventoryManagerView{
    
    protected final PrintWriter console = SecretsOfTheSea_RPG.getOutFile();
    
    private String promptMessage;
//    private NewGameControl tempUsername = null;
//    private MapControl tempMap = null;
//    private ShipSelectionControl tempPlayerShip= null;
    private InventoryControl tempInventory = null;
    private InputView getInput = new InputView();
    char item;
    char action ;
    int quantity =0;
    String strAction = "";
    
    public InventoryManagerView(NewGameControl username, MapControl map, 
            ShipSelectionControl playerShip, InventoryControl inventory){
//        tempUsername = username;  
//        tempMap = map;
//        tempPlayerShip= playerShip;
        tempInventory = inventory;
        this.console.println("\n");
        this.promptMessage = ("\n                   Inventory Manager"
                +"\n Please select a resource or close the inventory manager."
                + inventory.cargoToString()
                + "\n\nC - Close Inventory Manager");
        this.display();
    }
    
    public void display(){
        boolean done = false;
        do {
                do{
                
                this.console.println(this.promptMessage);
		item = getInput.charInput();
                if (! ((item == 'F') || (item == 'W') ||(item == 'U') ||(item == 'M') 
                        ||(item == 'C') ||(item == 'A') ||(item == 'G')) ){
                    ErrorView.display(this.getClass().getName(),"Invalid Input.  Please select from the following inventory");
                    continue;
                }
                }while (! ((item == 'F') || (item == 'W') ||(item == 'U') ||(item == 'M') 
                        ||(item == 'C') ||(item == 'A') ||(item == 'G')) );
                    
                do{
                this.console.println("What would you like to do with this item?"
                        + "\nD - Drop"
                        + "\nU - Use"
                        + "\nC - Close Inventory Manager");
                action = getInput.charInput();
                if (! ((action == 'D') || (action == 'U') ||(action == 'C')) ){
                    ErrorView.display(this.getClass().getName(),"Invalid Input.  Please choose actions to take"
                            + "\n from the list below.");
                    continue;
                }
                else if (action == 'D')
                    strAction = "drop";
                else if (action == 'U')
                    strAction = "use";
                }while (! ((action == 'D') || (action == 'U') ||(action == 'C')) );

                do{
                this.console.println("Plese input the quantity to " + strAction);
                quantity = getInput.intInput();
                //Need to make this detect if quantity > currentItems.
                //This may be easier handled by calling the control layer and
                //making a function to check here.  Instead of below
                }while ((quantity<=0));//||(quantity > ))

		done = this.doAction(item, action, quantity);
                
        }while (!done);
    }
    
        public boolean doAction(char item, char action, int quantity){
            
                switch (action) {
                    case 'D':
                        this.dropItem();
                        return false;
                    case 'U':
                        this.useResource();
                        return false;
                    case 'C':
                        return true;
                    default:
                        return true;//change to a throw later.
                }
        }

    public void dropItem(){
        this.console.println("dropItem function stub");
    }
    

    public void useResource(){
        this.console.println("useResource function called.");
    }
    
}  
//    public void takeItem(){
//        this.console.println("takeItem function stub");
//    }  Take not option in inventory, I picture this in explorableAreas
//     after finding an item if player chooses to keep it.

//    public void viewResource(){
//        this.console.println("viewResourceView called (maybe in same view, separte output and prompt)");
//    }  Don't see point in this anymore.
    


        //Add a throw for error detecting correct input.  Then close inventory manager


//                    case 'T':
//                        this.takeItem();
//                        return false;
//                    case 'V':
//                        this.viewResource();//unsure if needed or purpose.  perhaps to describe what the items are used for.
//                        return false;
                    
//        //            case 'G':  Took off so we don't have an endless loop of inventory, game menu
//        //                GameMenuView gamemenu = new GameMenuView();
//        //                return false; 
//                    case 'C'://closes inventory manager view
//                        return true;                
//                    default:
//                        this.console.println("\n" + value + " is an invalid entry. Please select an option below:");
//                        return false;
//                }
//        }
