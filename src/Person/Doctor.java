package Person;
import Date.Workday;

public class Doctor {
    private String specialisation;
    private int experienceYears;

    public Doctor(String specialisation){
        this.specialisation = specialisation;
    }

    boolean canOperate(){
        return false;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
}
