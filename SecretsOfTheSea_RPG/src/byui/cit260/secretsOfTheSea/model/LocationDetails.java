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
public class LocationDetails implements Serializable{
    private int FoodLevel;
    private int WaterLevel;
    private int FuelLevel;
    private int MunitionsLevel;
    private int CoinLevel;
    private int ArtifactsLevel;
    private int GemsLevel;
    private int Statue;
    private int XCoordinate;
    private int YCoordinate;

    public LocationDetails() {
    }
  
    public int getFoodLevel() {
        return FoodLevel;
    }

    public void setFoodLevel(int FoodLevel) {
        this.FoodLevel = FoodLevel;
    }

    public int getWaterLevel() {
        return WaterLevel;
    }

    public void setWaterLevel(int WaterLevel) {
        this.WaterLevel = WaterLevel;
    }

    public int getFuelLevel() {
        return FuelLevel;
    }

    public void setFuelLevel(int FuelLevel) {
        this.FuelLevel = FuelLevel;
    }

    public int getMunitionsLevel() {
        return MunitionsLevel;
    }

    public void setMunitionsLevel(int MunitionsLevel) {
        this.MunitionsLevel = MunitionsLevel;
    }

    public int getCoinLevel() {
        return CoinLevel;
    }

    public void setCoinLevel(int CoinLevel) {
        this.CoinLevel = CoinLevel;
    }

    public int getArtifactsLevel() {
        return ArtifactsLevel;
    }

    public void setArtifactsLevel(int ArtifactsLevel) {
        this.ArtifactsLevel = ArtifactsLevel;
    }

    public int getGemsLevel() {
        return GemsLevel;
    }

    public void setGemsLevel(int GemsLevel) {
        this.GemsLevel = GemsLevel;
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
        return "LocationDetails{" + "FoodLevel=" + FoodLevel + ", WaterLevel=" + WaterLevel + ", FuelLevel=" + FuelLevel + ", MunitionsLevel=" + MunitionsLevel + ", CoinLevel=" + CoinLevel + ", ArtifactsLevel=" + ArtifactsLevel + ", GemsLevel=" + GemsLevel + ", Statue=" + Statue + ", XCoordinate=" + XCoordinate + ", YCoordinate=" + YCoordinate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.FoodLevel;
        hash = 29 * hash + this.WaterLevel;
        hash = 29 * hash + this.FuelLevel;
        hash = 29 * hash + this.MunitionsLevel;
        hash = 29 * hash + this.CoinLevel;
        hash = 29 * hash + this.ArtifactsLevel;
        hash = 29 * hash + this.GemsLevel;
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
        if (this.FoodLevel != other.FoodLevel) {
            return false;
        }
        if (this.WaterLevel != other.WaterLevel) {
            return false;
        }
        if (this.FuelLevel != other.FuelLevel) {
            return false;
        }
        if (this.MunitionsLevel != other.MunitionsLevel) {
            return false;
        }
        if (this.CoinLevel != other.CoinLevel) {
            return false;
        }
        if (this.ArtifactsLevel != other.ArtifactsLevel) {
            return false;
        }
        if (this.GemsLevel != other.GemsLevel) {
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
