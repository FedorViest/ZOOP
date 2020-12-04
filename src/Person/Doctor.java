package Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Staff{
    private String specialisation;
    private int experienceYears;

    protected ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    public Doctor(String specialisation, int experienceYears, String gender, int workedHours){
        setSpecialisation(specialisation);
        setExperienceYears(experienceYears);
        setGender(gender);
        setWorkedHours(workedHours);
    }

    boolean canOperate(int hours, int years){
        if (hours < 40 && years > 10)
            return true;

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


    public void createDoctors(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Doctor " + (i + 1));
            System.out.println("========================");
            System.out.println("|| Set specialisation ||");
            System.out.println("========================");

            Scanner specialise = new Scanner(System.in);
            String newspecialise = specialise.nextLine();

            System.out.println("==========================");
            System.out.println("|| Set experience years ||");
            System.out.println("==========================");

            Scanner xpyears = new Scanner(System.in);
            int newxpyears = xpyears.nextInt();

            System.out.println("================");
            System.out.println("|| Set gender ||");
            System.out.println("================");

            Scanner gender = new Scanner(System.in);
            String newgender = gender.nextLine();

            System.out.println("=================================");
            System.out.println("|| Set worked hours(this week) ||");
            System.out.println("=================================");

            Scanner workedHours = new Scanner(System.in);
            int newworkedHours = workedHours.nextInt();

            doctors.add(new Doctor(newspecialise, newxpyears, newgender, newworkedHours));
        }
    }

    public void printDoctors(int count){
        System.out.println("\nThere are " + count + " doctors at work today.\n");
        for (int i = 0; i < count; i++) {
            System.out.println("Doctor " + (i+1) + ":\n \tspecialisation: " + doctors.get(i).specialisation + "\n\tgender: " +  doctors.get(i).getGender()
                    + "\n\texperience years: " + doctors.get(i).experienceYears + "\n\tworked hours(week): " + doctors.get(i).getWorkedHours());
            if (canOperate(doctors.get(i).getWorkedHours(), doctors.get(i).getExperienceYears())){
                System.out.println("\tis able to operate.\n\n");
            }
            else{
                System.out.println("\tisnt able to operate due to inexperienced or high hours worked this week.\n\n");
            }
        }
        doctors.clear();
    }
}
