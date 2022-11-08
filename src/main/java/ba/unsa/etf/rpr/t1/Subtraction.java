package ba.unsa.etf.rpr.t1;

import java.util.Scanner;

/**
 * Class that accepts two inputs from keyboard and calculate their difference
 * @author Eman Alibalić
 * @version 1.0
 * */
public class Subtraction {

    /**
     * entry method for console application for subtraction
     * @param args input arguments from console
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = scanner.nextInt();
        System.out.println("Input second number: ");
        int second = scanner.nextInt();
        System.out.println("The difference is : "+ (first - second));
    }
}