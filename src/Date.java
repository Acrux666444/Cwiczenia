import java.util.Scanner;
public class Date {
    private int year;
    private int month;
    private int day;
    private static Scanner sc = new Scanner(System.in);


    public Date(){
        getDAte();
    }


    public Date(int year, int month, int day){
        System.out.println("Podaj date pattern YYYY-MM-DD");


        this.year = year;
        this.month = month;
        this.day = day;

    }
    public static Date  getDAte(){

        String date = sc.nextLine();
        String []date1=date.split("\\.");
        System.out.println(date1.length);
        //if(date1.length==3 && (Integer.parseInt(date1[0])>=0 && Integer.parseInt(date1[0])<=9999))
        Date newDate = new Date(Integer.parseInt(date1[0]),Integer.parseInt(date1[1]),Integer.parseInt(date1[2]));
//        this.year=Integer.parseInt(date1[0]);
//        this.month=Integer.parseInt(date1[1]);
//        this.day=Integer.parseInt(date1[2]);

//        for(int i = 0 ; i<date1.length ;i++){
//            if(i==0){
//                System.out.println(Integer.parseInt(date1[0]));
//                this.year=Integer.parseInt(date1[i]);
//            }else if(i==1){
//                this.month=Integer.parseInt(date1[1]);
//            }else if(i==2){
//                this.day=Integer.parseInt(date1[2]);
//            }
//    }
        sc.close();
        return newDate;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

//    public String toString(){
//        String info="Rok " +year + " Miesiac " +month+ " Dzien " +day;
//
//       // System.out.println("Rok " +year + " Miesiac " +month+ " Dzien " +day);
//        return info;
//
//    }
}