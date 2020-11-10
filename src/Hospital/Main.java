package Hospital;

import Person.Visitor;
import Person.Person;


public class Main {

    public static void main(String[] args) {
        int age = 50;
        Visitor visitor = new Visitor(age);
        visitor.risk(visitor.getAge());
        visitor.setStatus("healthy");
        visitor.setPatientRelationship("girlfriend");
        if (visitor.isEjected()){
            if (visitor.relationshipStatus()){
                System.out.println("Visitor can come in");
            }
        }
        else{
            System.out.println("Visitor cannot come in");
        }
    }
}
