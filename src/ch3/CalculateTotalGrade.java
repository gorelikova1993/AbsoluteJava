package ch3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTotalGrade {
    public static void main(String[] args) {
        int countEx, receivedScore = 0, totalScore = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many exercises to input?");
        countEx = input.nextInt();
        for(int i=1; i<=countEx;i++){
            System.out.println("Score received for exercise " + i + ": ");
            receivedScore = input.nextInt() + receivedScore;
            System.out.println("Total points possible for exercise " + i + ": ");
            totalScore = totalScore + input.nextInt();
        }
        DecimalFormat format =  new DecimalFormat("##.## %");
        System.out.println("Your total is " + receivedScore + " out of " + totalScore +", or " + format.format((double)receivedScore/totalScore));
    }
}
