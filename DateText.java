
public class DateText {
    public static void main(String[] args) {
        Date date = new Date(5,20,2004);
        date.displayDate();
        System.out.println("Month:"+date.getMonth());
        System.out.println("Day:"+date.getDay());
        System.out.println("Year:"+date.getYear());;
        date.setMonth(14);
        date.setDay(25);
        date.setYear(2025);
        date.displayDate();
        System.out.println("Month:"+date.getMonth());
        System.out.println("Day:"+date.getDay());
        System.out.println("Year:"+date.getYear());

    }
}
