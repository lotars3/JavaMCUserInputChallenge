package ControlFlowStatements06;

import java.util.Scanner;

public class UserInputChallenge{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (counter <5){
            int order = counter +1;
            System.out.println("Enter number #" + order + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();
                counter++;
                sum +=number;

            }else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }

        System.out.println("Suma podanych liczb = " + sum);

        scanner.close();

    }

}
