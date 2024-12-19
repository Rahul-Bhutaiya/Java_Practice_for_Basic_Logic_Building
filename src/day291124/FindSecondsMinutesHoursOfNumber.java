package day291124;

public class FindSecondsMinutesHoursOfNumber {
    public static void main(String[] args) {
        int n=1234567;
        int hours,minutes,seconds;

        hours=n/3600;
        n%=3600;
        minutes=n/60;
        seconds=n%60;
        System.out.println("Hours = "+hours);
        System.out.println("Minutes = "+minutes);
        System.out.println("Seconds = "+seconds);
    }
}
