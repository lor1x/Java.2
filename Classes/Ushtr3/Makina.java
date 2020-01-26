package Classes.Ushtr3;

public class Makina {
    private int efPerKm;
    private double gasV;

    public Makina(int ef){
        this.efPerKm = ef;
    }

    public void addGas(Double gv){
        this.gasV += gv;
    }

    public void drive(int dr){
        this.gasV -= (efPerKm*dr);
    }

    public double getGas(){
        return this.gasV;
    } 
}