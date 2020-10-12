/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacontrolflow;

/**
 *
 * @author Joey
 */
public class JavaControlFlow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //What is the value of k after the following loop executes:

        int k = 80;
        for (int i = 0; i < 5; i++) {
            k = k - 12;
        }
        System.out.println(k); // results of the loop is 20.

    }
}
