package day031224;

public class FindAverageOfNumber {
    public static void main(String[] args) {
        int num=75392;
        int sum=0;
        int count=0;
        for(int i=num;i>0;i=i/10){
            int remainder = i%10;
            sum+=remainder;
            count++;
        }
        System.out.println("Average = "+sum/count);
    }
}
