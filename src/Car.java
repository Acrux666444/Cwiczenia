public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    double getFuelNeeds() {
        return 28;
    }

    @Override
    double getDistance() {
        return 100;
    }
}
