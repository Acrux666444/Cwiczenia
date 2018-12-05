public class Address {
    public String city;
    public String zip;
    public String street;

    public Address(String city, String zip, String street) {
        this.city = city;
        this.zip = zip;
        this.street = street;
    }
    public String getInfo(){
        String value = city+":"+zip+":"+street;
        //System.out.println(city+":"+zip+":"+street);
        return value;

    }


}
