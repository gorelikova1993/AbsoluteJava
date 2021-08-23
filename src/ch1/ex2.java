package ch1;

public class ex2 {
    public static void main(String[] args) {
        int winCoupons = 147;
        int countCandy = winCoupons/10;
        int countGumball = (winCoupons%10)/3;
        System.out.println("Candy: " + countCandy +"\n" + "Gumballs: " + countGumball);
    }
}
