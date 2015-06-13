/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class ExplorableAreasView {
    
    public ExplorableAreasView(){
        String menu = this.displayOptions();
        char selection = ' ';
        do {
                System.out.println(menu);
		selection = this.getInput(menu);
		this.nextAction(selection);
        }while ( !(selection =='B'));
    }    //repeat until player Boards ship
    
    
    public String displayOptions(){
        String tempMenu = null;
        tempMenu = "You are on the SocientName island in the AreaName."
                + "\nPlese select what you would like to do"
                + "\nE - Explore the Area"
                + "\nM - Move to new Area"
                + "\nB - Board Ship"
                + "\nW - Work on Ship"
                + "\nX - Exchange Resources"
                + "\nI - Inventory Manager"
                + "\nV - View all Statuses"
                + "\nG - Game Menu\n";
        return tempMenu;
    }
    
    public char getInput(String menu){
        Scanner keyboard = new Scanner(System.in);
        char choice = ' ';
        boolean valid = false;
            //honestly, this just continues until the if is skipped and the break is executed.
            //if it wasn't for that it would continue forever.
        while(!valid){
            choice = Character.toUpperCase(keyboard.next().charAt(0));
            if ( !( choice == 'E' || choice == 'M' || choice =='B' || choice == 'W' || 
                    choice=='X' || choice == 'I' || choice=='V' || choice == 'G' )){
                System.out.println( "Invalid entry\n" + menu );
            }
            break;
        }
        
        return choice;
    }

    public void exploreAreaControl(){
        System.out.println("exploreAreaControl method called");
    }
    
    public void onShipView(){
        System.out.println("onShipView method called");
    }
    
    public void moveAreaControl(){
        System.out.println("moveAreaControl Stub");
    }
            
    public void workOnShipControl(){
        System.out.println("workOnShipControl method called");
    }
    
    public void exchangeViewStub(){
        System.out.println("exchangeViewStub called");
    }
    
    public void tempInvStub(){
        System.out.println("holder for future inventory view");
    }
    
    public void tempStatusView(){
        System.out.println("holder for future statuses view");
    }
    
    public void nextAction(char choice){
        switch (choice) {
            case 'E':
		this.exploreAreaControl();
		break;
            case 'M':
		this.moveAreaControl();
		break;
            case 'B':
		this.onShipView();
		break;
            case 'W':
		this.workOnShipControl();
		break;
            case 'X':
                this.exchangeViewStub();
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
