public class Customer {
    public String name;
    public Address addres;
    public Trip trip;

    public Customer(String name) {
        this.name = name;
    }

    public void setAddres(Address addres) {
        this.addres = addres;
    }

    public void assignTrip(Trip trip) {
        this.trip = trip;
    }
    public String getInfo(){
        String info = "name "+name+"\n"+"Addres info :"+addres.getInfo()+"\n"+" Trip info:"+"\n"+trip.getInfo();
        return info;

    }
}
