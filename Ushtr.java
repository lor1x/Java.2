import java.util.ArrayList;
import java.util.Scanner;

public class Ushtr {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int[][] arr = { 
                        { 1, 2, 3, 4 }, 
                        { 5, 6, 7, 8 }, 
                        { 9, 10, 11, 12 }, 
                        { 13, 14, 15, 16 } 
                       };
        // arrLiz();
        int row, col;
        row = c.nextInt();
        col = c.nextInt();
        System.out.println(neighAv(arr, row, col));
        System.out.println("----------");
        printA(arr);
        c.close();
    }

    public static double neighAv(int[][] arr, int row, int column) {
        double sum = 0;
        if (row == 0 && column == 0) {
            sum += arr[0][1] + arr[1][0];
            return sum;
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == 0 && j == 0) {
                        sum += (arr[0][0]) * 2;
                        sum += arr[0][1];
                        sum += arr[1][0];
                        return sum;
                    } else if (i == 0 && j == arr[0].length) {
                        sum += arr[0][arr[0].length];
                        sum += arr[0][arr[0].length - 1];
                        sum += arr[1][arr[0].length];
                        return sum;

                    } else if (i == arr.length && j == 0) {

                    } else if (i == arr.length && j == arr[arr.length].length) {

                    }
                    // getting the mid(s) of the top row
                    else if (i == 0 && j != 0 && j != arr[0].length) {
                        sum += arr[i][j]; // top value or mirror
                        sum += arr[i][j - 1]; // left value

                        // ERROR****
                        sum += arr[i][j + 1]; // right value
                        sum += arr[i + 1][j]; // bottom value
                        return sum;

                    }
                    // getting the mid(s) of the bottom row
                    else if (i == arr.length && j != 0 && j != arr[arr.length].length) {
                        sum += arr[i][j];
                        sum += arr[i][j - 1];
                        sum += arr[i][j + 1];
                        sum += arr[i - 1][j];
                        return sum;
                    }
                    // getting the mid(s) of the left most column
                    else if (j == 0 && i != 0 && i != arr.length) {
                        sum += arr[i][j];
                        sum += arr[i - 1][j];
                        sum += arr[i + 1][j];
                        sum += arr[i][j + 1];
                        return sum;
                    }
                    // getting the mid(s) of the right most column
                    else if (j == arr[0].length && i != 0 && i != arr.length) {
                        sum += arr[i][j];
                        sum += arr[i - 1][j];
                        sum += arr[i + 1][j];
                        sum += arr[i][j - 1];
                        return sum;
                    }
                    // filling in all the remaining values
                    else {
                        sum += arr[i - 1][j];
                        sum += arr[i + 1][j];
                        sum += arr[i][j - 1];
                        sum += arr[i][j + 1];
                        return sum;
                    }
                }
            }
            return sum;
        }
    }

    public static void printA(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void arrLiz() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> states = new ArrayList<String>();
        ArrayList<Integer> stars = new ArrayList<Integer>();
        String state;
        int star, elem, stop = 0;

        while (stop != -1) {
            state = sc.next();
            states.add(state);
            star = sc.nextInt();
            stars.add(star);
            System.out.println("-----Enter -1 to exit or enter to continue-----");
            stop = sc.nextInt();
        }

        for (int i = 0; i < states.size(); i++) {
            System.out.print(states.get(i) + ":   ");
            elem = stars.get(i);
            for (int j = 0; j < elem; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}