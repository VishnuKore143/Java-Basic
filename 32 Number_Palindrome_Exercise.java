public class Number_Palindrome_Exercise {
    public static void main(String[] args) {

 boolean ans = isPalindrome(2052);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int number){

        if(number < 0) {
            number = -number;
        }
        int temp = number;
        int rev = 0;
        while(number>0){
            int lastDigit = number%10;
            rev = rev*10+lastDigit;
            number /= 10; // number = number / 10;
        }
        if(rev == temp){
            return true;
        } else {
            return false;

        }
    }
}
