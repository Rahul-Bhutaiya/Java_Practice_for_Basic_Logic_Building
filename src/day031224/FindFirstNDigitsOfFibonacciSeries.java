package day031224;

public class FindFirstNDigitsOfFibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int temp=b;
            b=b+a;
            a=temp;
        }
    }
}
