package ch2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        final double PERCENT = 0.001;
        double sweetener, mouse, dieter;
        double numSoda;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the amount of artificial sweetener needed to kill a mouse");
        sweetener = keyboard.nextDouble();
        System.out.println("Type the weight of the mouse");
        mouse = keyboard.nextDouble();
        System.out.println("Type the desired weight of the dieter");
        dieter = keyboard.nextDouble();

        double amountOfSweetenerToKill = (sweetener/mouse)*dieter;
        numSoda = amountOfSweetenerToKill/PERCENT;
        System.out.println(numSoda);


    }
}
