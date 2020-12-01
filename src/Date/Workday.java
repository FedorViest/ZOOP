package Date;

public class Workday {
    private int day;
    public Workday(){
    }

    public boolean isWeekend(int day){
        if (day % 7 == 6 || day % 7 == 0){
            return true;
        }
        return false;
    }

    public int getDay(){
        return day;
    }

    public void setDay(int day){
        this.day = day;
    }
}
