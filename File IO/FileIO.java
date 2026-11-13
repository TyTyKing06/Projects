//Name: Tyesia King
//Assignment: Mod 8 Assignment 1 File IO

import java.io.*;
import java.util.Scanner;

public class FileIO {
        public static void main(String[] args) throws IOException {
            // Open the input and output files
        String inputFile = "pay.csv";
        String outputFile = "output.csv";
            
        Scanner fileScanner = new Scanner(new File(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Write the header to the output file
        writer.write("EmpID,Rate, Hours,WeeklyPay");
        writer.newLine();

        // Skip the header line in the input file
        if (fileScanner.hasNextLine()) {
            fileScanner.nextLine();
        }

        // Process each line of the input file
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] data = line.split(",");
            String empID = data[0];
            double rate = Double.parseDouble(data[1]);
            double hours = Double.parseDouble(data[2]);
            double weeklyPay;

            // Calculate the weekly pay based on the number of hours worked
            if (hours > 40) {
                weeklyPay = (40 * rate) + ((hours - 40) * rate * 1.5);
            } else {
                weeklyPay = rate * hours;
            }

            // Format the weekly pay to two decimal places
            String formattedPay = String.format("$%.2f", weeklyPay);

            // Write the formatted data to the output file
            writer.write(empID + "," + rate + "," + hours + "," + formattedPay);
            writer.newLine();
        }

        // Close the input and output files
        fileScanner.close();
        writer.close();
    }
}

