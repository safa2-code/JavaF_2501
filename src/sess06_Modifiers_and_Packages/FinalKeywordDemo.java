package sess06_Modifiers_and_Packages;

/**
 *java program to demonstrate the final keyword in java.
 * 
 * 1. final field---> cannot be reassigned/modified after initialisation
 * 2. final method ---> cannot be override in subclasses
 * 3. final class ---> cannot be extended (no subclass allowed)
 * @author pc
 */
public class FinalKeywordDemo
{
    //main method beginsprogram execution
    public static void main(String[] args)
    {
        //1 demonstrate the final field
        System.out.println("=========1. final field Demo=======");
        person person = new person(30, "Jane mutisya");
        System.out.println(person);
        
        //Try to reassign jane's ID no
        //person.id = 21; //would not compile due to private access & trying to 
        //modify a final
        
        //we can change jane's age
        person.setAge(23);
        System.out.println("After jane's birthday: \n" + person);
        
        //2 demonstrate the final method
        System.out.println("=========2. final field Demo=======");
        Employee emp = new Employee(30,50000, "Alice");  //id, salary,name
        emp.setAge(25);  //set the employee's age
        System.out.println(emp.getDetails());
        
        
        //3. Demonstrate the final class
        System.out.println("======3. final Class Demo======");
        MathUtils.add(20, 10);
        MathUtils.multiply(5, 8);
    }
}

/** 
 * Class with a final field
 * The 'id' field is final --> must be set the constructor and never
 * changed/modified
 */
class person
{
    private final int id; //final instance field
    private String name;
    private int age;

    public person(int id, String name)
    {
        this.id = id; //only place where final Id field can be assigned
        this.name = name;
        this.age = 0;
    }
    
    public int getId() {return this.id;}
    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    
    public void setAge(int age) {this.age = age;}
    

    @Override
    public String toString()
    {
        return "User Details" 
                + "\n" + "_".repeat(50)
                + "\nID No.: " + this.id
                + "\nName : " + this.name
                + "\nAge : " + this.age
                + "\n" + "-".repeat(50);
    }
}


/**
*2 Class with a final method
*its subclasses cannot override the getDetails() method
*
*  @author pc
*/
class Employee extends person
{
    private double salary;
    
    //constructor

    public Employee(int id,double salary, String name)
    {
        super(id, name);  //generate random id for the user
        this.salary = salary;
    }
    
    // final method → cannot be overridden
    public final String getDetails()
    {
        return "Employee Details"
                + "\n" + "_".repeat(50)
                + "\nID No.: " + getId()
                + "\nName : " + getName()
                + "\nAge : " + getAge()
                + "\nSalary: " + this.salary
                + "\n" + "-".repeat(50);
    }
}

/**
* 3. Final class - cannot be sub classed
* Examples in Java API: String, Integer, Double, Math, System, etc.
*/
final class MathUtils {
 
    // Static final field (constant) - convention: all final fields should be in UPPERCASE
    public static final double PI = 3.14159265359;
 
    // Utility methods
    public static void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
 
    public static void multiply(int a, int b) {
        System.out.println(a + " × " + b + " = " + (a * b));
    }
}
 
// This would cause a compile-time error:
// class AdvancedMath extends MathUtils { }  // Cannot inherit from final 'MathUtils'

