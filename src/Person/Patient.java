package Person;
import Date.Date;

public class Patient extends Person{
    private int roomNumber;
    private boolean hospitalised;
    private String allergies;
    private String diagnosis;
    private float time;
    private int day;
    private int month;

    Date date = new Date();
    //association
    public Patient(Date date) {
        this.date = date;
        this.day = this.date.getDay();
        this.month = this.date.getMonth();
        this.time = this.date.getTime();
    }

    double cured () {
        return 0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isHospitalised() {
        return hospitalised;
    }

    public void setHospitalised(boolean hospitalised) {
        this.hospitalised = hospitalised;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
