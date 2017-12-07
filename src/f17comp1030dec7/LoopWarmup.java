package f17comp1030dec7;

import java.security.SecureRandom;

/**
 *
 * @author jwright
 */
public class LoopWarmup {
    public static void main(String[] args)
    {
        //create a random number 1-10
        SecureRandom rng = new SecureRandom();
        int randomNum = rng.nextInt(10)+1;
        
        //display the random number
        System.out.printf("The random number is %d%n", randomNum);
        
        //print my name the amount of times specified by the random num
        for (int counter=1; counter<=randomNum; counter++)
        {
            System.out.println("My name is Frank");
        }
    }
}
