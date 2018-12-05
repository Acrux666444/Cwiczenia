public class Hello {
    String name;
    int value;

    public Hello(String name) {
        this.name = name;
        value = 23;
    }

    public void changeValue(){
        System.out.println(name +value);
    }
}
