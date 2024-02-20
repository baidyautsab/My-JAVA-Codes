package technicalRoundQuestions.AvaliSolution;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        // Print the plus symbol
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 2 || j == 2) {  // Row 3 or Column 3
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  // Two spaces for padding
                }
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
