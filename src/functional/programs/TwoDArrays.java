package functional.programs;
import java.util.Scanner;
import java.io.PrintWriter;

public class TwoDArrays {
    public static int[][] readIntArray(int m, int n, Scanner sc) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }
    public static double[][] readDoubleArray(int m, int n, Scanner sc) {
        double[][] array = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextDouble();
            }
        }
        return array;
    }
    public static boolean[][] readBooleanArray(int m, int n, Scanner sc) {
        boolean[][] array = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextBoolean();
            }
        }
        return array;
    }
    public static void printIntArray(int[][] array, PrintWriter out) {
        for (int[] row : array) {
            for (int value : row) {
                out.print(value + " ");
            }
            out.println();
        }
    }
    public static void printDoubleArray(double[][] array, PrintWriter out) {
        for (double[] row : array) {
            for (double value : row) {
                out.print(value + " ");
            }
            out.println();
        }
    }
    public static void printBooleanArray(boolean[][] array, PrintWriter out) {
        for (boolean[] row : array) {
            for (boolean value : row) {
                out.print(value + " ");
            }
            out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        System.out.print("Enter rows : ");
        int m = sc.nextInt();
        System.out.print("Enter columns : ");
        int n = sc.nextInt();
        System.out.println("Enter " + (m * n) + " integer values:");
        int[][] intArray = readIntArray(m, n, sc);
        out.println("2D Integer Array:");
        printIntArray(intArray, out);
        out.flush();
    }
}
