
package sess09_exceptions;

/**
 *
 * @author pc
 */
public class DivideByZeroException extends ArithmeticException
{
    //============
    // Constructor
    //=============
    public DivideByZeroException(String message)
    {
        super(message);
    }
    
}
