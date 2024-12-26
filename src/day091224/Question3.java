package day091224;

public class Question3 {
    public static void main(String[] args) {
        int num = 4421;
        int sum=0;
        int product=1;
        for(int i=num;i>0;i=i/10){
            int remainder = i%10;
            sum+=remainder;
            product*=remainder;
        }
        System.out.println(product-sum);
    }
}
