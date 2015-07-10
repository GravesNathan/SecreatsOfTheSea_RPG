/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.exceptions.CharInputException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class InputView {
    
    private final BufferedReader keyboard = SecretsOfTheSea_RPG.getInFile();
   
    public char charInput(){

        char value = ' ';
        try {
            value = this.keyboard.readLine().charAt(0);
        //System.out.println("Invalid Character Input.  Plese try again.");
        //If possible check for valid character input. Otherwise probably handle
        //swith switch statement wherever this was called from
        }catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return value;  //return the user input.
    }
    
    public int intInput(){
        //Scanner keyboard = new Scanner(System.in);
        String input;
        int value = 0;
        try {
        input = this.keyboard.readLine();
        input = input.trim();
        value = Integer.parseInt(input);
        } catch (IOException ioe) {
            System.out.println("\nError obtaining input\n");
        } catch (NumberFormatException nf) {
            System.out.println("\n Please enter a valid whole number.\n");
            
        }
        return value;  //return the user input.
    }
    
        public String stringInput(){
        //Scanner keyboard = new Scanner(System.in);
        String value = " ";
        try {
        value = this.keyboard.readLine();
        value = value.trim();
        } catch (IOException ioe) {
            System.out.println("\nError obtaining input\n");
        }
        return value;
    }
}
