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

/**
 *
 * @author Nathan
 */
public class InventoryManagerView{
    
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
        System.out.println("\n");
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
                
                System.out.println(this.promptMessage);
		item = getInput.charInput();
                if (! ((item == 'F') || (item == 'W') ||(item == 'U') ||(item == 'M') 
                        ||(item == 'C') ||(item == 'A') ||(item == 'G')) ){
                    System.out.println("Invalid Input.  Please select from the following inventory");
                    continue;
                }
                }while (! ((item == 'F') || (item == 'W') ||(item == 'U') ||(item == 'M') 
                        ||(item == 'C') ||(item == 'A') ||(item == 'G')) );
                    
                do{
                System.out.println("What would you like to do with this item?"
                        + "\nD - Drop"
                        + "\nU - Use"
                        + "\nC - Close Inventory Manager");
                action = getInput.charInput();
                if (! ((action == 'D') || (action == 'U') ||(action == 'C')) ){
                    System.out.println("Invalid Input.  Please choose actions to take"
                            + "\n from the list below.");
                    continue;
                }
                else if (action == 'D')
                    strAction = "drop";
                else if (action == 'U')
                    strAction = "use";
                }while (! ((action == 'D') || (action == 'U') ||(action == 'C')) );

                do{
                System.out.println("Plese input the quantity to " + strAction);
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
        System.out.println("dropItem function stub");
    }
    

    public void useResource(){
        System.out.println("useResource function called.");
    }
    
}  
//    public void takeItem(){
//        System.out.println("takeItem function stub");
//    }  Take not option in inventory, I picture this in explorableAreas
//     after finding an item if player chooses to keep it.

//    public void viewResource(){
//        System.out.println("viewResourceView called (maybe in same view, separte output and prompt)");
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
//                        System.out.println("\n" + value + " is an invalid entry. Please select an option below:");
//                        return false;
//                }
//        }
