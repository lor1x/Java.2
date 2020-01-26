package Classes.Ushtr5;

public class Population {
    private int popN;

    public Population(int popN){
        this.popN = popN;
    }

    public void doublePop(){
        this.popN *= 2;
    }

    public void reducePop(){
        this.popN -= (this.popN*10)/100;
    }

    public int getPop(){
        return this.popN;
    }
}