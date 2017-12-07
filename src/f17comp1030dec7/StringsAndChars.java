package f17comp1030dec7;

import java.util.Scanner;

/**
 *
 * @author jwright
 */
public class StringsAndChars {
    public static void main(String[] args)
    {
        System.out.print("Enter a word and I'll display it's characters: ");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        
        //create a simple loop to display the characters
        for (int i=0; i<word.length(); i++)
        {
            System.out.printf("In position %d is character: %c%n", 
                              i, word.charAt(i));
        }
        
        System.out.printf("The first letter %s upper case",
                              firstLetterUpperCase(word)?"is":"is not");
    }
    
    /**
     * This method will check if the first letter of a word is uppercase
     */
    public static boolean firstLetterUpperCase(String word)
    {
        return (word.charAt(0) >= 65 && word.charAt(0)<=90);
            
    }
}
