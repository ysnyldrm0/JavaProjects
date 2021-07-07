package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6,7,8};
        reverse(array);

    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int temp ;
        for (int i = array.length-1 ; i > 0 ; i--){
            for (int k = 0 ; k < i ; k++){
                temp = array[k];
                array[k] = array[k+1];
                array[k+1] = temp;

            }
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
