package poly;

//Faculty is a type of employee
public class Faculty extends Employee
{
    //Variable to identify what title the faculty object has
    String title;
    
    //Default/no-arg constructor
    public Faculty()
    {
        super();
        title = "";
    }

    //Overloaded constructor
    public Faculty(String n, String d, int id, String t)
    {
        super(n, d, id);
        title = t;
    }

    //Overwrites indetifiers of object to desired values rather than creating new object with desired values
    public void reset(String newName, String newDepartment, int newID, String newTitle)
    {
        super.name = newName;
        super.department = newDepartment;
        super.employeeID = newID;
        title = newTitle;
    }

    //Getter
    public String getTitle()
    {
        return title;
    }

    //Setter
    public void setTitle(String newTitle)
    {
        this.title = newTitle;
    }

    //Equality checker: checks if two graduate objects are the same
    public boolean isEqual(Faculty otherFaculty)
    {
        //Checks if all identifiers of both objects are equal
        if (otherFaculty.name.equals(super.name) && otherFaculty.department.equals(super.department) && otherFaculty.employeeID == super.employeeID && otherFaculty.title.equals(title))
        {
            //If name, department, and id of both faculty are equal then they're the same faculty
            return true;
        }
        return false;
    }

    //Prints object instance variables
    public void writeOutput() 
    {
        System.out.println("Name: " + super.name);
        System.out.println("Dept: " + super.department);
        System.out.println("Employee ID: " + super.employeeID);
        System.out.println("Title: " + title);
    }
}
