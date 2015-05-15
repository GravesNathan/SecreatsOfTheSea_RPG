/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secretsofthesea_rpg;

/**
 *
 * @author SDababneh
 */
public class SecretsOfTheSea_RPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map playerOne = new Map();
        
        playerOne.setDifficulty("Easy Challenge");
        playerOne.setXMax("5");
        playerOne.setYMax("10");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
