package Hospital;

import Date.Date;
import Person.Visitor;


public class Main {

    public static void main(String[] args) {
        int age = 50;
        Visitor visitor = new Visitor(age);
        visitor.visitsAvailable();
        visitor.risk(visitor.getAge());
        visitor.setStatus("healthy");
        visitor.setPatientRelationship("family");

        if (visitor.isEjected()){
            if (visitor.relationshipStatus()){
                System.out.println("Visitor can come in");
            }
        }
        else {
            System.out.println("Visitor cannot come in, because he is early/late or sick");
        }


        Date date = new Date();
        date.setDay(6);
        date.setMonth(1);
        double time = 17;
        date.setTime(date.convertTimeMinutes(time) + date.convertTimeHours(time));
    }
}
