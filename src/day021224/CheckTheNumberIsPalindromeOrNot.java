package day021224;

public class CheckTheNumberIsPalindromeOrNot {
    public static void main(String[] args) {
        int number = 535;
        int rev = 0;
        for(int i=number;i>0;i=i/10){
            int remainder = i%10;
            rev = (rev*10)+remainder;
        }
        if(rev == number){
            System.out.println("It's Palindrome");
        }
        else {
            System.out.println("It's Not Palindrome");
        }
    }
}
