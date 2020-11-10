package Date;

public class Workday {
    private int day;
    public Workday(){
    }

    boolean isWeekend(){
        return false;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }
}
