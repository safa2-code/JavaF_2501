
package sess08_interfaces_and_nested_classes;

import sess07_inheritance_and_polymorphism.Shape;

/**
 *
 * @author pc
 */
public class Circle extends Shape implements I2DShape
{
    //==================
    // Instance field(s)
    //==================
    /**
     *The radius of the circle (in units)
    */
    protected int radius;
    
    //=========================
    // Getters & Setters
    //=========================
    /**
     * returns the area of the circle (in units)
     *
     * @return the area of Circle (in units)
     */
    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    
    //======================
    //Constractor
    //=====================
    public Circle()
    {
        this.radius = 0;
        this.name = "Circle";
    }
    
    public Circle(int radius)
    {
        this.radius = radius;
    }
    
    //=================
    // Overriden method
    //==================
    @Override
    public String getName()
    {
        return "Circle";
    }
    
    @Override
    public float calcArea()
    {
        return (float) (Math.PI * (radius * 2));
    }
    
    //===============
    //Overriden method
    //================
    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "_".repeat(50)
                + "\n Radius: " + this.radius
                + "\n Area: " + this.calcArea()
                + "\n Circumference: " + this.calcCircumference()
                + "\n" + "_".repeat(50);
    
    }
    
    public float calcCircumference()
    {
        return (float) (Math.PI * (radius * 2));
    }
    
    
    
    
}
