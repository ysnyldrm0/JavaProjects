package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("Min : " + findMin(readElements(readInteger())));;
    }

    private static int findMin(int[] readElements) {

        int min = readElements[0];
        for(int i = 0 ; i < readElements.length ; i++){
            if( readElements[i] < min)
                min = readElements[i];
        }
        return min;
    }

    private static int[] readElements(int length) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int array[] = new int[length];
        System.out.println("Enter numbers: ");
        while(counter != length){
            array[counter] = scanner.nextInt();
            counter++;
        }
        return array;
    }

    private static int readInteger(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements do you need ?");
        int input  = scanner.nextInt();
        return input;
    }
}
