package Classes.Ushtr5;

import java.util.Scanner;

public class Ushtr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int popN = sc.nextInt();

        Population pp = new Population(popN);

        System.out.println("The population is " + pp.getPop() + " people.");

        pp.doublePop();
        System.out.println("The population after doubled is "+pp.getPop()+" people.");

        pp.reducePop();
        System.out.println("The population reduced by 10% is " + pp.getPop() + " people.");

        sc.close();
    }
}