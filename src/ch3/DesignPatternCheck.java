package ch3;

import java.util.Scanner;

//Chapter 3 exercise 2
public class DesignPatternCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isAdjacent = false;
        System.out.println("Please type the pattern of five stripes using three colors: \n" +
                "Red as R \n" +
                "Green as G \n" +
                "Blue as B");
        String pattern = sc.nextLine();
        String answer;
        if(pattern.matches("[RGB]]")) {
            while(!isAdjacent){

            }
        }
        for(int i=0; i<pattern.length(); i++){
            if(pattern.charAt(i) == pattern.charAt(i+1)){
                answer = "Invalid pattern";
            }
            else {
                answer = "Fine pattern";
            }
            System.out.println(answer + ": " + pattern);
        }
    }
}
//программа должна проверить, чтобы были только доступные цвета,!!