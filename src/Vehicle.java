public abstract class Vehicle {
    public String name;

    abstract double getFuelNeeds();
    abstract double getDistance();

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    public  double calculateFuelConsumption(){
        return getFuelNeeds()/getDistance();
    }
    public void go(){
        System.out.println(getClass()+" Wehicle go");
    }
    public void stop(){
        System.out.println(getClass()+" Vehicle stop");
    }

    public String getName() {
        return name;
    }
}
