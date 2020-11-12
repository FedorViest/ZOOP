package Department;

public class OperationRoom extends Room{

    private boolean isReady;

    double successfulOperations(){
        return 100;
    }

    public boolean setReady(){
        return isReady;
    }

    public void getReady(boolean isReady){
        this.isReady = isReady;
    }
}
