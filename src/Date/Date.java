package Date;

import Person.Visitor;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
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

    public int getTime() {
        return timeHours;
    }

    public void setTime(int timeHours) {
        this.timeHours = timeHours;
    }

    public int convertTime(int hour, int minute){
        return hour * 60 + minute;
    }

    //aggregation
    public void createTime(Date date, Visitor visitor){
        visitor.visitsAvailable();

        System.out.println("=========================");
        System.out.println("|| Input time of visit ||");
        System.out.println("=========================");

        System.out.println("=================");
        System.out.println("|| Input hours ||");
        System.out.println("=================");
        Scanner hour = new Scanner(System.in);
        int newhour = hour.nextInt();

        System.out.println("===================");
        System.out.println("|| Input minutes ||");
        System.out.println("===================");
        Scanner minute = new Scanner(System.in);
        int newminute = minute.nextInt();

        int time = date.convertTime(newhour, newminute);
        date.setTime(time);
    }
}
