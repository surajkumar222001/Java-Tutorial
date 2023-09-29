package Autograder;

import java.util.Arrays;

public class war {
    public static void main(String[] args) {
        int m = 7; // Replace with the actual number of rows
        int n = 7; // Replace with the actual number of columns

        char[] targets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        int[] columnIndices = {5, 1, 6, 3, 3, 4, 5, 0, 5, 3, 5};
        int[] rowPointers = {0, 1, 3, 4, 7, 8, 9, 11};

        // Create a 2D matrix filled with 'z' (safe zones)
        char[][] battlefield = new char[m][n];
        for (char[] row : battlefield) {
            Arrays.fill(row, 'z');
        }

        // Fill the battlefield matrix with enemy targets
        int targetIndex = 0;
        for (int i = 0; i < m; i++) {
            int start = rowPointers[i];
            int end = rowPointers[i + 1];
            for (int j = start; j < end; j++) {
                int columnIndex = columnIndices[j];
                battlefield[i][columnIndex] = targets[targetIndex++];
            }
        }

        // Print the battlefield matrix
        for (char[] row : battlefield) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
