package Department;
import Date.Date;
import Person.Seller;

import java.util.Scanner;

public abstract class Buffet implements Department {

    //final attribute
    private final String[] food = {"Vyprazany syr + hranolky", "Segedinsky gulas + knedla", "Cezar Salat", "Kuracie prsia + zemiakova kasa", "Parenne buchty s makom"};

    //static attribute
    private static Buffet buffet = null;

    //composition
    //private constructor
    private Buffet(){
        Seller seller = new Seller();
        seller.getisWorking();
    }


    //abstract class
    @Override
    public abstract int infectionRisk();

    public void menu(Date date){
        System.out.println("Select if you wish to see full weeks menu ('week') or menu of the day ('day'):\n");
        Scanner handler = new Scanner(System.in);
        String inputhandler = handler.next();
        if (inputhandler.equals("day")) {
            if (date.getDay() % 7 == 1) {
                System.out.println("Todays menu item is: " + food[0]);
                System.out.println("\tPrice: " + 4.50 + "€\n");
            }
            else if (date.getDay() % 7 == 2) {
                System.out.println("Todays menu item is: " + food[1]);
                System.out.println("\tPrice: " + 5.00 + "€\n");
            }
            else if (date.getDay() % 7 == 3) {
                System.out.println("Todays menu item is: " + food[2]);
                System.out.println("\tPrice: " + 3.60 + "€\n");
            }
            else if (date.getDay() % 7 == 4) {
                System.out.println("Todays menu item is: " + food[3]);
                System.out.println("\tPrice: " + 4.00 + "€\n");
            }
            else if (date.getDay() % 7 == 5) {
                System.out.println("Todays menu item is: " + food[4]);
                System.out.println("\tPrice: " + 4.20 + "€\n");
            }
        }
        else if (inputhandler.equals("week")){
            System.out.println("Monday: " + food[0]);
            System.out.println("\tPrice: " + 4.50 + "€\n");
            System.out.println("Tuesday: " + food[1]);
            System.out.println("\tPrice: " + 5.00 + "€\n");
            System.out.println("Wednesday: " + food[2]);
            System.out.println("\tPrice: " + 3.60 + "€\n");
            System.out.println("Thursday: " + food[3]);
            System.out.println("\tPrice: " + 4.00 + "€\n");
            System.out.println("Friday: " + food[4]);
            System.out.println("\tPrice: " + 4.20 + "€\n");
        }
        else
            System.out.println("Invalid entry\n");
    }

    //Singleton
    public static Buffet getInstance(){
        if (buffet == null){
            buffet = new Buffet(){
                @Override
                public int infectionRisk() {
                    return 0;
                }
            };
        }
        return buffet;
    }

}
