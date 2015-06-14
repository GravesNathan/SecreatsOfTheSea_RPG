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
public class ExchangeView {
    public ExchangeView(){
        String menu = this.displayOptions();
        char selection = ' ';
        do {
                System.out.println(menu);
                selection = this.getInput(menu);
                this.nextAction(selection);
        }while (!(selection =='C'));
    }   //repeat until player closes Exchange/Trading view
    
    public String displayOptions(){
        String tempMenu = null;
        tempMenu = "Exchanging / Trading Resouces can be tricky.  Make sure you know that those you trade with may not offer fair trades."
                + "\n"
                + "\n Please choose a trade option below:"
                + "\n O - Offer Trade"
                + "\n A - Accept Trade Terms"
                + "\n C - Close Exchange Menu"
                + "\n I - Inventory Menu"
                + "\n V - View Status"
                + "\n G - Game Menu \n";
                return tempMenu;
    }
                
    public char getInput(String menu){
        Scanner keyboard = new Scanner(System.in);
        char choice = ' ';
        boolean valid = false;
        while(!valid){
            choice = Character.toUpperCase(keyboard.next().charAt(0));
            if  ( !( choice == 'O' || choice == 'A' || choice =='C' || choice == 'I' || 
                    choice=='V' || choice == 'G' )){
                System.out.println( "Invalid entry\n" + menu );
            }
            break;
        }
        return choice;
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

    public void tempInvStub(){
        System.out.println("holder for future inventory view");
    }
    
    public void tempStatusView(){
        System.out.println("holder for future statuses view");
    }  
        
    
    public void nextAction(char choice){
//        switch (choice) {
//            case 'O':
//		this.offerTradeControl();
//		break;
//            case 'X':
//		break;
//            case 'A':
//		this.acceptTradeControl();
//		break;
//            case 'C':
//		this.closeTradeControl();
//		break;
//            case 'I':
//		this.tempInvStub();
//		break;
//            case 'V':
//		this.tempStatusView();
//		break;
//            case 'G':
//		GameMenuView gameMenu = new GameMenuView();
//		break;
//            default:
//                System.out.println("Invalid choice");
        
                if (choice == 'O')
            this.offerTradeControl();
            else if (choice == 'A'){
                this.offerTradeControl();
            }
                else if (choice == 'C')
                    this.closeTradeControl();
                    else if (choice == 'I')
                        this.tempInvStub();
                        else if (choice == 'V')
                            this.tempStatusView();
    }
}
