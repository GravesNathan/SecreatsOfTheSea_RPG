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
public class GameMenuView extends View{
    
    public GameMenuView(){
//        String menu = this.displayGameMenu();
//        char selection = ' ';
//        do {
//                System.out.println(menu);
//		selection = this.getInput(menu);
//		this.nextAction(selection);
//        }while ( !( selection =='Q' || selection == 'C'  ));
//    }//Repeat until the player chooses to close the menu or quit the game.
    
    
//    private String displayGameMenu(){
//        String tempMenu = null;
//        tempMenu = 
                super("\n Game Menu Options"
                + "\n S - Save Game"
                + "\n H - Help"
                + "\n Q - Quit Game"
                + "\n C - Close Menu"
                + "\n I - Inventory Manager"
                + "\n V - View all Statuses\n");
//        return tempMenu;
//    }
    }
    
//    public char getInput(String menu){
//        Scanner keyboard = new Scanner(System.in);
//        char choice = ' ';
//        boolean valid = false;
//            //honestly, this just continues until the if is skipped and the break is executed.
//            //if it wasn't for that it woudl continue forever.
//        while(!valid){
//            choice = Character.toUpperCase(keyboard.next().charAt(0));
//            if ( !( choice == 'S' || choice == 'H' || choice =='Q' || choice == 'C' || 
//                    choice=='I' || choice=='V' )){
//                System.out.println( "Invalid entry\n" + menu );
//            }
//            break;
//        }
//        
//        return choice;
//    }

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
    
    @Override
    public boolean doAction(char entry){
        //return false to stay in same menu, return true to exit this view to previous view
        //also return false for invalid input to repeat the view with the display function
        char value = entry;
        
        switch (value) {
            case 'S':
		this.saveGame();
		return false;
            case 'H':
		HelpMenuView helpMenu = new HelpMenuView();
//                helpMenu.displayMenu();
		return false;
            case 'Q':
		this.quitGame();
		return true;
            case 'C':
		this.closeMenu();
		return true;
            case 'I':
		this.tempInvStub();
		return false;
            case 'V':
		this.tempStatusView();
		return false;
            default:
                System.out.println("Invalid choice.  Please try again.");
                return false;
        } 
    }
}
