public class Date {
    int year;
    String month;
    int day;
    Date(int year,String month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    Date(int year){
        this(year,"7월",14);
    }
    Date(){
        this(1995,"7월",14);
    }

    @Override
    public String toString(){
        return "Date [ year="+year+", month="+month+", day="+day+"]";
    }
    public static void main(String[] args){
        Date date = new Date(1990);
        System.out.println(date);

    }
}
