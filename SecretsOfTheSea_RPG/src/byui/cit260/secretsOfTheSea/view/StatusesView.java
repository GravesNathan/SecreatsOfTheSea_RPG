/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.view;

import byui.cit260.secretsOfTheSea.control.InventoryControl;
import byui.cit260.secretsOfTheSea.control.MapControl;
import byui.cit260.secretsOfTheSea.control.NewGameControl;
import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;
import byui.cit260.secretsOfTheSea.exceptions.MapControlException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;


/**
 *
 * @author Nathan
 */
public class StatusesView extends View{
    
                private static final PrintWriter statusReport =
            SecretsOfTheSea_RPG.getStatusReport();
    
    public StatusesView(NewGameControl username, MapControl map, ShipSelectionControl playerShip,
            InventoryControl inventory){
        super("\n Current Game Statuses"
                + "\n C - Close Inventory Manager"
                + "\n P - Print Status Report", null, null, null, null);
               // + "\nG - Game Menu View", username, map, playerShip);
        //Took out so we don't have a loop of game menu and statuses view
    }
    
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        //System.out.println(dateFormat.format(date)); 
    
    
        
    @Override
    public boolean doAction(char entry){
        char value = entry;
        try {
        switch (value) {
//            case 'G':  Took out so we don't have a loop of game menu and statuses view
//                GameMenuView gamemenu = new GameMenuView();
//                return false; 
            case 'C'://closes inventory manager view
                return true;    
            case 'P':
        {
                statusReport.println("\n ********** Game Status Report ********** \n");
                        statusReport.write("\n Date & Time \n");
                        statusReport.write(dateFormat.format(date));
                        statusReport.write("\n Player Name \n");
                        statusReport.write(tempUsername.getPlayerName());
                        statusReport.write("\n Difficulty \n");
                        statusReport.write( tempMap.getDifficulty());
                        statusReport.write("\n");
            
        }
                statusReport.write("\n ************ \n");
                statusReport.close();
                this.console.println("Your Status Report has been successfully written to disk.");
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\n" + value + " is an invalid entry. Please select an option below:");
                return false;
        }
        } catch (Exception e){
            ErrorView.display(this.getClass().getName(), e.getMessage() +"Error Creating Report.");
        } finally{
            if (statusReport != null){
                try {
                    statusReport.close();
                } catch (Exception e){
                    ErrorView.display("Error closing Report file",e.getMessage());
                }
            }
        }
                    return false;
    }
}
