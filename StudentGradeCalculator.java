import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Take marks obtained (out of 100) in each subject
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        
        // Calculate Total Marks
        int totalMarks = calculateTotalMarks(marks);
        
        // Calculate Average Percentage
        double averagePercentage = calculateAveragePercentage(totalMarks, numSubjects);
        
        // Grade Calculation
        char grade = calculateGrade(averagePercentage);
        
        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
    
    // Function to calculate total marks
    public static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }
    
    // Function to calculate average percentage
    public static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }
    
    // Function to calculate grade
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else if (percentage >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}
