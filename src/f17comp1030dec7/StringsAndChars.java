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
        
        System.out.printf("The first letter %s upper case%n",
                              firstLetterUpperCase(word)?"is":"is not");
        
        reversi(word);
    }
    
    /**
     * This method will check if the first letter of a word is uppercase
     */
    public static boolean firstLetterUpperCase(String word)
    {
        return (word.charAt(0) >= 65 && word.charAt(0)<=90);
            
    }
    
    /**
     * This method will display a String in reverse to the screen
     * @param word 
     */
    public static void reversi(String word)
    {
        for (int i=word.length()-1; i>=0;i=i-1)
            System.out.print(word.charAt(i));
        
        System.out.println();
    }
}
