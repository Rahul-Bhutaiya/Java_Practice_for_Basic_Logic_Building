package day091224;

public class Question5 {
    public static void main(String[] args) {
        int left=1;
        int right=22;
        for(int i=left;i<=right;i++){
            int flag=checkSelfDividingStatus(i);
            if(flag==1){
                System.out.println(i);
            }
        }
    }
    public static int checkSelfDividingStatus(int num){
        if(num<10){
            return 1;
        }else {
            for(int i=num;i>0;i=i/10){
                int remainder=i%10;
                if(remainder==0 || num%remainder!=0){
                    return 0;
                }
            }
            return 1;
        }
    }
}
