package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
printMegaBytesAndKiloBytes(1);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes = (kiloBytes/1024);
            int kiloRemainder = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+kiloRemainder+" KB");
        }
    }
}
