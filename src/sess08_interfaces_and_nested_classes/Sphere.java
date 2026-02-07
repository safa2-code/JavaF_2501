package sess08_interfaces_and_nested_classes;

/**
 * Sphere class that extends Circle and implements I3DShape
 */
public class Sphere extends Circle implements I3DShape
{
    //======================
    // Constructors
    //======================

    public Sphere()
    {
        super();
        this.name = "Sphere";
    }

    public Sphere(int radius)
    {
        super(radius);
        this.name = "Sphere";
    }

    //======================
    // Overridden Methods
    //======================

    /**
     * Calculate surface area of a Sphere: 4πr²
     */
    @Override
    public float calcSurfaceArea()
    {
        return 4 * this.calcArea();  // πr² from Circle
    }

    /**
     * Calculate volume of a Sphere: (4/3)πr³
     */
    @Override
    public float calcVolume()
    {
        return (4/3.0f) * this.calcArea() * this.radius; // πr² * r
    }

    //======================
    // toString Method
    //======================
    
    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "_".repeat(50)
                + "\n   Radius: " + this.radius
                + "\n Surface Area: " + this.calcSurfaceArea()
                + "\n Volume: " + this.calcVolume()
                + "\n" + "_".repeat(50);
    }
    
    
}
