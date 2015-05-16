/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.model;

import java.io.Serializable;

/**
 *
 * @author Nathan
 */
public class Storage implements Serializable{
    
    protected int food;
    protected int water;
    protected int fuel;
    protected int munitions;
    protected int coin;
    protected int artifacts;
    protected int gems;

    public Storage() {
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getMunitions() {
        return munitions;
    }

    public void setMunitions(int munitions) {
        this.munitions = munitions;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(int artifacts) {
        this.artifacts = artifacts;
    }

    public int getGems() {
        return gems;
    }

    public void setGems(int gems) {
        this.gems = gems;
    }

    @Override
    public String toString() {
        return "Storage{" + "food=" + food + ", water=" + water + ", fuel=" + fuel + ", munitions=" + munitions + ", coin=" + coin + ", artifacts=" + artifacts + ", gems=" + gems + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.food;
        hash = 79 * hash + this.water;
        hash = 79 * hash + this.fuel;
        hash = 79 * hash + this.munitions;
        hash = 79 * hash + this.coin;
        hash = 79 * hash + this.artifacts;
        hash = 79 * hash + this.gems;
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
        final Storage other = (Storage) obj;
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
        return true;
    }
    
    
}
