package ch2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String hate = "hate";
        String love = "love";
        System.out.println("Enter a sentence: ");
        String sentence = keyboard.nextLine();

        if (sentence.indexOf(hate) == -1) {
            System.out.println("There is no hate in the entered line. ");
        } else {
            int hateIndex = sentence.indexOf(hate);
            System.out.println("changed sentence:");
            System.out.println(sentence.substring(0, hateIndex) + love + sentence.substring(hateIndex + 4));
        }

        keyboard.close();
    }
}
