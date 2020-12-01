package Department;
import Date.Date;
import Person.Seller;

import java.util.Scanner;

public abstract class Buffet implements Department {

    private final String[] food = {"Vyprazany syr + hranolky", "Segedinsky gulas + knedla", "Cezar Salat", "Kuracie prsia + zemiakova kasa", "Parenne buchty s makom"};
    private int price;
    private Seller seller;

    public Buffet(){
        this.seller = new Seller();
        seller.getisWorking();
    }

    @Override
    public int infectionRisk(){
        return 1;
    }

    boolean isOpen(Seller seller){
        return true;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

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

}
