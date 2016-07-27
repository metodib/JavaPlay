package ch1;

import util.Question;

public class RotateMatrix extends Question {
    public RotateMatrix() {
        super("1.6", "Given an image represented by an NxN matrix, rotate by 90 degrees.");
    }

    int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

    int[][] b = {{1,2,3}, {4,5,6}, {7,8,9}};

    int[][] c ={{1,2}, {3, 4}};

    public void run() {
        hello();

        System.out.println("2x2 Initial:");
        printInt2D(c);
        System.out.println("2x2 Rotated:");
        printInt2D(rotate(c));
        System.out.println("3x3 Initial:");
        printInt2D(b);
        System.out.println("3x3 Rotated:");
        printInt2D(rotate(b));
        System.out.println("4x4 Initial:");
        printInt2D(a);
        System.out.println("4x4 Rotated:");
        printInt2D(rotate(a));

        bye();
    }

    int[][] rotate(int[][] in) {
        if (in.length == 0 || in.length != in[0].length) {
            return in; // not a square matrix or empty matrix
        }

        int[][] res = new int[in.length][in.length];

        for (int row = 0; row < in.length; row++) {
            int[] cRow = in[row];

            for(int i = 0; i < cRow.length; i++) {
                int cCol = res.length - 1 - row;
                res[i][cCol] = cRow[i];
            }
        }
        return res;
    }


    void printInt2D (int[][] in) {
        for (int row = 0; row < in.length; row++) {
            for (int col = 0; col < in[row].length; col++) {
                System.out.print(String.format("%3d", in[row][col]));
            }
            System.out.println();
        }
    }
}