package Classes.Ushtr7;

import java.util.Scanner;

public class Ushtr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble(), r = sc.nextDouble();

        Cylinder cl = new Cylinder(h, r);

        System.out.printf(
                "The volume of the cylinder with a height of %.3fcm and a radius of %.3fcm has a volume of %.3fcm3 and a surface of %.3fcm2.\n",
                h, r, cl.cylinderVolume(), cl.cylinderSurface());

        sc.close();
    }
}