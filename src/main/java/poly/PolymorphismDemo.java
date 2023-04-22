package poly;

/**
 * Hello world!
 *
 */
public class PolymorphismDemo 
{
    public static void main( String[] args )
    {
        Person[] people = new Person[4];
        people[0] = new Graduate("Cotty, Manny", 4910, 1);
        people[1] = new Graduate("Kick, Anita", 9931, 2);
        people[2] = new Student("DeBanque, Robin", 8812);
        people[3] = new Graduate("Bugg, June", 9901, 4);

        Person p1 = new Student("DeBanque, Robin", 8812);
        Person p2 = new Student("DeBanque, Robin", 8812);
        //System.out.println(p1.equals(people[2]));

        Person test1 = new Graduate("Bob");
        

        System.out.println(((Student) p1).isEqual((Student) p2));

        /*for (Person p : people)
        {

            p.writeOutput(); //even though p is of type Person, the
            //writeOutput method associated with
            //Undergraduate or Student is invoked
            //depending upon which class was used to
            //create the object.
            System.out.println();
        }*/
    }
}
