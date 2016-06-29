package dayTwo.AddressBookProgramme;

import dayTwo.example.*;
import dayTwo.example.Person;

/**
 * Created by student on 28-Jun-16.
 */
public class AddressBook {

    private Contact[] contacts = new Contact[100];

    int counter = 0;

    public void addNewContact(Contact contact)
    {

        contacts[counter + 1] =  contact;
        counter++;
    }

    public Contact[] getContacts()
    {
        return contacts;
    }
}
