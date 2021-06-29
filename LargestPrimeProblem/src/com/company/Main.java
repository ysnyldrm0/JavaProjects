package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(16));

    }

    public static int getLargestPrime(int number){

        int largestPrime = -1;
        boolean flag = true;

        if (number <= 0)
            return -1;

        if (number == 2)
            return 2;

        for (int i = 2 ; i <= number ; i++){

            if(number % i == 0){
                for (int k = 2 ; k < i ; k++){
                    if(i % k == 0)
                        flag = false;
                }
                if(flag == true)
                    largestPrime = i;
            }
        }
        return largestPrime;
    }
}
