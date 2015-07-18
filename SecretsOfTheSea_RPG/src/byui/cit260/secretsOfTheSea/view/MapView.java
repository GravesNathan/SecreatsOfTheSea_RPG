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
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class MapView extends View{
    
//    private final BufferedReader keyboard = SecretsOfTheSea_RPG.getInFile();
//    private final PrintWriter console = SecretsOfTheSea_RPG.getOutFile();
    //private static JLabel ship = new JLabel();
//    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
//    private static final String MOVE_UP = "move up";
//    private static final String MOVE_DOWN = "move down";
//    private static final String MOVE_LEFT = "move left";
//    private static final String MOVE_RIGHT = "move right";
//    private InputView input = new InputView();
//    private MapControl tempMap = null;
//    private NewGameControl tempUsername = null;
//    private ShipSelectionControl tempPlayerShip = null;
//    private InventoryControl tempInventory = null;  
//    Had above lines if need to take away extends View
    
    
    public MapView( NewGameControl username, MapControl map, ShipSelectionControl playerShip,
            InventoryControl inventory){
        super( "This is the current map of the Sea \n\n" + map.mapToString() + "\n\n\n"
                + "Please enter an option below."
                + "\n D - Dock ship"
                + "\n W - Work on(Repair) ship"
                + "\n I - View Inventory"
                + "\n V - View all Statuses"
                + "\n G - Game Menu"
                + "\n\nUse the E, R, T, and 4 keys to move your ship"
                + "\nLeft, Down, Right, and Up respectively."
                + "\n\nShip Health = " + playerShip.getHealth()
                + "\nCurrent Morale = " + playerShip.getMorale() , username, map, playerShip, inventory);
    }

    
   
    @Override
    public boolean doAction(char entry){
        char value = entry;
        if (value == 'E' || value == 'R' || value == 'T' || value == '4'){
            try {
                tempMap.moveShip(entry, ShipSelectionControl.getSelectedShip());
                } catch (MapControlException ex) {
                ErrorView.display("MapView", ex.getMessage());
                }
                this.setPromptMessage("This is the current map of the Sea \n\n" + tempMap.mapToString() + "\n\n\n"
                + "Please enter an option below."
                + "\n D - Dock ship"
                + "\n W - Work on(Repair) ship"
                + "\n I - View Inventory"
                + "\n V - View all Statuses"
                + "\n G - Game Menu"
                + "\n\nUse the E, R, T, and 4 keys to move your ship"
                + "\nLeft, Down, Right, and Up respectively."
                + "\n\nShip Health = " + tempPlayerShip.getHealth()
                + "\nCurrent Morale = " + tempPlayerShip.getMorale());
                return false;
        }
        switch (value) {
            case 'D':
                ExplorableAreasView explorableareas = new ExplorableAreasView(tempUsername, tempMap, tempPlayerShip, tempInventory);
		return true;
            case 'W':
		this.workOnShipControl();
		return false;
            case 'I':
		InventoryManagerView inventory = new InventoryManagerView(tempUsername, tempMap, tempPlayerShip, tempInventory);
		return false;
            case 'V':
		StatusesView status = new StatusesView(tempUsername, tempMap, tempPlayerShip, tempInventory);
		return false;
            case 'G':
		GameMenuView gameMenu = new GameMenuView(tempUsername, tempMap, tempPlayerShip, tempInventory);
		return false;
            default:
                ErrorView.display(this.getClass().getName(),"\n Invalid choice.  Please try again.");
                return false;
        } 
        
    }

    private void workOnShipControl() {
        System.out.println("Work on Ship stub called."); 
    }

}