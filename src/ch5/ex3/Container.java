package ch5.ex3;

public class Container {
    private int maxCapacity;
    private int quantityLiquid;

    public Container(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.quantityLiquid = 0;
    }

    public void fillContainerComplet(){
        quantityLiquid = maxCapacity;
    }

    public void fill(int lit){
        if(lit+quantityLiquid<maxCapacity){
            quantityLiquid+=lit;
        }
        else {
            System.out.println("Fatal Error.");
            System.exit(0);
        }
    }

    public void empty(int lit){
        if(quantityLiquid - lit <quantityLiquid){
        quantityLiquid-=lit;}
        else {
            System.out.println("Fatal Error.");
            System.exit(0);
        }
    }

    public void emptyContainerComplet(){
        quantityLiquid =0;
    }
    public void transferLiquid(Container aContainer){
        if(quantityLiquid+aContainer.quantityLiquid<aContainer.maxCapacity) {
            aContainer.quantityLiquid = quantityLiquid;
        }else {
            System.out.println("Fatal Error.");
            System.exit(0);
        }
    }
    public int quantity(){
        return quantityLiquid;
    }

    public void displayQuantity(){
        System.out.println(quantityLiquid);
    }

    public int leftOver(){
        return maxCapacity - quantityLiquid;
    }

}
