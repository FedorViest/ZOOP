package Department;

public abstract class Room implements Department {

    //static attribute
    private static int capacity;

    private int rating;
    private int roomID;
    private int floor;
    private int personelleRequired;
    private int numberOfRooms;
    private String type;

    public Room(){
    }

    String amentities(int rating){
        return "tv";
    }

    int isFull(int capacity){
        return 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        Room.capacity = capacity;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
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

}
