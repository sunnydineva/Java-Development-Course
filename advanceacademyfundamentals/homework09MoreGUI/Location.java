package advanceacademyfundamentals.homework09MoreGUI;

public class Location {

    private String country;
    private String city;
    private String street;
    private String streetNo;
    private String postalCode;

    public Location(String country, String city, String street, String streetNo, String postalCode){
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNo = streetNo;
        this.postalCode = postalCode;
    }

    public String getCountry(){
        return country;
    }
    public void setCountry(){
        this.country = country;
    }
    public String getCity(){
        return city;
    }
    public void setCity(){
        this.city = city;
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(){
        this.street = street;
    }
    public String getStreetNo(){
        return streetNo;
    }
    public void setStreetNo(){
        this.streetNo = streetNo;
    }
    public String getPostalCode(){
        return postalCode;
    }
    public void setPostalCode(){
        this.postalCode = postalCode;
    }
    public String toString(){
        return "Country: " + country + "Street No " + street + " " + streetNo + " " + postalCode;
    }



}
