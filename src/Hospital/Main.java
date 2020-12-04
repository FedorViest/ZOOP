package Hospital;

import Date.Date;
import Department.Buffet;
import Department.Room;
import Person.Patient;
import Person.Person;
import Person.Seller;
import Person.Visitor;
import Date.Orders;
import Person.Doctor;
import Person.Nurse;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner handler = new Scanner(System.in);
        int count = 0;
        while (true) {
            navigationMenu();
            Orders k = new Orders();
            String newhandler = handler.nextLine();
            if (newhandler.equals("visit")) {
                System.out.println("======================");
                System.out.println("| Input visitors age |");
                System.out.println("======================");
                Scanner age = new Scanner(System.in);
                int inputAge = age.nextInt();
                Visitor visitor = new Visitor(inputAge);
                visitor.createVisitor(visitor);
                if (visitor.isEjected(visitor.getStatus()) == 1){
                    System.out.println("\nVisitor cannot come in, because he is unhealthy");
                    System.out.println("\nCurrent amount of visitors is: " + count);
                    continue;
                }
                else if (visitor.isEjected(visitor.getStatus()) == 2){
                    System.out.println("\nVisitor cannot come in, because his status is invalid");
                    System.out.println("\nCurrent amount of visitors is: " + count);
                    continue;
                }

                Date date = new Date();
                date.createTime(date, visitor);

                if (visitor.isEjected(date)) {
                    if (visitor.relationshipStatus()) {
                        System.out.println("\nVisitor can come in");
                        count++;
                    }
                } else {
                    if(date.getTime() < 720) {
                        System.out.println("\nVisitor cannot come in, because he is early");
                    }
                    else if(date.getTime() > 960){
                        System.out.println("\nVisitor cannot come in, because he is late");

                    }
                }

                System.out.println("\nCurrent amount of visitors is: " + count + "\n\n");
            }
            else if (newhandler.equals("patient")) {
                Date date = new Date();

                Orders order = new Orders();

                order.printTerm();

                System.out.println("Set day of appointment:\n");
                Scanner day = new Scanner(System.in);
                int inputday = day.nextInt();
                if (inputday > 30 || inputday < 1){
                    System.out.println("Invalid input.\n");
                    continue;
                }
                date.setDay(inputday);

                System.out.println("Set month of appointment:\n");
                Scanner month = new Scanner(System.in);
                int inputmonth = month.nextInt();
                if (inputmonth > 12 || inputmonth < 1){
                    System.out.println("Invalid input.\n");
                    continue;
                }
                date.setMonth(inputmonth);

                System.out.println("Set time [hour(7-13)] of appointment:\n");
                Scanner time = new Scanner(System.in);
                int inputtime = time.nextInt();
                if (inputtime > 13 || inputtime < 7){
                    System.out.println("Invalid input(select time range between 7:00 and 13:00).\n");
                    continue;
                }
                date.setTime(inputtime);

                if (order.isOccupied(inputday, inputmonth, inputtime) || inputday % 7 == 0 || inputday % 7 ==1){
                    System.out.println("Your selected checkup date (" +inputday+"."+inputmonth+". at " + inputtime + ":00) is occupied or is weekend, please choose other date.\n");
                    continue;
                }

                Patient patient = new Patient(date);
                System.out.println("Reserved checkup of patient is : " + patient.getDay() + "." + patient.getMonth() + ". at " + patient.getTime() + "0\n");
            }

            else if (newhandler.equals("buffet")){
                Date date = new Date();

                System.out.println("Input day(1-31) to see if the buffet is open.\n");
                Scanner day = new Scanner(System.in);
                int inputday = day.nextInt();
                date.setDay(inputday);

                if (inputday > 31 || inputday < 1){
                    System.out.println("Invalid day number.\n");
                    continue;
                }

                //Singleton
                Buffet buffet = Buffet.getInstance();

                int working = generateRandom(0, 2);
                if (working == 0) {
                    System.out.println("Unfortunately buffet on this day is closed, because seller is not at work.\n");
                }
                else{
                    //upcasting
                    Person person = new Seller();
                    person.isHealthy("healthy");

                    //downcasting
                    Seller seller1 = (Seller)person;
                    if (seller1.isHealthy(date.getDay())){
                        System.out.println("\nBuffet is open\n");
                        buffet.menu(date);
                    }
                    else{
                        System.out.println("\nBuffet is closed because of weekend\n");
                    }
                }
            }

            else if (newhandler.equals("doctor")){
                Date date = new Date();
                System.out.println("Set day to see information about doctors present at work today.\n");
                Scanner day = new Scanner(System.in);
                int newday = day.nextInt();

                Doctor doctor = new Doctor("a", 1, "m", 1);
                Nurse nurse = new Nurse(1, "a", 1, "f", 1);

                System.out.println("Select time of day ('night'|'day'):\n");
                Scanner daytime = new Scanner(System.in);
                String inputdaytime = daytime.nextLine();

                int countDoctor, countNurse;

                if (newday % 7 == 0 || newday % 7 == 6 || inputdaytime.equals("night")){
                    countDoctor = generateRandom(1, 3);
                    countNurse = generateRandom(1 ,4);
                    doctor.createDoctors(countDoctor);
                    nurse.createNurse(countNurse);
                }
                else {
                    countDoctor = generateRandom(3, 4);
                    countNurse = generateRandom(1 ,3);
                    doctor.createDoctors(countDoctor);
                    nurse.createNurse(countNurse);
                }
                doctor.printDoctors(countDoctor);
                nurse.printNurse(countNurse);
            }

            else if (newhandler.equals("exit") || newhandler.equals("end") || newhandler.equals("close")){
                System.out.println("Ending inputting...");
                break;
            }
            else{
                System.out.println("\nInvalid entry");
                System.out.println("Ending inputting...");
                break;
            }
        }
    }

    //final method
    public final static void navigationMenu(){
        System.out.println("Input\n'visit' for visit\n'patient' to order for checkup\n'buffet' to see if buffet is open and to see daily menu\n'doctor' to see details about doctor");
        System.out.println("Input 'end' or 'close' or 'exit' to end inputting\n");
    }

    //static method
    public static int generateRandom(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }
}
