package Person;
import Date.Workday;

public class Seller extends Person {

    private boolean isWorking;

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public boolean getisWorking(){
        return isWorking;
    }
    public boolean isHealthy(int day){
        Workday workday = new Workday();
        if (workday.isWeekend(day)){
            return false;
        }
        return true;
    }
}
