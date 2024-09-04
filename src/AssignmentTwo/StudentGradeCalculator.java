package AssignmentTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfSubjects = 5;
        boolean validInput = false;

        float maths = 0, physics = 0, chemistry = 0, english = 0, nepali = 0;

        while (!validInput) {
            try {
                // Input marks for each subject
                System.out.print("Enter Marks in Maths: ");
                maths = sc.nextFloat();
                System.out.print("Enter Marks in Physics: ");
                physics = sc.nextFloat();
                System.out.print("Enter Marks in Chemistry: ");
                chemistry = sc.nextFloat();
                System.out.print("Enter Marks in English: ");
                english = sc.nextFloat();
                System.out.print("Enter Marks in Nepali: ");
                nepali = sc.nextFloat();

                // Check if all marks are within the valid range
                if (maths < 0 || maths > 100 || physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || english < 0 || english > 100 || nepali < 0 || nepali > 100) {
                    throw new Exception("Marks must be between 0 and 100.");
                }

                // If everything is valid, exit the loop
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numeric values only.");
                sc.nextLine(); // Clear the invalid input
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Calculate total marks and percentage
        float totalMarks = maths + physics + chemistry + english + nepali;
        float percentage = (totalMarks / (numberOfSubjects * 100)) * 100;

        // Determine the grade based on the percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80 && percentage < 90) {
            grade = 'B';
        } else if (percentage >= 70 && percentage < 80) {
            grade = 'C';
        } else if (percentage >= 60 && percentage < 70) {
            grade = 'D';
        } else if (percentage >= 40 && percentage < 60) {
            grade = 'E';
        }
        else
            grade = 'F';

        // Output the total marks, percentage, and grade
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
