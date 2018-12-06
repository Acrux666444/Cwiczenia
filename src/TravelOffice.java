public class TravelOffice {
    public static int countCustomer=0;
    public static Customer [] tablica = new Customer [2];



    public static void main(String[] args) {
        int countCustomer=0;
        Customer [] tablica = new Customer [2];
        Date start = new Date(2022,12,25);
        Date end = new Date(2025,12,25);

       Address ad = new Address("lodz ","9885","Warszawska");
        Trip tr = new Trip(start,end,"London");
        Customer cs = new Customer("Dave");
        Customer qw = new Customer("Harold");
        Customer qq = new Customer("Matthew");
        Customer ww = new Customer("Mariano");

        ww.setAddres(ad);
        ww.assignTrip(tr);

        qw.assignTrip(tr);
        qw.setAddres(ad);

        cs.assignTrip(tr);
        cs.setAddres(ad);

        qq.assignTrip(tr);
        qq.setAddres(ad);
        // System.out.println(start.getInfo());
       // System.out.println(cs.getInfo());
        addCustomer(cs);
       // showTable();
        addCustomer(qw);
        //System.out.println(countCustomer);

        addCustomer(qq);
        addCustomer(ww);
        showTable();
        System.out.println("CC "+countCustomer);

    }
    public static void addCustomer (Customer cust) {
        if(countCustomer+1>tablica.length){
            Customer []tab = new Customer[countCustomer+1];
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
            System.out.println(i+" Element tAblicy to \n"+tablica[i].getInfo());
        }

         System.out.println(countCustomer);
    }


}
