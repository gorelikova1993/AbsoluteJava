package ch5.ex3;

public class ContainerDemo {
    public static void main(String[] args) {
        Container con1 = new Container(100);
        Container con2 = new Container(30);
        con2.fillContainerComplet();
        con1.fill(10);
        con1.displayQuantity();
        con1.fillContainerComplet();
        con1.displayQuantity();
        con1.empty(20);
        con1.displayQuantity();
        con1.emptyContainerComplet();
        con1.displayQuantity();
//        con1.fill(120);
        con2.transferLiquid(con1);
        con1.displayQuantity();
    }
}
