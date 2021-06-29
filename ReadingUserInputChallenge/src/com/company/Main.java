package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        int input;

        while(counter != 11){


            System.out.println("Enter number #" + counter + ":");
            boolean flag = scanner.hasNextInt();

            if(flag){
                input = scanner.nextInt();
                counter++;
                sum += input;
            }
            else
                System.out.println("Invalid Input");
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of numbers: " + sum);

    }
}
