/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author SDababneh
 */
public class SocietyNPCs implements Serializable{
    
    private String LeaderName;
    private String LeaderDescription;
    private int LeaderTrustLevel;
    private int LeaderTrustLevelTarget;

    public SocietyNPCs() {
    }

    public String getLeaderName() {
        return LeaderName;
    }

    public void setLeaderName(String LeaderName) {
        this.LeaderName = LeaderName;
    }

    public String getLeaderDescription() {
        return LeaderDescription;
    }

    public void setLeaderDescription(String LeaderDescription) {
        this.LeaderDescription = LeaderDescription;
    }

    public int getLeaderTrustLevel() {
        return LeaderTrustLevel;
    }

    public void setLeaderTrustLevel(int LeaderTrustLevel) {
        this.LeaderTrustLevel = LeaderTrustLevel;
    }

    public int getLeaderTrustLevelTarget() {
        return LeaderTrustLevelTarget;
    }

    public void setLeaderTrustLevelTarget(int LeaderTrustLevelTarget) {
        this.LeaderTrustLevelTarget = LeaderTrustLevelTarget;
    }

    @Override
    public String toString() {
        return "SocietyNPCs{" + "LeaderName=" + LeaderName + ", LeaderDescription=" + LeaderDescription + ", LeaderTrustLevel=" + LeaderTrustLevel + ", LeaderTrustLevelTarget=" + LeaderTrustLevelTarget + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.LeaderName);
        hash = 17 * hash + Objects.hashCode(this.LeaderDescription);
        hash = 17 * hash + this.LeaderTrustLevel;
        hash = 17 * hash + this.LeaderTrustLevelTarget;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SocietyNPCs other = (SocietyNPCs) obj;
        if (!Objects.equals(this.LeaderName, other.LeaderName)) {
            return false;
        }
        if (!Objects.equals(this.LeaderDescription, other.LeaderDescription)) {
            return false;
        }
        if (this.LeaderTrustLevel != other.LeaderTrustLevel) {
            return false;
        }
        if (this.LeaderTrustLevelTarget != other.LeaderTrustLevelTarget) {
            return false;
        }
        return true;
    }
    
    
}
