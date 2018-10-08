package InnerAndAbstractClassesInterfaces09.ReverseArrayChallenge09;

import java.util.Arrays;
import java.util.Scanner;

public class main{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ile liczb");
        int number = scanner.nextInt();
        scanner.nextLine();

        int[] userIntegers = readIntegers(number);
        System.out.println("Reverse = " + Arrays.toString(userIntegers));

        reverse(userIntegers);

    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }
    public static void reverse( int array[]){
        int maxIndex = array.length - 1;
        for ( int i =0 ; i< array.length/2; i++){
            int temp = array[i];
            array[i]= array[maxIndex-i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Array " + Arrays.toString(array));
    }
}
