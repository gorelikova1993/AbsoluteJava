package ch2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Print percentage: ");
        double percentage = keyboard.nextDouble();
        double GPA = (percentage/100)*4;
        System.out.printf("(" + percentage + "/100)*4 = %.0f" ,  GPA );
    }
}
