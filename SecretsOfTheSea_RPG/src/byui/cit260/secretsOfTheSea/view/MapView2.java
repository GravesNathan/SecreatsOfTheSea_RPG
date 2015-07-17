///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.secretsOfTheSea.view;
//
//import byui.cit260.secretsOfTheSea.control.InventoryControl;
//import byui.cit260.secretsOfTheSea.control.MapControl;
//import byui.cit260.secretsOfTheSea.control.NewGameControl;
//import byui.cit260.secretsOfTheSea.control.ShipSelectionControl;
//import byui.cit260.secretsOfTheSea.exceptions.MapControlException;
//import java.awt.event.ActionEvent;
//import java.awt.event.KeyEvent;
//import java.io.BufferedReader;
//import java.io.PrintWriter;
//import javax.swing.AbstractAction;
//import javax.swing.JComponent;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.KeyStroke;
//import secretsofthesea_rpg.SecretsOfTheSea_RPG;
//
///**
// *
// * @author Nathan
// */
//public class MapView2 extends JFrame{
//    
//    private final BufferedReader keyboard = SecretsOfTheSea_RPG.getInFile();
//    private final PrintWriter console = SecretsOfTheSea_RPG.getOutFile();
//    private static JLabel ship = new JLabel();
//    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;
//    private static final String MOVE_UP = "move up";
//    private static final String MOVE_DOWN = "move down";
//    private static final String MOVE_LEFT = "move left";
//    private static final String MOVE_RIGHT = "move right";
//    private MapControl tempMap = null;
//    
//    public MapView2(NewGameControl username, MapControl map, ShipSelectionControl playerShip,
//            InventoryControl inventory){
//        tempMap = map;
//        console.println( map.toString() + "\n"
//                + "Please enter an option below or use the arrow keys to move."
//                + "\n D - Dock ship"
//                + "\n W - Work on(Repair) the ship"
//                + "\n I - View Inventory"
//                + "\n V - View all Statuses"
//                + "\n M - View Map"
//                + "\n G - Game Menu");
//        //layout button mapping.
//        ship.getInputMap(IFW).put(KeyStroke.getKeyStroke("UP"), MOVE_UP);
//        ship.getInputMap(IFW).put(KeyStroke.getKeyStroke("UP"), MOVE_DOWN);
//        ship.getInputMap(IFW).put(KeyStroke.getKeyStroke("UP"), MOVE_LEFT);
//        ship.getInputMap(IFW).put(KeyStroke.getKeyStroke("UP"), MOVE_RIGHT);
//    }
//    
//    //***********Added following an example
//    static void rebindKey(KeyEvent ke, String oldKey) {
//
////      Depends on your GUI implementation.
////      Detecting the new key by a KeyListener is the way to go this time.
//        ship.getInputMap(IFW).remove(KeyStroke.getKeyStroke(oldKey));
////      Removing can also be done by assigning the action name "none".
//        ship.getInputMap(IFW).put(KeyStroke.getKeyStrokeForEvent(ke),
//        ship.getInputMap(IFW).get(KeyStroke.getKeyStroke(oldKey)));
////      You can drop the remove action if you want a secondary key for the action.
//    }
//    
//    //***********Added following an example
//    private class MoveAction extends AbstractAction {
//
//        int direction;
//        int player;
//
//        MoveAction(int direction, int player) {
//
//            this.direction = direction;
//            this.player = player;
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//            // Same as the move method in the question code.
//            // Player can be detected by e.getSource() instead and call its own move method.
//            try {
//            tempMap.exploreMap(e);
//            }catch (MapControlException mce){
//                ErrorView.display(this.getClass().getName(), mce.getMessage());
//            }
//        }
//    }
//
//    
//    
//    //@Override
//    public boolean doAction(char entry){
//        return false;//get rid of error
//    }
//
//}