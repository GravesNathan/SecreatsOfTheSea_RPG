/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.secretsOfTheSea.control;

import byui.cit260.secretsOfTheSea.exceptions.CharInputException;
import byui.cit260.secretsOfTheSea.view.InventoryManagerView;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nathan
 */
public class InventoryReport {
    
    public InventoryReport(InventoryControl inventory, String outFileLocation){
        printInventory(inventory, outFileLocation);
    }
    
    public void printInventory(InventoryControl inventory, String outFileLocation){
//        try (BufferedWriter out = new BufferWriter(new FileWriter(outputLocation))){
        BufferedWriter outFile = null;
        try {  
            outFile = new BufferedWriter(new FileWriter(outFileLocation));
            outFile.write("Current Cargo\n");
            outFile.write(inventory.cargoToString());
            outFile.write("\nCurrent Storage\n");
            outFile.write(inventory.storageToString());
        } catch (IOException ex1){
            System.out.println("Temp Error Creating Inventory Report.");
        } finally{
            if (outFile != null){
                try {
                    outFile.close();
                } catch (IOException ex2){
                    System.out.println("Temp Error closing file");
                }
                
            }
        }
    }
}