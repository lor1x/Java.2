package Classes.Ushtr4;

public class Produkt {
    private String pName;
    private double price;

    public Produkt(String name, double pr){
        this.pName = name;
        this.price = pr;
    }

    public String getName(){
        return this.pName;
    }

    public double getPrice(){
        return this.price;
    }

    public void reducePrice(double red){
        this.price -= red;
    }
}