package Person;

public class Staff extends Person {
    private int workedHours;

    boolean isAvailable(){
        return true;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}
