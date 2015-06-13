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
public class HelpMenuView {
    
    public  HelpMenuView(){
        
}
 
    void displayMenu() {
        System.out.println("\n****HELP MENU***"
                + "\n"
                + "\nHotkey - Description"
                + "\n G - What is the Goal of the Game?"
                + "\n H - Health Explained"
                + "\n M - How to Move"
                + "\n R - Resource Types"
                + "\n S - Societies"
                + "\n T - Trust Levels"                
                + "\n Q - Quit Menu"
                + "\n ");
            this.displayMenuInput();
    }
    
    /*Editted existing code so that the returnHelpMenu is called from the switch
    Removed any call from the quitMenu option causing it to break.  This setup allows
    the help menu to return to previous view instead of just to the startGameView.
    Week 7 material has a nice layout once you get use to it.  I've implemented
    with constructors in ExplorableAreas and GameMenuView.  it allows the Views
    to return to previous view when they are done executing with ease.
    */
    public void displayMenuInput(){
        char helpMenuChoice;
        Scanner reader = new Scanner(System.in);
        helpMenuChoice = Character.toUpperCase(reader.next().charAt(0));
        switch (helpMenuChoice) {
            case 'G':
                this.describeGameGoal();
                this.returnHelpMenu();
                break;
            case 'H':
                this.healthExplained();
                this.returnHelpMenu();
                break;
            case 'M':
                this.howToMove();
                this.returnHelpMenu();
                break;
            case 'R':
                this.resourceTypes();
                this.returnHelpMenu();
                break;
            case 'S':
                this.societyHelp();
                this.returnHelpMenu();
                break; 
            case 'T':
                this.trustLevelsExplained();
                this.returnHelpMenu();
                break;                
            case 'Q':
                //this.quitMenu();
                break;
            default:
                System.out.println(helpMenuChoice + " is an invalid entry. Please select an option below:"
                + "\nHotkey - Description"
                + "\n G - What is the Goal of the Game?"
                + "\n H - Health Explained"
                + "\n M - How to Move"
                + "\n R - Resource Types"
                + "\n S - Societies"
                + "\n T - Trust Levels"                
                + "\n Q - Quit Menu"
                + "\n ");
            this.displayMenuInput();
        }
    }

    private void describeGameGoal() {
        System.out.println("\n *** What is the Goal of the Game: ***"
                        + "\n"
                        + "\n The goal of the game is to gather up all of the 8 statues."
                        + "\n You have been given the first statue by your own people, you "
                        + "\n must now travel the Seas to find other the other societies"
                        + "\n that have the remaining statues."
                        + "\n"
                        + "\n Be mindful that you won't be trusted at first.  You must use"
                        + "\n your wit, charm, strength and guile to win over each society"
                        + "\n so that you can find all of the statues without finding yourself"
                        + "\n swimming with the sharks."
                        + "\n "
        );
    }

    
    private void healthExplained() {
        System.out.println("\n *** HEALTH EXPLAINED ***"
                        + "\n"
                        + "\n As you travel through the game you and your crew will face ."
                        + "\n storms at sea, hunger, thirst, and the possibility of an "
                        + "\n angry society."
                        + "\n"
                        + "\n The type of ship you select will have varying levels of ability"
                        + "\n to withstand these trials.  Choose wisely and be sure to repair"
                        + "\n your ship as needed."
                        + "\n "
        );
    }



    private void howToMove() {
        System.out.println("\n *** HOW TO MOVE ***"
                        + "\n"
                        + "\n Enter Description Here."
                        + "\n"
                        + "\n"
        );
    }

    private void resourceTypes() {
        System.out.println("\n *** RESOURCE TYPES ***"
                        + "\n"
                        + "\n Enter Description Here."
                        + "\n"
                        + "\n"
        );
    }

    private void societyHelp() {
        System.out.println("\n *** SOCIETIES EXPLAINED ***"
                        + "\n"
                        + "\n Enter Description Here."
                        + "\n"
                        + "\n"
        );
    }

    private void trustLevelsExplained() {
        System.out.println("\n *** TRUST LEVELS EXPLAINED ***"
                        + "\n"
                        + "\n Enter Description Here."
                        + "\n"
                        + "\n"
                            );
    }
    
        public void quitMenu() {
        //StartProgramView returnToStart = new StartProgramView();
        //returnToStart.startMenuDisplay();
        //This will return the user to the main game menu but ends the program.  
        //Ideal action would be to return to calling menu (Main or Game)
        //Need help figuring this part out.
    }
       
        public void returnHelpMenu(){
        String input1 = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Press ENTER to Proceed.");
        input1 = keyboard.nextLine();
        this.displayMenu();
    }
}
