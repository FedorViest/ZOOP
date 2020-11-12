package Person;
import Date.Date;

import java.util.Scanner;

public class Visitor extends Person{
    private String patientRelationship;
    private String status;


    //aggregation
    Date date = new Date();


    public Visitor(int age){
        this.setAge(age);
    }

    @Override
    public boolean isHealthy (String status) {
        if (status.equals("healthy")) {
            return true;
        }
        else if(status.equals("sick") || status.equals("unhealthy")) {
            return false;
        }
        return false;
    }
    public double infectionChance (int age) {
        double percentage = 0;
        if (age < 40){
            percentage = 25;
        }
        if (age >= 40 && age < 60){
            percentage = 50;
        }
        if (age >= 60 && age < 80) {
            percentage = 75;
        }
        if (age >=80){
            percentage = 90;
        }
        return percentage;
    }

    public void risk(int percentage){
        if (infectionChance(percentage) <= 25){
            System.out.println("Chance of getting infected is low");
        }
        if (infectionChance(percentage) > 25 && infectionChance(percentage) <= 50){
            System.out.println("Chance of getting infected is medium");
        }
        if (infectionChance(percentage) > 50 && infectionChance(percentage) <=75){
            System.out.println("Chance of getting infected is high");
        }
        if (infectionChance(percentage) > 75 && infectionChance(percentage) <= 100){
            System.out.println("Chance of getting infected is extremely high");
        }
    }

    //overloading of function isEjected

    public boolean isEjected(Date date){
        return date.getTime() >= 720 && date.getTime() <= 960;
    }

    public int isEjected(String status){
        if (status.equals("unhealthy") || status.equals("sick")){
            return 1;
        }
        else if (!status.equals("healthy")){
            return 2;
        }
        else {
            return 0;
        }
    }

    public boolean relationshipStatus(){
        if (getPatientRelationship().equals("family") || getPatientRelationship().equals("friend")){
            return true;
        }
        else{
            System.out.println("\n\nVisitor cannot come in, because only family members or friends can come in");
            return false;
        }
    }

    public void visitsAvailable(){
        System.out.println("\n\nVisits are only available during workdays from 12:00 to 16:00");
    }

    public void createVisitor(Visitor visitor){
        visitor.risk(visitor.getAge());
        Scanner status = new Scanner(System.in);
        System.out.println("\n\nInput 'healthy' if visitor is healthy or 'sick' or 'unhealthy' if visitor is unhealthy");
        String inputStatus = status.nextLine();
        Scanner relationship = new Scanner(System.in);
        System.out.println("\n\nInput visitors relationship, either 'family', 'friend', or 'other'");
        String inputRelationship = relationship.nextLine();

        visitor.setStatus(inputStatus);
        visitor.setPatientRelationship(inputRelationship);
    }

    public String getPatientRelationship() {
        return patientRelationship;
    }

    public void setPatientRelationship(String patientRelationship) {
        this.patientRelationship = patientRelationship;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
