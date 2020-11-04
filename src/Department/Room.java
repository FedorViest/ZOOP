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
}
