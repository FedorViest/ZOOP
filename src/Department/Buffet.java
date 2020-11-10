package Department;
import Person.Seller;

public class Buffet extends Department {

    private String food;
    private int price;

    boolean isOpen(Seller seller){
        return true;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
