//Name: Tyesia King
//Assignment2: Tests Java

import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print ("Enter Test Score 1: ");
        double testscore1 = scnr.nextDouble();

        System.out.print("Enter Test Score 2: ");
        double testscore2 = scnr.nextDouble();

        System.out.print("Enter Test Score 3: ");
        double testscore3 = scnr.nextDouble();

        double average = (testscore1 + testscore2 + testscore3) / 3;
        System.out.println("Test Score 1: " + testscore1);
        System.out.println("Test Score 2: " + testscore2);
        System.out.println("Test Score 3: " + testscore3);
        System.out.println("The average of 3 test scores is: " + average);
    
        scnr.close();
    
    }
}
