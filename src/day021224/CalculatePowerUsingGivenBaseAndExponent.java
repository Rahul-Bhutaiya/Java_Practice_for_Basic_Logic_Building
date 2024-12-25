package day021224;

public class CalculatePowerUsingGivenBaseAndExponent {
    public static void main(String[] args) {
        int base = 8;
        int exponent = 5;
        int power = base;

        for(int i=1;i<exponent;i++){
            power*=base;
        }
        System.out.println("Power = "+power);
    }
}
