package sess08_interfaces_and_nested_classes;

import java.util.Scanner;

/**
 * java program to demonstrate declaring and instantiating { circle} 
 * and Sphere objects and displaying their details
 * 
 * @author pc
 */
public class CircleSphereDemo
{
    //mainmethod begins program execution
    public void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    
    //Declare circle and sphere objects 
    Circle c1, c2;
    Sphere s1, s2;
    
    //prompt the user for the radius of 'c2' and 's2'
    System.out.println("please enter the radius of the circle in cm:\n");
    int rad =sc.nextInt();
    System.out.println("please enter the radius of the sphere in cm:\n");
    int rad2 =sc.nextInt();
    
    //instantiate the circle, then the spheres
    c1 = new Circle(); //using default constructor
    c1.setRadius(7);
    c2 = new Circle(rad); //using the parameterised constructor
    
    s1 = new Sphere(); //using default constructor
    s1.setRadius(7);
    s2 = new Sphere(rad); //using the parameterised constructor
    
    //Display the dimensions of the circles & spheres
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(s1);
    System.out.println(s2);
 
    }
}
