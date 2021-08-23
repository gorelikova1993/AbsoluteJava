package ch4;

public class DateDemo {
    public static void main(String args[])
    {
        Date d1 = new Date("October", 17, 2016);
        Date d2 = new Date();
        Date d3 = new Date(2016);
        Date d4 = new Date(10, 11, 1963);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
        System.out.println();
        System.out.println("Date 1's month: " + d1.getMonth());
        System.out.println("Date 1's day: " + d1.getDay());
        System.out.println("Date 1's year: " + d1.getYear());
        d1.setDate(10, 17, 2016);
        System.out.println("After setting new date:");
        System.out.println("Date 1's month: " + d1.getMonth());
        System.out.println("Date 1's day: " + d1.getDay());
        System.out.println("Date 1's year: " + d1.getYear());
        System.out.println();
        System.out.println("Both dates are equal:"+d2.precedes(d1));
        System.out.println("Both dates are equal :"+d1.equals(d3));

    }
}
