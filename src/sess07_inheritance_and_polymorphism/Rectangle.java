package sess07_inheritance_and_polymorphism;

/**
 *The  {@code Rectangle} class represents a 2-dimensional rectangle with its
 * length and width. It provides methods to compute its are and perimeter.
 * 
 * @author pc
 */
public class Rectangle extends Shape
{
    //=====================
    //instance fields
    //======================
    /**
     * The length of the rectangle (in units)
     */
    protected int length;
    
    /**
     * The width of the rectangle ( units)
     */
    protected int width;
    
    //=========================
    // Getters & Setters
    //=========================
    /**
     * returns the length of the rectangle (in units)
     *
     * @return the rectangle's length (in units)
     */
    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }
    
    //=========================
    //Constructor
    //===========================
    
    public Rectangle()
    {
        this.length = 0;
        this.width = 0;
        this.name = "Rectangle";
    }

    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
        this.name = "Rectangle";
    }
    
    //==================
    // instance method
    //==================
    
    /**
    *Calculates and returns the rectangle's area (in square units)
    * 
    *@return  the rectangle's area (in square units)
    */
    protected long calcArea()
    {
        return length * width;
    }
    
    protected long calcPerimeter()
    {
        return 2 * (length + width);
    }
    
   
    //=============
    //Overriden method
    //==================
    @Override 
    public String getName()
    {
        return this.name;
    
    }
    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "_".repeat(50)
                + "\n Length: " + this.length
                + "\n Width: " + this.width
                + "\n Area: " + this.calcArea()
                + "\n Perimeter: " + this.calcPerimeter()
                + "\n" + "_".repeat(50);
    
    }
      
}
