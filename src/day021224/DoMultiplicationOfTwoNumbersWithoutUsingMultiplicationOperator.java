package day021224;

public class DoMultiplicationOfTwoNumbersWithoutUsingMultiplicationOperator {
    public static void main(String[] args) {
        int num1=3;
        int num2=10;
        int mul=num1;

        for(int i=1;i<num2;i++){
            mul+=num1;
        }
        System.out.println("Multiplication = "+mul);
    }
}
