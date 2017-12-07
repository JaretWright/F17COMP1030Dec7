package f17comp1030dec7;

/**
 *
 * @author jwright
 */
public class ArrayRefresher {
    public static void main(String[] args)
    {
        String[] favGame = new String[4];  //define a new Array that can hold 4 Strings
        favGame[0]="SkyRim";               //Adding a String to position 0
        favGame[1]="League of Legends";    //Adding a String to position 1
        favGame[2]="Portal";               //Adding a String to position 2
        favGame[3]="Counter Strike";       //Adding a String to position 3
        
        //create a for loop to display each of the games to the screen
        for (int i=0; i<favGame.length; i++)
            System.out.printf("The game in position %d is %s%n", i, favGame[i]);
        
        
    }
}
