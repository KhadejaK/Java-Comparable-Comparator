/**
 * Describes a Student with a name and grade point.
 * 
 */
public class Student implements Measurable
{
    private String name;
    private double gpa;
    private double QUALIFYING_GPA = 3.54;
    
    /**
     * Creates a student
     * @param theName the name of this student
     * @param theGpa the gpa of this student
     */
    public Student(String theName, double theGpa)
    {
        name = theName;
        gpa = theGpa;
    }
    
    /**
     * Gets the name of this student
     * @return the name of this student
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the GPA of this student
     * @return the GPA of this student
     */
    public double getGPA()
    {
        return gpa;
    }

    public double getMeasure()
    {
        return gpa;
    }
}