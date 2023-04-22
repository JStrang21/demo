package poly;

//Undergraduate is a type of student
public class Undergraduate extends Student{
    public int level;

    //Default/no-arg constructor
    public Undergraduate()
    {
        super();
        level = 0;
    }

    //Just name constructor
    public Undergraduate(String n)
    {
        super(n);
        level = 0;
    }

    //Name + studentLevel constructor
    public Undergraduate(String n, int s)
    {
        super(n, s);
        level = 0;
    }

    //Overloaded constructor
    public Undergraduate(String n, int s, int l) {
        super(n, s);
        level = l;
    }

    //Overwrites indetifiers of object to desired values rather than creating new object with desired values
    public void reset(String newName, int newStudentNumber, int newLevel)
    {
        super.name = newName;
        super.studentNumber = newStudentNumber;
        level = newLevel;
    }

    //Getter
    public int getLevel() 
    {
        return level;
    }

    //Setter
    public void setLevel(int newLevel)
    {
        level = newLevel;
    }
    
    //Equality checker: checks if two undergrad objects are the same
    public boolean isEqual(Undergraduate otherUndergrad)
    {
        if (otherUndergrad.studentNumber == this.studentNumber && otherUndergrad.name.equals(super.name) && otherUndergrad.level == level)
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
        System.out.println("Student Level: " + level);
    }
}
