package ch2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String item = "Item";
        String quantity = "Quantity";
        String price = "Price";
        String total = "Total";
        String subTotal = "Subtotal";
        String salesTax = "6.25% sales tax";


        System.out.println("Input name of item 1: ");
        String nameItem1 = keyboard.nextLine();
        System.out.println("Input quantity of item 1: ");
        int quantityItem1 = keyboard.nextInt();
        System.out.println("Input price of item 1: ");
        double priceItem1 = keyboard.nextDouble();

        double totalPriceItem1 = priceItem1 * quantityItem1;
        keyboard.nextLine();
        System.out.println("Input name of item 2: ");
        String nameItem2 = keyboard.nextLine();
        System.out.println("Input quantity of item 2: ");
        int quantityItem2 = keyboard.nextInt();
        System.out.println("Input price of item 2: ");
        double priceItem2 = keyboard.nextDouble();

        double totalPriceItem2 = priceItem2 * quantityItem2;
        keyboard.nextLine();
        System.out.println("Input name of item 3: ");
        String nameItem3 = keyboard.nextLine();
        System.out.println("Input quantity of item 3: ");
        int quantityItem3 = keyboard.nextInt();
        System.out.println("Input price of item 3: ");
        double priceItem3 = keyboard.nextDouble();

        double totalPriceItem3 = priceItem3 * quantityItem3;

        double totalPrice = totalPriceItem1 + totalPriceItem2 + totalPriceItem3;
        double totalSalesTax = (totalPrice * 6.25) / 100;
        double totalPriceWithTax = totalPrice + totalSalesTax;

        System.out.println("Your bill: ");
        System.out.printf("%-20s %-10s %-10s %-10s\n", item, quantity, price, total);
        System.out.printf("%-20s %-10d %-10.2f %5.2f\n", nameItem1,
                quantityItem1, priceItem1, totalPriceItem1);
        System.out.printf("%-20s %-10d %-10.2f %5.2f\n", nameItem2,
                quantityItem2, priceItem2, totalPriceItem2);
        System.out.printf("%-20s %-10d %-10.2f %-10.2f\n", nameItem3,
                quantityItem3, priceItem3, totalPriceItem3);
        System.out.printf("%-20s %-10s %-10s %-10.2f\n", subTotal,
                "         ", "         ", totalPrice);
        System.out.printf("%-20s %-10s %-10s %5.2f\n", salesTax,
                "         ", "         ", totalSalesTax);
        System.out.printf("%-20s %-10s %-10s %-10.2f\n", total,
                "         ", "         ", totalPriceWithTax);
    }
}
