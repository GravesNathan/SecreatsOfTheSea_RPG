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
public class Societies implements Serializable{
    
    private String Name;
    private String Description;
    private String PositiveApproach;
    private String NeutralApproach;
    private String NegativeApproach;
    private int LeaderTrustLevel;
    private int LeaderTrustLevelTarget;
    private String LeaderTrustStatus;
    

    public Societies() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPositiveApproach() {
        return PositiveApproach;
    }

    public void setPositiveApproach(String PositiveApproach) {
        this.PositiveApproach = PositiveApproach;
    }

    public String getNeutralApproach() {
        return NeutralApproach;
    }

    public void setNeutralApproach(String NeutralApproach) {
        this.NeutralApproach = NeutralApproach;
    }

    public String getNegativeApproach() {
        return NegativeApproach;
    }

    public void setNegativeApproach(String NegativeApproach) {
        this.NegativeApproach = NegativeApproach;
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

    public void setLeaderTrustStatus(String LeaderTrustStatus) {
        this.LeaderTrustStatus = LeaderTrustStatus;
    }
    
//    @Override
//    public String toString() {
//        return "Societies{" + "Name=" + Name + ", Description=" + Description + ", PositiveApproach=" + PositiveApproach + ", NeutralApproach=" + NeutralApproach + ", NegativeApproach=" + NegativeApproach + '}';
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.Name);
        hash = 17 * hash + Objects.hashCode(this.Description);
        hash = 17 * hash + Objects.hashCode(this.PositiveApproach);
        hash = 17 * hash + Objects.hashCode(this.NeutralApproach);
        hash = 17 * hash + Objects.hashCode(this.NegativeApproach);
        hash = 17 * hash + this.LeaderTrustLevel;
        hash = 17 * hash + this.LeaderTrustLevelTarget;
        hash = 17 * hash + Objects.hashCode(this.LeaderTrustStatus);
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
        final Societies other = (Societies) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.PositiveApproach, other.PositiveApproach)) {
            return false;
        }
        if (!Objects.equals(this.NeutralApproach, other.NeutralApproach)) {
            return false;
        }
        if (!Objects.equals(this.NegativeApproach, other.NegativeApproach)) {
            return false;
        }
        if (this.LeaderTrustLevel != other.LeaderTrustLevel) {
            return false;
        }
        if (this.LeaderTrustLevelTarget != other.LeaderTrustLevelTarget) {
            return false;
        }
        if (!Objects.equals(this.LeaderTrustStatus, other.LeaderTrustStatus)) {
            return false;
        }
        return true;
    }
    
    
}
