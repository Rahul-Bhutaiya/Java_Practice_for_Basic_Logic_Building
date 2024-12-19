package day291124;

public class PrintN2ToN1 {
    public static void main(String[] args) {
        int num1=10;
        int num2=100;
//        for(int i=num2;i>=num1;i--){
//            System.out.println(i);
//        }
        while (num2>=num1){
            System.out.println(num2);
            num2--;
        }
    }
}
