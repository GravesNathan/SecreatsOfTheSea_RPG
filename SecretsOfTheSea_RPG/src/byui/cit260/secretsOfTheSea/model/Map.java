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
    private int xMax;
    private int yMax;
    private char Difficulty;

    public Map() {
    }
    
    
    
    /**
     * Get the value of xMax
     *
     * @return the value of xMax
     */
    public int getxMax() {
        return xMax;
    }

    /**
     * Set the value of xMax
     *
     * @param xMax new value of xMax
     */
    public void setxMax(int xMax) {
        this.xMax = xMax;
    }



    /**
     * Get the value of yMax
     *
     * @return the value of yMax
     */
    public int getyMax() {
        return yMax;
    }

    /**
     * Set the value of yMax
     *
     * @param yMax new value of yMax
     */
    public void setyMax(int yMax) {
        this.yMax = yMax;
    }



    /**
     * Get the value of Difficulty
     *
     * @return the value of Difficulty
     */
    public char getDifficulty() {
        return Difficulty;
    }

    /**
     * Set the value of Difficulty
     *
     * @param Difficulty new value of Difficulty
     */
    public void setDifficulty(char Difficulty) {
        this.Difficulty = Difficulty;
    }

    @Override
    public String toString() {
        return "Map{" + "xMax=" + xMax + ", yMax=" + yMax + ", Difficulty=" + Difficulty + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.xMax);
        hash = 11 * hash + Objects.hashCode(this.yMax);
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
        if (!Objects.equals(this.xMax, other.xMax)) {
            return false;
        }
        if (!Objects.equals(this.yMax, other.yMax)) {
            return false;
        }
        if (!Objects.equals(this.Difficulty, other.Difficulty)) {
            return false;
        }
        return true;
    }

    
    
}
