package Classes.Ushtr4;

import java.util.Scanner;

public class Ushtr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pNm = sc.nextLine();
        double price = sc.nextDouble();

        Produkt pd = new Produkt(pNm, price);

        System.out.println("The product name is "+pd.getName()+" and it costs "+pd.getPrice()+"$.");

        pd.reducePrice(5);

        System.out.println("The product name is " + pd.getName() + " and its reduced price is " + pd.getPrice() + "$.");

        sc.close();
    }
}