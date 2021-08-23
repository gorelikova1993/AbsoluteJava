package ch4.ex5;

public class WordCount {
    private int count;

    public void setCounter(){
        count = 0;
    }

    public void incCounter(){
        count += 1;
    }
    public void dscCounter(String word){
        if (count > 0 & Character.toUpperCase(word.charAt(0)) == 'A'){
                count -= 1;
            }
    }
    public int getCount(){
        return count;
    }
    public void displayCount(){
        System.out.println("Current Count Value: " + count);
    }



}
