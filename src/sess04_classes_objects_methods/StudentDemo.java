package sess04_classes_objects_methods;

/**
 * Java program to demonstrate creating student objects and invoking their
 * methods
 * 
 * @author pc
 */
public class StudentDemo
{
    // main method begins program execution
    public static void main(String[] args)
    {
        Student s1 = new Student();// declare and instantiate a student object
        
        // initialise the student object
        s1.initialiseStudent();
        
        // display the student's details
        s1.displayDetails();
    }


    
}
