/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.MapControl;
import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;
import java.util.Scanner;

/**
 *
 * @author SDababneh
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    protected NewGameControl tempUsername = null;
    protected MapControl tempMap = null;
    protected ShipSelectionControl tempPlayerShip= null;
    
    public View(String promptMessage, NewGameControl username, MapControl map, ShipSelectionControl playerShip) {
        tempUsername = username;  
        tempMap = map;
        tempPlayerShip= playerShip;
        System.out.println("\n");
        this.promptMessage = promptMessage;
        this.display();
    }
    
    @Override
    public void display(){
        boolean done = false;
        char value = ' ';
        do {
                System.out.println(this.promptMessage);
		value = this.getInput();
		done = this.doAction(value);
                //doAction in sub-class return true to stay in
                //same view.  return false to end the view and return to previous view
                //also return false from doAction when an invalid value is input.
        }while (!done);
    }//Repeat until the player chooses to close the menu or quit the game.
    

    
    @Override
    public char getInput(){
        Scanner keyboard = new Scanner(System.in);
        char value = ' ';
        //boolean valid = false;
            //honestly, this just continues until the if is skipped and the break is executed.
            //if it wasn't for that it woudl continue forever.
        //while(!valid){
            value = Character.toUpperCase(keyboard.next().charAt(0));
        //    if ( !( value == 'S' || value == 'H' || value =='Q' || value == 'C' || 
        //            value=='I' || value=='V' )){
        //        System.out.println( "Invalid entry. \n" );
        //    }
        //    break;
        //}
        
        return value;  //return the user input.
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
}

