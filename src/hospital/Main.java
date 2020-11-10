package hospital;

import Person.Visitor;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Visitor visitor = new Visitor();
        visitor.age = 60;
        visitor.canBeInfected(visitor.age);
    }
}
