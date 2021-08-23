package ch2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Name of exercise 1:");
        String ex1 = keyboard.nextLine();
        System.out.println("Score received for exercise 1: ");
        int scoreEx1 = keyboard.nextInt();
        System.out.println("Total points possible for exercise 1: ");
        int possibleScoreEx1 = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Name of exercise 2:");
        String ex2 = keyboard.nextLine();
        System.out.println("Score received for exercise 2: ");
        int scoreEx2 = keyboard.nextInt();
        System.out.println("Total points possible for exercise 2: ");
        int possibleScoreEx2 = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Name of exercise 3:");
        String ex3 = keyboard.nextLine();
        System.out.println("Score received for exercise 3: ");
        int scoreEx3 = keyboard.nextInt();
        System.out.println("Total points possible for exercise 3: ");
        int possibleScoreEx3 = keyboard.nextInt();

        int total = scoreEx1 + scoreEx2 + scoreEx3;
        int totalPossible = possibleScoreEx1 + possibleScoreEx2 + possibleScoreEx3;
        DecimalFormat myFormat = new DecimalFormat("##.00%");
        System.out.printf("%-15s %-10s %-10s\n", "Exercise", "Score", "Total Possible");
        System.out.printf("%-15s %-10d %-10d\n", ex1, scoreEx1, possibleScoreEx1);
        System.out.printf("%-15s %-10d %-10d\n", ex2, scoreEx2, possibleScoreEx2);
        System.out.printf("%-15s %-10d %-10d\n", ex3, scoreEx3, possibleScoreEx3);
        System.out.printf("%-15s %-10d %-10d\n", "Total", total, totalPossible);
        System.out.println("Your total is " + total + " out of " + totalPossible +", or " + myFormat.format((double)total/totalPossible) +".");

    }
}
