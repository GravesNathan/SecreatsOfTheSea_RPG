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
public class Map implements Serializable{
    
    //class instance variables
    private int XMax;
    private int YMax;
    private String Difficulty;

    public Map() {
    }
    
    
    
    /**
     * Get the value of XMax
     *
     * @return the value of XMax
     */
    public int getXMax() {
        return XMax;
    }

    /**
     * Set the value of XMax
     *
     * @param XMax new value of XMax
     */
    public void setXMax(int XMax) {
        this.XMax = XMax;
    }



    /**
     * Get the value of YMax
     *
     * @return the value of YMax
     */
    public int getYMax() {
        return YMax;
    }

    /**
     * Set the value of YMax
     *
     * @param YMax new value of YMax
     */
    public void setYMax(int YMax) {
        this.YMax = YMax;
    }



    /**
     * Get the value of Difficulty
     *
     * @return the value of Difficulty
     */
    public String getDifficulty() {
        return Difficulty;
    }

    /**
     * Set the value of Difficulty
     *
     * @param Difficulty new value of Difficulty
     */
    public void setDifficulty(String Difficulty) {
        this.Difficulty = Difficulty;
    }

    @Override
    public String toString() {
        return "Map{" + "XMax=" + XMax + ", YMax=" + YMax + ", Difficulty=" + Difficulty + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.XMax);
        hash = 11 * hash + Objects.hashCode(this.YMax);
        hash = 11 * hash + Objects.hashCode(this.Difficulty);
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.XMax, other.XMax)) {
            return false;
        }
        if (!Objects.equals(this.YMax, other.YMax)) {
            return false;
        }
        if (!Objects.equals(this.Difficulty, other.Difficulty)) {
            return false;
        }
        return true;
    }

    
    
}
