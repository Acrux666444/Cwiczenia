public class Main {

    public static void main(String[] args) {
        Vehicle []tab = new Vehicle [5];
        tab[0] = new Car("Porshe");
        tab[1] = new Plane("Ryaner");
        tab[2] = new Ship("Titanic");
        tab[3] = new Truck("Moster");
        tab[4]= new RaceCar("Mercedes");

        for(Vehicle veh : tab){
            System.out.println(veh.getName()+" ");
            if(veh instanceof Flying){
                ((Flying) veh).CallAirControl();}
            veh.go();
            veh.stop();
            System.out.println("Fuel COnsumption :"+veh.calculateFuelConsumption()+"\n");
        }

//        for(int i = 0 ; i < tab.length ; i++) {
//            tab[i].start();
//            if (tab[i] instanceof Car) {
//                System.out.println("instance of Car");
//            } else if (tab[i] instanceof Plane) {
//                System.out.println("instance of Plane");
//            } else if (tab[i] instanceof Ship) {
//                System.out.println("instance of Ship");
//            } else if (tab[i] instanceof Truck) {
//                System.out.println("instance of Truck");
//            } else if (tab[i] instanceof RaceCar) {
//                System.out.println("instance of RaceCar");
//            }
//        }

        System.out.println("Hello World!");
    }
}
