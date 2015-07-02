/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.Societies;
import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.SocietyNPCs;

/**
 *
 * @author Nathan
 */
public class TrustTrialControl {
    
    public void compareTrustLevels (SocietyNPCs leader, Societies societyOneNPC, CurrentStatus status){
        
            int leaderTrustLevelTarget = societyOneNPC.getLeaderTrustLevelTarget();
            int leaderTrustLevel = societyOneNPC.getLeaderTrustLevel();
            //String leaderName = Billy.get();
//            System.out.println("Leader current trust level= " + leaderTrustLevel);
            if (leaderTrustLevel <= 0) {
                status.setLifeStatus ("Game Over.  " + leader.getdescription() + " has thrown you in prison for life.");
                //System.out.println("Trust is zero");
                return;
            }
            else if (leaderTrustLevel < leaderTrustLevelTarget){
                    societyOneNPC.setLeaderTrustStatus("Untrusted");
                    status.setLifeStatus ("Alive and well");
//                    System.out.println("Trust is 1-3");
            }
            else if (leaderTrustLevel >= leaderTrustLevelTarget){
                    societyOneNPC.setLeaderTrustStatus("Trusted"); 
                    status.setLifeStatus ("Alive and well");
//                    System.out.println("Trust is matched");
            }
            else {
                    status.setLifeStatus ("Invalid entry, please try again.");//WEEK 10 IA
                    return;
                }
        }
}
