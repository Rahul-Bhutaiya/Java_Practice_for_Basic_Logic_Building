package day031224;

public class CheckTheNumberIsPrimeOrNot {
    public static void main(String[] args) {
        int num=87;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println("It's Not Prime Number");
                return;
            }
        }
        System.out.println("It's Prime Number");
    }
}
