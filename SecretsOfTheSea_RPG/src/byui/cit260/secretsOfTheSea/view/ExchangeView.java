/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

/**
 *
 * @author SDababneh
 */
public class ExchangeView extends View {
    
    public ExchangeView(){
                super("Exchanging / Trading Resouces can be tricky.  Make sure you know that those you trade with may not offer fair trades."
                + "\n"
                + "\n Please choose a trade option below:"
                + "\n O - Offer Trade"
                + "\n A - Accept Trade Terms"
                + "\n C - Close Exchange Menu"
                + "\n I - Inventory Menu"
                + "\n V - View Status"
                + "\n G - Game Menu \n");
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
		this.tempInvStub();
		return false;
            case 'V':
		this.tempStatusView();
		return false;
            case 'G':
		GameMenuView gameMenu = new GameMenuView();
		return false;
            default:
                System.out.println("Invalid choice");
                return false;
        }
    }
}
