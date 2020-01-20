import java.io.Console;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Seminar6 {
    public static void main(String[] args) {
        Console console = System.console();
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // final int a = scan.nextInt();
        System.out.print("Enter the size:     ");
        final int n = scan.nextInt();
        // int[] Arr = new int[a];
        int[] Arr2 = { 1, 2, 3, 4, 5 };
        int[] Arr3 = { 5, 4, 3, 2, 1 };
        int[][] Arr4 = new int[n][n];
        // {{5,4,2,16},{5,16,3,16}, {5,2,1,2},{16,16,16,1}};

        /*
         * for (int i = 0; i < Arr.length; i++) { Arr[i] = rand.nextInt(10) + 1; }
         */

        // randoArr(Arr, a);
        // print(Arr2);
        // console.printf("\n");

        // console.printf("The sum is %d", alterN(Arr,a));
        // console.printf("Are they palind? %b", palinD(Arr2, Arr3));
        // console.printf("\n");
        // sortMe();
        // console.printf("Is this magic? %b", magiSq(Arr4));
        if (magicSq(Arr4)) {
            System.out.println("We got magic here people 🎩");
        } else {
            System.out.println("No magic…😔");
        }
        console.printf("The size is: %d\n", Arr4.length * n);

        print2D(Arr4);
        scan.close();
    }

    static void print(int[] Arr) {
        for (int i : Arr) {
            System.out.printf("%d\t", i);
        }
    }

    static void print2D(int[][] Arr) {
        System.out.print("-------------------");
        System.out.println();
        System.out.println("This is the array:");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                System.out.printf("%d\t", Arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------");
    }

    static int alterN(int[] Arr) {
        int sum = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (i % 2 == 0)
                sum += Arr[i];
            else
                sum -= Arr[i];
        }
        return sum;
    }

    static boolean palinD(int[] Arr2, int[] Arr3) {
        if (Arr2.length == Arr3.length) {
            int j = 0;
            for (int i = Arr2.length - 1; i >= 0 && j <= Arr3.length - 1; i--, j++) {
                if (Arr2[i] == Arr3[j]) {
                    continue;
                } else {
                    return false;
                }
            }
            if (j == Arr3.length) {
                return true;
            } else {
                return false;
            }
        } else
            return false;
    }

    static void randoArr(int[] Arr, final int a) {
        final Console console = System.console();

        System.out.println("The array is: ");
        print(Arr);
        console.printf("\n");
        /*
         * System.out.println("The array even is: "); for (int i = 0; i < Arr.length;
         * i+= 2) { console.printf("%d\t", Arr[i]); } console.printf("\n");
         * 
         * System.out.println("The rev-array is: "); for (int i = Arr.length - 1; i >=
         * 0; i--) { console.printf("%d\t", Arr[i]); } console.printf("\n");
         * 
         * System.out.println("The head and end are: "); int tmp = Arr[0]; Arr[0] =
         * Arr[Arr.length - 1]; Arr[(Arr.length - 1)] = tmp; for (int i = 0; i <
         * Arr.length; i++) console.printf("%d\t", Arr[i]);
         */

        console.printf("\n");

        int temp;
        System.out.println("3b: ");
        for (int i = a - 1; i >= 0; i--) {
            if (i <= a - 2) {
                temp = Arr[i];
                Arr[i] = Arr[i + 1];
                Arr[i + 1] = temp;
            }
        }
        print(Arr);
    }

    static void sortMe() {
        final Random rand = new Random();
        final Console console = System.console();

        int[] Arr = new int[20];

        for (int i = 0; i < Arr.length; i++)
            Arr[i] = rand.nextInt(100);

        print(Arr);
        console.printf("\n");

        Arrays.sort(Arr);

        print(Arr);
        console.printf("\n");
    }

    static boolean magicSq(int Arr[][]) {
        Scanner scan = new Scanner(System.in);

        outer: for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                System.out.print("Enter number:    ");
                Arr[i][j] = scan.nextInt();
                System.out.print("-------------------");
                System.out.println();
                if (Arr[i][j] >= 1 && Arr[i][j] < 17) {
                    continue;
                } else {
                    System.out.println("Do you want to continue?    Y/N");
                    String cont = scan.next();
                    if (cont.equalsIgnoreCase("n")) {
                        System.out.println("Thank you and bye 👋");
                        break outer;
                    } else {
                        j -= 1;
                        continue;
                    }
                }
            }
        }

        // Calculate the sum of the prime diagonal
        int sum = 0, sum2 = 0;
        for (int i = 0; i < Arr.length; i++)
            sum = sum + Arr[i][i];

        // The secondary diagonal
        for (int i = 0; i < Arr.length; i++)
            sum2 = sum2 + Arr[i][Arr.length - 1 - i];

        if (sum != sum2)
            return false;

        // For sums of rows
        for (int i = 0; i < Arr.length; i++) {

            int rowSum = 0;
            for (int j = 0; j < Arr.length; j++)
                rowSum += Arr[i][j];

            // Check if every row sum is equal to prime diagonal sum
            if (rowSum != sum)
                return false;
        }

        // For sums of columns
        for (int i = 0; i < Arr.length; i++) {

            int colSum = 0;
            for (int j = 0; j < Arr.length; j++)
                colSum += Arr[j][i];

            // Check if every column sum is equal to prime diagonal sum
            if (sum != colSum)
                return false;
        }

        return true;
    }

    // Unfinished - finished method on line 145-207;
    static boolean magiSq(int[][] Arr) {
        final Scanner scan = new Scanner(System.in);
        int[][] sum = new int[10][10];

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr.length; j++) {
                outer: while (scan.hasNextInt()) {
                    System.out.println("Enter a num: ");
                    Arr[i][j] = scan.nextInt();

                    if (Arr[i][j] >= 1 || Arr[i][j] <= 16) {
                        Arr[i][j] = scan.nextInt();
                    } else {
                        System.out.println("Try again!");
                        continue outer;
                    }
                }
                if (i == 0) {
                    if (j == 0) {
                        sum[i][j] = Arr[i][j] * 2 + Arr[i + 1][j] + Arr[i][j + 1];
                    } else if (j == Arr[i].length - 1) {
                        sum[i][j] = Arr[i][j] * 2 + Arr[i][j - 1] + Arr[i + 1][j];
                    } else {
                        sum[i][j] = Arr[i][j] + Arr[i][j - 1] + Arr[i + 1][j] + Arr[i][j + 1];
                    }
                } else if (i == Arr.length - 1) {
                    if (j == 0) {
                        sum[i][j] = Arr[i][j] * 2 + Arr[i - 1][j] + Arr[i][j + 1];
                    } else if (j == Arr[i].length - 1) {
                        sum[i][j] = Arr[i][j] * 2 + Arr[i][j - 1] + Arr[i - 1][j];
                    } else {
                        sum[i][j] = Arr[i][j] + Arr[i][j - 1] + Arr[i - 1][j] + Arr[i][j + 1];
                    }
                } else if (j == 0) {
                    sum[i][j] = Arr[i][j] + Arr[i - 1][j] + Arr[i + 1][j] + Arr[i][j + 1];
                } else if (j == Arr[i].length - 1) {
                    sum[i][j] = Arr[i][j] + Arr[i - 1][j] + Arr[i + 1][j] + Arr[i][j - 1];
                } else {
                    sum[i][j] = Arr[i][j - 1] + Arr[i - 1][j] + Arr[i + 1][j] + Arr[i][j + 1];
                }
            }
        }
        scan.close();
        return false;
    }

}