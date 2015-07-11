/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea_rpg;

//import byui.cit260.secretsOfTheSea.control.StartControl;
import byui.cit260.secretsOfTheSea.view.ErrorView;
import byui.cit260.secretsOfTheSea.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author SDababneh
 */
public class SecretsOfTheSea_RPG {
    

    /**
     * @param args the command line arguments
     */
//    private static Game currentGame = null;
//    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter errorLog = null;
    private static PrintWriter statusReport = null;
    //private static ErrorView errorView = null;
    
    public static void main(String[] args) {
        //Sample Class Set & Print
        /*Sample samepleOne = new Sample();
        *
        *sampleOne.setAttribute("Value");
        *sampleOne.setIntAttribute(1); 
        *
        *String sampleInfo = sampleOne.toString();
        *this.console.println(sampleInfo);
        */
        //End sample Class Set & Print
        
        //StartControl startup = new StartControl();
        //startup.initializeGame();

        
        StartProgramView startProgramView = null;//= new StartProgramView();
        
        try {
        //These lines open a stream for input and output for the console.
        //The 4th line creates and errorLog file in the specified directory.
        //They are created in main so as to be referencable throughout the remainder
        //of the program
        SecretsOfTheSea_RPG.inFile = new BufferedReader(new InputStreamReader(System.in));
        SecretsOfTheSea_RPG.outFile = new PrintWriter(System.out, true);
        String filePath = "errorLog.txt";
        SecretsOfTheSea_RPG.errorLog = new PrintWriter(filePath);    
        
        SecretsOfTheSea_RPG.statusReport = new PrintWriter(System.out, true);
        String reportPath = "statusReport.txt";       
        
        //StartProgramView
        startProgramView = new StartProgramView();
        startProgramView.startProgram();

        
        
        } catch (Throwable te){ 

            ErrorView.display("SecretsOfTheSea_RPG",te.getMessage());
            
            te.printStackTrace();
            startProgramView.startProgram();
        }
        finally {
            try{
                if (SecretsOfTheSea_RPG.inFile != null)
                    SecretsOfTheSea_RPG.inFile.close();
                
                if (SecretsOfTheSea_RPG.outFile != null)
                    SecretsOfTheSea_RPG.outFile.close();
                
                if (SecretsOfTheSea_RPG.errorLog != null)
                    SecretsOfTheSea_RPG.errorLog.close();
            } catch (IOException ex) {
                ErrorView.display("SecretsOfTheSea_RPG","BLAH ERROR");
            }
        }
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SecretsOfTheSea_RPG.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SecretsOfTheSea_RPG.inFile = inFile;
    }

    public static PrintWriter getErrorLog() {
        return errorLog;
    }

    public static void setErrorLog(PrintWriter errorLog) {
        SecretsOfTheSea_RPG.errorLog = errorLog;
    }

    public static PrintWriter getStatusReport() {
        return statusReport;
    }

    public static void setStatusReport(PrintWriter statusReport) {
        SecretsOfTheSea_RPG.statusReport = statusReport;
    }
    
}
