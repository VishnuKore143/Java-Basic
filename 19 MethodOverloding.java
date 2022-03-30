public class MethodOverloding {
    public static void main(String[] args) {
         calcFeetAndInchesToCentimeters(100);
         calcFeetAndInchesToCentimeters(2.6,88);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet>=0) || ((inches >=0) || (inches<=12))){
            return -1;
        }
        return feet;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches>=0){
        }
            return -1;

    }

}
