package Classes.Ushtr1;

public class Adresa {
    private String streetName;
    private int aptNumber;
    private String city;
    private String state;
    private int zipCode;

    public Adresa(String strN, int aptN, String ct, String st, int zC) {
        this.streetName = strN;
        this.aptNumber = aptN;
        this.city = ct;
        this.state = st;
        this.zipCode = zC;
    }

    public Adresa(String strN1, String ct1, String st1, int zC1) {
        this(strN1, 0, ct1, st1, zC1);
    }

    public String getAdrStr() {
        return this.streetName;
    }

    public int getAdrApt() {
        return this.aptNumber;
    }

    public String getAdrCt() {
        return this.city;
    }

    public String getAdrSt() {
        return this.state;
    }

    public int getAdrZc() {
        return this.zipCode;
    }

    public void printAdr() {
        if (this.aptNumber != 0) {
            System.out.println("Address is:     " + this.streetName + "  " + this.aptNumber + "  " + this.city + "  "
                    + this.state + "  " + this.zipCode + ".");
        } else {
            System.out.println("Address is:     " + this.streetName + "  " + this.city + "  " + this.state + "  "
                    + this.zipCode + ".");
        }
    }

    public boolean comesBefore(int zpc) {
        if (zpc > this.zipCode) {
            return true;
        } else {
            return false;
        }
    }
}