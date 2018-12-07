public class Ship extends  Vehicle implements Sailing{
    public String name;

    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println("Docking !!!! IN pOrt");

    }

    @Override
    double getFuelNeeds() {
        return 1200;
    }

    @Override
    double getDistance() {
        return 190;
    }

    @Override
    public void stop() {
        dock();
    }
}
