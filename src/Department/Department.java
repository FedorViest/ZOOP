package Department;

public class Department {
    private int floor;
    private int personelleRequired;
    private int numberOfRooms;
    private String type;

    public Department(){
    }

    int infectionRisk(String type){
        return 1;
    }
    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getPersonelleRequired() {
        return personelleRequired;
    }

    public void setPersonelleRequired(int personelleRequired) {
        this.personelleRequired = personelleRequired;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
