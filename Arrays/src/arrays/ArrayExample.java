/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Joey
 */
public class ArrayExample {

    public static void main(String[] args) {
        System.out.println("How many numbers you want to enter????");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double max = 0;
        double min = 0;
        double[] arr = new double[n];
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Element Number: " + (i + 1) + ": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        double average = total / arr.length;

        System.out.format("The total is: %.2f", total);
        System.out.format("\nThe average is: %.2f", average);
        System.out.format("\nThe maximum is: %.2f", max);
        System.out.format("\nThe minimum is: %.2f", min);

    }

}
