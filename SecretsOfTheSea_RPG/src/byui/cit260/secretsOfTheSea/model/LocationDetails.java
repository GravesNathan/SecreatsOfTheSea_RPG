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

    @Override
    public String toString() {
        return "LocationDetails{" + "food=" + food + ", water=" + water + ", fuel=" + fuel + ", munitions=" + munitions + ", coin=" + coin + ", artifacts=" + artifacts + ", gems=" + gems + ", Statue=" + Statue + ", XCoordinate=" + XCoordinate + ", YCoordinate=" + YCoordinate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.food;
        hash = 29 * hash + this.water;
        hash = 29 * hash + this.fuel;
        hash = 29 * hash + this.munitions;
        hash = 29 * hash + this.coin;
        hash = 29 * hash + this.artifacts;
        hash = 29 * hash + this.gems;
        hash = 29 * hash + this.Statue;
        hash = 29 * hash + this.XCoordinate;
        hash = 29 * hash + this.YCoordinate;
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
        if (this.food != other.food) {
            return false;
        }
        if (this.water != other.water) {
            return false;
        }
        if (this.fuel != other.fuel) {
            return false;
        }
        if (this.munitions != other.munitions) {
            return false;
        }
        if (this.coin != other.coin) {
            return false;
        }
        if (this.artifacts != other.artifacts) {
            return false;
        }
        if (this.gems != other.gems) {
            return false;
        }
        if (this.Statue != other.Statue) {
            return false;
        }
        if (this.XCoordinate != other.XCoordinate) {
            return false;
        }
        if (this.YCoordinate != other.YCoordinate) {
            return false;
        }
        return true;
    }
   
    
}
