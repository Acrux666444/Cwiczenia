public class Date {
    public int year;
    public int month;
    public int day;



    public Date(int year, int month, int day){

        this.year = year;
        this.month = month;
        this.day = day;

    }

    public String getInfo(){
        String info="Rok " +year + " Miesiac " +month+ " Dzien " +day;

       // System.out.println("Rok " +year + " Miesiac " +month+ " Dzien " +day);
        return info;

    }
}