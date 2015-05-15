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
    private String StatuesCount;    
    private String LifeStatus;

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
    public String getStatuesCount() {
        return StatuesCount;
    }

    /**
     * Set the value of StatuesCount
     *
     * @param StatuesCount new value of StatuesCount
     */
    public void setStatuesCount(String StatuesCount) {
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

    @Override
    public String toString() {
        return "CurrentStatus{" + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.CurrentLocation);
        hash = 97 * hash + Objects.hashCode(this.StatuesCount);
        hash = 97 * hash + Objects.hashCode(this.LifeStatus);
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
        return true;
    }

    
    
}
