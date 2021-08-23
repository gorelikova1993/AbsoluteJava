package ch4.ex1;

import ch4.ex1.PrintCodeword;

public class PrintCodewordDemo {
    public static void main(String[] args) {
        PrintCodeword pcd = new PrintCodeword('F', 5);
        pcd.printCode();
        PrintCodeword edf = new PrintCodeword('1', 10);
    }
}
