package f17comp1030dec7;

/**
 *
 * @author jwright
 */
public class TwoDArrayStarter {
    public static void main(String[] args)
    {
        String[][] ticTacToe = new String[3][3];
        
        ticTacToe[0][0]="X";
        ticTacToe[0][1]="O";
        ticTacToe[0][2]="X";
        
        ticTacToe[1][0]=" ";
        ticTacToe[1][1]="X";
        ticTacToe[1][2]=" ";
        
        ticTacToe[2][0]="O";
        ticTacToe[2][1]="X";
        ticTacToe[2][2]="O";
        display(ticTacToe);
    }
    
    public static void display(String[][] gameBoard)
    {
        for (int row=0; row < gameBoard.length; row++)
        {
            for (int col=0; col<gameBoard[row].length; col++)
                System.out.print(gameBoard[row][col]);
            System.out.println();
        }
    }
}


