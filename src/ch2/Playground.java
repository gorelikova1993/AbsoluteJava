package ch2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Playground {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age.");
        int age = keyboard.nextInt();
        System.out.println("Enter your name.");
        String name = keyboard.next();
        System.out.println(name + ",you are " + age + " years old.");
    }
}
