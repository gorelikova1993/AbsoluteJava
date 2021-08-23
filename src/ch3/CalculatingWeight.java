package ch3;


import java.util.Collection;
import java.util.Scanner;

public class CalculatingWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the weight of car");
        double carWeight = sc.nextDouble();
        double weightInN;
        System.out.println("Would you like to calculate the car’s weight in Newtons either on Earth or on\n" +
                "the Moon? Please type M for Moon and E for Earth, for exit O");
        char answ = sc.next().charAt(0);
        answ = Character.toUpperCase(answ);
        while(answ!='O') {
            switch (answ) {
                case ('M'):
                    weightInN = (carWeight * 9.81) / 6;
                    System.out.println("The weight of car on Moon is " + weightInN);
                    break;
                case ('E'):
                    weightInN = carWeight*9.81;
                    System.out.println("The weight of car on Earth is " + weightInN);
                    break;
                default:
                    System.out.println("Incorrect character ");
                    break;

            }
            System.out.println("Type the weight of car");
            carWeight = sc.nextDouble();
            System.out.println("Would you like to calculate the car’s weight in Newtons either on Earth or on\n" +
                    "the Moon? Please type M for Moon and E for Earth, for exit O");
            answ = sc.next().charAt(0);
            answ = Character.toUpperCase(answ);
        }

    }
}
