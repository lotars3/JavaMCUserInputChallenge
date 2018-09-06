package ControlFlowStatements06;

public class isPalindrome{
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int check = number;
        int lastDigit;
        while(number !=0){
            lastDigit = number %10;
            reverse = (reverse * 10) + lastDigit;
            number = number/10;
        }
        return (check == reverse);

    }
}
