package ch4.ex13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class BoxOfProduceDemo {
    public static void main(String[] args) {
        int LENGTH = 5;
        Scanner scn = new Scanner(System.in);
        Scanner fileScn = null;
        String fruit = null;
        String[] items = new String[LENGTH];
        try{
            fileScn = new Scanner(new FileInputStream("src/ch4/ex13/items.txt"));
        } catch (FileNotFoundException e)
        {   System.out.println("File not found");
            System.exit(0);
        }
        int index = 0;
        while (fileScn.hasNext()){
            fruit = fileScn.nextLine();
            items[index] = fruit;
            index = index + 1;
        }
        Random random = new Random();
        String firstFruitType = items[random.nextInt(LENGTH)];
        String secondFruitType = items[random.nextInt(LENGTH)];
        String thirdFruitType = items[random.nextInt(LENGTH)];
        BoxOfProduce boxOfProduce = new BoxOfProduce(firstFruitType, secondFruitType, thirdFruitType);
        System.out.print("****Random of 3 items*****\n");
        System.out.println(boxOfProduce.toString());
        System.out.println("******Total items:*******");
        for (int position = 0; position < items.length; position++)
            System.out.println(position + 1 + ": " + items[position]);
        System.out.println("----------------------");
        System.out.print("Enter your choice:");
        int listChoice = scn.nextInt();
        System.out.print("List of replace fruit items:\n ");
        System.out.println(boxOfProduce.toString());
        System.out.print("Choice of replace fruit item number(1-3): ");
        int boxChoice = scn.nextInt();
        switch (boxChoice){
            case 1:
                boxOfProduce = new BoxOfProduce(items[listChoice - 1], secondFruitType, thirdFruitType);
                break;
            case 2:
                boxOfProduce = new BoxOfProduce(firstFruitType, items[listChoice - 1], thirdFruitType);
                break;
            case 3:
                boxOfProduce = new BoxOfProduce(firstFruitType, secondFruitType, items[listChoice - 1]);
                break;
            default:
                System.out.println("Invalid choice");
        }

        System.out.println("Items:");
        System.out.println(boxOfProduce.toString());

    }
}
