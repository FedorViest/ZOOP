package Date;

public class Date {
    private int day;
    private int month;
    private int year;
    private int timeHours;


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTime() {
        return timeHours;
    }

    public void setTime(int timeHours) {
        this.timeHours = timeHours;
    }

    public int convertTimeMinutes(double time){
        double minutes = (time - (int) time) * 60;
        return (int)minutes;
    }

    public int convertTimeHours(double time){
        return (int) time * 60;
    }
}
