public class Test {

    public static int countCustomer=0;
    public static Customer [] tablica = new Customer [2];

    public static void main(String[] args) {

        Date start = new Date(2022,12,25);
        Date end = new Date(2025,12,25);

        Address ad = new Address("lodz ","9885","Warszawska");
        Trip tr = new Trip(start,end,"London",2000.2);
        Customer cs = new Customer("Dave");
        Customer qw = new Customer("Harold");
        Customer qq = new Customer("Matthew");
        Customer ww = new Customer("Mariano");

        Trip brasil = new DomesticTrip(start,end,"Brasil",562.22);
        Trip inCountry = new AboardTrip(start,end,"Wroclaw",999.2);

        ww.setAddres(ad);
        ww.assignTrip(brasil);

        qw.assignTrip(inCountry);
        qw.setAddres(ad);

//        cs.assignTrip(tr);
//        cs.setAddres(ad);
//
//        qq.assignTrip(tr);
//        qq.setAddres(ad);

//        addCustomer(cs);
        addCustomer(qw);
//        addCustomer(qq);
        addCustomer(ww);

        showTable();

        System.out.println("CC "+countCustomer);
    }
    public static void addCustomer (Customer cust) {
        if(countCustomer+1>tablica.length){
            Customer []tab = new Customer[countCustomer+2];
            for(int i = 0 ; i<tablica.length;i++){
                tab[i]=tablica[i];
            }
            tablica=tab;
        }
        tablica[countCustomer]=cust;
        countCustomer++;
    }
    public static void showTable() {
        for(int i = 0 ; i<tablica.length;i++){
            System.out.println(i+" Element tAblicy to \n"+tablica[i].toString());
        }
        System.out.println(countCustomer);
    }
}
