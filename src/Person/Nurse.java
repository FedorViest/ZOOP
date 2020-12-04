package Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Nurse extends Staff{
    public int experienceYears;
    public int hasFamily;
    public String skills;

    protected ArrayList<Nurse> nurses = new ArrayList<Nurse>();

    public Nurse(int experienceYears, String skills, int hasFamily, String gender, int workedHours){
        setExperienceYears(experienceYears);
        setSkills(skills);
        setHasFamily(hasFamily);
        setGender(gender);
        setWorkedHours(workedHours);
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public int isHasFamily() {
        return hasFamily;
    }

    public void setHasFamily(int hasFamily) {
        this.hasFamily = hasFamily;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void createNurse(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Nurse " + (i + 1));

            System.out.println("====================");
            System.out.println("|| Set main skill ||");
            System.out.println("====================");

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

            System.out.println("=================================================");
            System.out.println("|| Set if nurse has family('1' = yes|'0' = no) ||");
            System.out.println("=================================================");

            Scanner family = new Scanner(System.in);
            int inputfamily = family.nextInt();

            System.out.println("=================================");
            System.out.println("|| Set worked hours(this week) ||");
            System.out.println("=================================");

            Scanner workedHours = new Scanner(System.in);
            int newworkedHours = workedHours.nextInt();

            nurses.add(new Nurse(newxpyears, newspecialise, inputfamily, newgender, newworkedHours));
        }
    }

    public void printNurse(int count){
        System.out.println("\nThere are " + count + " nurses at work today.\n");
        for (int i = 0; i < count; i++) {
            System.out.println("Nurse " + (i+1) + ":\n \tskills: " + nurses.get(i).skills + "\n\tgender: " +  nurses.get(i).getGender()
                    + "\n\texperience years: " + nurses.get(i).experienceYears + "\n\tworked hours(week): " + nurses.get(i).getWorkedHours());
            if (nurses.get(i).isHasFamily() == 1){
                System.out.println("\thas family\n\n");
            }
            else{
                System.out.println("\tno family\n\n");
            }
        }
    }
}
