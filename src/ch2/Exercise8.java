package ch2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter(",");
        String w1 = keyboard.next();
        String w2 = keyboard.next();
        String w3 = keyboard.next();
        System.out.println(w1 + "\n" + w2 + "\n" + w3);

    }
}
