package ReverseArrayChallenge09;

import java.util.Arrays;

public class main{

    public static void main(String[] args) {
        int [] array= { 1,5,6,3,78,2};
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);
        System.out.println("Reverse = " + Arrays.toString(array));

    }

    public static void reverse( int array[]){
        int maxIndex = array.length - 1;
        for ( int i =0 ; i< array.length/2; i++){
            int temp = array[i];
            array[i]= array[maxIndex-i];
            array[maxIndex - i] = temp;
        }
    }
}
