package poly;

//Employee is a type of person
public class Employee extends Person
{
    //Identifies the employee's department
    String department;
    //Identifies the employee's number
    int employeeID;

    //Default/no-arg constructor
    public Employee()
    {
        super();
        department = "";
        employeeID = 0;
    }

    //Just name constructor
    public Employee(String n)
    {
        super(n);
    }

    /*//Name and department constuctor
    public Employee(String n, String d)
    {
        super(n);
        department = d;
        employeeNumber = 0;
    }*/

    //Overloaded constructor
    public Employee(String n, String d, int eNumber)
    {
        super(n);
        department = d;
        employeeID = eNumber;
    }

    //Overwrites indetifiers of object to desired values rather than creating new object with desired values
    public void reset(String n, String d, int eNumber)
    {
        super.name = n;
        department = d;
        employeeID = eNumber;
    }
    
    //Getter methods
    public int getEmployeeID()
    {
        return employeeID;
    }

    public String getEmployeeDepartment()
    {
        return department;
    }

    //Setter methods
    public void setEmployeeID(int n)
    {
        employeeID = n;
    }

    public void setEmployeeDepartment(String d)
    {
        department = d;
    }

    //Equality checker: checks if two employee objects are the same
    public boolean isEqual(Employee otherEmployee)
    {
        //Checks if all identifiers of both objects are equal
        if (otherEmployee.name.equals(super.name) && otherEmployee.department == department && otherEmployee.employeeID == employeeID)
        {
            //If all are same, then object are equal
            return true;
        }
        return false;
    }

    //Prints object instance variables
    public void writeOutput()
    {
        System.out.println("Name: " + super.name);
        System.out.println("Dept: " + department);
        System.out.println("Employee ID: " + employeeID);
    }

    
}
