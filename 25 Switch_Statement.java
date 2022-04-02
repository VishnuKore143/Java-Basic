public class Switch_Statement {
    public static void main(String[] args) {
        char charValue = 'F';
        switch(charValue){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':case 'D':case 'E':
                System.out.println(charValue+" Value was found ");
                break;
            default:
                System.out.println("Could not found the Value A,B,C,D or E");
        }
    }
}
