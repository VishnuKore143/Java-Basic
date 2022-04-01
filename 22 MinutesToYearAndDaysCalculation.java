public class MinutesToYearAndDaysCalculation {
    public static void main(String[] args) {

        printYearsAndDays(21);
    }
        public static void printYearsAndDays(long minutes){
            if(minutes<0){
                System.out.println("Invalid Value");
            }
            long years = minutes/525600;
            long days =(minutes%525600)/24;
            System.out.println(minutes + "min " + "=" + years + "y" + "and "+ days + "d");


        }
    }

