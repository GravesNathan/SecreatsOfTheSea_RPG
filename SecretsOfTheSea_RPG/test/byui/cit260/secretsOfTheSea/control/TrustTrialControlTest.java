/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.model.CurrentStatus;
import byui.cit260.secretsOfTheSea.model.SocietyNPCs;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SDababneh
 */
public class TrustTrialControlTest {
    
    public TrustTrialControlTest() {
    }

    /**
     * Test of compareTrustLevels method, of class TrustTrialControl.
     */
    @Test
    public void testCompareTrustLevels() {
        System.out.println("compareTrustLevels");
        /******************/
        /****Zero Trust****/
        /*****************/        
        System.out.println("compareTrustLevels of Zero Trust");
        SocietyNPCs societyOneNPC = new SocietyNPCs();
        societyOneNPC.setLeaderTrustLevel(0);
        societyOneNPC.setLeaderTrustLevelTarget(5);
        
        CurrentStatus status = new CurrentStatus();
        status.setLifeStatus ("Game Over.  You have died.  Return to the Game Menu to start a new game.");
        
        TrustTrialControl instance = new TrustTrialControl();
        instance.compareTrustLevels(societyOneNPC, status);
    
        
        
        /********************/
        /*Trust below Target*/
        /********************/        
        System.out.println("compareTrustLevels of Zero Trust");
        societyOneNPC.setLeaderTrustLevel(2);
        societyOneNPC.setLeaderTrustLevelTarget(5);
        
        status.setLifeStatus ("You still have not earned the trust of the leader.");
        
        instance.compareTrustLevels(societyOneNPC, status);

        
        /**********************/
        /*Trust Target Reached*/
        /**********************/        
        System.out.println("compareTrustLevels of Zero Trust");
        societyOneNPC.setLeaderTrustLevel(5);
        societyOneNPC.setLeaderTrustLevelTarget(5);
        
        status.setLifeStatus ("You have earned the trust of the leader and may freely travel their island.");
        
        instance.compareTrustLevels(societyOneNPC, status);
    }
    
}
