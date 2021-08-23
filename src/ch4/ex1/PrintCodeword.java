package ch4.ex1;

public class PrintCodeword {
    private char letter;
    private int digit;

    public PrintCodeword(char letter, int digit) {
        if (validLetter(letter) && validDigit(digit)) {
            this.letter = letter;
            this.digit = digit;
        } else {
            System.out.println("Error: Not valid letter or digit");
            System.exit(0);
        }

    }

    public void printCode() {
        int i = 26;
        do{
            System.out.print(letter);
            System.out.print(digit);
            System.out.println();
            letter+=1;
            digit+=1;
            if(letter>'Z'){
                letter='A';
            }
            if(digit>9){
                digit=0;
            }
            i--;
        }while(i>0);
    }

    boolean validLetter(char letter) {
        if ((letter >= 'A') && (letter <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }

    boolean validDigit(int digit) {
        if ((digit >= 0) && (digit <= 9)) {
            return true;
        } else {
            return false;
        }
    }

}
