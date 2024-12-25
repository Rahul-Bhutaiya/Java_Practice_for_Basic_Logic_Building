package day031224;

public class CheckTheNumberIsBinaryOrNot {
    public static void main(String[] args) {
        int number = 10150;
        for(int i=number;i>0;i=i/10){
            int remainder = i%10;
            if(remainder!=0 && remainder!=1){
                System.out.println("Not Binary Number");
                return;
            }
        }
        System.out.println("It's Binary Number");
    }
}
