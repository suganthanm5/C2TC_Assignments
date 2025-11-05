package com.sugu.Assignment_6;

import java.util.Scanner;

public class StudentTestScoreTrackerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test scores: \n");
        int n = sc.nextInt();

        StudentTestScoreTracker student = new StudentTestScoreTracker(n);

        student.inputScores(sc);
        student.convertToArrayList();
        student.displayScores();

        sc.close();
    }
}