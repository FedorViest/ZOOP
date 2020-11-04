package Department;
import Person.Seller;

public class Buffet extends Department {
    private String food;
    private int price;

    boolean isOpen(Seller seller){
        return true;
    }
}
