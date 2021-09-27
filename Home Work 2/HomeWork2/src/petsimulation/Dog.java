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
public class Dog implements  Pet{
    
      private String PetType="Dog";
      private String sound="Woof";
      
      @Override
      public void MakeSound(){
      System.out.println("Your Pet Says:"+sound);
      }
      
      @Override
      public String getPetType(){
          return PetType;
      }
}
