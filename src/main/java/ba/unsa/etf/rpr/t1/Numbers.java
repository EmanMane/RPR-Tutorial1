package ba.unsa.etf.rpr.t1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Eman Alibalić
 * Accepts one number from keyboard input and print out all numbers
 * that are dividable by sum of its digits
 * */
public class Numbers {

    /**
     * adds a new element to array
     * */
    public static int[] addX(int n, int[] arr, int x)
    {
        int i;

        // create a new array of size n+1
        int[] newArray = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newArray[i] = arr[i];

        newArray[n] = x;

        return newArray;
    }

    /**
     * entry point method for numbers program
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter integer number: ");
        int number = scanner.nextInt();
        int[] numArray = {};
        for (int i = 1,position=0; i < number; i++){
            if (isDividableBySumOfDigits(i)){
                numArray=addX(position,numArray,i);
                position=position+1;
            }
        }
        System.out.println("Numbers that are dividable by sum of their digits and are less than " + number + ": " + Arrays.toString(numArray));
    }

    /**
     * check if number is dividable by its digits
     * @param number just an integer number
     * */
    private static boolean isDividableBySumOfDigits(int number){
        int sum = sumDigits(number);
        return number%sum == 0;
    }

    /**
     * calculate the sum of all digits
     * @param number just an integer number
     * */
    private static int sumDigits(int number){
        int sum = 0;
        while (number > 0) {
            sum += number%10;
            number = number / 10;
        }
        return sum;
    }
}