/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petsimulation;

/**
 *
 * @author adiio
 */
public interface Pet {
    
    String sound="";
    String PetType="";
    
    void MakeSound();
    String getPetType();
      
}
