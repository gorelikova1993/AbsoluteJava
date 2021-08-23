package ch3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MostConsecutiveVowels {
    public static void main(String[] args) {
        Scanner inFile = null;
        String name, consecutiveWord = null;
        int consecutiveVowels = 0;
        int maxConsecutiveVowels = 0;
        try {
            inFile = new Scanner(new FileInputStream("src/ch3/words.txt"));

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }
        while (inFile.hasNext()) {
            name = inFile.next();
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'i') {
                    consecutiveVowels++;
                } else {
                    if (consecutiveVowels > maxConsecutiveVowels) {
                        maxConsecutiveVowels = consecutiveVowels;
                        consecutiveWord = name;
                    }
                    consecutiveVowels = 0;
                }
            }
            if (consecutiveVowels > maxConsecutiveVowels) {
                maxConsecutiveVowels = consecutiveVowels;
                consecutiveWord = name;
            }
        }
        inFile.close();
        if (consecutiveWord != null) {
            System.out.println("The maximum consecutive vowel string: " + consecutiveWord);
            System.out.println("Vowel count: " + maxConsecutiveVowels);
        } else
            System.out.println("No String found.");
    }
}
