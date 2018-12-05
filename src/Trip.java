public class Trip {

    public Date start;
    public Date end;
    public String destination;

    public Trip(Date start, Date end, String destination) {
        this.start = start;
        this.end = end;
        this.destination = destination;
    }
    public String getInfo(){
            String info= "Start trip"+start.getInfo()+"\n"+ " End Date " +end.getInfo() +"Dest "+destination;
        //System.out.println(start.getInfo()+end.getInfo() +"Dest "+destination);
        return info;
    }
}
