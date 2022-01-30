package ch1;
//TODO
/**The task:
 * Write a program that starts with the string variable first set to your first name and the string variable
 * last set to your last name. Both names should be all lowercase. Your program should then create a new string
 * that contains your full name in pig latin with the first letter capitalized for the first and last name. Use only the pig
 * latin rule of moving the first letter to the end of the word and adding “ay.” Output the pig latin name to the screen.
 * Use the substring and toUpperCase methods to construct the new name.
 * For example, given
 * first = "walt";
 * last = "savitch";
 * the program should create a new string with the text “Altway Avitchsay” and print it.
 */

public class ex3 {
    public static void main(String[] args) {
        String firstName = "Yulia";
        String lastName = "Gorelikova";
        String lastCharF = firstName.substring(0,1);
        String lastCharL = lastName.substring(0,1);

    }
}
