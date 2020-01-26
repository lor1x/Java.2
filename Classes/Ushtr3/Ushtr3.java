package Classes.Ushtr3;

import java.util.Scanner;

public class Ushtr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ef = sc.nextInt();
        double addG = sc.nextDouble();
        int drive = sc.nextInt();

        Makina m = new Makina(ef);

        m.addGas(addG);
        if ((drive*ef) > m.getGas()) {
            System.out.println("You can't drive that much");
        } else {
            m.drive(drive);
            System.out.println("Your car has:  " + m.getGas()+" KG of gas left.");
        }

        sc.close();
    }
}