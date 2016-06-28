package dayTwo.example;

/**
 * Created by student on 28-Jun-16.
 */
public class Person {

    //fields,
    private String firstName;
    private String lastName;
    private int age;
    private boolean female;

    // properties,

    public void setFirstName(String fn){this.firstName = fn; }

    public String getFirstName() {return this.firstName; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // constructors

    public Person()
    {

    }

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // ,methods,
    public String Talk(){return null; }

    public void Walk() {}

    @Override
    public String toString()
    {
        return "Name: " + firstName + " " + lastName;
    }

    // event;
}
