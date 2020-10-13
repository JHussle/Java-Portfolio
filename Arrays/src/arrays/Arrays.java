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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // This is going to be the input from the user for numbers requested.
        Scanner input = new Scanner(System.in);

        //allow user  input;
        System.out.println("How many numbers do you want to enter?");
        int num = input.nextInt();
        double total = 0;

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }

        System.out.println("These are the numbers you have entered.");
        printArray(array);

        input.close();

    }

    public static void printArray(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
