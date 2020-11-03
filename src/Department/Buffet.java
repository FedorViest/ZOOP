package Department;
import Person.Seller;

public class Buffet extends Department {
    String food;
    int price;

    boolean isOpen(Seller seller){
        return true;
    }
}
