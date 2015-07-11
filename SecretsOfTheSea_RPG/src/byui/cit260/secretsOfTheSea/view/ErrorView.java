/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import java.io.PrintWriter;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class ErrorView {
    private static final PrintWriter errorFile = 
            SecretsOfTheSea_RPG.getOutFile();
    
    private static final PrintWriter errorLog =
            SecretsOfTheSea_RPG.getErrorLog();
    
    public static void display (String className, String errorMessage){
        
        errorFile.println("------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n--------------------------------------");
    
    //log error
    errorLog.println(className + " - " + errorMessage);
    }
}