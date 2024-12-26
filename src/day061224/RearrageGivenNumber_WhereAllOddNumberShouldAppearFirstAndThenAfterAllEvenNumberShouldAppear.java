package day061224;

public class RearrageGivenNumber_WhereAllOddNumberShouldAppearFirstAndThenAfterAllEvenNumberShouldAppear {
    public static void main(String[] args) {
        int num=24963;
        int rev=0;
        int finalNum=0;

        //reversing the number
        for(int i=num;i>0;i=i/10){
            int remainder = i%10;
            rev=(rev*10)+remainder;
        }

        for(int i=rev;i>0;i=i/10){
            int remainder = i%10;
            if(remainder%2==1){
                finalNum = (finalNum*10)+remainder;
            }
        }
        for(int i=rev;i>0;i=i/10){
            int remainder = i%10;
            if(remainder%2==0){
                finalNum = (finalNum*10)+remainder;
            }
        }

        System.out.println(finalNum);
    }
}
