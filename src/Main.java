

public class Main {

    public static void main(String[] args) {
      byte b1 = -127 ; byte b2 =127 ;
      byte b3 = (byte) (b1+b2);
       // System.out.println("bin :" + bin + " osc "+oct +" hex "+hex);

      //System.out.println(msg);
        System.out.println("Podaj rok a sprzwdze czy jest przsepny");
        isLeapYear(2001);
        short s = 'A';
        char c = 65;
        System.out.println(b3);
       // Hello sd = new Hello();
       // System.out.println(sd.getClass());
        Hello q = new Hello("Kapusta");
        Hello w = new Hello("Warzywo");
        Hello r = new Hello("taak");
        System.out.println(q.name );
        q.changeValue();


}
    public static boolean isLeapYear(int year){
        if(year%4==0 && (year%100!=0 || year%400==0) ){
            System.out.println("Przestępny");
            return true;

        }else{
            System.out.println("Nie Przestępny");
            return false;
        }
    }
}
