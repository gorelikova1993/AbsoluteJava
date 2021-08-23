package ch4.ex13;

public class BoxOfProduce {
    private String f1;
    private String f2;
    private String f3;

    public BoxOfProduce(String f1, String f2, String f3){
        setFruit1(f1);
        setFruit2(f2);
        setFruit3(f3);
    }

    public void setFruit1(String f1){
        this.f1 = f1;
    }

    public void setFruit2(String f2){
        this.f2 = f2;
    }

    public void setFruit3(String f3){
        this.f3 = f3;
    }

    public String getFruit1(){
        return f1;
    }

    public String getFruit2(){
        return f2;
    }

    public String getFruit3() {
        return f3;
    }

    public String toString(){
        return "1 : " + f1 + "\n" + "2 : " + f2 + "\n" + "3 : " + f3;
    }
}
