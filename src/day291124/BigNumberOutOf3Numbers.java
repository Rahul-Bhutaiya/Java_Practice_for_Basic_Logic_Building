package day291124;

public class BigNumberOutOf3Numbers {
    public static void main(String[] args) {
        int num1=112;
        int num2=112;
        int num3=112;

        if(num1>num2 && num1>num3){
            System.out.println("num1 is big");
        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is big");
        }else if(num3>num1 && num3>num2){
            System.out.println("num3 is big");
        } else if (num1==num2 && num1>num3) {
            System.out.println("num1 and num2 are big and same");
        }else if(num1==num3 && num1>num2){
            System.out.println("num1 and num3 are big and same");
        }else if(num2==num3 && num2>num1){
            System.out.println("num2 and num3 are big and same");
        }else {
            System.out.println("num1, num2 and num3 all are same");
        }
    }
}
