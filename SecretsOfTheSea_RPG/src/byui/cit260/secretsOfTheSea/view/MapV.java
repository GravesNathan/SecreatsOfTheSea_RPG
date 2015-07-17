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
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.PrintWriter;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import secretsofthesea_rpg.SecretsOfTheSea_RPG;

/**
 *
 * @author Nathan
 */
public class MapV extends View{
    
    private final BufferedReader keyboard = SecretsOfTheSea_RPG.getInFile();
    private final PrintWriter console = SecretsOfTheSea_RPG.getOutFile();
    private static JLabel ship = new JLabel();
    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
    private static final String MOVE_UP = "move up";
    private static final String MOVE_DOWN = "move down";
    private static final String MOVE_LEFT = "move left";
    private static final String MOVE_RIGHT = "move right";
    private MapControl tempMap = null;
    
    public MapV(NewGameControl username, MapControl map, ShipSelectionControl playerShip,
            InventoryControl inventory){
        super( map.mapToString() + "\n"
                + "Please enter an option below or use the arrow keys to move your ship."
                + "\n D - Dock ship"
                + "\n W - Work on(Repair) ship"
                + "\n I - View Inventory"
                + "\n V - View all Statuses"
                + "\n M - View Map"
                + "\n G - Game Menu", username, map, playerShip, inventory);
        KeyEventDemo keyDetect = new KeyEventDemo("Move Ship View");
        
    }

    
    
    @Override
    public boolean doAction(char entry){
        return false;//get rid of error
    }

}