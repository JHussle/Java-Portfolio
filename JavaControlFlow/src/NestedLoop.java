/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joey
 */
public class NestedLoop {

    public static void main(String[] args) {
        patternOne();
    }

    private static void patternOne() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("o ");
            }
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
