public class Address {
    private int streerNumber;
    private String streetName;
    private String city;
    private String postalCode;



    public Address(int streerNumber, String streetName, String city, String postalCode) {
        this.streerNumber = streerNumber;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address(int streerNumber) {
        this.streerNumber = streerNumber;
    }

    public int getStreerNumber() {
        return streerNumber;
    }

    public void setStreerNumber(int streerNumber) {
        this.streerNumber = streerNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
