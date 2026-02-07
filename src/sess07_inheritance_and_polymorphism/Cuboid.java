
package sess07_inheritance_and_polymorphism;

/**
*The  {@code Rectangle} class represents a 2-dimensional rectangle with its
 * length, width and breadth(depth). It provides methods to compute its
 * surface area and volume.
 * @author pc
 */
public class Cuboid extends Rectangle
{
    //=====================
    //instance fields
    //======================
    /**
     * The length of the cuboid ( units)
     
     */
    private int depth;
    
     //=========================
    // Getters & Setters
    //=========================
    /**
     * returns the depth of the rectangle (in units)
     *
     * @return the rectangle's depth (in units)
     */
    
    public int getdepth()
    {
        return depth;
    }

    public void stedepth(int depth)
    {
        this.depth= depth ;
    }
    
    //=========================
    //Constructor
    //===========================
    
    public Cuboid()
    {
        super();  //call the parent/super class constructor
        this.depth = 0;
        this.name = "Cuboid";  //change the name from rectangle to cuboid
    }

    public Cuboid(int length, int width, int depth)
    {
        super (length,width);
        this.depth = depth;
        this.name = "Cuboid";
    }
    
    //==================
    // instance method
    //==================
    
    /**
    *Calculates and returns the Cuboid's surface area (in square units)
    * 
    *@return  the Cuboid's surface area (in square units)
    */
    protected long calcSurfaceArea()
    {
        return 2 * (this.calcArea() + width * depth + length * depth);  //2(lw + wd +ld)
    }
    
    protected long calcVolume()
    {
        return this.calcArea() * this.depth;
    }

    
    
//    //==================
//    //Overriden method
//    //==================
//    @Override 
//    public String getName()
//    {
//        return this.name;
//    
//    }
    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "_".repeat(50)
                + "\n Length: " + this.length
                + "\n Width: " + this.width
                + "\n Depth: " + this.depth
                + "\n Surface Area: " + this.calcSurfaceArea()
                + "\n Volume: " + this.calcVolume()
                + "\n" + "_".repeat(50);
    
    }
    
}
