package sess01_intro2java;

// Bring in the package that contains a class to get input from the user
import java.util.Scanner;
/**
 *Java program that accepts the user's name and greet them.
 * 
 * @author pc
 */
public class GreetUser
{
    
    //     Main method begins program execution
    public static void main(String[] args)
    {
        // Variable(s) to be used in the appication
        String username;
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for their name
        System.out.println("Please enter your name");
        // Read in the user's name
        username = sc.nextLine();
        
        // Close the input stream
        sc.close();
        
        // Greet the user
        System.out.println("Hello" + username + "from Java Programming!");
    }
    
}
