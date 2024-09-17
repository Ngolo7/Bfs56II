package OPPS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for general student details
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        // Validate Name
        String name;
        while (true) {
            System.out.print("Enter Student Name (Max 15 characters): ");
            name = scanner.nextLine();
            try {
                if (name == null || name.isEmpty() || name.length() > 15) {
                    throw new IllegalArgumentException("Name must not be empty and should not exceed 15 characters.");
                }
                break; // Exit loop if input is valid
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Validate Mobile Number
        String mobileNumber;
        while (true) {
            System.out.print("Enter Mobile Number (10 digits): ");
            mobileNumber = scanner.nextLine();
            try {
                if (mobileNumber == null || !mobileNumber.matches("\\d{10}")) {
                    throw new IllegalArgumentException("Mobile number must be exactly 10 digits.");
                }
                break; // Exit loop if input is valid
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Course (e.g., Data Science, AI and ML, Cyber Security, Blockchain): ");
        String course = scanner.nextLine();

        // Select the batch type
        System.out.println("\nSelect the batch type:");
        System.out.println("1. FastTrack Batch");
        System.out.println("2. Corporate Batch");
        System.out.println("3. Weekend Batch");
        System.out.println("4. Corporate Weekend Batch");
        System.out.print("Enter your choice (1-4): ");
        int batchType = scanner.nextInt();

        Student student = null;

        // Create the appropriate Student object based on the user's choice
        switch (batchType) {
            case 1:
                student = new FastTrackBatchStudent(studentId, name, mobileNumber, address, course);
                break;
            case 2:
                student = new CorporateBatchStudent(studentId, name, mobileNumber, address, course);
                break;
            case 3:
                student = new WeekendBatchStudent(studentId, name, mobileNumber, address, course);
                break;
            case 4:
                student = new CorporateWeekendBatchStudent(studentId, name, mobileNumber, address, course);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        // Print the details and fee
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Mobile Number: " + student.getMobileNumber());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Course: " + student.getCourse());
        System.out.println("Total Fee: $" + student.calculateFee());
    }
}
