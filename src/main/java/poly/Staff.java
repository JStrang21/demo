package poly;

//Staff is a type of person
public class Staff extends Employee
{
    //Variable to identify what title the faculty object has
    int pay;
    
    //Default/no-arg constructor
    public Staff()
    {
        super();
        pay = 0;
    }

    //Overloaded constructor
    public Staff(String n, String d, int id, int p)
    {
        super(n, d, id);
        setPay(p);
    }

    //Overwrites indetifiers of object to desired values rather than creating new object with desired values
    public void reset(String newName, String newDepartment, int newID, int newPay)
    {
        super.name = newName;
        super.department = newDepartment;
        super.employeeID = newID;
        setPay(newPay);
    }

    //Getter
    public int getpay()
    {
        return pay;
    }

    //Setter
    public void setPay(int newPay)
    {
        //If pay is less than 0 or greater than 20 then the pay equals 0
        if (newPay < 1 || newPay > 20) 
        {
            newPay = 0;
        }
        pay = newPay;
    }

    //Equality checker: checks if two graduate objects are the same
    public boolean isEqual(Staff otherStaff)
    {
        //Checks if all identifiers of both objects are equal
        if (otherStaff.name.equals(super.name) && otherStaff.department.equals(super.department) && otherStaff.employeeID == super.employeeID && otherStaff.pay == pay)
        {
            //If name, department, id, and pay of both staff are equal then they're the same staff
            return true;
        }
        return false;
    }
    
    //Prints object instance variables
    public void writeOutput() 
    {
        System.out.println("Name: " + super.name);
        System.out.println("Dept: " + super.department);
        System.out.println("Employee ID:" + super.employeeID);
        System.out.println("Pay Grade: " + pay);
    }
}
