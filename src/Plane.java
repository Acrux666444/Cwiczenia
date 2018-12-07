public class Plane extends Vehicle implements Flying{
    public String name;

    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {
        System.out.println("Im Taking Off");

    }

    @Override
    public void land() {
        System.out.println("Landing");

    }

    @Override
    public void CallAirControl() {
        System.out.println("Calling Air Controll");

    }

    @Override
    double getFuelNeeds() {
        return 2000;
    }

    @Override
    double getDistance() {
        return 1201;
    }

    @Override
    public void go() {
        takeOff();
    }

    @Override
    public void stop() {
        land();
    }
}
