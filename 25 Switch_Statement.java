public class Switch_Statement {
    public static void main(String[] args) {
        //char example
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
        
        //int example
        int numValue = 1;
        switch(numValue){
            case 1:
                System.out.println("1 was found");
                break;
            case 2:
                System.out.println("2 was found");
                break:
            case 3: case 4: case 5:
                System.out.println("3, 4, or 5 was found");
                break;
            default:
                System.out.println("Value not found");
                break;
        } 
    }
}
