package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int average = 0;
        int counter = 0;
        int input = 0;
        boolean first = true;

        while (true){

            System.out.println("Enter number: ");
            if(scanner.hasNextInt()){
                input = scanner.nextInt();
                sum += input;
                counter++;
                if(first)
                    first = false;
            }
            else
                break;
            scanner.nextLine();
        }
        scanner.close();

        if(first)
            System.out.println("SUM = 0 AVG = 0");
        else{
            average = Math.round(sum/counter);
            System.out.println("SUM = " + sum + " "+ "AVG = " + average);
        }
    }
}
