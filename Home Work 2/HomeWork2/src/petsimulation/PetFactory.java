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
public class PetFactory {
    
    public Pet MakePetBySound(String sound){

        Pet mypet=new Duck();//Default Pet When Sound Is Not Known
        
        if("Quack".equals(sound)){
             mypet=new Duck();
        }else if("Woof".equals(sound)){
            mypet=new Dog();
        }
        else if("Quik".equals(sound)){
            mypet=new Pig();
        }
        
        return mypet;
    }
    
}
