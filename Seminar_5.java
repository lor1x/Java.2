import java.io.Console;
import java.util.*;
import java.util.Scanner;
import jdk.jfr.Unsigned;
import java.lang.String;
import java.lang.*;
import java.lang.StringBuilder;

public class Seminar_5 {
    public static void main(String[] args) {
        Console console = System.console();
        double x, y, z;
        // Scanner sc = new Scanner(System.in);
        // x = sc.nextDouble();
        // y = sc.nextDouble();
        // z = sc.nextDouble();
        // final int a;
        // a = sc.nextInt();
        // sc.close();

        // Scanner keyb = new Scanner(System.in);
        // final String word = keyb.nextLine();
        // final String str = keyb.nextLine();
        // keyb.close();

        // console.printf("The average sum of 3 numbers is: %.3f\n", doubleAvg(x, y,
        // z));
        // console.printf("Are the 3 numbers all the same? %b\n", allTheSame(x, y, z));

        // System.out.println("First digit of the nubmer is: " + firstDigit(a));
        // System.out.println("Last digit of the nubmer is: " + lastDig(a));
        // System.out.println("Your numbers length is: " + lengthDigit(a));

        // strCh(word);

        // countStr(word);

        // revStr(word);
        // System.out.println("Does your word contain '" + str + "'? " + find(word,
        // str));
        // System.out.println("Is the word '" + word + "' palindrome? " +
        // ështëPalindromë(word));

        // System.out.println(ridDouble("Ju lutem vendosni pagën "));

        passWord();
    }

    public static double doubleAvg(double a, double b, double c) {

        double doubleAvg = (a + b + c) / 3;

        return doubleAvg;
    }

    public static boolean allTheSame(double a, double b, double c) {
        if (a == b && b == c) {
            return true;
        } else
            return false;
    }

    static int lastDig(int h) {
        return Math.abs(h % 10);
    }

    static char firstDigit(int q) {
        if (q > 0) {
            String frsd = "" + q;
            return frsd.charAt(0);
        } else {
            String frsd = "" + q;
            return frsd.charAt(1);
        }
    }

    static int lengthDigit(int h) {
        if (h > 0) {
            String len = "" + h;
            int leng = String.valueOf(len).length();
            return leng;
        } else {
            String len = "" + h;
            int leng = String.valueOf(len).length();
            return leng - 1;
        }
    }

    static void strCh(String wrd) {
        if (wrd.length() % 2 == 1) {
            System.out.println("Character at the middle of the word is '" + wrd.charAt(wrd.length() / 2) + "'.");
        } else {
            System.out.println("Characters at the middle of the word  are '" + wrd.charAt((wrd.length() / 2) - 1)
                    + "' and '" + wrd.charAt((wrd.length() / 2) + 1) + "'.");
        }
    }

    static void countStr(String wrd) {
        if (wrd.isEmpty()) {
            System.out.println("FAK YOU BITCH!");
        } else {
            System.out.println("Before: >" + wrd + "<.");
            System.out.println("After: >" + wrd.trim() + "<.");
        }
    }

    static void revStr(String wrd) {
        System.out.println("Your reversed string is : " + new StringBuilder(wrd).reverse().toString());
    }

    public static boolean find(String str, String match) {
        if (str.equalsIgnoreCase("")) {
            return false;
        } else if (str.contains(match)) {
            return true;
        } else {
            return find(str.substring(1), match);
        }
    }

    public static boolean ështëPalindromë(String wrd) {
        if (wrd.length() == 0 || wrd.length() == 1) {
            return true;
        }
        if (wrd.charAt(0) == wrd.charAt(wrd.length() - 1)) {
            return ështëPalindromë(wrd.substring(1, wrd.length() - 1));
        }
        return false;
    }

    public static double ridDouble(String prompt) {
        Scanner scc = new Scanner(System.in);
        System.out.print(prompt);
        double paga = scc.nextDouble();
        scc.close();
        return paga;
    }

    static void passWord() {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter a password: ");
        boolean pass = true;

        repeat: while (pass) {
            System.out.print("Enter a password: ");
            String password = keyb.nextLine();

            boolean isAtLeast8 = password.length() >= 8;
            boolean hasUpperCase = !password.equals(password.toLowerCase());
            boolean hasLowerCase = !password.equals(password.toUpperCase());

            if (!hasLowerCase || !hasUpperCase || !isAtLeast8) {
                if (!hasLowerCase) {
                    System.out.println("Must have at least one lowercase Character");
                    continue repeat;
                } else if (!hasUpperCase) {
                    System.out.println("Must have at least one uppercase Character");
                    continue repeat;
                } else {
                    System.out.println("Must have at least 8 Characters");
                    continue repeat;
                }
            } else {
                keyb.close();
                pass = false;
            }
        }
    }
}
