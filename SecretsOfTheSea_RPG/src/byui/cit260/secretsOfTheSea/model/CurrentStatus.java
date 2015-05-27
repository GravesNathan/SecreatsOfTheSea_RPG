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
public class CurrentStatus implements Serializable{
    //CurrentLocation
    //StatuesCount
    //LifeStatus
    
    private String CurrentLocation;
    private int StatuesCount;    
    private String LifeStatus;
    private String gameDifficulty;
    private String statusMessage;
    
    public CurrentStatus() {
    }

    /**
     * Get the value of CurrentLocation
     *
     * @return the value of CurrentLocation
     */
    public String getCurrentLocation() {
        return CurrentLocation;
    }

    /**
     * Set the value of CurrentLocation
     *
     * @param CurrentLocation new value of CurrentLocation
     */
    public void setCurrentLocation(String CurrentLocation) {
        this.CurrentLocation = CurrentLocation;
    }

    

    /**
     * Get the value of StatuesCount
     *
     * @return the value of StatuesCount
     */
    public int getStatuesCount() {
        return StatuesCount;
    }

    /**
     * Set the value of StatuesCount
     *
     * @param StatuesCount new value of StatuesCount
     */
    public void setStatuesCount(int StatuesCount) {
        this.StatuesCount = StatuesCount;
    }



    /**
     * Get the value of LifeStatus
     *
     * @return the value of LifeStatus
     */
    public String getLifeStatus() {
        return LifeStatus;
    }

    /**
     * Set the value of LifeStatus
     *
     * @param LifeStatus new value of LifeStatus
     */
    public void setLifeStatus(String LifeStatus) {
        this.LifeStatus = LifeStatus;
    }

    public String getGameDifficulty() {
        return gameDifficulty;
    }

    public void setGameDifficulty(String gameDifficulty) {
        this.gameDifficulty = gameDifficulty;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    
    
    @Override
    public String toString() {
        return "CurrentStatus{" + "CurrentLocation=" + CurrentLocation + ", StatuesCount=" + StatuesCount + ", LifeStatus=" + LifeStatus 
                + ", GameDifficulty=" + gameDifficulty + "statusMessage = " + statusMessage + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.CurrentLocation);
        hash = 23 * hash + Objects.hashCode(this.StatuesCount);
        hash = 23 * hash + Objects.hashCode(this.LifeStatus);
        hash = 23 * hash + Objects.hashCode(this.gameDifficulty);
        hash = 23 * hash + Objects.hashCode(this.statusMessage);
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
        final CurrentStatus other = (CurrentStatus) obj;
        if (!Objects.equals(this.CurrentLocation, other.CurrentLocation)) {
            return false;
        }
        if (!Objects.equals(this.StatuesCount, other.StatuesCount)) {
            return false;
        }
        if (!Objects.equals(this.LifeStatus, other.LifeStatus)) {
            return false;
        }
        if (!Objects.equals(this.gameDifficulty, other.gameDifficulty)) {
            return false;
        }
        if (!Objects.equals(this.statusMessage, other.statusMessage)) {
            return false;
        }
        return true;
        
    
    }

}
