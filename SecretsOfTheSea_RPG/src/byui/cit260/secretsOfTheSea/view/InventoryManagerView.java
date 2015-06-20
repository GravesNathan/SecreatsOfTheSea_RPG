/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

/**
 *
 * @author Nathan
 */
public class InventoryManagerView extends View{
    
    public InventoryManagerView(){
        super("\n Inventory Manager"
                + "\nD - Drop Resource"
                + "\nT - Take Resource"
                + "\nV - View Resource"
                + "\nU - Use Resource"
                + "\nG - Game Menu View"
                + "\nC - Close Inventory Manager");
    }
    
    public void dropItem(){
        System.out.println("dropItem function stub");
    }
    
    public void takeItem(){
        System.out.println("takeItem function stub");
    }

    public void viewResource(){
        System.out.println("viewResourceView called (maybe in same view, separte output and prompt)");
    }
    
    public void useResource(){
        System.out.println("useResource function called.");
    }
    
        
    @Override
    public boolean doAction(char entry){
        char value = entry;
        
        switch (value) {
            case 'D':
                this.dropItem();
                return false;
            case 'T':
                this.takeItem();
                return false;
            case 'V':
                this.viewResource();//unsure if needed or purpose.  perhaps to describe what the items are used for.
                return false;
            case 'U':
                this.useResource();
                return false;
            case 'G':
                GameMenuView gamemenu = new GameMenuView();
                return false; 
            case 'C'://closes inventory manager view
                return true;                
            default:
                System.out.println("\n" + value + " is an invalid entry. Please select an option below:");
                return false;
        }
    }
}
