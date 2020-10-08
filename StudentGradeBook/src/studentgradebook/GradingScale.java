/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradebook;

import java.util.ArrayList;

/**
 *
 * @author Joey
 */
public class GradingScale {
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private ArrayList<String> studentNames = new ArrayList<String>();
    private char[] studentLetterGrade = {'A', 'B', 'C', 'D', 'F'};
    private double[][] studentTestScores;

    public String getStudentName(int studentIndex) {
        return studentNames.get(studentIndex);
    }

    public double calculateAverageTestScore(double[] studentTestScores) {
        double studentTestScoresTotal = 0;
        double studentTestScoresAverage;

        for (int currentStudentTestScore = 0; currentStudentTestScore < studentTestScores.length; currentStudentTestScore++) {
            studentTestScoresTotal = studentTestScoresTotal + studentTestScores[currentStudentTestScore];
        }
        studentTestScoresAverage = studentTestScoresTotal / studentTestScores.length;
        return studentTestScoresAverage;
    }
    
    public char getStudentLetterGrade (double studentTestScoreAverage) {
        char studentLetterGrade = 0;
        if (studentTestScoreAverage < 60) 
        {
            studentLetterGrade = 'F';
        } else if (studentTestScoreAverage < 70) {
            studentLetterGrade = 'D';
        } else if (studentTestScoreAverage < 80) {
            studentLetterGrade = 'C';
        } else if (studentTestScoreAverage < 90) {
            studentLetterGrade = 'B';
        } else if (studentTestScoreAverage <= 100) {
            studentLetterGrade = 'A';
        }
        
        return studentLetterGrade;
    }
    public void setStudentName(String studentName) {
        studentNames.add(studentName);
    }
    public void setStudentScore(int studentIndex, int scoreIndex, double studentScore) {
        studentTestScores[studentIndex][scoreIndex] = studentScore;
    
    }
   
    public GradingScale (int numberOfStudents, int numberOfTestScoresPerStudent) {
        studentTestScores = new double [numberOfStudents][numberOfTestScoresPerStudent];
    }

    void getStudentTestScoresArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
