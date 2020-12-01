package Department;
import Person.Seller;

public abstract class Buffet implements Department {

    private String[] food = {"Vyprazany syr", "Segedinsky gulas", "Cezar Salat", "Kuracie prsia", "Parenne buchty"};
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

}
