package day291124;

public class FindDaysMonthsYearsOfNumber {
    public static void main(String[] args) {
        int n=1234567;
        int year,month,day;
        year=n/365;
        n%=365;
        month=n/30;
        day=n%30;
        System.out.println("Year = "+year);
        System.out.println("Month = "+month);
        System.out.println("Day = "+day);
    }
}
