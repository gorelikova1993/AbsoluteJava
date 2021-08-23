package ch2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        final int KILLING_DOSE_CAFFEINE = 10000; //milligrams
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type the name of the drink");
        String nameDrink = sc.nextLine();
        System.out.println("How much milligrams of caffeine in the drink?");
        int mgCafDrink = sc.nextInt();
        double numOfDrinksToKill = KILLING_DOSE_CAFFEINE/mgCafDrink;
        System.out.println("It will take approximately " + numOfDrinksToKill + " drinks of " + nameDrink + " to kill a person from caffeine.");
    }
}
