import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the row");
        int n = sc.nextInt();
        System.out.println("Please enter the size of the column");
        int n1 = sc.nextInt();
        int[][] arr = new int[n][n1];
        System.out.println("Please enter the array numbers");
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
