package poly;

public class PolymorphismDemo 
{
    public static void main( String[] args )
    {
        /* Person[] Person = new Person[4];
        Person[0] = new Graduate("Cotty, Manny", 4910, 1);
        Person[1] = new Graduate("Kick, Anita", 9931, 2);
        Person[2] = new Student("DeBanque, Robin", 8812);
        Person[3] = new Graduate("Bugg, June", 9901, 4);

        Person p1 = new Student("DeBanque, Robin", 8812);
        Person p2 = new Student("DeBanque, Robin", 8812);
        //System.out.println(p1.equals  Person[2]));

        Person test1 = new Graduate("Bob");
        

        //System.out.println(((Student) p1).isEqual((Student) p2));
        for (Person p : Person)
        {

            p.writeOutput(); //even though p is of type Person, the
            //writeOutput method associated with
            //Undergraduate or Student is invoked
            //depending upon which class was used to
            //create the object.
            System.out.println();
        } */

        Person p1 = new Staff("Yawf, Len", "MECH", 8942, 28);
	    Person p2 = new Staff("Bruh, John", "ARTE", 2369, -2);
	    Person p3 = new Employee("Brando, Dio", "JOJO", 8945);
	    Person p4 = new Faculty("Hennen, Christie", "EECS", 9821, "Advisor");
	    Person p5 = new Undergraduate("Tired, Iam", 4532, 6);
		
        p1.writeOutput();
    }
}
