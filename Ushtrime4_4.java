import java.math.*;
import java.util.Scanner;

class Ushtrime4_4 {

    void U4_4(int n, char c) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)

            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++)

            {
                System.out.print(c);
            }
            System.out.println();

        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= n - i; j++)

            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++)

            {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    void U4_5(int n) {
        int i, num;
        String nrprim = " ";
        for (i = 1; i <= n; i++) {
            int count = 0;

            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count += 1;
                }
            }

            if (count == 2) {
                nrprim += i + " ";
            }
        }
        System.out.println("Nr prim nga 1 deri ne " + n + " jane: ");
        System.out.println(nrprim);
    }

    void U4_6(int a){
        int i = 2;
        while (a>Math.sqrt(a)){
            if (a % i == 0) {
                System.out.println("Factor is: "+i+".");
                a = a / i;
                continue;
            }
            i++;
        }   
    }

    void U4_7(int m){
        int n1 = 0, n2 = 1, n3xt, i;
        System.out.print("The series: "+n1 + " " + n2 + " ");
        for (i = 2; i < m; ++i) {
            n3xt = n1 + n2;
            System.out.print(Math.abs(n3xt) + " ");
            n1 = n2;
            n2 = n3xt;

        }
        System.out.println();
    }

    void U4_8(){
        Scanner sc = new Scanner(System.in);
        final int MAX_LENGTH = 1;
        int num = 0, sum = 0;

        System.out.println("If you want to end it just press 'n'");
        System.out.print("Enter a number: ");
        scanner: while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                if (String.valueOf(num).length() <= MAX_LENGTH) {
                    System.out.print("Enter a number: ");
                    if (num % 2 == 1) {
                        sum += num;
                    }
                } else {
                    System.out.println("ERROR: Input number was too long");
                    System.out.print("Enter a number: ");
                    if (sc.next().equalsIgnoreCase("N"))
                        break scanner;
                }
            } else {
                System.out.println("The sum of odd numbers is: " + sum);
                if (sc.next().equalsIgnoreCase("N"))
                    break scanner;
            }
        }
    }
}