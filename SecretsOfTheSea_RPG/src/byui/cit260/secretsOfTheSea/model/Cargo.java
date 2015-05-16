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
public class Cargo extends Storage implements Serializable{
    private int size;

    public Cargo() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cargo{" + "size=" + size + ", food=" + food + ", water=" + water + ", fuel=" + fuel + ", munitions=" + munitions + ", coin=" + coin + ", artifacts=" + artifacts + ", gems=" + gems + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.size;
        hash = 71 * hash + this.food;
        hash = 71 * hash + this.water;
        hash = 71 * hash + this.fuel;
        hash = 71 * hash + this.munitions;
        hash = 71 * hash + this.coin;
        hash = 71 * hash + this.artifacts;
        hash = 71 * hash + this.gems;
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
        final Cargo other = (Cargo) obj;
        if (this.size != other.size) {
            return false;
        }
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
