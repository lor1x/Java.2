package Classes.Ushtr1;

import java.io.Console;
import java.util.Scanner;

public class Ush1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Console cs = System.console();
        System.out.println("Enter your address, (*) indicates a required field");

        System.out.print("Street name(*): ");
        String strN = cs.readLine();

        System.out.print("Apartment number: ");
        int aptN = sc.nextInt();

        System.out.print("City(*): ");
        String ct = cs.readLine();

        System.out.print("State(*): ");
        String st = cs.readLine();

        System.out.print("Zip Code(*): ");
        int zc = sc.nextInt();

        System.out.println();

        System.out.println("Enter your address, (*) indicates a required field");

        System.out.print("Street name(*): ");
        String strN2 = cs.readLine();

        System.out.print("Apartment number: ");
        int aptN2 = sc.nextInt();

        System.out.print("City(*): ");
        String ct2 = cs.readLine();

        System.out.print("State(*): ");
        String st2 = cs.readLine();

        System.out.print("Zip Code(*): ");
        int zc2 = sc.nextInt();

        sc.close();

        Adresa adr = new Adresa(strN, aptN, ct, st, zc);
        adr.printAdr();

        Adresa adr2 = new Adresa(strN2, aptN2, ct2, st2, zc2);
        adr2.printAdr();

        if (adr.comesBefore(adr.getAdrZc())) {
            System.out.print("Adresa 1 para");
        } else {
            System.out.print("Adresa 2 para");
        }

        System.out.println();
    }
}