package sess03_selection_and_iteration;

/**
 *Java program to demonstrate the if, while, do...while loops to display
 * the first ten integers
 * @author pc
 */
public class LoopsFirstTenInts
{
    //main method begins program execution
    public static void main(String[] args)
    {
        //Variable to be used in the program
        int n;
        for(n = 1; n<= 10; n++)
            System.out.printf("%02d\n", n);
        
        System.out.println("First ten integers using a while loop. ");
        n = 1; //re-assign n to 1
        while(n <= 10)
        { 
            System.out.printf("%02d\n",n);
            n++;
        }
        
        System.out.println("First ten integers using a do....while loop.");
        n = 1; //re-assign n to 1
        do 
        { 
            System.out.printf("%02d\n",n);
            n++;
        }while(n <= 10);
    }
    
}
