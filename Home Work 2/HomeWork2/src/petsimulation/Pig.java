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
public class Pig implements  Pet{
    
      private String PetType="Pig";
      private String sound="Quik";
      
      @Override
      public void MakeSound(){
      System.out.println("Your Pet Says:"+sound);
      }
      
      @Override
      public String getPetType(){
          return PetType;
      }
}
