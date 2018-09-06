package ControlFlowStatements06;

import java.util.Scanner;

public class MinMaxInputChallenge{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while(counter<5){
            int order = counter+1;
            System.out.println("liczba #" + order + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if( hasNextInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
            }else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Suma liczb to: " + sum);

        scanner.close();
    }
}
