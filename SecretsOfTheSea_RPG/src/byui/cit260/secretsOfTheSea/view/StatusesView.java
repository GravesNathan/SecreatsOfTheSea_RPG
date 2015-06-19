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
public class StatusesView extends View{
    
    public StatusesView(){
        super("\n Current Game Statuses"
                + "\nC - Close Inventory Manager"
                + "\nG - Game Menu View");
    }
    
        
    @Override
    public boolean doAction(char entry){
        char value = entry;
        
        switch (value) {
            case 'G':
                GameMenuView gamemenu = new GameMenuView();
                return false; 
            case 'C'://closes inventory manager view
                return true;                
            default:
                System.out.println(value + " is an invalid entry. Please select an option below:");
                return false;
        }
    }
}
