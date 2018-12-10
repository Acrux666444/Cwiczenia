package Anonymous;

public class Main {
    public static void main(String[] args) {
        Vehicle c = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Hello form Car");
            }
        };
        c.start();


    }
interface Vehicle{
        void start();
}
}
