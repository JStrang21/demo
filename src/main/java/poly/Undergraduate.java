package poly;

public class Undergraduate extends Student{
    public int level;

    public Undergraduate()
    {
        super();
    }

    public Undergraduate(String n, int s, int l) {
        super(n, s);
        level = l;
    }

    public void reset(String newName, int newStudentNumber, int newLevel)
    {
        super.name = newName;
        super.studentNumber = newStudentNumber;
        level = newLevel;
    }

    public int getLevel() 
    {
        return level;
    }

    public void setLevel(int newLevel)
    {
        level = newLevel;
    }
    
    public boolean equals(Graduate otherGrad)
    {
        
        return false;
    }

    public void writeOutput()
    {
        System.out.println("Name: " + super.name);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Student Level: " + level);
    }
    
}
