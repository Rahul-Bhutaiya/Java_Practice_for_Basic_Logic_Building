package day021224;

public class FindFactorialOfGivenNumber {
    public static void main(String[] args) {
        int num=10;
        int fact=num;

        for(int i=num-1;i>1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial = "+fact);
    }
}
