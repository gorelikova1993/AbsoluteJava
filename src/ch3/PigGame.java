package ch3;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
    public static void main(String[] args) {
        boolean run;
        Random rand = new Random();
        int dice, humanTotalScore = 0, computerTotalScore=0, turnScore=0;
        char answ;
        Scanner input = new Scanner(System.in);

        do
        {
            System.out.println("*** Human's Turn ***");
            run = true;
            do
            {
                dice = 1 + rand.nextInt(6);
                System.out.println("Human rolled " + dice + ".");

                if (dice == 1)
                {
                    System.out.println("Human's score: " + humanTotalScore
                            + " and Computer's score: " + computerTotalScore);
                    run = false;
                }
                else
                {
                    humanTotalScore += dice;
                    System.out.println("Human's score: " + humanTotalScore
                            + " and Computer's score: " + computerTotalScore);

                    if (humanTotalScore >= 100)
                    {
                        run = false;
                    }
                    else
                    {
                        System.out.print("Enter 'r' to roll again or 'h' to hold: ");
                        answ = input.next().charAt(0);
                        if (answ == 'h')
                        {
                            run = false;
                        }
                    }
                }
            } while (run);

            if (humanTotalScore < 100)
            {
                System.out.println("\n*** Computer's Turn ***");

                turnScore = 0;
                run = true;
                do
                {
                    dice = 1 + rand.nextInt(6);
                    System.out.println("Computer rolled " + dice + ".");

                    if (dice == 1)
                    {
                        System.out.println("Human's score: " + humanTotalScore
                                + " and Computer's score: " + computerTotalScore);
                        run = false;
                    }
                    else
                    {
                        turnScore += dice;
                        computerTotalScore += dice;
                        System.out.println("Human's score: " + humanTotalScore
                                + " and Computer's score: " + computerTotalScore);

                        if (turnScore >= 20)
                        {
                            System.out.println("Computer's subtotal >= 20.");
                            run = false;
                        }

                        if (computerTotalScore >= 100)
                        {
                            run = false;
                        }
                    }
                } while (run && turnScore < 20);
            }
            System.out.println();
        } while (humanTotalScore < 100 && computerTotalScore < 100);

        if (humanTotalScore >= 100)
            System.out.println("Human wins the game!");
        else
            System.out.println("Computer wins the game!");
        input.close();
    }
}
