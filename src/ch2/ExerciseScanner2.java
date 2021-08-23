package ch2;

import java.util.Scanner;

public class ExerciseScanner2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word1 = keyboard.next();
        String word2 = keyboard.next();
        String word3 = keyboard.next();
        System.out.println(word1 + " " + word2 + " " + word3 );
    }
}
