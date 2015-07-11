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
    //assigns the console out stream memory to errorFile
    private static final PrintWriter errorFile = 
            SecretsOfTheSea_RPG.getOutFile();
    //assigns the errorLog steam to local errorLog
    private static final PrintWriter errorLog =
            SecretsOfTheSea_RPG.getErrorLog();
    
    //write to the errorlog
    public static void display (String className, String errorMessage){

        errorFile.println("------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n--------------------------------------");
    
    //log error
    errorLog.println(className + " - " + errorMessage);
    }
}
