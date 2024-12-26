package day091224;

public class Question4 {
    public static void main(String[] args) {
        int num=8;
        int step=0;
        while (num!=0){
            if(num%2==0){
                num/=2;
                step++;
            }else {
                num--;
                step++;
            }
        }
        System.out.println("Steps = "+step);
    }
}
