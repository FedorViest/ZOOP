package Person;
import Date.Date;

public class Visitor extends Person{
    private String patientRelationship;
    private String status;

    Visitor[] visitors;

    public Visitor(int age){
        this.setAge(age);
    }


    boolean isHealthy (String status) {
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
        if (percentage <= 25){
            System.out.println("Chance of getting infected is low");
        }
        if (percentage> 25 && percentage <= 50){
            System.out.println("Chance of getting infected is medium");
        }
        if (percentage > 50 && percentage <=75){
            System.out.println("Chance of getting infected is high");
        }
        if (percentage > 75 && percentage <= 100){
            System.out.println("Chance of getting infected is extremely high");
        }
    }

    public boolean isEjected(){
        if (isHealthy(getStatus())){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean relationshipStatus(){
        if (getPatientRelationship().equals("family") || getPatientRelationship().equals("friend")){
            System.out.println("Visitor can come in");
            return true;
        }
        else{
            System.out.println("Visitor cannot come in, because only family members or friends can come in");
            return false;
        }
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
