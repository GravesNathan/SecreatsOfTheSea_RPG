/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.exceptions.CharInputException;
import java.util.Scanner;

/**
 *
 * @author Nathan
 */
public class InputView {
    
    
    public char charInput(){
        Scanner keyboard = new Scanner(System.in);
        char value = ' ';
        value = Character.toUpperCase(keyboard.next().charAt(0));
        //System.out.println("Invalid Character Input.  Plese try again.");
        //If possible check for valid character input. Otherwise probably handle
        //swith switch statement wherever this was called from
        return value;  //return the user input.
    }
    
    public int intInput(){
        Scanner keyboard = new Scanner(System.in);
        String input;
        int value = 0;
        input = keyboard.next();
        input = input.trim();
        try {
        value = Integer.parseInt(input);
        } catch (NumberFormatException nf) {
            System.out.println("\n Please enter a valid whole number.\n");
            
        }
        return value;  //return the user input.
    }
    
        public String stringInput(){
        Scanner keyboard = new Scanner(System.in);
        String value = " ";
        value = keyboard.nextLine();
        value = value.trim();
        return value;  //return the user input.
    }
}
