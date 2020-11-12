package Department;

public class Room extends Department {
    private int capacity;
    private int rating;
    private int roomID;
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
        this.capacity = capacity;
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

}
