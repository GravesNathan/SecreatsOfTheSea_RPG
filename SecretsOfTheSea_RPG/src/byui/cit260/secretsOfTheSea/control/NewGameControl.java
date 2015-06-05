/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.Player;

/**
 *
 * @author SDababneh
 */
public class NewGameControl {
    
    private Player player1 = null;//Initializeing here allows it's use throughout class refering to the same object for get and set
    //private String tempUserName = null;  He lost me on the whole tempUserName thing.  Have some grasp of constructors, but not completely.
    
    //these are called constructors.
    public NewGameControl(){
        //pass username from MainMenuView to here
        //and assign to tempUser
        //Why?  Is he trying to initiate the whole class right here to save running time by less calls?
        
    }

    public void setPlayerName(String userName){ 
        //init player with String player name from view
        //pass temp username to player
        player1 = new Player();//Why separate instead of all up top?
        player1.setName(userName);//accepts value from view then pushes to the model layer
        }
    
    public String getPlayer1Name(){
        return player1.getName();
    }
    
}
