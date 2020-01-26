package Classes.Ushtr7;

public class Cylinder {
    private double height;
    private double radius;

    public Cylinder(double h, double r) {
        this.height = h;
        this.radius = r;
    }

    public double cylinderVolume() {
        return (Math.PI * (this.radius * this.radius * this.height));
    }

    public double cylinderSurface() {
        return (2 * Math.PI * this.radius * (this.height + this.radius));
    }
}