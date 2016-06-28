package dayTwo.AddressBookProgramme;

/**
 * Created by student on 28-Jun-16.
 */
public class Address {

    private String street;
    private String city;
    private String country;
    private String postcode;

    public Address(String city, String street, String postcode, String country) {
        this.city = city;
        this.street = street;
        this.postcode = postcode;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
