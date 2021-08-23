package ch1;

public class ex10 {
    public static void main(String[] args) {
         final int killingMG = 10000;
         int oneColaMG = 34;
         int oneCoffeeMG = 160;
         int colaKill, coffeeKill;

         if(killingMG%oneColaMG>0){
             colaKill = killingMG/oneColaMG + 1;
         }
         else {
             colaKill = killingMG/oneColaMG;
         }
        System.out.println(colaKill);
    }
}
