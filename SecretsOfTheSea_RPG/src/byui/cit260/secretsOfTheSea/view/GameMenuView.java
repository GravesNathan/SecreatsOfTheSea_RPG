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
public class GameMenuView {
    
    public GameMenuView(){
        String menu = this.displayGameMenu();
        char selection = ' ';
        do {
                System.out.println(menu);
		selection = this.getInput(menu);
		this.nextAction(selection);
        }while ( !( selection =='Q' || selection == 'C'  ));
    }//Repeat until the player chooses to close the menu or quit the game.
    
    
    public String displayGameMenu(){
        String tempMenu = null;
        tempMenu = "Game Menu Options"
                + "\nS - Save Game"
                + "\nH - Help"
                + "\nQ - Quit Game"
                + "\nC - Close Menu"
                + "\nI - Inventory Manager"
                + "\nV - View all Statuses\n";
        return tempMenu;
    }
    
    public char getInput(String menu){
        Scanner keyboard = new Scanner(System.in);
        char choice = ' ';
        boolean valid = false;
            //honestly, this just continues until the if is skipped and the break is executed.
            //if it wasn't for that it woudl continue forever.
        while(!valid){
            choice = Character.toUpperCase(keyboard.next().charAt(0));
            if ( !( choice == 'S' || choice == 'H' || choice =='Q' || choice == 'C' || 
                    choice=='I' || choice=='V' )){
                System.out.println( "Invalid entry\n" + menu );
            }
            break;
        }
        
        return choice;
    }

    public void saveGame(){
        System.out.println("saveGame method called");
    }
    
    public void quitGame(){
        System.out.println("quitGame method called");
    }
    
    public void closeMenu(){
        System.out.println("closeMenu method called");
    }
    
    public void tempInvStub(){
        System.out.println("holder for future inventory view");
    }
    
    public void tempStatusView(){
        System.out.println("holder for future statuses view");
    }
    
    public void nextAction(char choice){
/*        switch (choice) {
            case 'S':
		this.saveGame();
		break;
            case 'H':
		HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
		break;
            case 'Q':
		this.quitGame();
		break;
            case 'C':
		this.closeMenu();
		break;
            case 'I':
		this.tempInvStub();
		break;
            case 'V':
		this.tempStatusView();
		break;
            default:
                System.out.println("Invalid choice");
        } 
Commented temporarily to fulfil the if else if ladder requirement*/
        if (choice == 'S')
            this.saveGame();
            else if (choice == 'H'){
                HelpMenuView helpMenu = new HelpMenuView();
                helpMenu.displayMenu();
            }
                else if (choice == 'Q')
                    this.quitGame();
                    else if (choice == 'C')
                        this.closeMenu();
                        else if (choice == 'I')
                            this.tempInvStub();
                            else if (choice == 'V')
                                this.tempStatusView();
    }
}