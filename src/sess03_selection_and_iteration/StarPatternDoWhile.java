package sess03_selection_and_iteration;

/**
 *java program to display a star pattern using nested do...while loops
 * @author pc
 */
public class StarPatternDoWhile
{
    //main method begins execution
    public static void main(String[] args)
    {
        //variable to be used in the program 
        int row = 1, col;
        do // Outer loop
        {
            col =1;
            do // Inner loop
            {
                System.out.printf("*");
                col++;
            }while (col <= row);
            System.out.println("");
            row++; 
        } while (row <= 5);
        
    }
    
}
