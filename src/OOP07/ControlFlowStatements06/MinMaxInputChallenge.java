package OOP07.ControlFlowStatements06;

import java.util.Scanner;

public class MinMaxInputChallenge{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();


            if (hasNextInt) {
                int number = scanner.nextInt();

                if (first){
                    first = false;
                    min=number;
                    max=number;
                }
                if (number > max) {
                    max = number;
                }

                if (number<min){
                    min=number;
                }
            } else {
                break;
            }
            System.out.println("min=" + min +", max=" +max);
            scanner.nextLine();


        }
        scanner.close();

    }
}
