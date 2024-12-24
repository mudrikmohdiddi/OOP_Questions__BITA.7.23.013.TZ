public class Date {
    private int month;
    private int day;
    private int year;
    public Date(int month,int day,int year){
        this.year = year;
        this.day = day;
        setMonth(month);
    }
    public void setMonth(int month){
        if(month>= 1 && month<=12){
            this.month = month;
        }
        else{
            this.month = 1;
        }
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public String displayDate(){
        return getMonth()+"/"+getDay()+"/"+getMonth();
    }
    
}
