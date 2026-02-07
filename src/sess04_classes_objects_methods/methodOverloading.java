package sess04_classes_objects_methods;

/**
 *A utility class demonstrating method overloading in Java.
 * This class provides multiple version of the 'addNums' method that performs
 * addition operations on different parameter lists, showcasing the concept of 
 * method overloading (compile-time/static polymorphism)
 * 
 * @author pc
 */
public class methodOverloading
{
    /**
     * Adds two integers and return their sum as long as
     * 
     * @param num1 the first integer to be added
     * @param num2 the second integer to be added
     * @return  the sum of the two integers as long value
     */
    public long addNums(int num1, int num2)
    {return num1 + num2; }
    
    /**
     * Adds three integers and return their sum as long as
     * 
     * @param num1 the first integer to be added
     * @param num2 the second integer to be added
     * @param num3 the third integer to be added
     * @return  the sum of the three integers as long value
     */
    
    public long addNums(int num1, int num2, int num3)
    {return num1 + num2 + num3;}
    
    /**
     * Add a byte and an integer and return their sum as long as
     * 
     * @param num1 the byte operand (automatically converted/promoted to int)
     * @param num2 the integer operand to be added
     * @return  the sum of the byte and an integer as long value
     */
    public long addNums(byte num1, int num2)
    {return num1 + num2; }
    
    /**
     * Adds variable numbers of  integers arguments using java's varargs
     * feature
     * This method provides the most flexible way to add numbers as it can handle
     * any numbers of arguments including zero
     * 
     * @param varargs a variable number of integer arguments (0 or more)
     * @return  the sum of all provided integers as long value
     */
    public long addNums(int...varargs)
    {
        long sum = 0;
        for(int n: varargs)
            sum += n;
        return sum;
    }
    
}
