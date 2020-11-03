package Person;

public class Visitor extends Person{
    String patientRelationship;
    String status;


    boolean isHealthy () {
        return true;
    }
    public double canBeInfected (int age) {
        double percentage = 0;
        if (age >= 50) {
            percentage = 90;
        }
        if (percentage >= 90){
            System.out.println("Risk of getting infected is high.");
        }
        return percentage;
    }
}
