package Patterns_Assignment1;

public class Question9 {
    public static void main(String[] args) {
        int n=5;
        int flag=1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(flag);
//                if(flag==1)flag=0;
//                else flag=1;
//            }
//            System.out.println();
//        }

//      method:2
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(flag%2);
                flag++;
            }
            System.out.println();
        }
    }
}
