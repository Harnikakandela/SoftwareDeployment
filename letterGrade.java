// Author: Harnika Kandela
import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the numeric grade
        System.out.print("Enter the numeric grade: ");
        int numericGrade = scanner.nextInt();
        
        // Calculate the letter grade
        String letterGrade = calculateLetterGrade(numericGrade);
        
        // Display the letter grade
        System.out.println("The letter grade is: " + letterGrade);
    }
    
       // Modification that includes the options of A+, B+, C+, D+ based on the 
    // specified numeric grade ranges.
   public static String calculateLetterGrade(int numericGrade) 
  {
    if (numericGrade >= 95) {
        return "A+";
    } else if (numericGrade >= 90) {
        return "A";
    } else if (numericGrade >= 85) {
        return "B+";
    } else if (numericGrade >= 80) {
        return "B";
    } else if (numericGrade >= 75) {
        return "C+";
    } else if (numericGrade >= 70) {
        return "C";
    } else if (numericGrade >= 65) {
        return "D+";
    } else {
        return "D";
    }
  }
}
