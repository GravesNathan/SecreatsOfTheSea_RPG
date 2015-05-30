/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.SocietyNPCs;
import byui.cit260.secretsOfTheSea.model.CurrentStatus;

/**
 *
 * @author Nathan
 */
public class TrustTrialControl {
    
    public void compareTrustLevels (SocietyNPCs societyOneNPC, CurrentStatus status){
            int leaderTrustLevelTarget = societyOneNPC.getLeaderTrustLevelTarget();
            int leaderTrustLevel = societyOneNPC.getLeaderTrustLevel();
            String leaderName = societyOneNPC.getLeaderName();
            if (leaderTrustLevel <= 0) {
                status.setLifeStatus ("Game Over.  " + leaderName + " They have thrown you in prison for life.");
                return;
            }
            else if (leaderTrustLevel < leaderTrustLevelTarget){
                    societyOneNPC.setLeaderTrustStatus("Untrusted");
                    status.setLifeStatus ("Alive and well");
            }
            else if (leaderTrustLevel >= leaderTrustLevelTarget){
                    societyOneNPC.setLeaderTrustStatus("Trusted"); 
                    status.setLifeStatus ("Alive and well");
            }
            else {
                    status.setLifeStatus ("Alive and well");
                    return;
                }
        }
}
