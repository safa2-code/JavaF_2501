package sess09_exceptions;

/**
 *
 * @author pc
 */
public class Mathematics
{
    //===========================
    // Class Methods
    //===========================
    public static long addNums(String num1, String num2) throws InvalidNumberFormatException
    {
        try
        {
            int n1 = Integer.parseInt(num1); // try to convert num1 into an integer
            int n2= Integer.parseInt(num2); // try to convert num2 into an integer
            return (long) (n1 + n2);
        } catch (NumberFormatException nfe)
        {
            // catch and handle numberformat exception if either num1 or num2 is 
            //not a valid integer
            System.err.println("Error: " + nfe.getLocalizedMessage());
            throw new InvalidNumberFormatException("One or both of the inputs " + "values is not a valid number");
        }
    }

    public static long multiplyNums(int num1, int num2)
    {
        return (long)(num1 * num2); // multiply the two nums and return products as a long
    }

    public static int subtractNums(int num1, int num2)
    {
        return num1 - num2; // subtract the two nums and return products as an integer
    }

    public static int divideNums(int num1, int num2) throws DivideByZeroException
    {
        try
        {
            return num1 / num2;// return the quotient of num1 divided by num2
        } catch (ArithmeticException ae)
        {
           // catch and handle arithmeticc exception when division by 0 occurs num2 is 
            System.err.println("Error: " + ae.getLocalizedMessage());
            throw new DivideByZeroException("Division by zero is not allowed");
        }
    }


    // main method begins program execution
    public static void main(String[] args)
    {
        try
        {
        // Demonstrate the addNums method with valid and invalid input
        System.out.println("Results of add '5' and '3' is: " + addNums("5", "3"));
        System.out.println("Results of add '2' and 'the' is: " + addNums("2", "ten"));

        // Demonstrate the multiplyNums method
        System.out.println("Results of multiplying '5' and '4' is: " + multiplyNums(5, 4));

        // Demonstrate the subtractNums method
        System.out.println("Results of subtractinging '8' and '4' is: " + subtractNums(8, 4));

        // Demonstrate the divideNums method
        System.out.println("Results of dividing '10' and '5' is: " + divideNums(10, 5));
        System.out.println("Results of dividing '2' and '0' is: " + divideNums(2, 0));
        }
        catch(InvalidNumberFormatException infe)
        {
            System.err.println("Error: " + infe.getLocalizedMessage());
        }
        catch(DivideByZeroException dbze)
        {
            System.err.println("Error: " + dbze.getLocalizedMessage());
        }
        catch(Exception e) // General catch block
        {
            System.err.println("Error: " + e.getLocalizedMessage());
        }
    }
}