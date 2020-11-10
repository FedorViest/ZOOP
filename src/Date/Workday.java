package Date;

public class Workday {
    private int day;
    public Workday(){
    }

    boolean isWeekend(int day){
        return day % 6 == 0 || day % 7 == 0;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }
}
