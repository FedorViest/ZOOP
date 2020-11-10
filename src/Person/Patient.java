package Person;
import Date.Date;

public class Patient extends Person{
    private int roomNumber;
    private boolean hospitalised;
    private String allergies;
    private String diagnosis;

    public Patient() {

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
}
