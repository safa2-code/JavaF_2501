package sess06_Modifiers_and_Packages;
import java.io.Serializable;
import java.io.*;

/**
 * Java program to demonstrate the 'transient' keyword/modifier
 * to prevent the user's password from being serialised
 * @author pc
 */
public class TransientExample
{
    //main method begins program execution 
    public static void main(String[] args)
    {
        //Create a user object 
        User user1 = new User("Safa-2code", "safadeprincess@gmail.com","imraan@#3190");
        //Display the details of the user b4 serialisation
        System.out.println("The user's details before serialisation: \n " + user1);
        
        //serialise the user1 object to file
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser")))
        {
            oos.writeObject(user1);
        } catch (IOException ioe)
                {
                System.err.println("The error: " + ioe.getLocalizedMessage() + "occurred!");
                
                }
        //modify the object by changing the user's password
        user1.password = "n3wEaslerp@$s";
        
        //Deserialise the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser")))
        {
            User deserialsedUser = (User) ois.readObject();
            
            //Display the details of the user after serialisation
            System.out.println("The user's details after serialisation: \n" + deserialsedUser);
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("The error: " + e.getLocalizedMessage() + "occurred!");
        }
    }
    
}

class User implements Serializable
{
    //Regular fields, will be serialised
    String username, email;
    
    //Transient field, will NOT be serialised
    transient String password;
    
    //parameterised constructor
    public User(String username,String email, String password)
    {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    //override the to string method
    @Override
    public String toString()
    {
        return "User Details"
                + "\n" + "_".repeat(50)
                + "\nUsername : " +this.username
                + "\nEmail : " + this.email
                + "\nPassword : " + (this.username != null? "*******" : "null" )
                + "\n" + "_".repeat(50);
               
    }
}
