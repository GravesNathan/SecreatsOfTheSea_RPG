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
public class ExplorableAreasView extends View {
    
    public ExplorableAreasView(){
                super("You are on the SocientName island in the AreaName."
                + "\nPlese select what you would like to do"
                + "\nE - Explore the Area"
                + "\nM - Move to new Area"
                + "\nB - Board Ship"
                + "\nW - Work on Ship"
                + "\nX - Exchange Resources"
                + "\nI - Inventory Manager"
                + "\nV - View all Statuses"
                + "\nG - Game Menu\n");
            }
    
    
    public void exploreAreaControl(){
        System.out.println("exploreAreaControl method called");
    }
    
    public void onShipView(){
        System.out.println("onShipView method called");
        //load OnShipView
    }
    
    public void moveAreaControl(){
        System.out.println("moveAreaControl Stub");
    }
            
    public void workOnShipControl(){
        System.out.println("workOnShipControl method called");
    }
    
    public void exchangeView(){
        System.out.println("exchangeViewStub called");
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
            case 'E':
		this.exploreAreaControl();
		break;
            case 'M':
		this.moveAreaControl();
		break;
            case 'B':
                OnShipView loadShipView = new OnShipView();
		break;
            case 'W':
		this.workOnShipControl();
		break;
            case 'X':
                ExchangeView exchangeView = new ExchangeView();
                //this.exchangeViewStub();
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
                System.out.println("\n ***Invalid choice***");
                return false;
        } 
        
        return true;
    }
    
}
