package sess05_arrays_and_strings;

/**
 * Java class to create person objects
 * 
 * @author pc
 */
public class Person
{
    //Instance field
    /**
     * The person's full name.
     */
    protected String name;
    /**
     * The person's binary gender i.e 'm'. or 'M' for male and 
     * 'f' or 'F' for female
     */
    protected char gender;
    /**
     * The person's age store as a {@code byte} to save memory since human
     * age is typically 0 to about 120 years
     */
    protected byte age;
    
    
    //------------------------------------------------------
    // Constractors
    //------------------------------------------------------
    /**
     * Default no-argument constructor that initilises a {@code Person}
     * object with default values
     */
    
    public Person()
    {
    }
    
    /**
    *Parameterised constructor to initialise a person's details to the 
    * values passed in as parameters
    * 
    * @param name the person's full name
    * @param gender the person's gender: 'M'/'m' for 'F'/'f' for female
    * @param age the person's age in years (0 -127)
    */
    
    public Person(String name, char gender, byte age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    
    //----------------------------------
    //Getter and setter methods
    //----------------------------------
    /**
     * Returns the name of the person.
     * 
     * @return the current value of {@code name}
     */

    public String getName()
    {
        return name;
    }
    
    /**
    * Update or sets the person's name
    * 
    * @param name the new name of the person
    */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * Returns the gender of the person ('m' or 'F').
     * 
     * @return the current value of {@code name}
     */
    public char getGender()
    {
        return gender;
    }
    /**
    * Updates or sets the person's gender
    * 
    * @param gender the new age of the persons
    */

    public void setGender(char gender)
    {
        this.gender = gender;
    }
    /**
     * Returns the age of the person in years.
     * 
     * @return the current value of {@code name}
     */
    public byte getAge()
    {
        return age;
    }
    /**
    * Updates or sets the person's age
    * 
    * @param age the new age of the persons
    */

    public void setAge(byte age)
    {
        this.age = age;
    }
    
    //---------------------------------------
    //Overriden methods
    //--------------------------------------
    /**
     * Returns a formatted string representation of the {@code person} object.
     * 
     * @return  a multi-line formatted string describing the person
     */
    @Override
    public String toString()
    {
        return "person Details\n"
        + " - " .repeat(50)
        + "\nPerson's Name: " + this.name
        + "\n Person's age: " + this.age
        + "\n Person's gender: " + (this.gender == 'm' ||
                this.gender == 'F' ? "Male\n" : "Female\n")
        + "-".repeat(50);
    }
           
}
