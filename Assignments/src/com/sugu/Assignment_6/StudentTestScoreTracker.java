package com.sugu.Assignment_6;

import java.util.Scanner;
import java.util.ArrayList;
class StudentTestScoreTracker {
 private int[] scores;                  
 private ArrayList<Integer> scoreList; 
 public StudentTestScoreTracker(int n) {
     scores = new int[n];
     scoreList = new ArrayList<>();
 }
 public void inputScores(Scanner sc) {
     // Test Scores
	 System.out.println("Enter test scores: \n");
     for (int i = 0; i < scores.length; i++) {
         scores[i] = sc.nextInt();
     }
 }

 public void convertToArrayList() {
     for (int score : scores) {
         scoreList.add(score);
     }
 }

 public void displayScores() {
     System.out.println("Elements in the ArrayList:");
     for (int score : scoreList) {
         System.out.println(score);
     }
 }
}