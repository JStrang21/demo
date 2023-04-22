package poly;

public class Graduate extends Student{
    public int level;

    //Default/no-arg constructor
    public Graduate()
    {
        super();
        level = 0;
    }

    //Just name constructor
    public Graduate(String n)
    {
        super(n);
        level = 0;
    }

    //Name + studentLevel constructor
    public Graduate(String n, int s)
    {
        super(n, s);
        level = 0;
    }

    //Overloaded constructor
    public Graduate(String n, int s, int l) {
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
    
    //Equality checker: checks if two person objects are the same
    public boolean isEqual(Graduate otherGrad)
    {
        if (otherGrad.studentNumber == this.studentNumber && otherGrad.name.equals(super.name) && otherGrad.level == level)
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
