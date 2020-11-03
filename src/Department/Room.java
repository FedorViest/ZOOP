package Department;

public class Room extends Department {
    public Room(){
       int capacity;
       int rating;
       int roomID;
    }

    String amentities(int rating){
        return "tv";
    }
    int isFull(int capacity){
        return 0;
    }
}
