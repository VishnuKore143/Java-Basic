public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(-1);
    }
    public static void printNumberInWord(int wholeNumber){
        if (wholeNumber==0){
            System.out.println("ZERO");
        }else if (wholeNumber==1){
            System.out.println("ONE");
        }else if(wholeNumber==2){
            System.out.println("TWO");
        }else if (wholeNumber==3){
            System.out.println("THREE");
        }else if (wholeNumber==4){
            System.out.println("FOUR");
        }else if (wholeNumber==5){
            System.out.println("FIVE");
        }else if (wholeNumber==6){
            System.out.println("SIX");
        }else if (wholeNumber==7){
            System.out.println("SEVEN");
        }else if (wholeNumber==8){
            System.out.println("EIGHT");
        }else if (wholeNumber==9){
            System.out.println("NINE");
        }else{
            System.out.println("OTHER");
        }
    }
}
