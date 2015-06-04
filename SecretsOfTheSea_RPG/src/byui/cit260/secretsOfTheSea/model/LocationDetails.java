/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.model;

import java.io.Serializable;

/**
 *
 * @author SDababneh
 */
public class LocationDetails extends Storage implements Serializable{
    private int Statue;
    private int XCoordinate;
    private int YCoordinate;
    private float distance;
    
    public LocationDetails() {
    }

    public int getStatue() {
        return Statue;
    }

    public void setStatue(int Statue) {
        this.Statue = Statue;
    }

    public int getXCoordinate() {
        return XCoordinate;
    }

    public void setXCoordinate(int XCoordinate) {
        this.XCoordinate = XCoordinate;
    }

    public int getYCoordinate() {
        return YCoordinate;
    }

    public void setYCoordinate(int YCoordinate) {
        this.YCoordinate = YCoordinate;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    
    @Override
    public String toString() {
        return "LocationDetails{" + ", Statue=" + Statue + ", XCoordinate=" + XCoordinate + ", YCoordinate="
                + YCoordinate + ", distance = " + distance + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.Statue;
        hash = 29 * hash + this.XCoordinate;
        hash = 29 * hash + this.YCoordinate;
        hash = (int) (29 * hash + this.distance);//That's what netbeans suggested for the long...
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
        final LocationDetails other = (LocationDetails) obj;
        if (this.Statue != other.Statue) {
            return false;
        }
        if (this.XCoordinate != other.XCoordinate) {
            return false;
        }
        if (this.YCoordinate != other.YCoordinate) {
            return false;
        }
        if (this.distance != other.distance){
            return false;
        }
        return true;
    }
   
    
}
