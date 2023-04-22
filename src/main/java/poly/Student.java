package poly;

//Extends person class
public class Student extends Person
{
    //Student indentifier
    public int studentNumber;

    //Default constructor
    public Student()
    {
        super();
        studentNumber = 0;
    }

    public Student(String n)
    {
        super(n);
        studentNumber = 0;
    }

    //Overloaded Constructor
    public Student(String n, int s)
    {
        super(n);
        studentNumber = s;
    }

    //Overwrites indetifiers of object to desired values rather than creating new object with desired values
    public void reset(String newName, int newStudentNumber)
    {
        super.name = newName;
        studentNumber = newStudentNumber;
    }

    //Getter
    public int getStudentNumber()
    {
        return studentNumber;
    }

    //Setter
    public void setStudentNumber(int newStudentNumber)
    {  
        studentNumber = newStudentNumber;
    }

    //Equality checker: checks if two person objects are the same
    public boolean isEqual(Student otherStudent)
    {
        System.out.println(otherStudent.studentNumber);
        System.out.println(studentNumber);
        if (otherStudent.studentNumber == this.studentNumber)
        {
            return true;
        }
        return false;
    }

    //Prints object instance indentifiers
    public void writeOutput()
    {
        System.out.println("Name: " + super.name);
        System.out.println("Student Number: " + studentNumber);
    }
}