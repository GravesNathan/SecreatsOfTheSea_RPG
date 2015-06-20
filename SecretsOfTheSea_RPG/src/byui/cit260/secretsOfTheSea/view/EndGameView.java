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
public class EndGameView extends View{
    
    public EndGameView(){
        super("\n Game Over"
                + "\n C - View Credits"
                + "\n V - View All Statuses"
                + "\n E - Exit Game"
                + "\n S - Start New Game");
    }
    
    public void viewCredits(){
        System.out.println("View Credits function stub");
    }
    
    public void exitGame(){
        System.out.println("Exit Game function stub");
    }
    
  @Override
    public boolean doAction(char entry){
        char value = entry;
    
        switch (value) {
            case 'C':
                this.viewCredits();
                return false;
            case 'E':
                this.exitGame();
                return false;
            case 'V':
		StatusesView status = new StatusesView();
		return false;
            case 'S':
                GameMenuView gamemenu = new GameMenuView();
                return false; 
            default:
                System.out.println("\n Invalid choice. Please try again.");
                return false;
        }
    }
}
