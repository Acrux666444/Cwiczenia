public class Truck extends Car {


    public Truck(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return super.getFuelNeeds()+10;
    }
}
