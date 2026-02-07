package sess04_classes_objects_methods;

/**
 *Java class to model a student object
 * @author pc
 */
public class Student
{
    String studentID;
    String name;
    int age;
    char gender;
    
    // no argument constructor
    public Student()
    {
        this.studentID = "";
        this.name = "";
        this.age = 0;
        this.gender = 'F';
    }
    
    // student initializer
    public void initialiseStudent()
    {
        this.studentID = "Student0001";
        this.name = "Student One";
        this.age = 18;
    }
    
    // method to display the student's details
    public void displayDetails()
    {
        System.out.println("Student Details");
        System.out.println("#".repeat(50));
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Student's Name: " + this.name);
        System.out.println("Student's Age: " + this.age);
        System.out.println("Student's Gender: " + (this.gender == 'm' || this.gender == 'M'? "Male":"Female"));
        System.out.println("#".repeat(50));
    }
  
}
