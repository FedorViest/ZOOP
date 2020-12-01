package Hospital;

import Date.Date;
import Department.Buffet;
import Department.Room;
import Person.Patient;
import Person.Person;
import Person.Seller;
import Person.Visitor;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner handler = new Scanner(System.in);
        int count = 0;
        while (true) {
            navigationMenu();
            String newhandler = handler.nextLine();
            if (newhandler.equals("visit")) {

                System.out.println("Input visitors age:");
                Scanner age = new Scanner(System.in);
                int inputAge = age.nextInt();
                Visitor visitor = new Visitor(inputAge);
                visitor.createVisitor(visitor);
                if (visitor.isEjected(visitor.getStatus()) == 1){
                    System.out.println("\n\nVisitor cannot come in, because he is unhealthy");
                    System.out.println("\n\nCurrent amount of visitors is: " + count);
                    continue;
                }
                else if (visitor.isEjected(visitor.getStatus()) == 2){
                    System.out.println("\n\nVisitor cannot come in, because his status is invalid");
                    System.out.println("\n\nCurrent amount of visitors is: " + count);
                    continue;
                }

                Date date = new Date();
                date.createTime(date, visitor);

                if (visitor.isEjected(date)) {
                    if (visitor.relationshipStatus()) {
                        System.out.println("\n\nVisitor can come in");
                        count++;
                    }
                } else {
                    if(date.getTime() < 720) {
                        System.out.println("\n\nVisitor cannot come in, because he is early");
                    }
                    else if(date.getTime() > 960){
                        System.out.println("\n\nVisitor cannot come in, because he is late");

                    }
                }

                System.out.println("\n\nCurrent amount of visitors is: " + count);
            }
            else if (newhandler.equals("patient")) {
                Date date = new Date();
                date.setDay(6);
                date.setMonth(4);
                date.setTime(13);
                Patient patient = new Patient(date);
                System.out.println("Checkup of patient is : " + patient.getDay() + "." + patient.getMonth() + ". at " + patient.getTime() + "0\n\n");
            }

            else if (newhandler.equals("buffet")){
                Date date = new Date();
                System.out.println("Input day(1-31) to see if the buffet is open.\n");
                Scanner day = new Scanner(System.in);
                int inputday = day.nextInt();
                date.setDay(inputday);
                if (inputday > 31 || inputday < 1){
                    System.out.println("Invalid day number.\n\n");
                    continue;
                }
                Buffet buffet = new Buffet(){
                    @Override
                    public int infectionRisk() {
                        return 0;
                    }
                };
                int working = generateRandom(0, 2);
                if (working == 0) {
                    System.out.println("Unfortunately buffet on this day is closed, because seller is not at work.\n\n");
                }
                else{
                    //downcasting
                    Person seller = new Seller();
                    seller.isHealthy("healthy");

                    //upcasting
                    Seller seller1 = (Seller)seller;
                    if (seller1.isHealthy(date.getDay())){
                        System.out.println("\nBuffet is open\n\n");
                    }
                    else{
                        System.out.println("\nBuffet is closed\n\n");
                    }
                }
            }

            else if (newhandler.equals("exit") || newhandler.equals("end") || newhandler.equals("close")){
                System.out.println("Ending inputting...");
                break;
            }
            else{
                System.out.println("\n\nInvalid entry");
                System.out.println("Ending inputting...");
                break;
            }

        }
    }
    public static void navigationMenu(){
        System.out.println("Input 'visit' for visit, 'patient' to see patients order time and date");
        System.out.println("Input 'end' or 'close' or 'exit' to end inputting\n\n\n");
    }

    public static int generateRandom(int min, int max){
        return (int) (Math.random() * (max - min) + min);
    }


}
