
package sess11_additional_java_features;

import java.util.List;
import java.util.Arrays;
import java.util.Map;

/**
 * Java program to demonstrate all the major stream operations
 * @author pc
 */
public class CombinedStreamDemo
{
    //=========================
    // Simple student class
    //==========================
    static class Student
    {
        private String name;
        private int age;
        private List<Integer> grades;

        public Student(String name, int age, List<Integer> grades)
        {
            this.name = name;
            this.age = age;
            this.grades = grades;
        }
        
        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public List<Integer> getGrades()
        {
            return grades;
        }

        @Override
        public String toString()
        {
            return  "name = " + name + ", age = " + age + ", grades = " + grades ;
        }
    }
    
    //=========================
    // Simple Employee class
    //==========================
    static class Employee
    {
        private String name;
        private String department;
        private double salary;

        public Employee(String name, String department, double salary)
        {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName()
        {
            return name;
        }

        public String getDepartment()
        {
            return department;
        }

        public double getSalary()
        {
            return salary;
        }

        @Override
        public String toString()
        {
            return "Employee " + "name = " + name + ", department = " + department + ", salary =Kes. " + salary + '_';
        }
        
        public static void main(String[] args)
        {
            //=============================================
            //1. Create dummy student and employee data
            //================================================
            
            List<Student> students = Arrays.asList(
            new Student("Jane Kamau", 20, Arrays.asList(78,85,90)),
            new Student("Safa Sadiiq", 22, Arrays.asList(88,92,79)),
            new Student("Abdi khani", 19, Arrays.asList(95,90,100)),
            new Student("Diana Cheleng", 20, Arrays.asList(55,60,65)) 
            );
            
            List<Employee> employees = Arrays.asList(
            new Employee("Sophia Ahmet", "HR",650000),
            new Employee("Elias Kimani", "IT",800000),
            new Employee("Mohamed Abdi", "Finance",850000),
            new Employee("Hilda Wamaitha", "Finance",90000),
            new Employee("Ahmed Ali", "IT",75000)
            );
            
            //============================================
            //2. map(): Convert student names to uppercase
            //=============================================
            List<String> upperCaseStudentNames = students.stream()
                    .map(s --> s.getName().toUpperCase()).toList();
            
            System.out.println("Using map() to convert student names to upper case");
            System.out.println(upperCaseStudentNames);
        }
        
        //============================================
        //3. sorted(): sort Student by age ascending
        //=============================================
        List<Student> sortedByAge = students.stream().sorted(comparator.co)
        
        
        
        
    
    }
     
     

  
}
