package ch2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int divider = a/b;
        int remainder = a%b;
        System.out.println(a + "/" + b + " = " + divider + " remainder: " + remainder );
    }
}
