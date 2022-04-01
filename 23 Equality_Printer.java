public class Equality_Printer {
    public static void main(String[] args) {

        printEqual(128,128,228);
    }

    public static void printEqual(int a, int b, int c){
        if((a<0) || (b<0) || (c<0)){
            System.out.println("Invalid Value");
        }
        else if(a==b && b==c){
            System.out.println("All numbers are equal");
        }
        else if(a!=b && b!=c && a != c){
            System.out.println("All numbers are different");
        } else if((a == b && b != c ) || (b == c && a!= b ) || (a == c && c != b)){
            System.out.println("Neither all are equal or different");
        }
    }
}
