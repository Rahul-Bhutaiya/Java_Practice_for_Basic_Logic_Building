package day291124;

public class EvenNumbersFromN1ToN2 {
    public static void main(String[] args) {
        int num1=1;
        int num2=100;
        while (num1<=num2){
            if(num1%2==0){
                System.out.println(num1);
            }
            num1++;
        }
    }
}
