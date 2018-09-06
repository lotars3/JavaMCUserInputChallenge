package ControlFlowStatements06;

public class LastDigitChecker{
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
    }
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if((first < 10 || first > 1000) || (second < 10 || second > 1000) || (third < 10 || third > 1000)) {
            return false;
        }
        int firstLastDigit = first%10;
        int secondLastDigit = second%10;
        int thirdLastDigit = third%10;
        if((firstLastDigit == secondLastDigit) || (firstLastDigit == thirdLastDigit) || (secondLastDigit == thirdLastDigit)) {
            return true;
        }
        return false;
    }
}
