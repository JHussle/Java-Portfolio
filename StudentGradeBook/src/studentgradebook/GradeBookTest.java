/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradebook;

import java.util.Scanner;

/**
 *
 * @author Joey
 */
public class GradeBookTest {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        String studentName;
        double studentScore;
        //double [][] studentTestScores;
        
        final int NUMBER_OF_STUDENTS = 5;
        final int NUMBER_OF_TESTSCORES_PER_STUDENT = 4;
        
        GradingScale classOf2020 = new GradingScale(NUMBER_OF_STUDENTS, NUMBER_OF_TESTSCORES_PER_STUDENT);
        classOf2020.getStudentTestScoresArray();
        
        for (int currentStudentIndex = 0; currentStudentIndex < NUMBER_OF_STUDENTS; currentStudentIndex++) {
            System.out.println("Please enter the name of student: " + (currentStudentIndex + 1) );
            studentName = keyboard.nextLine();
            classOf2020.setStudentName(studentName);
           // studentTestScores = 
            
            for (int currentStudentScoreIndex = 0; currentStudentScoreIndex < NUMBER_OF_TESTSCORES_PER_STUDENT; currentStudentScoreIndex++) {
                System.out.println("Please enter the score " + (currentStudentScoreIndex + 1) + " of " + studentName); 
                studentScore = keyboard.nextDouble();
                keyboard.nextLine();
                classOf2020.setStudentScore(currentStudentIndex, currentStudentIndex, studentScore);
            }
        }
    }
}