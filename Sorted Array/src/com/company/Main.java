package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array;
        array = sortIntegers(getIntegers(6));
        printArray(array);

    }

    public static void printArray(int[] array) {
        for (int i = 0 ; i < array.length ; i++)
            System.out.println("Element " + i + " contents " +  array[i]);
    }

    public static int[] sortIntegers(int[] array) {
        int tmp = 0;
        for(int i = 0 ; i < array.length-1 ; i++) {
            if(array[i] < array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    return  sortIntegers(array);
            }
        }
        return  array;
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 integers");
        for(int i = 0 ; i < array.length ; i++ ){
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
