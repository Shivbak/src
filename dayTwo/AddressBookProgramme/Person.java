package dayTwo.AddressBookProgramme;

import com.sun.jndi.cosnaming.IiopUrl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 28-Jun-16.
 */
public class Person {


    private String firstName;
    private String lastName;



    public Person(String firstName, String lastName) {

        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
