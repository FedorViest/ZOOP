package Hospital;

import Date.Date;
import Person.Visitor;
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
        System.out.println("Input 'visit' for visit");
           /* System.out.println("Input 'patient' for appointment order");
            System.out.println("Input 'visit' for visit");*/
        System.out.println("Input 'end' or 'close' or 'exit' to end inputting\n\n\n");
    }
}
