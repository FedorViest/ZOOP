package Person;

public class Person {
    private int age;
    private int personalID;
    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonalID() {
        return personalID;
    }

    public void setPersonalID(int personalID) {
        this.personalID = personalID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public boolean isHealthy(String handler){
        if (handler.equals("healthy")){
            return true;
        }
        else {
            return false;
        }
    }
}
