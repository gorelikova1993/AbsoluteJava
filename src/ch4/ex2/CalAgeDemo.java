package ch4.ex2;

public class CalAgeDemo {
    public static void main(String[] args) {
        CalAge ca = new CalAge();
        ca.setBirthDate(8, 11, 1993);
        ca.setCurrentDate(19,4,2020);
        System.out.println(ca.calAge());
    }


}
