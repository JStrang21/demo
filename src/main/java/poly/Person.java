package poly;

//Main class/ base class for other classes
public class Person 
{
    //String to identify person object
    public String name;

    //Default constuctor: sets identifier to empty string
    public Person()
    {
        name = "";
    }

    public Person(String n)
    {
        name = n;
    }

    //Setter
    public void setName(String newName)
    {
        name = newName;
    }

    //Getter
    public String getName()
    {
        return name;
    }

    //Prints object instance indentifier
    public void writeOutput()
    {
        System.out.println("Name: " + name);
    }

    //Equality checker: checks if two person objects are the same
    public boolean hasSameName(Person otherPerson) 
    {
        //If both name variables are equal then they're the same person
        if (otherPerson.name.equals(name))
        {
            return true;
        }
        return false;
    }
}
