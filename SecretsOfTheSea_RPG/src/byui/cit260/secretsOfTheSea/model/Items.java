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
public enum Items implements Serializable{
    //This enum only sets the base value.  It may vary based on societies trust level.
    Food("Food", 20, 5),
    Water("Water", 10, 5),
    Fuel("Fuel", 30, 5),
    Munitions("Munitions", 40, 15),
    Coin("coin", 1, .1),
    Artifacts("Artifacts", 50, 1),
    Gems("Gems", 100, 1);
    
    
    private final String name;
    private final int value;
    private final double weight;

    Items (String name, int value, double weight){
        this.name = name;
        this.value = value;
        this.weight = weight;
    }
    
    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }
    
    
}
