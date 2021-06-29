package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int max = 0;
        int min = 0;
        int input ;
        boolean first = true;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter number: ");
             if (scanner.hasNextInt()){
                 input = scanner.nextInt();

                 if(first){
                     min = input;
                     max = input;
                     first = false;
                 }
                 if(input < min)
                     min = input;
                 if(input > max)
                     max = input;

             }
             else
                 break;
             scanner.nextLine();
        }
        scanner.close();

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
