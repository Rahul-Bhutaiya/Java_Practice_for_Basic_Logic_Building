package day031224;

public class PrintPrimeNumbersInGivenRange {
    public static void main(String[] args) {
        int left = 11;
        int right = 20;
        for(int i=left;i<=right;i++){
            int flag = checkPrime(i);
            if(flag==1){
                System.out.println(i+" ");
            }
        }
    }
    public static int checkPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
}
