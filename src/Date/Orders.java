package Date;


import java.util.Scanner;

public class Orders extends Date{

    final float[] terms = {70.08f, 262.12f, 139.13f, 78.10f, 289.09f, 149.11f, 119.07f, 262.07f, 285.08f, 175.09f, 239.10f, 58.12f, 316.13f, 225.11f, 95.12f,
            63.08f, 187.08f, 76.07f, 68.09f, 159.09f, 309.09f, 130.11f, 14.12f, 143.12f,330.13f, 174.07f, 298.07f, 17.09f, 26.08f, 290.10f};

    public boolean isOccupied(int day, int month, int time){
        float hour = (float)time/100;
        float value = day + 30 * (month-1) + hour;
        for (int i = 0; i < 30; i++){
            if (value == terms[i]){
                return true;
            }
        }
        return false;
    }

    public void printTerm(){
        int day, month;
        float hour;
        System.out.println("Input 'yes' if you wish to see all reservations, otherwise input 'no'\n");
        Scanner handler = new Scanner(System.in);
        String inputhandler = handler.nextLine();
        if (inputhandler.equals("yes")){
            System.out.println("Reserved checkups so far are:\n");
            for (float term : terms) {
                month = (int) term / 30;
                day = (int) term - (month) * 30;
                hour = (term - day - month * 30) * 100;
                if (month == 0)
                    month = 1;
                if (day == 0)
                    day = 1;
                System.out.println("\t" + day + "." + month + ". (" + weekDay(day) + ")");
                System.out.printf("\tat %.2f\n\n", hour);
            }
        }
    }

    public String weekDay(int day){
        if (day % 7 == 1){
            return "Monday";
        }
        else if (day % 7 == 2){
            return "Tuesday";
        }
        else if (day % 7 == 3){
            return "Wednesday";
        }
        else if (day % 7 == 4){
            return "Thursday";
        }
        else if (day % 7 == 5){
            return "Friday";
        }
        else if (day % 7 == 6){
            return "Saturday";
        }
        else{
            return "Sunday";
        }
    }
}