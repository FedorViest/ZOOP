package Hospital;

import Date.Date;
import Person.Visitor;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner handler = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Input 'visit' for visit");
            String newhandler = handler.nextLine();
            if (newhandler.equals("visit")) {

                System.out.println("Input visitors age:");
                Scanner age = new Scanner(System.in);
                int inputAge = age.nextInt();
                Visitor visitor = new Visitor(inputAge);
                visitor.createVisitor(visitor);

                Date date = new Date();
                date.createTime(date, visitor);

                if (visitor.isEjected(date)) {
                    if (visitor.relationshipStatus()) {
                        System.out.println("Visitor can come in");
                        count++;
                    }
                } else {
                    System.out.println("Visitor cannot come in, because he is early/late or sick");
                }

                System.out.println("Amount of visitors is: " + count);
            }
            else{
                System.out.println("Invalid entry");
                System.out.println("Ending inputting...");
                break;
            }
        }
    }
}
