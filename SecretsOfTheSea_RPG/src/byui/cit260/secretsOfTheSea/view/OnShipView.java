/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import java.util.Scanner;

/**
 *
 * @author SDababneh
 */
public class OnShipView {
 
    public OnShipView(){
        String menu = this.displayOptions();
        char selection = ' ';
        do {
                System.out.println(menu);
                selection = this.getInput(menu);
                this.nextAction(selection);
        }while (!(selection =='D'));
    }   //repeat until player leaves ship
    
    public String displayOptions(){
        String tempMenu = null;
        tempMenu = "You are now aboard your ship.  What would you like to do?"
                + "\n"
                + "\n Please choose an option below:"
                + "\n L - Launch the ship"
                + "\n D - Dock/Leave the ship"
                + "\n W - Work on(Repair) the ship"
                + "\n I - View Inventory"
                + "\n V - View all Statuses"
                + "\n G - Game Menu \n";
                return tempMenu;
    }
                
    public char getInput(String menu){
        Scanner keyboard = new Scanner(System.in);
        char choice = ' ';
        boolean valid = false;
        while(!valid){
            choice = Character.toUpperCase(keyboard.next().charAt(0));
            if  ( !( choice == 'L' || choice == 'D' || choice =='W' || choice == 'I' || 
                    choice=='V' || choice == 'G' )){
                System.out.println( "Invalid entry\n" + menu );
            }
            break;
        }
       
        return choice;
}
    
    public void launchShipControl(){
        System.out.println("launchShipControl stub");
    }
    
    public void workOnShipControl(){
        System.out.println("workOnShip stub");
    }

    public void tempInvStub(){
        System.out.println("holder for future inventory view");
    }
    
    public void tempStatusView(){
        System.out.println("holder for future statuses view");
    }  
        
    
    public void nextAction(char choice){
        switch (choice) {
            case 'L':
		this.launchShipControl();
		break;
            case 'D':
		break;
            case 'W':
		this.workOnShipControl();
		break;
            case 'I':
		this.tempInvStub();
		break;
            case 'V':
		this.tempStatusView();
		break;
            case 'G':
		GameMenuView gameMenu = new GameMenuView();
		break;
            default:
                System.out.println("Invalid choice");
        } 
    }
}
