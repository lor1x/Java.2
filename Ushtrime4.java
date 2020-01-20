import java.io.Console;
import java.util.*;
import java.util.Scanner;

public class Ushtrime4 {
    public static void main(String[] args) {
        Console console = System.console();
        Ushtrime4_4 ushtr4 = new Ushtrime4_4();

        // Ushtrimi 4;
        Ushtrime4_1 ushtr = new Ushtrime4_1();
        console.printf("Sum is: %d\n", ushtr.U4_1());

        // Ushtrimi 5;
        Ushtime4_2 ushtr2 = new Ushtime4_2();
        ushtr2.U4_2();

        System.out.println("-----");

        // Ushtrimi 6;
        int x, y;
        Scanner keyboard = new Scanner(System.in);
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        Ushtrime4_3 ushtr3 = new Ushtrime4_3();
        console.printf("The sum of odd numbers is: %d\n", ushtr3.U4_3(x, y));

        System.out.println("-----");

        // Ushtrimi 7;
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        char c = key.next().charAt(0);
        ushtr4.U4_4(n, c);

        System.out.println("-----");

        // Ushtrimi 8;
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        ushtr4.U4_5(m);

        System.out.println("-----");

        // Ushtrimi 9;
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        ushtr4.U4_6(nr);

        System.out.println("-----");

        // Ushtrimi 10;
        Scanner scr = new Scanner(System.in);
        int j = scr.nextInt();
        ushtr4.U4_7(j);

        System.out.println("-----");

        // Ushtrimi 11;
        ushtr4.U4_8();


        keyboard.close();
        key.close();
        kb.close();
        sc.close();
        scr.close();
    }
}
