package day291124;

public class BigNumberOutOf2numbers {
    public static void main(String[] args) {
        int num1=50;
        int num2=50;

        if(num1>num2){
            System.out.println("num1 is big = " + num1);
        }
        else if(num2>num1){
            System.out.println("num2 is big = "+num2);
        }
        else {
            System.out.println("num1 and num2 both are same = "+num1);
        }

    }
}
