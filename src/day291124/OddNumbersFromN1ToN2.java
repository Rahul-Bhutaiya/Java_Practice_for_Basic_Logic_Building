package day291124;

public class OddNumbersFromN1ToN2 {
    public static void main(String[] args) {
        int num1=1;
        int num2=100;
        for(int i=num1;i<=num2;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
