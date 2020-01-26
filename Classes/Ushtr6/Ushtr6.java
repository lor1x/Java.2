package Classes.Ushtr6;

import java.util.Scanner;

public class Ushtr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of the products prices you want to add: ");
        int a = sc.nextInt();

        CashRegister cs = new CashRegister();

        for (int j = 0; j < a; j++) {
            cs.addVl(sc.nextDouble());
        }

        for (int j = 0; j < a; j++) {
            System.out.println("Produkti "+(j+1)+" ka cmim: "+cs.getCmime(j)+"$.");
        }

        sc.close();
    }
}