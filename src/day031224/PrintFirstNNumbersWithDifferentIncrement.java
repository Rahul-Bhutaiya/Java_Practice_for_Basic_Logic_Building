package day031224;

public class PrintFirstNNumbersWithDifferentIncrement {
    public static void main(String[] args) {
        int n=6;
        int increment=1;
        for(int i=1;i<=n;i++){
            System.out.println(increment);
            increment+=i;
        }
    }
}
