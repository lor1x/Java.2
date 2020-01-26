package Classes.Ushtr6;

import java.util.ArrayList;

public class CashRegister {
    private ArrayList<Double> cmime = new ArrayList<Double>();
    
    public CashRegister(){
    }
    
    public void addVl(double e){
        this.cmime.add(e);
    }

    public Double getCmime(int index) {
        return this.cmime.get(index);
    }
}