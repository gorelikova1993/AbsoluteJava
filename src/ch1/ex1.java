package ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Type your weight kg");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int weigght = Integer.parseInt(br.readLine());
        System.out.println("Type your height m");
        double height = Double.parseDouble(br.readLine());

        double bmi = weigght/(height*height);
        System.out.println(bmi);
    }
}
