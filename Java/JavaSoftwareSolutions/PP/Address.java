//********************************************************************
// Address.java Author: Lewis/Loftus
//
// Represents a street address.
//********************************************************************
public class Address {
    private String streetAddress, city, state;
    private long zipCode;

    //-----------------------------------------------------------------
    // Constructor: Sets up  this address with the specified data.
    //-----------------------------------------------------------------
    public Address (String streetAddress, String city, String state, long zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAdress() {
        return this.streetAddress;
    }
    //-----------------------------------------------------------------
    // Returns a description of this Address object.
    //-----------------------------------------------------------------
    public String toString() {
        return ("Street adress: " + this.streetAddress + "\tCity: " + this.city + "\tState: " + this.state + "\tZipcode: " + this.zipCode);
    }
}