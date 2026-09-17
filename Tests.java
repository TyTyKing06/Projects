//Name: Tyesia King
//Assignment3: Tests Java

import java.util.Scanner;

public class Tests {
    
    //Fields
    private double ave;
    private int count;
    private int score;

    //Constructor
    public Tests() {
        ave = 0.0;
        count = 0;
        score = 0;
    }

    //Getters
    public double getAve() {
        return ave;
    }
    
    public int getCount() {
        return count;
    }
    
    public int getScore() {
        return score;
    }

    //Setters
    public void setScore(int newScore) {
        score = newScore;
    }

    //Methods to enter test scores and calculate average
    public void getAverage() {
       Scanner scnr = new Scanner(System.in);

       int sum = 0;
       int localCount = 0;
        

        System.out.print("Enter a test score (or -1 to quit): ");
        int testscore = scnr.nextInt();

        while (testscore != -1) {

            sum += testscore;
            localCount++;

            System.out.print("Enter a test score (or -1 to quit): ");
            testscore = scnr.nextInt();
        }
        ave = (double) sum / localCount;

        count = localCount;
        scnr.close();

    }

    public String toString() {
        return "The average of the " + count + " scores entered is: " + String.format("%.2f", ave);
    }
}
