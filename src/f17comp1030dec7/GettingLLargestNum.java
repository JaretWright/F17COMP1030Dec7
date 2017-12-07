package f17comp1030dec7;

/**
 *
 * @author jwright
 */
public class GettingLLargestNum {
    public static void main(String[] args)
    {
        //build an array to hold 4 integers
        int[] numbers = {-10,-11,-12,-13};
        
        //send it to a method called "max" that will return the highest number
        int maxNum = max(numbers);
        
        //display the result
        System.out.printf("The highest number of ");
        displayArray(numbers);
        System.out.printf("was %d%n", maxNum);
    }
    
    public static int max(int[] array)
    {
        int highestNum = array[0]; //assume the first element is the highest
        
        //compare all the other elements
        for (int i=1; i<array.length; i++)
        {
            if (highestNum < array[i])
                highestNum=array[i];
        }
        return highestNum;
    }
    
    public static void displayArray(int[] array)
    {
        System.out.print("[");
        
        for (int i=0; i<array.length; i++)
        {
            if (i==array.length-1)
                System.out.printf("%d]", array[i]);
            else
                System.out.printf("%d, ", array[i]);
        }
    }
    
}
