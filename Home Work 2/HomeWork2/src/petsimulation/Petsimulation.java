package petsimulation;

import java.util.Scanner;

public class Petsimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        Pet Mypet;         
        PetFactory petfactory=new PetFactory();

        System.out.println("=== PET SIMULATION ===");
        System.out.println("First Lets Create A Pet By A Sound");
        System.out.println("Please Type A Pet Sound,It Can Be:Quack,Woof,Quik");
        System.out.println("Please Type A Pet Sound:");
        Mypet=petfactory.MakePetBySound(input.nextLine());//create a pet by its sound
        System.out.println("Your Pet Was Created Sucesful And Its Type Is "+Mypet.getPetType());
        Mypet.MakeSound();

	}

}
