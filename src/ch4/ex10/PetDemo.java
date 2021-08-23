package ch4.ex10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PetDemo {
    public static void main(String args[]) {

        Pet p = new Pet("Daniel Plainview");
        System.out.println("No records on your pet name ");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the pet's name:");
        String name = keyboard.nextLine();
        System.out.println("Enter the pet's age:");
        int age = keyboard.nextInt();
        System.out.println("Enter the pet's weight:");
        double weight = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Is the pet a dog? (y/n):");
        boolean isDog;
        String choice = keyboard.nextLine();
        if (choice.equalsIgnoreCase("y"))
            isDog = true;
        else
            isDog = false;
        p.setPet(name, age, weight, isDog);

        System.out.println("Records as follows:");
        System.out.println(p);
        System.out.println("Acepromazine needed: " + p.acepromazine() + " ml");
        System.out.println("Carprofen needed: " + p.carprofen() + " ml");
    }
}
