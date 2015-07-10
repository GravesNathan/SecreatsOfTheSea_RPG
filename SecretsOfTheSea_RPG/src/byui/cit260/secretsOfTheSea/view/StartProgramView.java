/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.InitializeControl;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class StartProgramView {
    
    public StartProgramView(){
        
    }
    private final BufferedReader keyboard = SecretsOfTheSea_RPG.getInFile();
    InputView input = new InputView(); 
    
    public void startProgram(){
        char mainInput;
        this.displayBanner();
        InitializeControl initialize = new InitializeControl();
        initialize.initializeGame();
        this.startupInput();
        do {//Followed this week's paturn to make this continue when help is the option.  Stops otherwise.
            mainInput = this.startMenuDisplay();
        }while (!((mainInput == 'G') || (mainInput == 'L') || (mainInput == 'Q')));

    }

    public void displayBanner (){
        System.out.println("\n\n *********************************************");
        System.out.println("\n        Secrets of the Sea");
        System.out.println(" The Best Treasure hunting game ever!");
        System.out.println("\n **********************************************");
        
        System.out.println(""
                + "\n Secrets of the Sea is a text-based role playing adventure. In this game, you will be taking on the"
                + "\n role as captain of a ship. You will navigate 7 ports and 22 excavation sites as you seek to acquire 8"
                + "\n highly valuable statues. On each token there is a piece of an ancient inscription, and when all 8 are "
                + "\n put together a secret code is unlocked."
                + "\n"
                + "\n As time has gone on, the statues have changed from history to possible myths. Some believe in"
                + "\n their ability to unlock hidden treasure, while others think it is nothing by a made up story."
                + "\n Leverage your crew & ship to gain access to the ports where you can then explore the sites."
                + "\n Upon gaining equipment and other necessities, voyages will be chosen to not only find these hidden statues, "
                + "\n but to survive the now tumultuous atmosphere of the world."
                + "\n"
                + "\n As you travel you will encounter different societies, each will respond differently to your approach"
                + "\n(Diplomacy, Intimidation, Bribery, Deceit)"
                + "\n"
                + "\n After picking a crew/ship and packing a ship, you will as captain, lead your team on an adventure of a lifetime."
                + "\n Those who preserve and work together are likely to unlock the mysteries awaiting on both sea and land."
                + "\n");
        
        System.out.println("\n Hope you have a fun time."
        + "\n" );
    }
    
    public void startupInput(){
        String input1 = null;
        System.out.println("Press ENTER to Proceed.");

        try {
        input1 = keyboard.readLine();
        } catch (IOException ioe) {
            System.out.println("\nError obtaining input\n");
        }
    }
    
    public char startMenuDisplay(){//change to return character for comparison in startProgram()
        char mainInput;
        System.out.println("Please select an option below"
                + "\nHotkey - Description"
                + "\n G - Start Game"
                + "\n H - Help Menu"
                + "\n L - Load Game"
                + "\n Q - Quit Game"
                + "\n");
        mainInput = this.startMenuInput();
        this.startMenuChoice(mainInput);
        return mainInput;//added this line
    }
    
    public char startMenuInput(){
        char input1;
        input1 = input.charInput();
        while(!((input1 == 'G') || (input1 == 'H') || (input1 == 'L') || (input1 == 'Q'))){
        System.out.println(input1 + " is an invalid entry. Please select an option below:"
            + "\nHotkey - Description"
            + "\n G - Start Game"
            + "\n H - Get Help"
            + "\n L - Load Game"
            + "\n Q - Quit Game");
            input1 = input.charInput();
        }
        return input1;
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
                System.out.println("\n Invalid Selection *** Try again \n");
        }
    }
    
}
    
/******** String Compare with compareTo  ************
      public void startMenuInput(){
        String input;
        //Scanner keyboard = new Scanner(System.in);
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
