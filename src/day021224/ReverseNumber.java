package day021224;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=59831;
        int reverse=0;
        for(int i=n;i>0;i=i/10){
            int remainder=i%10;
            reverse=(reverse*10)+remainder;
        }
        System.out.println("reverse = "+reverse);
    }
}
