public class TravelOffice {

    public static void main(String[] args) {
        Date start = new Date(2022,12,25);
        Date end = new Date(2025,12,25);

        Address ad = new Address("lodz ","9885","Warszawska");
        Customer cs = new Customer("Dave");
        Trip tr = new Trip(start,end,"London");
        cs.assignTrip(tr);
        cs.setAddres(ad);
        // System.out.println(start.getInfo());
        System.out.println(cs.getInfo());



    }

}
