package dayTwo.AddressBookProgramme;

import dayTwo.example.*;
import dayTwo.example.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 28-Jun-16.
 */
public class Contact {

    //person refrence to a single person in a single contact
    private Person p;
    private List<Address> addresses = new ArrayList<>();
    private String phoneNumber;
    private String email;

    public Contact( Person p,Address address,String phoneNumber ,String email) {

        this.p = p;
        addresses.add(address);
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //add an address to a collection
    public void addAddress(Address address)
    {
        addresses.add(address);
    }

    //remove a address from a collection based on index number
    public void removeAddress(int index)
    {
        addresses.remove(index);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person getPerson()
    {
        return p;
    }
}
