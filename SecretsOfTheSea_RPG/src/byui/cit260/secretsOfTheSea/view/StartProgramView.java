/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.InitializeControl;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class StartProgramView {
    
    public StartProgramView(){
        
    }    
        
    public void startProgram(){
        char mainInput;
        this.displayBanner();
        InitializeControl initialize = new InitializeControl();
        initialize.initializeGame();
        this.startupInput();
        this.startMenuDisplay();
        mainInput = this.startMenuInput();
        this.startMenuChoice(mainInput);
    }

    public void displayBanner (){
        System.out.println("\n\n*********************************************");
        System.out.println("\n        Secrets of the Sea");
        System.out.println("The Best Treasure hunting game ever!");
        System.out.println("\n**********************************************");
        
        System.out.println(""
                + "\nSecrets of the Sea is a text-based role playing adventure. In this game, you will be taking on the"
                + "\nrole as captain of a ship. You will navigate 7 ports and 22 excavation sites as you seek to acquire 8"
                + "\nhighly valuable statues. On each token there is a piece of an ancient inscription, and when all 8 are "
                + "\nput together a secret code is unlocked."
                + "\n\nAs time has gone on, the statues have changed from history to possible myths. Some believe in"
                + "\ntheir ability to unlock hidden treasure, while others think it is nothing by a made up story."
                + "\nLeverage your crew & ship to gain access to the ports where you can then explore the sites."
                + "\nUpon gaining equipment and other necessities, voyages will be chosen to not only find these hidden statues, "
                + "\nbut to survive the now tumultuous atmosphere of the world."
                + "\n\nAs you travel you will encounter different societies, each will respond differently to your approach"
                + "\n(Diplomacy, Intimidation, Bribery, Deceit)"
                + "\nAfter picking a crew/ship and packing a ship, you will as captain, lead your team on an adventure of a lifetime."
                + "\nThose who preserve and work together are likely to unlock the mysteries awaiting on both sea and land."
                + "\n");
        
        System.out.println("\n Hope you have a fun time.");
    }
    
    public void startupInput(){
        String input1 = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Press Enter to Proceed.");
        input1 = keyboard.nextLine();
    }
    
    public void startMenuDisplay(){
        System.out.println("Please select an option below"
                + "\nHotkey - Description"
                + "\nG - Start Game"
                + "\nH - Get Help"
                + "\nL - Load Game"
                + "\nQ - Quit Game"
                + "\n");
    }
    
    public char startMenuInput(){
        char input;
        Scanner reader = new Scanner(System.in);
        input = Character.toUpperCase(reader.next().charAt(0));
        while(!((input == 'G') || (input == 'H') || (input == 'L') || (input == 'Q'))){
        System.out.println(input + " is an invalid entry. Please select an option below:"
            + "\nHotkey - Description"
            + "\nG - Start Game"
            + "\nH - Get Help"
            + "\nL - Load Game"
            + "\nQ - Quit Game");
            input = Character.toUpperCase(reader.next().charAt(0));
        }
        return input;
        //do-while and while loops, continue if condition is true. Exit when false.
    }
    
    public void startMenuChoice(char userChoice){
        MainMenuView mMView = new MainMenuView();
        switch (userChoice) {
            case 'G':
                mMView.newGame();
                break;
            case 'H':
                mMView.openHelp();
                break;
            case 'L':
                mMView.loadGame();
                break;
            case 'Q':
                mMView.quitGame();
                break;
            default:
                System.out.println("\n Invalid Selection *** Try again");
        }
    }
    
}
    
/******** String Compare with compareTo  ************
      public void startMenuInput(){
        String input;
        Scanner keyboard = new Scanner(System.in);
    do {
        input = keyboard.nextLine();
        input = input.trim();
        System.out.println("Invalid Entry. Please select an option below"
            + "\nHotkey - Description"
            + "\nG - Start Game"
            + "\nH - Get Help"
            + "\nL - Load Game"
            + "\nQ - Quit Game"
            + "\ninput = " + input);
    }while(!((input.compareTo("g"))==0));// || (input == 'G') || (input == 'h') || (input == 'H') || (input == 'l') || (input == 'L') || (input == 'q') || (input == 'Q') ) );
        //do-while and while loops, continue if condition is true. Exit when false.
    // 0 is false so if 0 == 0 then it's true and ! again turns it false.
    }
*/
